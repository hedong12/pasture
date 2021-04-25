package com.dscy.pasture.service;

import com.dscy.pasture.entity.ImgCache;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ImgCacheService {

    PageInfo getImgCacheList(String imgCacheName,Integer currentPage);

    ImgCache getImgCacheById(Integer id);

    int delImgCacheById(Integer imgCacheId);

    List<ImgCache> getPetsImgCacheList();
    int doUpdateImgcacheById(ImgCache imgCache);

    int addImgcache(ImgCache imgCache);
}
