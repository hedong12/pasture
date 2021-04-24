package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ShouyiRule;
import com.dscy.pasture.entity.ShouyiRuleExample;
import com.dscy.pasture.mapper.ShouyiRuleMapper;
import com.dscy.pasture.service.ShouyiRuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ShouyiRuleServiceImpl implements ShouyiRuleService {


    @Autowired
    private ShouyiRuleMapper shouyiRuleMapper;

    @Override
    public PageInfo getShouyiRuleList(Integer currentPage, String szName, String petsName) {
        ShouyiRuleExample example = new ShouyiRuleExample();
        ShouyiRuleExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(szName)) {
            criteria.andSzNameLike('%'+szName+'%');
        }
        if (!StringUtils.isEmpty(petsName)) {
            criteria.andPetsNameLike('%'+petsName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ShouyiRule> shouyiRuleList = shouyiRuleMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(shouyiRuleList);
        return pageInfo;
    }

    @Override
    public ShouyiRule selectShouyiRuleById(Integer id) {
        return shouyiRuleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delShouyiRuleById(Integer srId) {
        return shouyiRuleMapper.deleteByPrimaryKey(srId);
    }

    @Override
    public int addShouyiRule(ShouyiRule shouyiRule) {
        return shouyiRuleMapper.insert(shouyiRule);
    }

    @Override
    public int updateShouyiRuleById(ShouyiRule shouyiRule) {
        return shouyiRuleMapper.updateByPrimaryKey(shouyiRule);
    }
}
