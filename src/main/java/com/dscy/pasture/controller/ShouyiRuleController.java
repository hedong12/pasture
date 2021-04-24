package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.entity.ShouyiRule;
import com.dscy.pasture.entity.ShouyiZhonglei;
import com.dscy.pasture.service.PetsService;
import com.dscy.pasture.service.ShouyiRuleService;
import com.dscy.pasture.service.ShouyiZhongleiService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shouyiRule")
public class ShouyiRuleController {


    @Autowired
    private ShouyiRuleService shouyiRuleService;

    @Autowired
    private ShouyiZhongleiService shouyiZhongleiService;

    @Autowired
    private PetsService petsService;

    @RequestMapping("/shouyiRuleList")
    public String getShouyiRuleList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(value = "szName",required = false,defaultValue = "") String szName,
                                    @RequestParam(value = "petsName",required = false,defaultValue = "")String petsName,
                                    Model model){
        PageInfo pageInfo = shouyiRuleService.getShouyiRuleList(currentPage,szName,petsName);
        List<ShouyiZhonglei> shouyiZhongleiList = shouyiZhongleiService.selectZhongLeiList();
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("shouyiZhongleiList",shouyiZhongleiList);
        model.addAttribute("petsList",petsList);
        model.addAttribute("szName",szName);
        model.addAttribute("petsName",petsName);
        return "shouyiRuleList";
    }

    @RequestMapping("/delShouyiRuleById")
    @ResponseBody
    public String delShouyiRuleById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        ShouyiRule shouyiRule = shouyiRuleService.selectShouyiRuleById(id);
        if (shouyiRule!=null) {
            int result = shouyiRuleService.delShouyiRuleById(shouyiRule.getSrId());
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




    @RequestMapping("/addShouyiRule")
    @ResponseBody
    public String addShouyiRule(@RequestParam("showId") Integer showId,
                                @RequestParam("quantity") Long quantity,
                                @RequestParam("szId") Integer szId,
                                @RequestParam("petsId") Integer petsId,
                                @RequestParam("ruleType") Integer ruleType){
        Map<String,String> map = new HashMap<>();
        ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);
        if (shouyiZhonglei != null) {
            Pets pets = petsService.queryPetsById(petsId);
            if (pets != null) {
                ShouyiRule shouyiRule = new ShouyiRule();
                shouyiRule.setShowId(showId);
                shouyiRule.setSzId(shouyiZhonglei.getSzId());
                shouyiRule.setSzName(shouyiZhonglei.getSzName());
                shouyiRule.setSzImg(shouyiZhonglei.getSzImg());
                shouyiRule.setPetsId(pets.getPetsId());
                shouyiRule.setPetsName(pets.getPetsName());
                shouyiRule.setPetsImg(pets.getPetsImgUrl());
                shouyiRule.setPetsLevel(pets.getPetsLevel());
                shouyiRule.setRuleType(ruleType);
                shouyiRule.setQuantity(quantity);
                shouyiRule.setAddTime(new Date());
                int result = shouyiRuleService.addShouyiRule(shouyiRule);
                if (result > 0) {
                    map.put("result","true");
                }else {
                    map.put("result","false");
                }
            }else {
                map.put("result","false");
            }
        }else {
            map.put("result","false");
        }
        return JSON.toJSONString(map);
    }



    @RequestMapping("/toUpdateShouyiRuleById")
    public String toUpdateShouyiRuleById(@RequestParam("id") Integer id,
                                         Model model){
        ShouyiRule shouyiRule = shouyiRuleService.selectShouyiRuleById(id);
        List<ShouyiZhonglei> shouyiZhongleiList = shouyiZhongleiService.selectZhongLeiList();
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("shouyiZhongleiList",shouyiZhongleiList);
        model.addAttribute("petsList",petsList);
        model.addAttribute("shouyiRule",shouyiRule);
        return "updateShouyiRule";
    }



    @RequestMapping("/doUpdateShouyiRuleById")
    public String doUpdateShouyiRuleById(@RequestParam("srId") Integer srId,
                                         @RequestParam("showId") Integer showId,
                                         @RequestParam("szId") Integer szId,
                                         @RequestParam("petsId") Integer petsId,
                                         @RequestParam("ruleType") Integer ruleType,
                                         @RequestParam("quantity") Long quantity){
        ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);
        if (shouyiZhonglei != null) {
            Pets pets = petsService.queryPetsById(petsId);
            if (pets != null) {
                ShouyiRule shouyiRule = shouyiRuleService.selectShouyiRuleById(srId);
                shouyiRule.setShowId(showId);
                shouyiRule.setSzId(shouyiZhonglei.getSzId());
                shouyiRule.setSzName(shouyiZhonglei.getSzName());
                shouyiRule.setSzImg(shouyiZhonglei.getSzImg());
                shouyiRule.setPetsId(pets.getPetsId());
                shouyiRule.setPetsName(pets.getPetsName());
                shouyiRule.setPetsImg(pets.getPetsImgUrl());
                shouyiRule.setPetsLevel(pets.getPetsLevel());
                shouyiRule.setRuleType(ruleType);
                shouyiRule.setQuantity(quantity);
                int result = shouyiRuleService.updateShouyiRuleById(shouyiRule);
                if (result > 0) {
                    return "redirect:shouyiRuleList";
                }
            }
        }
        return "";
    }


}
