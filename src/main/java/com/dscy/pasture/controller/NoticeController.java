package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Notice;
import com.dscy.pasture.service.NoticeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/notice")
public class NoticeController {


    @Autowired
    private NoticeService noticeService;

    /**
     * 查询公告列表
     * @param currentPage
     * @param noticeName
     * @param model
     * @return
     */
    @RequestMapping("/noticeList")
    public String getNoticeList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                @RequestParam(value = "noticeName",required = false,defaultValue = "") String noticeName,
                                Model model){
        PageInfo pageInfo = noticeService.getNoticeList(currentPage,noticeName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("noticeName",noticeName);
        return "noticeList";
    }

    /**
     * 根据id删除公告
     * @return
     */
    @RequestMapping("/delNoticeById")
    @ResponseBody
    public String delNoticeById(@RequestParam("id") Integer nId){
        Map<String,String> map = new HashMap<>();
        Notice notice = noticeService.selectNoticeById(nId);
        if (notice != null) {
            int result = noticeService.delNoticeById(notice.getnId());
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
     * 添加公告
     * @return
     */
    @RequestMapping("/addNotice")
    @ResponseBody
    public String addNotice(@RequestParam("showId") Integer showId,
                            @RequestParam("noticeName") String noticeName,
                            @RequestParam("noticeContent") String noticeContent,
                            @RequestParam("status") Integer status,
                            @RequestParam("sort") Integer sort){
        Map<String,String> map = new HashMap<>();
        Notice notice = new Notice();
        notice.setShowId(showId);
        notice.setNoticeName(noticeName);
        notice.setNoticeContent(noticeContent);
        notice.setStatus(status);
        notice.setSort(sort);
        notice.setAddTime(new Date());
        int result = noticeService.addNotice(notice);
        if (result > 0) {
            map.put("result","true");
        }else {
            map.put("result","false");
        }
        return JSON.toJSONString(map);
    }

    /**
     * 前往更新页面
     * @param nId
     * @param model
     * @return
     */
    @GetMapping("/toUpdateNoticeById/{id}")
    public String toUpdateNoticeById(@PathVariable("id") Integer nId,
                                     Model model){
        Notice notice = noticeService.selectNoticeById(nId);
        model.addAttribute("notice",notice);
        return "updateNotice";
    }

    /**
     * 更新公告信息
     * @param showId
     * @param noticeName
     * @param noticeContent
     * @param status
     * @param sort
     * @param nId
     * @return
     */
    @PostMapping("/doUpdateNoticeByNotice")
    public String doUpdateNoticeByNotice(@RequestParam("showId") Integer showId,
                                         @RequestParam("noticeName") String noticeName,
                                         @RequestParam("noticeContent") String noticeContent,
                                         @RequestParam("status") Integer status,
                                         @RequestParam("sort") Integer sort,
                                         @RequestParam("nId") Integer nId){
        Notice notice = noticeService.selectNoticeById(nId);
        if (notice != null) {
            notice.setShowId(showId);
            notice.setNoticeName(noticeName);
            notice.setNoticeContent(noticeContent);
            notice.setStatus(status);
            notice.setSort(sort);
            int result = noticeService.doUpdateNoticeByNotice(notice);
            if (result > 0) {
                return "redirect:noticeList";
            }
        }
        return "";
    }

}
