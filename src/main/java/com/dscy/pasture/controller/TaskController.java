package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Task;
import com.dscy.pasture.service.TaskService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/task")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @RequestMapping("/taskList")
    public String getTaskList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                              @RequestParam(value = "taskName",required = false,defaultValue = "") String taskName,
                              Model model){
        PageInfo pageInfo = taskService.getTaskList(currentPage,taskName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("taskName",taskName);
        return "taskList";
    }


    @RequestMapping("/delTaskById")
    @ResponseBody
    public String delTaskById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Task task = taskService.selectTaskById(id);
        if (task != null) {
            int result = taskService.delTaskById(task.getId());
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



    @RequestMapping("/addTask")
    @ResponseBody
    public String addTask(@RequestParam("showId") Integer showId,
                          @RequestParam("taskName") String taskName,
                          @RequestParam("taskContent") String taskContent,
                          @RequestParam("guizeId") Integer guizeId,
                          @RequestParam("status") Integer status,
                          @RequestParam("taskType") Integer taskType){
        Map<String,String> map = new HashMap<>();
        Task task = new Task();
        task.setShowId(showId);
        task.setTaskName(taskName);
        task.setTaskContent(taskContent);
        task.setGuizeId(guizeId);
        task.setStatus(status);
        task.setAddTime(new Date());
        task.setTaskType(taskType);
        int result = taskService.addTask(task);
        if (result > 0) {
            map.put("result","true");
        }else {
            map.put("result","false");
        }
        return JSON.toJSONString(map);
    }


    @RequestMapping("/toUpdateTaskById/{id}")
    public String toUpdateTaskById(@PathVariable("id") Integer id,
                                   Model model){
        Task task = taskService.selectTaskById(id);
        model.addAttribute("task",task);
        return "updateTask";
    }



    @RequestMapping("/doUpdateTaskById")
    public String doUpdateTaskById(@RequestParam("id") Integer id,
                                   @RequestParam("showId") Integer showId,
                                   @RequestParam("taskName") String taskName,
                                   @RequestParam("taskContent") String taskContent,
                                   @RequestParam("guizeId") Integer guizeId,
                                   @RequestParam("status") Integer status,
                                   @RequestParam("taskType") Integer taskType){
        Task task = taskService.selectTaskById(id);
        if (task!=null) {
            task.setShowId(showId);;
            task.setTaskName(taskName);
            task.setTaskContent(taskContent);
            task.setTaskType(taskType);
            task.setGuizeId(guizeId);
            task.setStatus(status);
            int result = taskService.doUpdateTaskById(task);
            if (result > 0) {
                return "redirect:taskList";
            }
        }

        return "";
    }





}
