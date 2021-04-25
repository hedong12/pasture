package com.dscy.pasture.service;

import com.dscy.pasture.entity.Sign;
import com.github.pagehelper.PageInfo;

public interface SignService {

    PageInfo getSignList(Integer currentPage, String signName, String expPrizeName);

    Sign getSignById(Integer id);

    int delSignById(Integer getsId);

    int doUpdateSignById(Sign sign);

    int addSign(Sign sign);
}
