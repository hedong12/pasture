package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.UserFodderRecord;
import com.dscy.pasture.entity.UserFodderRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFodderRecordMapper {
    int countByExample(UserFodderRecordExample example);

    int deleteByExample(UserFodderRecordExample example);

    int deleteByPrimaryKey(Integer ufrId);

    int insert(UserFodderRecord record);

    int insertSelective(UserFodderRecord record);

    List<UserFodderRecord> selectByExample(UserFodderRecordExample example);

    UserFodderRecord selectByPrimaryKey(Integer ufrId);

    int updateByExampleSelective(@Param("record") UserFodderRecord record, @Param("example") UserFodderRecordExample example);

    int updateByExample(@Param("record") UserFodderRecord record, @Param("example") UserFodderRecordExample example);

    int updateByPrimaryKeySelective(UserFodderRecord record);

    int updateByPrimaryKey(UserFodderRecord record);
}