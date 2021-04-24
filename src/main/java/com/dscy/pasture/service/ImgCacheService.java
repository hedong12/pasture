package com.dscy.pasture.service;

import com.dscy.pasture.entity.ImgCache;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ImgCacheService {

    PageInfo getImgCacheList(String imgCacheName,Integer currentPage);

    ImgCache getImgCacheById(Integer id);

    int delImgCacheById(Integer imgCacheId);

    List<ImgCache> getPetsImgCacheList();
<<<<<<< HEAD

    int doUpdateImgcacheById(ImgCache imgCache);

    int addImgcache(ImgCache imgCache);
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
