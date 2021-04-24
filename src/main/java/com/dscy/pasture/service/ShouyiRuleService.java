package com.dscy.pasture.service;

import com.dscy.pasture.entity.ShouyiRule;
import com.github.pagehelper.PageInfo;

public interface ShouyiRuleService {

    PageInfo getShouyiRuleList(Integer currentPage, String szName, String petsName);

    ShouyiRule selectShouyiRuleById(Integer id);

    int delShouyiRuleById(Integer srId);

    int addShouyiRule(ShouyiRule shouyiRule);

    int updateShouyiRuleById(ShouyiRule shouyiRule);
}
