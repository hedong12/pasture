package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Task;
import com.dscy.pasture.entity.TaskExample;
import com.dscy.pasture.mapper.TaskMapper;
import com.dscy.pasture.service.TaskService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Autowired
    private TaskMapper taskMapper;

    @Override
    public PageInfo getTaskList(Integer currentPage, String taskName) {
        TaskExample example = new TaskExample();
        TaskExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(taskName)) {
            criteria.andTaskNameLike('%'+taskName+'%');
        }
        List<Task> taskList = taskMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(taskList);
        return pageInfo;
    }

    @Override
    public Task selectTaskById(Integer id) {
        return taskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delTaskById(Integer id) {
        return taskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addTask(Task task) {
        return taskMapper.insert(task);
    }

    @Override
    public int doUpdateTaskById(Task task) {
        return taskMapper.updateByPrimaryKey(task);
    }
}
