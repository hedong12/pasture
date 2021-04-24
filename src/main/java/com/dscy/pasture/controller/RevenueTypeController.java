package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.ShouyiZhonglei;
import com.dscy.pasture.service.ShouyiZhongleiService;
import com.dscy.pasture.util.FileUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 收益种类——控制器
 */
@Controller
@RequestMapping("/revenueType")
public class RevenueTypeController {


    @Autowired
    private ShouyiZhongleiService shouyiZhongleiService;

    /**
     * 查询收益种类列表
     * @param currentPage
     * @param szName
     * @param model
     * @return
     */
    @RequestMapping("/revenueTypeList")
    public String getRevenueTypeList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                                     @RequestParam(value = "szName",required = false,defaultValue = "") String szName,
                                     Model model){
        PageInfo pageInfo = shouyiZhongleiService.getRevenueTypeList(currentPage,szName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("szName",szName);
        return "revenueTypeList";
    }

    /**
     * 根据id删除收益种类
     * @return
     */
    @RequestMapping("/delRTypeById")
    @ResponseBody
    public String delRTypeById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(id);
        if (shouyiZhonglei!=null) {
            int reuslt = shouyiZhongleiService.delRTypeById(shouyiZhonglei.getSzId());
            if (reuslt > 0) {
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
     * 添加收益种类
     * @param file
     * @param showId
     * @param szName
     * @return
     */
    @RequestMapping("/addRevenueTyper")
    @ResponseBody
    public String addRevenueTyper(@RequestParam("fileName") MultipartFile file,
                                  @RequestParam("showId") Integer showId,
                                  @RequestParam("szName") String szName){
        Map<String,Object> map = new HashMap();
        if (file.getSize() / 1000 > 10000){
            map.put("result","false");
        }else {
            //判断上传文件格式
            String fileType = file.getContentType();
            if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                // 要上传的目标文件存放的绝对路径
                //用src为保存绝对路径不能改名只能用原名，不用原名会导致ajax上传图片后在前端显示时出现404错误-->原因未知
//                String localPath="F:\\IDEAProject\\imageupload\\src\\main\\resources\\static\\img";
                final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                //上传后保存的文件名(需要防止图片重名导致的文件覆盖)
                //获取文件名
                String fileName = file.getOriginalFilename();
                //获取文件后缀名
                String suffixName = fileName.substring(fileName.lastIndexOf("."));
                //重新生成文件名
                fileName = UUID.randomUUID()+suffixName;
                if (FileUtils.upload(file, localPath, fileName)) {
                    //文件存放的相对路径(一般存放在数据库用于img标签的src)
                    String relativePath="uploaded/"+fileName;
                    map.put("relativePath",relativePath);//前端根据是否存在该字段来判断上传是否成功
                    ShouyiZhonglei shouyiZhonglei = new ShouyiZhonglei();
                    shouyiZhonglei.setShowId(showId);
                    shouyiZhonglei.setSzName(szName);
                    shouyiZhonglei.setSzImg(fileName);
                    int result = shouyiZhongleiService.addRevenueTyper(shouyiZhonglei);
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

    /**
     * 前往收益种类更新页面
     * @param szId
     * @return
     */
    @GetMapping("/toUpdateRevenueTypeById/{id}")
    public String toUpdateRevenueTypeById(@PathVariable("id") Integer szId,
                                          Model model){
        ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);
        model.addAttribute("RType",shouyiZhonglei);
        return "updateRType";
    }

    /**
     * 执行更新收益种类信息
     * @param file
     * @param showId
     * @param szName
     * @param szId
     * @return
     */
    @PostMapping("/doUpdateRevenueTypeById")
    public String doUpdateRevenueTypeById(@RequestParam("fileName") MultipartFile file,
                                          @RequestParam("showId") Integer showId,
                                          @RequestParam("szName") String szName,
                                          @RequestParam("szId") Integer szId){
        ShouyiZhonglei shouyiZhonglei = shouyiZhongleiService.selectRTypeById(szId);
        if (shouyiZhonglei != null) {
            if (file.getSize() / 1000 > 10000){
                return "";
            }else {
                //判断上传文件格式
                String fileType = file.getContentType();
                if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
                    // 要上传的目标文件存放的绝对路径
                    //用src为保存绝对路径不能改名只能用原名，不用原名会导致ajax上传图片后在前端显示时出现404错误-->原因未知
                    final String localPath="D:\\Code-idea-projects\\54\\springboot-project\\PASTURE\\src\\main\\resources\\static\\uploaded";
                    //上传后保存的文件名(需要防止图片重名导致的文件覆盖)
                    //获取文件名
                    String fileName = file.getOriginalFilename();
                    //获取文件后缀名
                    String suffixName = fileName.substring(fileName.lastIndexOf("."));
                    //重新生成文件名
                    fileName = UUID.randomUUID()+suffixName;
                    if (FileUtils.upload(file, localPath, fileName)) {
                        shouyiZhonglei.setShowId(showId);
                        shouyiZhonglei.setSzName(szName);
                        shouyiZhonglei.setSzImg(fileName);
                        int result = shouyiZhongleiService.doUpdateRevenueTypeById(shouyiZhonglei);
                        if (result > 0) {
                            return "redirect:revenueTypeList";
                        }
                    }
                }
            }
        }

        return "";
    }

}
