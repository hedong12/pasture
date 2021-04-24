package com.dscy.pasture.service;

import com.dscy.pasture.entity.CashRule;
import com.github.pagehelper.PageInfo;

public interface CashRuleService {

    PageInfo getCashRuleList(Integer currentPage, String crName);

    CashRule selectCashRuleById(Integer crId);

    int delCashRuleById(Integer crId);

    int addCashRule(CashRule cashRule);

    int updateCashRule(CashRule cashRule);
}
