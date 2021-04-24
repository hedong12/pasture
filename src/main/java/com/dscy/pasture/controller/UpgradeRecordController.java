package com.dscy.pasture.controller;

import com.dscy.pasture.service.UpgradeRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/upgradeRecord")
public class UpgradeRecordController{

    @Autowired
    private UpgradeRecordService upgradeRecordService;

    /**
     * 查询升级记录列表
     * @param currentPage
     * @param username
     * @param petsName
     * @param model
     * @return
     */
    @RequestMapping("/upgradeRecordList")
    public String getUpgradeRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                       @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                       @RequestParam(value = "petsName",required = false,defaultValue = "") String petsName,
                                       Model model){
        PageInfo pageInfo = upgradeRecordService.getUpgradeRecordList(currentPage,username,petsName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("petsName",petsName);
        return "upgradeRecordList";
    }

}
