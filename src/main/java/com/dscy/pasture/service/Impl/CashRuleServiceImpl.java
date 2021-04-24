package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.CashRule;
import com.dscy.pasture.entity.CashRuleExample;
import com.dscy.pasture.mapper.CashRuleMapper;
import com.dscy.pasture.service.CashRuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashRuleServiceImpl implements CashRuleService {


    @Autowired
    private CashRuleMapper cashRuleMapper;


    @Override
    public PageInfo getCashRuleList(Integer currentPage, String crName) {
        CashRuleExample example = new CashRuleExample();
        CashRuleExample.Criteria criteria = example.createCriteria();
        if (crName != null) {
            criteria.andCrNameLike('%'+crName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<CashRule> cashRuleList = cashRuleMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(cashRuleList);
        return pageInfo;
    }

    @Override
    public CashRule selectCashRuleById(Integer crId) {
        return cashRuleMapper.selectByPrimaryKey(crId);
    }

    @Override
    public int delCashRuleById(Integer crId) {
        return cashRuleMapper.deleteByPrimaryKey(crId);
    }

    @Override
    public int addCashRule(CashRule cashRule) {
        return cashRuleMapper.insert(cashRule);
    }

    @Override
    public int updateCashRule(CashRule cashRule) {
        return cashRuleMapper.updateByPrimaryKey(cashRule);
    }
}
