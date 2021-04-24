package com.dscy.pasture.controller;

import com.dscy.pasture.service.CashRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cashRecord")
public class CashRecordController {


    @Autowired
    private CashRecordService cashRecordService;

    @RequestMapping("/cashRecordList")
    public String getCashRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                    @RequestParam(value = "szName",required = false,defaultValue = "") String szName,
                                    Model model){
        PageInfo pageInfo = cashRecordService.getCashRecordList(currentPage,username,szName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("szName",szName);
        return "cashRecordList";
    }
}
