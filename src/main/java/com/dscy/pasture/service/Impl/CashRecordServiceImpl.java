package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.CashRecord;
import com.dscy.pasture.entity.CashRecordExample;
import com.dscy.pasture.mapper.CashRecordMapper;
import com.dscy.pasture.service.CashRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CashRecordServiceImpl implements CashRecordService {


    @Autowired
    private CashRecordMapper cashRecordMapper;

    @Override
    public PageInfo getCashRecordList(Integer currentPage, String username, String szName) {
        CashRecordExample example = new CashRecordExample();
        CashRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(szName)) {
            criteria.andSzNameLike('%'+szName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<CashRecord> cashRecordList = cashRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(cashRecordList);
        return pageInfo;
    }
}
