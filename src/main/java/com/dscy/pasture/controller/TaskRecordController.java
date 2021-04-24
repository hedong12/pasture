package com.dscy.pasture.controller;

import com.dscy.pasture.service.TaskRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/taskRecord")
public class TaskRecordController {



    @Autowired
    private TaskRecordService taskRecordService;


    @RequestMapping("/taskRecordList")
    public String getTaskRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                    @RequestParam(value = "taskName",required = false,defaultValue = "") String taskName,
                                    Model model){
        PageInfo pageInfo = taskRecordService.getTaskRecordList(currentPage,username,taskName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("taskName",taskName);
        return "taskRecordList";
    }
}
