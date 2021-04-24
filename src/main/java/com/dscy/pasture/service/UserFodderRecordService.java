package com.dscy.pasture.service;

import com.dscy.pasture.entity.UserFodderRecord;
import com.github.pagehelper.PageInfo;

public interface UserFodderRecordService {

    PageInfo getUserFodderRecordList(Integer currentPage, String username, String fodderName);

    UserFodderRecord selectUserFodderRecordById(Integer id);

    int delUserFodderRecordById(Integer ufrId);
}
