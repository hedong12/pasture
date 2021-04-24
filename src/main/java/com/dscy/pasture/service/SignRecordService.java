package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface SignRecordService {

    PageInfo getSignRecordList(Integer currentPage, String username);
}
