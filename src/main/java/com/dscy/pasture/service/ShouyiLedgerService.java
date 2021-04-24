package com.dscy.pasture.service;

import com.dscy.pasture.entity.ShouyiLedger;
import com.github.pagehelper.PageInfo;

public interface ShouyiLedgerService {


    PageInfo getShouyiLedgerList(Integer currentPage, String username, String szName);

    ShouyiLedger selectLedgerById(Integer id);

    int delLedgerById(Integer slId);
}
