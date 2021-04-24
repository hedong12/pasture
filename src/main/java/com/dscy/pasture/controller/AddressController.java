package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Address;
import com.dscy.pasture.service.AddressService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户地址——控制器
 */
@Controller
@RequestMapping("/address")
public class AddressController {



    @Autowired
    private AddressService addressService;


    /**
     * 查询用户地址列表
     * @param currentPage
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/addressList")
    public String getAddressList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                 @RequestParam(value = "username",required = false,defaultValue = "") String username,
                                 Model model){
        PageInfo pageInfo = addressService.getAddressList(currentPage,username);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("username",username);
        return "addressList";
    }


    @RequestMapping("/delAddressById")
    @ResponseBody
    public String delAddressById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Address address = addressService.selectAddressById(id);
        if (address != null) {
            int result = addressService.delAddressById(address.getAddressId());
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

    /**
     * 前往地址更新页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toUpdateAddressById")
    public String toUpdateAddressById(@RequestParam("id") Integer id,
                                      Model model){
        Address address = addressService.selectAddressById(id);
        model.addAttribute("address",address);
        return "updateAddress";
    }

    /**
     * 执行更新
     * @param id
     * @param showId
     * @param username
     * @param addressInfo
     * @param phone
     * @param addressStatus
     * @return
     */
    @RequestMapping("/doUpdateAddressById")
    public String doUpdateAddressById(@RequestParam("id") Integer id,
                                      @RequestParam("showId") Integer showId,
                                      @RequestParam("username") String username,
                                      @RequestParam("addressInfo") String addressInfo,
                                      @RequestParam("phone") String phone,
                                      @RequestParam("addressStatus") Integer addressStatus){
        Address address = addressService.selectAddressById(id);
        if (address != null) {
            address.setShowId(showId);
            address.setUsername(username);
            address.setAddressInfo(addressInfo);
            address.setAddressPhone(phone);
            address.setAddressStatus(addressStatus);
            int result = addressService.doUpdateAddressById(address);
            if (result > 0) {
                return "redirect:addressList";
            }
        }
        return "";
    }

}
