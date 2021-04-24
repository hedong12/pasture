package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface CashRecordService {


    PageInfo getCashRecordList(Integer currentPage, String username, String szName);
}
