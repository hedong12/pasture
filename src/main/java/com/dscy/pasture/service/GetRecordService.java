package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface GetRecordService {

    PageInfo getRecordList(Integer currentPage, String username, String prizeName);
}
