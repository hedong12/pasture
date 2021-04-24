package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ExpPrize;
import com.dscy.pasture.entity.ImgCache;
import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.service.ExpPrizeService;
import com.dscy.pasture.service.ImgCacheService;
import com.dscy.pasture.service.PetsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 宠物 - Controller
 */
@Controller
@RequestMapping("/pets")
public class PetsController {


    @Autowired
    private PetsService petsService;

    @Autowired
    private ExpPrizeService expPrizeService;

    @Autowired
    private ImgCacheService imgCacheService;

    /**
     * 前往宠物列表
     * @return
     */
    @RequestMapping("/petsList")
    public String toPetsList( @RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                              @RequestParam(value = "petsName",required = false,defaultValue = "") String petsName,
                              Model model){
        PageInfo pageInfo = petsService.selectPetsList(currentPage,petsName);
        List<ImgCache> imgCacheList = imgCacheService.getPetsImgCacheList();
        model.addAttribute("imgCacheList",imgCacheList);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("petsName",petsName);
        return "petsList";
    }

    /**
     * 根据删除宠物Id删除
     * @param petsId
     * @return
     */
    @RequestMapping("/delPetsBypetsId")
    @ResponseBody
    public String delPetsBypetsId(@RequestParam("petsIdval") Integer petsId){
        Map<String,String> map = new HashMap<>();
        Pets pets = petsService.queryPetsById(petsId);
        if (pets!=null){
            //执行删除
            int result = petsService.delPetsBypetsId(pets.getPetsId());
            if (result>0){//删除成功
                map.put("result","true");
            }else {
                map.put("result","false");
            }
        }else {
            // 数据不存在
            map.put("result","notexist");
        }

        return JSON.toJSONString(map);
    }

    /**
     * 添加宠物
     * @return
     */
    @RequestMapping("/addPets")
    @ResponseBody
    public String addPets(@RequestParam("showId") Integer showId,
                          @RequestParam("petsNametxt") String petsNametxt,
                          @RequestParam("petsLevel") Integer petsLevel,
                          @RequestParam("petsExp") String petsExp,
                          @RequestParam("expPrizeEId") Integer eId,
                          @RequestParam("imgCacheId") Integer imgCacheId,
                          @RequestParam("petsStatus") Integer petsStatus){
        Map<String,String> map = new HashMap<>();
        if (imgCacheId != null) {
            ExpPrize expPrize = expPrizeService.selectExpPrizeById(eId);
            ImgCache imgCache = imgCacheService.getImgCacheById(imgCacheId);
            Pets pets = new Pets();
            pets.setShowId(showId);
            pets.setPetsName(petsNametxt);
            pets.setPetsLevel(petsLevel);
            pets.setPetsExp(petsExp);
            pets.setPetsImgId(imgCache.getImgCacheId());
            pets.setPetsImgUrl(imgCache.getImgCacheUrl());
            pets.setPetsExpPrizeId(expPrize.geteId());
            pets.setPetsExpPrizeName(expPrize.getExpPrizeName());
            pets.setPetsStatus(petsStatus);
            int result = petsService.addPets(pets);
            if (result > 0){
                map.put("result","true");
            }else {
                map.put("result","false");
            }
        }
        return JSON.toJSONString(map);
    }

    /**
     * 根据id查询宠物信息
     * @return
     */
    @RequestMapping("/queryPetsById")
    public String queryPetsById(@RequestParam("id") Integer petsId,
                                Model model){
        Pets pets = petsService.queryPetsById(petsId);
        if (pets != null){
            model.addAttribute("pets",pets);
            return "updatePets";
        }
        return "redirect:petsList";
    }

    /**
     * 宠物更新
     * @return
     */
    @RequestMapping("/updatePetsByID")
    public String updatePetsByID(@RequestParam("petsId") Integer petsId,
                                 @RequestParam("showId") Integer showId,
                                 @RequestParam("petsName") String petsName,
                                 @RequestParam("petsLevel") Integer petsLevel,
                                 @RequestParam("petsExp") String petsExp,
                                 @RequestParam("petsStatus") Integer petsStatus){
        Pets pets2 = petsService.queryPetsById(petsId);
        Pets pets = new Pets();
        pets.setPetsId(pets2.getPetsId());
        pets.setShowId(showId);
        pets.setPetsName(petsName);
        pets.setPetsLevel(petsLevel);
        pets.setPetsExp(petsExp);
        pets.setPetsStatus(petsStatus);
        int result =petsService.updatePetsById(pets);
        if (result > 0){
            return "redirect:petsList";
        }
        return "updatePets";

    }



    /**
     * 新增宠物时查询出经验奖品列表
     * @return
     */
    @RequestMapping(value = "/getPetsExpPrizeList",produces="application/json;charset=utf-8")
    @ResponseBody
    public String getPetsExpPrizeList(HttpServletResponse response)  throws Exception{
        List<ExpPrize> expPrizeList = expPrizeService.getPetsExpPrizeList();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("expPrizeList",expPrizeList);
        return JSON.toJSONString(map);
    }



}
