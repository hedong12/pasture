package com.dscy.pasture.service;

import com.dscy.pasture.entity.Prize;
import com.github.pagehelper.PageInfo;

public interface PrizeService {

    PageInfo getPrizeList(Integer cuttentPage, String prizeName);

    Prize selectPrizeById(Integer id);

    int delPrizeById(Integer getpId);
    int doUpdatePrizeById(Prize prize);

    int addPrize(Prize prize);
}
