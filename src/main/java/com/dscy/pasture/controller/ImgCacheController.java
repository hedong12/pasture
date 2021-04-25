package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ImgCache;
import com.dscy.pasture.service.ImgCacheService;
import com.dscy.pasture.util.FileUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 图片-controller
 */
@Controller
@RequestMapping("/imgcache")
public class ImgCacheController {

    @Autowired
    private ImgCacheService imgCacheService;

    /**
     * 查询图片列表-分页
     * @param currentPage
     * @param model
     * @return
     */
    @RequestMapping("/imgCacheList")
    public String imgCacheList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                               @RequestParam(value = "imgCacheName",required = false,defaultValue = "") String imgCacheName,
                               Model model){
        PageInfo pageInfo = imgCacheService.getImgCacheList(imgCacheName,currentPage);
        model.addAttribute("imgCacheName",imgCacheName);
        model.addAttribute("pageInfo",pageInfo);
        return "imgCacheList";
    }

    /**
     * 根据id删除图片
     * @return
     */
    @RequestMapping("/delImgCacheById")
    @ResponseBody
    public String delImgCacheById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        ImgCache imgCache = imgCacheService.getImgCacheById(id);
        if (imgCache!=null) {
            int result = imgCacheService.delImgCacheById(imgCache.getImgCacheId());
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


    @RequestMapping("/toUpdateImgcacheById")
    public String toUpdateImgcacheById(@RequestParam("id") Integer id,
                                       Model model){
        ImgCache imgCache = imgCacheService.getImgCacheById(id);
        model.addAttribute("imgCache",imgCache);
        return "updateImgCache";
    }


    @RequestMapping("/doUpdateImgcacheById")
    public String doUpdateImgcacheById(@RequestParam("fileName") MultipartFile file,
                                       @RequestParam("imgCacheId") Integer imgCacheId,
                                       @RequestParam("showId") Integer showId,
                                       @RequestParam("imgCacheName") String imgCacheName,
                                       @RequestParam("imgCacheStatus") Integer imgCacheStatus){
        ImgCache imgCache = imgCacheService.getImgCacheById(imgCacheId);
        if (imgCache != null) {
            if (file.getSize() / 1000 > 10000){
                return "";
            }else {
                //判断上传文件格式
                String fileType = file.getContentType();
                if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                    final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                    String fileName = file.getOriginalFilename();
                    //获取文件后缀名
                    String suffixName = fileName.substring(fileName.lastIndexOf("."));
                    //重新生成文件名
                    fileName = UUID.randomUUID()+suffixName;
                    if (FileUtils.upload(file, localPath, fileName)) {
                        imgCache.setShowId(showId);
                        imgCache.setImgCacheName(imgCacheName);
                        imgCache.setImgCacheUrl(fileName);
                        imgCache.setImgCacheStatus(imgCacheStatus);
                        int result = imgCacheService.doUpdateImgcacheById(imgCache);
                        if (result > 0) {
                            return "redirect:imgCacheList";
                        }
                    }
                }
            }
        }
        return "";
    }



    @RequestMapping("addImgcache")
    @ResponseBody
    public String addImgcache(@RequestParam("fileName") MultipartFile file,
                              @RequestParam("showId") Integer showId,
                              @RequestParam("imgCacheName") String imgCacheName,
                              @RequestParam("imgCacheStatus") Integer imgCacheStatus){
        Map<String,String> map = new HashMap<>();
        if (file.getSize() / 1000 > 10000){
            map.put("result","false");
        }else {
            //判断上传文件格式
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                String fileName = file.getOriginalFilename();
                //获取文件后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //重新生成文件名
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    ImgCache imgCache = new ImgCache();
                    imgCache.setShowId(showId);
                    imgCache.setImgCacheName(imgCacheName);
                    imgCache.setImgCacheUrl(fileName);
                    imgCache.setImgCacheStatus(imgCacheStatus);
                    int result = imgCacheService.addImgcache(imgCache);
                    if (result > 0) {
                        map.put("result","true");
                    }else {
                        map.put("result","false");
                    }
                }
            }
        }


        return JSON.toJSONString(map);
    }
}
