package com.dscy.pasture.controller;

import com.dscy.pasture.service.VideoRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/videoRecord")
public class VideoRecordController {

    @Autowired
    private VideoRecordService videoRecordService;


    @RequestMapping("/videoRecordList")
    public String getVideoRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                     @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                     @RequestParam(value = "videoFodderName",required = false,defaultValue = "") String videoFodderName,
                                     Model model){
        PageInfo pageInfo = videoRecordService.getVideoRecordList(currentPage,username,videoFodderName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("videoFodderName",videoFodderName);
        return "videoRecordList";
    }
}
