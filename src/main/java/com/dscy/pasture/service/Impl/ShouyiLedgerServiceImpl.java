package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.ShouyiLedger;
import com.dscy.pasture.entity.ShouyiLedgerExample;
import com.dscy.pasture.mapper.ShouyiLedgerMapper;
import com.dscy.pasture.service.ShouyiLedgerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ShouyiLedgerServiceImpl implements ShouyiLedgerService {

    @Autowired
    private ShouyiLedgerMapper shouyiLedgerMapper;


    @Override
    public PageInfo getShouyiLedgerList(Integer currentPage, String username, String szName) {
        ShouyiLedgerExample example = new ShouyiLedgerExample();
        ShouyiLedgerExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(szName)) {
            criteria.andSzNameLike('%'+szName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<ShouyiLedger> shouyiLedgerList = shouyiLedgerMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(shouyiLedgerList);
        return pageInfo;
    }

    @Override
    public ShouyiLedger selectLedgerById(Integer id) {
        return shouyiLedgerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delLedgerById(Integer slId) {
        return shouyiLedgerMapper.deleteByPrimaryKey(slId);
    }
}
