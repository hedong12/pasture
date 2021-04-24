package com.dscy.pasture.controller;

import com.alibaba.fastjson.JSON;
import com.dscy.pasture.entity.Scene;
import com.dscy.pasture.service.SceneService;
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

@Controller
@RequestMapping("/scene")
public class SceneController {


    @Autowired
    private SceneService sceneService;

    @RequestMapping("/sceneList")
    public String getSceneList(@RequestParam(value = "pn",required = false,defaultValue = "1") Integer currentPage,
                               @RequestParam(value = "sceneName",required = false,defaultValue = "") String sceneName,
                               Model model){
        PageInfo pageInfo = sceneService.getSceneList(currentPage,sceneName);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("sceneName",sceneName);
        return "sceneList";
    }

    @RequestMapping("/addScene")
    @ResponseBody
    public String addScene(@RequestParam("fileName") MultipartFile file,
                           @RequestParam("sceneName") String sceneName,
                           @RequestParam("sceneLogoName") String sceneLogoName,
                           @RequestParam("sceneStatus") Integer sceneStatus){
        String result_msg="";//上传结果信息
        Map<String,Object> map = new HashMap<String, Object>();
        if (file.getSize() / 1000 > 10000){
            result_msg="图片大小不能超过100MB";
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
                    result_msg="图片上传成功";

                    Scene scene = new Scene();
                    scene.setSceneName(sceneName);
                    scene.setSceneImgUrl(fileName);
                    scene.setSceneLogoName(sceneLogoName);
                    scene.setSceneStatus(sceneStatus);
                    int result = sceneService.addScene(scene);
                    if (result > 0) {
                        map.put("result","true");
                    }else {
                        map.put("result","false");
                    }

                }
                else{
                    result_msg="图片上传失败";
                }
            }
            else{
                result_msg="图片格式不正确";
            }
        }
        map.put("result_msg",result_msg);
        return JSON.toJSONString(map);
    }


    @RequestMapping("/delSceneById")
    @ResponseBody
    public String delSceneById(@RequestParam("id") Integer id){
        Map<String,String> map = new HashMap<>();
        Scene scene = sceneService.selectSceneById(id);
        if (scene != null) {
            int result = sceneService.delSceneById(scene.getSceneId());
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
     * 前往更新页面
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/toUpdateSceneById")
    public String toUpdateSceneById(@RequestParam("id") Integer id,
                                    Model model){
        Scene scene = sceneService.selectSceneById(id);
        model.addAttribute("scene",scene);
        return "updateScene";
    }

    /**
     * 执行更新
     * @param file
     * @param sceneId
     * @param sceneName
     * @param sceneLogoName
     * @param sceneStatus
     * @return
     */
    @RequestMapping("/doUpdateSceneByID")
    public String doUpdateSceneByID(@RequestParam("fileName") MultipartFile file,
                                    @RequestParam("sceneId") Integer sceneId,
                                    @RequestParam("sceneName") String sceneName,
                                    @RequestParam("sceneLogoName") String sceneLogoName,
                                    @RequestParam("sceneStatus") Integer sceneStatus){
        Map<String,Object> map = new HashMap();
        Scene scene = sceneService.selectSceneById(sceneId);
        if (scene != null) {
            if (file.getSize() / 1000 > 10000){
                return "";
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
                        scene.setSceneName(sceneName);
                        scene.setSceneImgUrl(fileName);
                        scene.setSceneLogoName(sceneLogoName);
                        scene.setSceneStatus(sceneStatus);
                        int result = sceneService.updateScene(scene);
                        if (result > 0) {
                            return "redirect:sceneList";
                        }
                    }
                }
            }
        }

        return "";
    }


}
