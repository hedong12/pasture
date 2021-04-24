package com.dscy.pasture.controller;

import com.dscy.pasture.service.ShouyiLiushuiService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 收益流水-控制器
 */
@Controller
@RequestMapping("/revenueLiushui")
public class RevenueLiushuiController {


    @Autowired
    private ShouyiLiushuiService shouyiLiushuiService;


    /**
     * 查询收益流水列表
     * @param currentPage
     * @param username
     * @param szName
     * @param model
     * @return
     */
    @RequestMapping("/revenueLiushuiList")
    public String getRevenueLiushuiList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                        @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                        @RequestParam(value = "szName",required = false,defaultValue = "") String szName,
                                        Model model){
        PageInfo pageInfo = shouyiLiushuiService.getRevenueLiushuiList(currentPage,username,szName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("szName",szName);
        return "revenueLiushuiList";
    }

}
