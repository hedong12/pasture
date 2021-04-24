package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.GetRecord;
import com.dscy.pasture.entity.GetRecordExample;
import com.dscy.pasture.mapper.GetRecordMapper;
import com.dscy.pasture.service.GetRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class GetRecordServiceImpl implements GetRecordService {

    @Autowired
    private GetRecordMapper getRecordMapper;

    @Override
    public PageInfo getRecordList(Integer currentPage, String username, String prizeName) {
        GetRecordExample example = new GetRecordExample();
        GetRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(prizeName)){
            criteria.andPrizeNameLike('%'+prizeName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<GetRecord> getRecordList = getRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(getRecordList);
        return pageInfo;
    }
}
