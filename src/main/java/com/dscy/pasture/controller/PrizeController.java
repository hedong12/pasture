package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.entity.Prize;
import com.dscy.pasture.service.PetsService;
import com.dscy.pasture.service.PrizeService;
import com.dscy.pasture.util.FileUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

/**
 * 奖品-controller
 */
@Controller
@RequestMapping("/prize")
public class PrizeController {

    @Autowired
    private PrizeService prizeService;

    @Autowired
    private PetsService petsService;

    @RequestMapping("/prizeList")
    public String getPrizeList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer cuttentPage,
                               @RequestParam(value = "prizeName",required = false,defaultValue = "") String prizeName,
                               Model model){
        PageInfo pageInfo = prizeService.getPrizeList(cuttentPage,prizeName);
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("petsList",petsList);
        model.addAttribute("prizeName",prizeName);
        model.addAttribute("pageInfo",pageInfo);
        return "prizeList";
    }

    @RequestMapping("/delPrizeById")
    @ResponseBody
    public String delPrizeById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Prize prize = prizeService.selectPrizeById(id);
        if (prize != null) {
            int result = prizeService.delPrizeById(prize.getpId());
            if (result > 0) {
                map.put("result","true");
            }else {
                map.put("result","false");
            }
        }else {
            map.put("result","notexist");
        }

        return JSON.toJSONString(map);
    }



    @RequestMapping("/toUpdatePrizeById")
    public String toUpdatePrizeById(@RequestParam("id") Integer id,
                                    Model model){
        Prize prize = prizeService.selectPrizeById(id);
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("prize",prize);
        model.addAttribute("petsList",petsList);
        return "updatePrize";
    }



    @RequestMapping("/doUpdatePrizeById")
    public String doUpdatePrizeById(@RequestParam("pId") Integer pId,
                                    @RequestParam("showId") Integer showId,
                                    @RequestParam("prizeName") String prizeName,
                                    @RequestParam("fileName") MultipartFile file,
                                    @RequestParam("petsId") Integer petsId,
                                    @RequestParam("status") Integer status){
        Prize prize = prizeService.selectPrizeById(pId);
        if (prize != null) {
            if (file.getSize() / 1000 > 10000){
                return "";
            }else {
                //判断上传文件格式
                String fileType = file.getContentType();
                if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                    final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                    String fileName = file.getOriginalFilename();
                    //获取文件后缀名
                    String suffixName = fileName.substring(fileName.lastIndexOf("."));
                    //重新生成文件名
                    fileName = UUID.randomUUID()+suffixName;
                    if (FileUtils.upload(file, localPath, fileName)) {
                        Pets pets = petsService.queryPetsById(petsId);
                        if (pets != null) {
                            prize.setShowId(showId);
                            prize.setPrizeName(prizeName);
                            prize.setStatus(status);
                            prize.setPrizeImgUrl(fileName);
                            prize.setPetsId(pets.getPetsId());
                            pets.setPetsName(pets.getPetsName());
                            int result = prizeService.doUpdatePrizeById(prize);
                            if (result > 0) {
                                return "redirect:prizeList";
                            }
                        }

                    }
                }
            }
        }

        return "";
    }



    @RequestMapping("/addPrize")
    @ResponseBody
    public String addPrize(@RequestParam("showId") Integer showId,
                           @RequestParam("prizeName") String prizeName,
                           @RequestParam("fileName") MultipartFile file,
                           @RequestParam("petsId") Integer petsId,
                           @RequestParam("status") Integer status){
        Map<String,String> map = new HashMap<>();
        if (file.getSize() / 1000 > 10000){
            map.put("result","false");
        }else {
            //判断上传文件格式
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                String fileName = file.getOriginalFilename();
                //获取文件后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //重新生成文件名
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    Prize prize = new Prize();
                    prize.setShowId(showId);
                    prize.setPrizeName(prizeName);
                    prize.setPrizeImgUrl(fileName);
                    prize.setStatus(status);
                    prize.setAddTime(new Date());
                    Pets pets = petsService.queryPetsById(petsId);
                    if (pets != null) {
                        prize.setPetsId(pets.getPetsId());
                        prize.setPetsName(pets.getPetsName());
                    }
                    int result = prizeService.addPrize(prize);
                    if (result > 0) {
                        map.put("result","true");
                    }else {
                        map.put("result","false");
                    }
                }
            }
        }
        return JSON.toJSONString(map);
    }

}
