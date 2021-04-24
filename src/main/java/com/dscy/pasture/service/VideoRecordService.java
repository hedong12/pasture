package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface VideoRecordService {

    PageInfo getVideoRecordList(Integer currentPage, String username, String videoFodderName);
}
