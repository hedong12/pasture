package com.dscy.pasture.service;

import com.dscy.pasture.entity.Prize;
import com.github.pagehelper.PageInfo;

public interface PrizeService {

    PageInfo getPrizeList(Integer cuttentPage, String prizeName);

    Prize selectPrizeById(Integer id);

    int delPrizeById(Integer getpId);
<<<<<<< HEAD

    int doUpdatePrizeById(Prize prize);

    int addPrize(Prize prize);
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
