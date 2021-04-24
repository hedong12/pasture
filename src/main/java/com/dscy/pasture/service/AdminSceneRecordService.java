package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface AdminSceneRecordService {

    PageInfo getAdminSceneRecordList(Integer currentPage, String pastureName, String sceneName);
}
