package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.UpgradeRecord;
import com.dscy.pasture.entity.UpgradeRecordExample;
import com.dscy.pasture.mapper.UpgradeRecordMapper;
import com.dscy.pasture.service.UpgradeRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UpgradeRecordServiceImpl implements UpgradeRecordService {

    @Autowired
    private UpgradeRecordMapper upgradeRecordMapper;

    @Override
    public PageInfo getUpgradeRecordList(Integer currentPage, String username, String petsName) {
        UpgradeRecordExample example = new UpgradeRecordExample();
        UpgradeRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUserNameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(petsName)) {
            criteria.andPetsNameLike('%'+petsName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<UpgradeRecord> upgradeRecordList = upgradeRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(upgradeRecordList);
        return pageInfo;
    }
}
