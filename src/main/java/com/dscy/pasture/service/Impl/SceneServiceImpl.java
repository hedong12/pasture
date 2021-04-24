package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Scene;
import com.dscy.pasture.entity.SceneExample;
import com.dscy.pasture.mapper.SceneMapper;
import com.dscy.pasture.service.SceneService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SceneServiceImpl implements SceneService {

    @Autowired
    private SceneMapper sceneMapper;

    @Override
    public PageInfo getSceneList(Integer currentPage, String sceneName) {
        SceneExample example = new SceneExample();
        SceneExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(sceneName)) {
            criteria.andSceneNameLike('%'+sceneName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<Scene> sceneList = sceneMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(sceneList);
        return pageInfo;
    }

    @Override
    public int addScene(Scene scene) {
        return sceneMapper.insert(scene);
    }

    @Override
    public Scene selectSceneById(Integer id) {
        return sceneMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delSceneById(Integer sceneId) {
        return sceneMapper.deleteByPrimaryKey(sceneId);
    }

    @Override
    public int updateScene(Scene scene) {
        return sceneMapper.updateByPrimaryKey(scene);
    }
}
