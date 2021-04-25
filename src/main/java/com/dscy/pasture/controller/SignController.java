package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ExpPrize;
import com.dscy.pasture.entity.Sign;
import com.dscy.pasture.service.ExpPrizeService;
import com.dscy.pasture.service.SignService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @Autowired
    private ExpPrizeService expPrizeService;

    @RequestMapping("/signList")
    public String getSignList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                              @RequestParam(value = "signName",required = false,defaultValue = "") String signName,
                              @RequestParam(value = "expPrizeName",required = false,defaultValue = "") String expPrizeName,
                              Model model
                              ){
        PageInfo pageInfo = signService.getSignList(currentPage,signName,expPrizeName);
        List<ExpPrize> expPrizeList  = expPrizeService.getPetsExpPrizeList();
        model.addAttribute("expPrizeList",expPrizeList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("signName",signName);
        model.addAttribute("expPrizeName",expPrizeName);
        return "signList";
    }


    @RequestMapping("/delSignById")
    @ResponseBody
    public String delSignById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Sign sign = signService.getSignById(id);
        if (sign != null) {
            int result = signService.delSignById(sign.getsId());
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



    @RequestMapping("/toUpdateSignById")
    public String toUpdateSignById(@RequestParam("id") Integer id,
                                   Model model){
        Sign sign = signService.getSignById(id);
        List<ExpPrize> expPrizeList = expPrizeService.getPetsExpPrizeList();
        model.addAttribute("sign",sign);
        model.addAttribute("expPrizeList",expPrizeList);
        return "updateSign";
    }



    @RequestMapping("/doUpdateSignById")
    public String doUpdateSignById(@RequestParam("id") Integer id,
                                   @RequestParam("showId") Integer showId,
                                   @RequestParam("signName") String signName,
                                   @RequestParam("signDay") Integer signDay,
                                   @RequestParam("status") Integer status,
                                   @RequestParam("eId") Integer eId){
        Sign sign = signService.getSignById(id);
        if (sign != null) {
            sign.setShowId(showId);
            sign.setSignName(signName);
            sign.setSignDay(signDay);
            sign.setStatus(status);
            ExpPrize expPrize = expPrizeService.selectExpPrizeById(eId);
            if (expPrize != null) {
                sign.setExpPrizeId(expPrize.geteId());
                sign.setExpPrizeName(expPrize.getExpPrizeName());
            }
            int result = signService.doUpdateSignById(sign);
            if (result > 0) {
                return "redirect:signList";
            }
        }
        return "";
    }


    @RequestMapping("/addSign")
    @ResponseBody
    public String addSign(@RequestParam("showId") Integer showId,
                          @RequestParam("signName") String signName,
                          @RequestParam("signDay") Integer signDay,
                          @RequestParam("status") Integer status,
                          @RequestParam("expPrizeId") Integer eId){
        Map<String,String> map = new HashMap<>();
        Sign sign = new Sign();
        sign.setShowId(showId);
        sign.setSignName(signName);
        sign.setSignDay(signDay);
        sign.setStatus(status);
        ExpPrize expPrize = expPrizeService.selectExpPrizeById(eId);
        if (expPrize!=null) {
            sign.setExpPrizeId(expPrize.geteId());
            sign.setExpPrizeName(expPrize.getExpPrizeName());
        }
        int result = signService.addSign(sign);
        if (result > 0) {
            map.put("result","true");
        }else {
            map.put("result","false");
        }
        return JSON.toJSONString(map);
    }



}
