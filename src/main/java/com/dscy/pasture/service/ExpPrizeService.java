package com.dscy.pasture.service;

import com.dscy.pasture.entity.ExpPrize;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ExpPrizeService {
    PageInfo getExpPrizeList(String expPrizeName,Integer currentPage);

    ExpPrize selectExpPrizeById(Integer eId);

    int delExpPrizeById(Integer eId);

    int addExpPrize(ExpPrize expPrize);

    int doUpdateExpPrizeById(ExpPrize expPrize);

    int updateExpPrizeByExpId(Integer fodderId, String fodderName, String fodderImgUrl);

    List<ExpPrize> getPetsExpPrizeList();
}
