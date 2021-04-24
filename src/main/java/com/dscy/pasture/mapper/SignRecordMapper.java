package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.SignRecord;
import com.dscy.pasture.entity.SignRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SignRecordMapper {
    int countByExample(SignRecordExample example);

    int deleteByExample(SignRecordExample example);

    int deleteByPrimaryKey(Integer srId);

    int insert(SignRecord record);

    int insertSelective(SignRecord record);

    List<SignRecord> selectByExample(SignRecordExample example);

    SignRecord selectByPrimaryKey(Integer srId);

    int updateByExampleSelective(@Param("record") SignRecord record, @Param("example") SignRecordExample example);

    int updateByExample(@Param("record") SignRecord record, @Param("example") SignRecordExample example);

    int updateByPrimaryKeySelective(SignRecord record);

    int updateByPrimaryKey(SignRecord record);
}