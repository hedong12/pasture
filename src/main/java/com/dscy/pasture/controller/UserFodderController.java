package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
<<<<<<< HEAD
import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.entity.User;
import com.dscy.pasture.entity.UserFodder;
import com.dscy.pasture.service.FodderService;
import com.dscy.pasture.service.UserFodderService;
import com.dscy.pasture.service.UserService;
=======
import com.dscy.pasture.entity.UserFodder;
import com.dscy.pasture.service.UserFodderService;
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
import java.util.Map;

@Controller
@RequestMapping("/userFodder")
public class UserFodderController {

    @Autowired
    private UserFodderService userFodderService;

<<<<<<< HEAD
    @Autowired
    private UserService userService;

    @Autowired
    private FodderService fodderService;

=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
    @RequestMapping("/userFodderList")
    public String getUserFodderList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                    @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                    @RequestParam(value = "fodderName",required = false,defaultValue = "") String fodderName,
                                    Model model){
        PageInfo pageInfo = userFodderService.getUserFodderList(currentPage,username,fodderName);
<<<<<<< HEAD
        List<User> userList = userService.queryUserList();
        List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        model.addAttribute("userList",userList);
        model.addAttribute("fodderList",fodderList);
=======
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
        model.addAttribute("fodderName",fodderName);
        return "userFodderList";
    }


    @RequestMapping("/delUserFodderById")
    @ResponseBody
    public String delUserFodderById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        UserFodder userFodder = userFodderService.selectUserFodderById(id);
        if (userFodder != null){
            int result = userFodderService.delUserFodderById(userFodder.getUfId());
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


<<<<<<< HEAD
    @RequestMapping("/toUpdateUserFodderById")
    public String toUpdateUserFodderById(@RequestParam("id") Integer id,
                                         Model model){
        UserFodder userFodder = userFodderService.selectUserFodderById(id);
        List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
        model.addAttribute("fodderList",fodderList);
        model.addAttribute("userFodder",userFodder);
        return "updateUserFodder";
    }


    @RequestMapping("/doUpdateUserFodderById")
    public String doUpdateUserFodderById(@RequestParam("ufId") Integer ufId,
                                         @RequestParam("showId") Integer showId,
                                         @RequestParam("fodderId") Integer fodderId,
                                         @RequestParam("userFodderNum") Long userFodderNum){
        UserFodder userFodder = userFodderService.selectUserFodderById(ufId);
        if (userFodder != null) {
            userFodder.setShowId(showId);
            userFodder.setUserFodderNum(userFodderNum);
            Fodder fodder = fodderService.selectFooderById(fodderId);
            if (fodder != null) {
                userFodder.setFodderId(fodder.getFodderId());
                userFodder.setFodderName(fodder.getFodderName());
                userFodder.setFodderImg(fodder.getFodderImgUrl());
            }
            int result = userFodderService.doUpdateUserFodderById(userFodder);
            if (result > 0) {
                return "redirect:userFodderList";
            }
        }
        return "";
    }


    @RequestMapping("/addUserFodder")
    @ResponseBody
    public String addUserFodder(@RequestParam("showId") Integer showId,
                                @RequestParam("userFodderNum") Long userFodderNum,
                                @RequestParam("userId") Integer userId,
                                @RequestParam("fodderId") Integer fodderId){
        Map<String,String> map = new HashMap<>();
        UserFodder userFodder = new UserFodder();
        userFodder.setShowId(showId);
        userFodder.setUserFodderNum(userFodderNum);
        User user = userService.selectUserById(userId);
        if (user != null) {
            userFodder.setUserId(user.getUserId());
            userFodder.setUsername(user.getUsername());
        }
        Fodder fodder = fodderService.selectFooderById(fodderId);
        if(fodder != null) {
            userFodder.setFodderId(fodder.getFodderId());
            userFodder.setFodderName(fodder.getFodderName());
            userFodder.setFodderImg(fodder.getFodderImgUrl());
        }
        int result = userFodderService.addUserFodder(userFodder);
        if (result > 0) {
            map.put("result","true");
        }else {
            map.put("result","false");
        }

        return JSON.toJSONString(map);
    }
=======

>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
