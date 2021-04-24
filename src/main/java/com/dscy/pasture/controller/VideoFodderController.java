package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
<<<<<<< HEAD
import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.entity.VideoFodder;
import com.dscy.pasture.service.FodderService;
import com.dscy.pasture.service.PetsService;
=======
import com.dscy.pasture.entity.VideoFodder;
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
import com.dscy.pasture.service.VideoFodderService;
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
@RequestMapping("/videoFodder")
public class VideoFodderController {

    @Autowired
    private VideoFodderService videoFodderService;

<<<<<<< HEAD
    @Autowired
    private FodderService fodderService;

    @Autowired
    private PetsService petsService;

=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
    /**
     * 查询视频饲料列表——模糊
     * @param currentPage
     * @param videoFodderName
     * @param fodderName
     * @param petsName
     * @param model
     * @return
     */
    @RequestMapping("/videoFodderList")
    public String getVideoFodderList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                     @RequestParam(value = "videoFodderName",required = false,defaultValue = "") String videoFodderName,
                                     @RequestParam(value = "fodderName",required = false,defaultValue = "") String fodderName,
                                     @RequestParam(value = "petsName",required = false,defaultValue = "") String petsName,
                                     Model model){
        PageInfo pageInfo = videoFodderService.getVideoFodderList(currentPage,videoFodderName,fodderName,petsName);
<<<<<<< HEAD
        List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("fodderList",fodderList);
        model.addAttribute("petsList",petsList);
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("videoFodderName",videoFodderName);
        model.addAttribute("fodderName",fodderName);
        model.addAttribute("petsName",petsName);
        return "videoFodderList";
    }


    @RequestMapping("/delVideoFodderById")
    @ResponseBody
    public String delVideoFodderById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        VideoFodder videoFodder = videoFodderService.selectVideoFodderById(id);
        if (videoFodder != null) {
            int result = videoFodderService.delVideoFodderById(videoFodder.getVfId());
            if (result>0) {
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

    @RequestMapping("/toUpdateVideoFodderById")
    public String toUpdateVideoFodderById(@RequestParam("id") Integer id,
                                          Model model){
        VideoFodder videoFodder = videoFodderService.selectVideoFodderById(id);
        List<Fodder> fodderList = fodderService.getExpPrizeFodderList();
        List<Pets> petsList = petsService.queryPetsList();
        model.addAttribute("videoFodder",videoFodder);
        model.addAttribute("fodderList",fodderList);
        model.addAttribute("petsList",petsList);
        return "updateVideoFodder";
    }


    @RequestMapping("/doUpdateVideoFodderById")
    public String doUpdateVideoFodderById(@RequestParam("vfId") Integer vfId,
                                          @RequestParam("showId") Integer showId,
                                          @RequestParam("videoFodderName") String videoFodderName,
                                          @RequestParam("num") Long num,
                                          @RequestParam("fodderId") Integer fodderId,
                                          @RequestParam("petsId") Integer petsId){
        VideoFodder videoFodder = videoFodderService.selectVideoFodderById(vfId);
        if (videoFodder != null) {
            videoFodder.setShowId(showId);
            videoFodder.setVideoFodderName(videoFodderName);
            videoFodder.setNum(num);
            Fodder fodder = fodderService.selectFooderById(fodderId);
            if (fodder != null) {
                videoFodder.setFodderId(fodder.getFodderId());
                videoFodder.setFodderName(fodder.getFodderName());
                videoFodder.setFodderImg(fodder.getFodderImgUrl());
            }
            Pets pets = petsService.queryPetsById(petsId);
            if (pets != null) {
                videoFodder.setPetsId(pets.getPetsId());
                videoFodder.setPetsName(pets.getPetsName());
                videoFodder.setPetsLevel(pets.getPetsLevel());
            }
            int result = videoFodderService.doUpdateVideoFodderById(videoFodder);
            if (result > 0) {
                return "redirect:videoFodderList";
            }
        }
        return "";
    }




    @RequestMapping("/addVideoFodder")
    @ResponseBody
    public String addVideoFodder(@RequestParam("showId") Integer showId,
                                 @RequestParam("num") Long num,
                                 @RequestParam("videoFodderName") String videoFodderName,
                                 @RequestParam("fodderId") Integer fodderId,
                                 @RequestParam("petsId") Integer petsId){
        Map<String,String> map = new HashMap<>();
        VideoFodder videoFodder = new VideoFodder();
        videoFodder.setShowId(showId);
        videoFodder.setVideoFodderName(videoFodderName);
        videoFodder.setNum(num);
        Fodder fodder = fodderService.selectFooderById(fodderId);
        if (fodder != null) {
            videoFodder.setFodderId(fodder.getFodderId());
            videoFodder.setFodderName(fodder.getFodderName());
            videoFodder.setFodderImg(fodder.getFodderImgUrl());
        }
        Pets pets = petsService.queryPetsById(petsId);
        if (pets != null) {
            videoFodder.setPetsId(pets.getPetsId());
            videoFodder.setPetsName(pets.getPetsName());
            videoFodder.setPetsLevel(pets.getPetsLevel());
        }
        int result = videoFodderService.addVideoFodder(videoFodder);
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
