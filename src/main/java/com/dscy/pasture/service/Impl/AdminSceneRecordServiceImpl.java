package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.AdminSceneRecord;
import com.dscy.pasture.entity.AdminSceneRecordExample;
import com.dscy.pasture.mapper.AdminSceneRecordMapper;
import com.dscy.pasture.service.AdminSceneRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AdminSceneRecordServiceImpl implements AdminSceneRecordService {


    @Autowired
    private AdminSceneRecordMapper adminSceneRecordMapper;

    @Override
    public PageInfo getAdminSceneRecordList(Integer currentPage, String pastureName, String sceneName) {
        AdminSceneRecordExample example = new AdminSceneRecordExample();
        AdminSceneRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(pastureName)) {
            criteria.andPastureNameLike('%'+pastureName+'%');
        }
        if (!StringUtils.isEmpty(sceneName)) {
            criteria.andSceneNameLike('%'+sceneName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<AdminSceneRecord> adminSceneRecordList = adminSceneRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(adminSceneRecordList);
        return pageInfo;
    }
}
