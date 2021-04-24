package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.AdminSceneRecord;
import com.dscy.pasture.entity.AdminSceneRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminSceneRecordMapper {
    int countByExample(AdminSceneRecordExample example);

    int deleteByExample(AdminSceneRecordExample example);

    int deleteByPrimaryKey(Integer asrId);

    int insert(AdminSceneRecord record);

    int insertSelective(AdminSceneRecord record);

    List<AdminSceneRecord> selectByExample(AdminSceneRecordExample example);

    AdminSceneRecord selectByPrimaryKey(Integer asrId);

    int updateByExampleSelective(@Param("record") AdminSceneRecord record, @Param("example") AdminSceneRecordExample example);

    int updateByExample(@Param("record") AdminSceneRecord record, @Param("example") AdminSceneRecordExample example);

    int updateByPrimaryKeySelective(AdminSceneRecord record);

    int updateByPrimaryKey(AdminSceneRecord record);
}