package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.service.ExpPrizeService;
import com.dscy.pasture.service.FodderService;
import com.dscy.pasture.util.FileUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 食物\饲料
 */
@Controller
@RequestMapping("/fodder")
public class FodderController {

    @Autowired
    private FodderService fodderService;

    @Autowired
    private ExpPrizeService expPrizeService;


    @RequestMapping("/fodderList")
    public String getFodderList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer current,
                                @RequestParam(value = "fodderName",required = false,defaultValue = "") String fodderName,
                                Model model){
        PageInfo pageInfo = fodderService.getFodderList(fodderName,current);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("fodderName",fodderName);
        return "fodderList";
    }


    @PostMapping("/delFodderById")
    @ResponseBody
    public String delFodderById(@RequestParam("id") Integer fodderId){
        Map<String,String> map = new HashMap<>();
        Fodder fodder = fodderService.selectFooderById(fodderId);
        if (fodder != null) {
            //执行删除
            int result = fodderService.delFodderById(fodder.getFodderId());
            if (result > 0){
                map.put("result","true");
            }else {
                map.put("result","false");
            }

        }else {
            map.put("result","notexist");
        }
        return JSON.toJSONString(map);
    }

    /**
     * 前往饲料更新页面
     * @param id
     * @return
     */
    @RequestMapping("/toUpdateFodderById")
    public String toUpdateFodderById(@RequestParam("id") Integer id,
                                     Model model){
        Fodder fodder = fodderService.selectFooderById(id);
        model.addAttribute("fodder",fodder);
        return "updateFodder";
    }

    /**
     * 执行更新饲料信息
     * @param fodderId
     * @param showId
     * @param fodderName
     * @param fodderLevel
     * @param fodderExp
     * @param fodderStatus
     * @return
     */
    @RequestMapping("/doUpdateFodderById")
    public String doUpdateFodderById(@RequestParam("fodderId") Integer fodderId,
                                     @RequestParam("showId") Integer showId,
                                     @RequestParam("fodderName") String fodderName,
                                     @RequestParam("fodderLevel") Integer fodderLevel,
                                     @RequestParam("fodderExp") String fodderExp,
                                     @RequestParam("fodderStatus") Integer fodderStatus){
        Fodder fodder = fodderService.selectFooderById(fodderId);
        if (fodder != null) {
            fodder.setFodderId(fodderId);
            fodder.setShowId(showId);
            fodder.setFodderName(fodderName);
            fodder.setFodderLevel(fodderLevel);
            fodder.setFodderExp(fodderExp);
            fodder.setFodderStatus(fodderStatus);
            int result = fodderService.doUpdateFodderById(fodder);
            if (result > 0) {
                System.out.println(fodder.getFodderImgUrl());
                int num = expPrizeService.updateExpPrizeByExpId(fodder.getFodderId(),fodder.getFodderName(),fodder.getFodderImgUrl());
                return "redirect:fodderList";
            }

        }
        return "";
    }


    @RequestMapping("/addFodder")
    @ResponseBody
    public String addFodder(@RequestParam("fileName") MultipartFile file,
                            @RequestParam("fodderName") String fodderName,
                            @RequestParam("fodderLevel") Integer fodderLevel,
                            @RequestParam("fodderExp") String fodderExp,
                            @RequestParam("fodderStatus") Integer fodderStatus,
                            @RequestParam("showId") Integer showId,
                            HttpServletRequest request){
        String result_msg="";//上传结果信息
        Map<String,Object> map = new HashMap<String, Object>();
        if (file.getSize() / 1000 > 10000){
            result_msg="图片大小不能超过100MB";
        }
        else{
            //判断上传文件格式
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                // 要上传的目标文件存放的绝对路径
                //用src为保存绝对路径不能改名只能用原名，不用原名会导致ajax上传图片后在前端显示时出现404错误-->原因未知
//                String localPath="F:\\IDEAProject\\imageupload\\src\\main\\resources\\static\\img";
                final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                //上传后保存的文件名(需要防止图片重名导致的文件覆盖)
                //获取文件名
                String fileName = file.getOriginalFilename();
                //获取文件后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //重新生成文件名
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    //文件存放的相对路径(一般存放在数据库用于img标签的src)
                    String relativePath="uploaded/"+fileName;
                    map.put("relativePath",relativePath);//前端根据是否存在该字段来判断上传是否成功
                    result_msg="图片上传成功";
                    Fodder fodder = new Fodder();
                    fodder.setShowId(showId);
                    fodder.setFodderName(fodderName);
                    fodder.setFodderLevel(fodderLevel);
                    fodder.setFodderExp(fodderExp);
                    fodder.setFodderStatus(fodderStatus);
                    fodder.setFodderImgUrl(fileName);
                    int reuslt = fodderService.doAddFodder(fodder);
                    if (reuslt > 0) {
                        map.put("result","true");
                    }else {
                        map.put("result","false");
                    }

                }
                else{
                    result_msg="图片上传失败";
                }
            }
            else{
                result_msg="图片格式不正确";
            }
        }
        map.put("result_msg",result_msg);
        return JSON.toJSONString(map);
    }

}
