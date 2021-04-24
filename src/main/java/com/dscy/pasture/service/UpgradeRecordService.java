package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface UpgradeRecordService {

    PageInfo getUpgradeRecordList(Integer currentPage, String username, String petsName);
}
