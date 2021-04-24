package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.AdminUser;
import com.dscy.pasture.service.AdminUserService;
import com.dscy.pasture.service.UserService;
import com.dscy.pasture.util.Constants;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 总后台
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private UserService userService;

    /**
     * 管理员登录
     * @param phone
     * @param password
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam("phone") String phone,
                        @RequestParam("password") String password,
                        HttpServletRequest request){
        AdminUser adminUser = adminUserService.login(phone,password);
        if (adminUser!=null){ //登录成功
            request.getSession().setAttribute(Constants.USER_SESSION,adminUser);
            //跳转到后台页
            return "redirect:toIframe";
        }
        // 登录失败
        return "adminLogin";
    }

    /**
     * 中转——后台首页
     * @return
     */
    @RequestMapping("/toHome")
    public String toHome(HttpServletRequest request,
                         @RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                         @RequestParam(value = "username",required = false,defaultValue = "") String username,
                         @RequestParam(value = "userPhone",required = false,defaultValue = "") String userPhone,
                         Model model){

        AdminUser adminUser = (AdminUser) request.getSession().getAttribute(Constants.USER_SESSION);
        PageInfo pageInfo = userService.getUserList(currentPage,username,userPhone);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("adminUser",adminUser);
        // 数据回显
        model.addAttribute("username",username);
        model.addAttribute("userPhone",userPhone);
        return "home";
    }


    /**
     * 中转——后台首页
     * @return
     */
    @RequestMapping("/toIframe")
    public String toIframe(HttpServletRequest request,
                         Model model){
        AdminUser adminUser = (AdminUser) request.getSession().getAttribute(Constants.USER_SESSION);
        model.addAttribute("adminUser",adminUser);
        return "iframe";
    }


    @RequestMapping("/toregister")
    public String toregister(){
        return "register";
    }

    /**
     * 根据管理员手机号查询
     * @param phone
     * @return
     */
    @RequestMapping("/getAdminByPhone")
    @ResponseBody
    public String getAdminByPhone(@RequestParam("phone") String phone){
        AdminUser adminUser = adminUserService.getAdminByPhone(phone);
        Map<String,String> map = new HashMap<>();
        if (adminUser!=null){   // 手机号已存在
            map.put("res","error");
        }else {
            map.put("res","scuess");
        }
        return JSON.toJSONString(map);
    }


    /**
     * 注册账号
     * @return
     */
    @RequestMapping("/doregister")
    public String doregister(@RequestParam("adminUser") String adminName,
                             @RequestParam("password") String password,
                             @RequestParam("phone") String phone,
                             @RequestParam("pasture_name") String pasture_name,
                             HttpSession session,
                             Model model){
        AdminUser isAdminUser = adminUserService.getAdminByPhone(phone);
        if (isAdminUser != null){
            return "register";
        }
        AdminUser adminUser = new AdminUser();
        adminUser.setAdminName(adminName);
        adminUser.setPassword(password);
        adminUser.setPhone(phone);
        adminUser.setPastureName(pasture_name);
        adminUser.setStatus(0);
        adminUser.setAddTime(new Date());
        int result = adminUserService.addAdminUser(adminUser);
        if (result > 0){ // 添加成功
            AdminUser resultAdminUser = adminUserService.login(phone,password);
            session.setAttribute(Constants.USER_SESSION,resultAdminUser);
            return "redirect:toIframe";
        }
        // 添加失败

        return "register";
    }

    /**
     * 退出
     * @return
     */
    @RequestMapping("/loginout")
    public String loginOut(HttpServletRequest request){
        if (request.getSession().getAttribute(Constants.USER_SESSION) != null){
            request.getSession().removeAttribute(Constants.USER_SESSION);
        }
        return "admin";
    }

    /**
     * 前往我的信息页面
     * @return
     */
    @RequestMapping("/toMyInfo")
    public String toMyInfo(@RequestParam("adminId") String adminId2){
        Integer adminId = Integer.parseInt(adminId2);

        return "";
    }


}
