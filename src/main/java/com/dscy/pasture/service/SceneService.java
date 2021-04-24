package com.dscy.pasture.service;

import com.dscy.pasture.entity.Scene;
import com.github.pagehelper.PageInfo;

public interface SceneService {

    PageInfo getSceneList(Integer currentPage, String sceneName);

    int addScene(Scene scene);

    Scene selectSceneById(Integer id);

    int delSceneById(Integer sceneId);

    int updateScene(Scene scene);
}
