package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/delUserById")
    @ResponseBody
    public String delUserById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Boolean flag = userService.delUserById(id);
        if (flag) {
            map.put("flag","true");
        }else {
            map.put("flag","false");
        }

        return JSON.toJSONString(map);
    }
}
