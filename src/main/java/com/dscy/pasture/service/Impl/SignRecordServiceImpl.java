package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.SignRecord;
import com.dscy.pasture.entity.SignRecordExample;
import com.dscy.pasture.mapper.SignRecordMapper;
import com.dscy.pasture.service.SignRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SignRecordServiceImpl implements SignRecordService {


    @Autowired
    private SignRecordMapper signRecordMapper;


    @Override
    public PageInfo getSignRecordList(Integer currentPage, String username) {
        SignRecordExample example = new SignRecordExample();
        SignRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)){
            criteria.andUsernameLike('%'+username+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<SignRecord> signRecordList = signRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(signRecordList);
        return pageInfo;
    }
}
