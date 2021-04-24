package com.dscy.pasture.service;

import com.dscy.pasture.entity.Task;
import com.github.pagehelper.PageInfo;

public interface TaskService {

    PageInfo getTaskList(Integer currentPage, String taskName);

    Task selectTaskById(Integer id);

    int delTaskById(Integer id);

    int addTask(Task task);

    int doUpdateTaskById(Task task);
}
