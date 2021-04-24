package com.dscy.pasture.controller;

import com.dscy.pasture.service.GetRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 领取记录——控制器
 */
@Controller
@RequestMapping("/getRecord")
public class GetRecordList {


    @Autowired
    private GetRecordService getRecordService;

    @RequestMapping("/getRecordList")
    public String getRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                @RequestParam(value = "prizeName",required = false,defaultValue = "") String prizeName,
                                Model model){
        PageInfo pageInfo = getRecordService.getRecordList(currentPage,username,prizeName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("prizeName",prizeName);
        return "getRecordList";
    }

}
