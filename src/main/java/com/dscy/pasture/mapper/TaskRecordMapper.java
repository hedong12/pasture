package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.TaskRecord;
import com.dscy.pasture.entity.TaskRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskRecordMapper {
    int countByExample(TaskRecordExample example);

    int deleteByExample(TaskRecordExample example);

    int deleteByPrimaryKey(Integer trId);

    int insert(TaskRecord record);

    int insertSelective(TaskRecord record);

    List<TaskRecord> selectByExample(TaskRecordExample example);

    TaskRecord selectByPrimaryKey(Integer trId);

    int updateByExampleSelective(@Param("record") TaskRecord record, @Param("example") TaskRecordExample example);

    int updateByExample(@Param("record") TaskRecord record, @Param("example") TaskRecordExample example);

    int updateByPrimaryKeySelective(TaskRecord record);

    int updateByPrimaryKey(TaskRecord record);
}