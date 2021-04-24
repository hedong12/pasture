package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.UserFodderRecord;
import com.dscy.pasture.entity.UserFodderRecordExample;
import com.dscy.pasture.mapper.UserFodderRecordMapper;
import com.dscy.pasture.service.UserFodderRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserFodderRecordServiceImpl implements UserFodderRecordService {

    @Autowired
    private UserFodderRecordMapper userFodderRecordMapper;

    @Override
    public PageInfo getUserFodderRecordList(Integer currentPage, String username, String fodderName) {
        UserFodderRecordExample example = new UserFodderRecordExample();
        UserFodderRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)){
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(fodderName)){
            criteria.andFodderNameLike('%'+fodderName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<UserFodderRecord> userFodderRecordList = userFodderRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(userFodderRecordList);
        return pageInfo;
    }

    @Override
    public UserFodderRecord selectUserFodderRecordById(Integer id) {
        return userFodderRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delUserFodderRecordById(Integer ufrId) {
        return userFodderRecordMapper.deleteByPrimaryKey(ufrId);
    }
}
