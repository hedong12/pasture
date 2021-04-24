package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Sign;
import com.dscy.pasture.service.SignService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @RequestMapping("/signList")
    public String getSignList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                              @RequestParam(value = "signName",required = false,defaultValue = "") String signName,
                              @RequestParam(value = "expPrizeName",required = false,defaultValue = "") String expPrizeName,
                              Model model
                              ){
        PageInfo pageInfo = signService.getSignList(currentPage,signName,expPrizeName);
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

}
