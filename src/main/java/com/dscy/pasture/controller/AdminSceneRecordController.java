package com.dscy.pasture.controller;

import com.dscy.pasture.service.AdminSceneRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 管理员场景记录——控制器
 */
@Controller
@RequestMapping("/adminSceneRecord")
public class AdminSceneRecordController {

    @Autowired
    private AdminSceneRecordService adminSceneRecordService;


    @RequestMapping("/adminSceneRecordList")
    public String getAdminSceneRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                          @RequestParam(value = "pastureName",required = false,defaultValue = "") String pastureName,
                                          @RequestParam(value = "sceneName",required = false,defaultValue = "") String sceneName,
                                          Model model){
        PageInfo pageInfo = adminSceneRecordService.getAdminSceneRecordList(currentPage,pastureName,sceneName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("pastureName",pastureName);
        model.addAttribute("sceneName",sceneName);
        return "adminSceneRecordList";
    }




}
