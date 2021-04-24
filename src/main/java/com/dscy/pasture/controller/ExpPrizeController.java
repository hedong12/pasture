package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ExpPrize;
import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.service.ExpPrizeService;
import com.dscy.pasture.service.FodderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 经验奖励
 */
@Controller
@RequestMapping("/expprize")
public class ExpPrizeController {

    @Autowired
    private ExpPrizeService expPrizeService;

    @Autowired
    private FodderService fodderService;

    @RequestMapping("/expPrizeList")
    public String getExpPrizeList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                  @RequestParam(value = "expPrizeName",required = false,defaultValue = "") String expPrizeName,
                                  Model model){
        PageInfo pageInfo = expPrizeService.getExpPrizeList(expPrizeName,currentPage);

        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("expPrizeName",expPrizeName);

        return "expPrizeList";
    }

    @RequestMapping("/delExpPrizeById")
    @ResponseBody
    public String delExpPrizeById(@RequestParam("id") Integer eId){
        Map<String,String> map = new HashMap<>();
        ExpPrize expPrize = expPrizeService.selectExpPrizeById(eId);
        if (expPrize != null){
            int result = expPrizeService.delExpPrizeById(expPrize.geteId());
            if (result > 0){
                map.put("result","true");
            }else {
                map.put("result","false");
            }
        }else {
            map.put("result","notexist");
        }
        return JSON.toJSONString(map);
    }


    @RequestMapping("/addExpPrize")
    @ResponseBody
    public String addExpPrize(@RequestParam("showId") Integer showId,
                              @RequestParam("num") Integer num,
                              @RequestParam("hotelNo") Integer hotelNo,
                              @RequestParam("expPrizeName") String expPrizeName){
        Fodder fodder = fodderService.selectFooderById(hotelNo);
        Map<String,String> map = new HashMap<>();
        if (fodder != null) {
            ExpPrize expPrize = new ExpPrize();
            expPrize.setExpPrizeName(expPrizeName);
            expPrize.setShowId(showId);
            expPrize.setNum(num);
            expPrize.setExpId(fodder.getFodderId());
            expPrize.setExpName(fodder.getFodderName());
            expPrize.setExpImg(fodder.getFodderImgUrl());
            expPrize.setAddTime(new Date());
            int result = expPrizeService.addExpPrize(expPrize);
            if (result > 0) {
                map.put("result","true");
            }
        }

        return JSON.toJSONString(map);
    }

    /**
     * 新增饲料奖品时查询出饲料列表
     * @return
     */
    @RequestMapping(value = "/getExpPrizeFodderList",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getExpPrizeFodderList(HttpServletResponse response)  throws Exception{
       List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("fodderList",fodderList);
       return JSON.toJSONString(map);
    }

    /**
     * 前往经验饲料奖品更新页面
     * @param eid
     * @param model
     * @return
     */
    @RequestMapping("/toUpdateExpPrizeById")
    public String toUpdateExpPrizeById(@RequestParam("id") Integer eid,
                                       Model model){
        List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
        ExpPrize expPrize = expPrizeService.selectExpPrizeById(eid);
        model.addAttribute("expPrize",expPrize);
        model.addAttribute("fodderList",fodderList);
        return "updateExpPrize";
    }


    @RequestMapping("/doUpdateExpPrizeById")
    public String doUpdateExpPrizeById(@RequestParam("eId") Integer eId,
                                       @RequestParam("showId") Integer showId,
                                       @RequestParam("expPrizeName") String expPrizeName,
                                       @RequestParam("fodderId") Integer fodderId,
                                       @RequestParam("num") Integer num){
        Fodder fodder = fodderService.selectFooderById(fodderId);
        if (fodder != null) {
            ExpPrize expPrize = expPrizeService.selectExpPrizeById(eId);
            expPrize.setShowId(showId);
            expPrize.setExpPrizeName(expPrizeName);
            expPrize.setExpId(fodder.getFodderId());
            expPrize.setExpName(fodder.getFodderName());
            expPrize.setExpImg(fodder.getFodderImgUrl());
            expPrize.setNum(num);
            int result = expPrizeService.doUpdateExpPrizeById(expPrize);
            if (result > 0) {
                return "redirect:expPrizeList";
            }

        }
        return "redirect:toUpdateExpPrizeById";
    }
}
