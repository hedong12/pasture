package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ImgCache;
import com.dscy.pasture.entity.ImgCacheExample;
import com.dscy.pasture.mapper.ImgCacheMapper;
import com.dscy.pasture.service.ImgCacheService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgCacheServiceImpl implements ImgCacheService {

    @Autowired
    private ImgCacheMapper imgCacheMapper;

    @Override
    public PageInfo getImgCacheList(String imgCacheName,Integer currentPage) {
        ImgCacheExample example = new ImgCacheExample();
        ImgCacheExample.Criteria criteria = example.createCriteria();
        if (imgCacheName != null || !imgCacheName.equals("")){
            criteria.andImgCacheNameLike('%'+imgCacheName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ImgCache> imgCacheList = imgCacheMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(imgCacheList);
        return pageInfo;
    }

    @Override
    public ImgCache getImgCacheById(Integer id) {
        return imgCacheMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delImgCacheById(Integer imgCacheId) {
        return imgCacheMapper.deleteByPrimaryKey(imgCacheId);
    }

    @Override
    public List<ImgCache> getPetsImgCacheList() {
        ImgCacheExample example = new ImgCacheExample();
        ImgCacheExample.Criteria criteria = example.createCriteria();
        return imgCacheMapper.selectByExample(example);
    }
<<<<<<< HEAD

    @Override
    public int doUpdateImgcacheById(ImgCache imgCache) {
        return imgCacheMapper.updateByPrimaryKey(imgCache);
    }

    @Override
    public int addImgcache(ImgCache imgCache) {
        return imgCacheMapper.insert(imgCache);
    }
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
