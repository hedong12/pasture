package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.CashRule;
import com.dscy.pasture.entity.ShouyiZhonglei;
import com.dscy.pasture.service.CashRuleService;
import com.dscy.pasture.service.ShouyiZhongleiService;
import com.dscy.pasture.util.FileUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/cashRule")
public class CashRuleController {


    @Autowired
    private CashRuleService cashRuleService;

    @Autowired
    private ShouyiZhongleiService shouyiZhongleiService;


    @RequestMapping("/cashRuleList")
    public String getCashRuleList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                  @RequestParam(value = "crName",required = false,defaultValue = "") String crName,
                                  Model model){
        PageInfo pageInfo = cashRuleService.getCashRuleList(currentPage,crName);
        List<ShouyiZhonglei> shouyiZhongleiList = shouyiZhongleiService.selectZhongLeiList();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("shouyiZhongleiList",shouyiZhongleiList);
        model.addAttribute("crName",crName);
        return "cashRuleList";
    }


    @RequestMapping("/delCashRuleById")
    @ResponseBody
    public String delCashRuleById(@RequestParam("id") Integer crId){
        Map<String,String> map = new HashMap<>();
        CashRule cashRule = cashRuleService.selectCashRuleById(crId);
        if (cashRule != null) {
            int result = cashRuleService.delCashRuleById(cashRule.getCrId());
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

    /**
     * ??????????????????
     * @param file
     * @param showId
     * @param crNum
     * @param tiaojianNum
     * @param peopleNum
     * @param crName
     * @param szId
     * @return
     */
    @RequestMapping("/addCashRule")
    @ResponseBody
    public String addCashRule(@RequestParam("fileName") MultipartFile file,
                              @RequestParam("showId") Integer showId,
                              @RequestParam("crNum") Long crNum,
                              @RequestParam("tiaojianNum") Long tiaojianNum,
                              @RequestParam("peopleNum") Integer peopleNum,
                              @RequestParam("crName") String crName,
                              @RequestParam("szId") Integer szId){
        Map<String,String> map = new HashMap<>();
        if (file.getSize() / 1000 > 10000){
            map.put("result","false");
        }else {
            //????????????????????????
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                // ?????????????????????????????????????????????
                //???src????????????????????????????????????????????????????????????????????????ajax???????????????????????????????????????404??????-->????????????
                final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                //???????????????????????????(?????????????????????????????????????????????)
                //???????????????
                String fileName = file.getOriginalFilename();
                //?????????????????????
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //?????????????????????
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);

                    CashRule cashRule = new CashRule();
                    cashRule.setShowId(showId);
                    cashRule.setCrName(crName);
                    cashRule.setCrImg(fileName);
                    cashRule.setCrNum(crNum);
                    cashRule.setTiaojianNum(tiaojianNum);
                    cashRule.setPeopleNum(peopleNum);
                    cashRule.setSzId(shouyiZhonglei.getSzId());
                    cashRule.setSzName(shouyiZhonglei.getSzName());
                    cashRule.setSzImg(shouyiZhonglei.getSzImg());
                    int result = cashRuleService.addCashRule(cashRule);
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



    @RequestMapping("/toUpdateCashRuleById")
    public String toUpdateCashRuleById(@RequestParam("id") Integer id,
                                       Model model){
        CashRule cashRule = cashRuleService.selectCashRuleById(id);
        List<ShouyiZhonglei> shouyiZhongleiList = shouyiZhongleiService.selectZhongLeiList();
        model.addAttribute("cashRule",cashRule);
        model.addAttribute("shouyiZhongleiList",shouyiZhongleiList);
        return "updateCashRule";
    }



    @RequestMapping("/doUpdateCashRuleById")
    public String doUpdateCashRuleById(@RequestParam("fileName") MultipartFile file,
                                       @RequestParam("showId") Integer showId,
                                       @RequestParam("crNum") Long crNum,
                                       @RequestParam("tiaojianNum") Long tiaojianNum,
                                       @RequestParam("peopleNum") Integer peopleNum,
                                       @RequestParam("crName") String crName,
                                       @RequestParam("szId") Integer szId,
                                       @RequestParam("crId") Integer crId){
        CashRule cashRule = cashRuleService.selectCashRuleById(crId);
        if (cashRule != null) {
            if (file.getSize() / 1000 > 10000){
                return "";
            }else {
                //????????????????????????
                String fileType = file.getContentType();
                if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                    // ?????????????????????????????????????????????
                    //???src????????????????????????????????????????????????????????????????????????ajax???????????????????????????????????????404??????-->????????????
                    final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                    //???????????????????????????(?????????????????????????????????????????????)
                    //???????????????
                    String fileName = file.getOriginalFilename();
                    //?????????????????????
                    String suffixName = fileName.substring(fileName.lastIndexOf("."));
                    //?????????????????????
                    fileName = UUID.randomUUID()+suffixName;
                    if (FileUtils.upload(file, localPath, fileName)) {
                        cashRule.setCrImg(fileName);
                    }
                }
                ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);
                cashRule.setShowId(showId);
                cashRule.setCrName(crName);
                cashRule.setCrNum(crNum);
                cashRule.setTiaojianNum(tiaojianNum);
                cashRule.setPeopleNum(peopleNum);
                cashRule.setSzId(shouyiZhonglei.getSzId());
                cashRule.setSzName(shouyiZhonglei.getSzName());
                cashRule.setSzImg(shouyiZhonglei.getSzImg());
                int result = cashRuleService.updateCashRule(cashRule);
                if (result > 0) {
                    return "redirect:cashRuleList";
                }
            }


        }
        return "";
    }


}
