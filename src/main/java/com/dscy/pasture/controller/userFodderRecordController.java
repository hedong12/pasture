package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.UserFodderRecord;
import com.dscy.pasture.service.UserFodderRecordService;
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
@RequestMapping("/userFodderRecord")
public class userFodderRecordController {

    @Autowired
    private UserFodderRecordService userFodderRecordService;

    /**
     * 查询用户饲料记录列表
     * @param currentPage
     * @param username
     * @param fodderName
     * @param model
     * @return
     */
    @RequestMapping("/userFodderRecordList")
    public String getUserFodderRecordList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                          @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                          @RequestParam(value = "fodderName",required = false,defaultValue = "") String fodderName,
                                          Model model){
        PageInfo pageInfo = userFodderRecordService.getUserFodderRecordList(currentPage,username,fodderName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("fodderName",fodderName);
        return "userFodderRecordList";
    }

    /**
     * 根据Id删除用户饲料记录
     * @return
     */
    @RequestMapping("/delUserFodderRecordById")
    @ResponseBody
    public String delUserFodderRecordById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        UserFodderRecord userFodderRecord = userFodderRecordService.selectUserFodderRecordById(id);
        if (userFodderRecord != null) {
            int result = userFodderRecordService.delUserFodderRecordById(userFodderRecord.getUfrId());
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
