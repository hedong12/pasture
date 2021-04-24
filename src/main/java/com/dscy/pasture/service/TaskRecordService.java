package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface TaskRecordService {

    PageInfo getTaskRecordList(Integer currentPage, String username, String taskName);
}
