package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ShouyiLedger;
import com.dscy.pasture.service.ShouyiLedgerService;
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
@RequestMapping("/shouyiLedger")
public class shouyiLedgerController {



    @Autowired
    private ShouyiLedgerService shouyiLedgerService;

    @RequestMapping("/shouyiLedgerList")
    public String getShouyiLedgerList(@RequestParam(value = "cn",required = false,defaultValue = "1") Integer currentPage,
                                      @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                      @RequestParam(value = "szName",required = false,defaultValue = "") String szName,
                                      Model model){
        PageInfo pageInfo = shouyiLedgerService.getShouyiLedgerList(currentPage,username,szName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("szName",szName);
        return "shouyiLedgerList";
    }



    @RequestMapping("delLedgerById")
    @ResponseBody
    public String delLedgerById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        ShouyiLedger shouyiLedger = shouyiLedgerService.selectLedgerById(id);
        if (shouyiLedger!=null) {
            int result = shouyiLedgerService.delLedgerById(shouyiLedger.getSlId());
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
