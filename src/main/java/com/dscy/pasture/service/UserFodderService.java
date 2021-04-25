package com.dscy.pasture.service;

import com.dscy.pasture.entity.UserFodder;
import com.github.pagehelper.PageInfo;

public interface UserFodderService {

    PageInfo getUserFodderList(Integer currentPage, String username, String fodderName);

    UserFodder selectUserFodderById(Integer id);

    int delUserFodderById(Integer ufId);

    int doUpdateUserFodderById(UserFodder userFodder);

    int addUserFodder(UserFodder userFodder);
}
