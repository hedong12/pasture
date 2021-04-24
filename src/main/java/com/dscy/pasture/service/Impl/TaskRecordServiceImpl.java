package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.TaskRecord;
import com.dscy.pasture.entity.TaskRecordExample;
import com.dscy.pasture.mapper.TaskRecordMapper;
import com.dscy.pasture.service.TaskRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TaskRecordServiceImpl implements TaskRecordService {


    @Autowired
    private TaskRecordMapper taskRecordMapper;

    @Override
    public PageInfo getTaskRecordList(Integer currentPage, String username, String taskName) {
        TaskRecordExample example = new TaskRecordExample();
        TaskRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(taskName)) {
            criteria.andTaskNameLike('%'+taskName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<TaskRecord> taskRecordList = taskRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(taskRecordList);
        return pageInfo;
    }
}
