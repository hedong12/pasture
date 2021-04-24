package com.dscy.pasture.controller;

import com.dscy.pasture.service.SignRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/signRecord")
public class SignRecordController {


    @Autowired
    private SignRecordService signRecordService;

    @RequestMapping("/signRecordList")
    public String getSignRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                    Model model){
        PageInfo pageInfo = signRecordService.getSignRecordList(currentPage,username);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        return "signRecordList";
    }
}
