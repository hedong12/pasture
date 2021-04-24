package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.GetRecord;
import com.dscy.pasture.entity.GetRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GetRecordMapper {
    int countByExample(GetRecordExample example);

    int deleteByExample(GetRecordExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(GetRecord record);

    int insertSelective(GetRecord record);

    List<GetRecord> selectByExample(GetRecordExample example);

    GetRecord selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") GetRecord record, @Param("example") GetRecordExample example);

    int updateByExample(@Param("record") GetRecord record, @Param("example") GetRecordExample example);

    int updateByPrimaryKeySelective(GetRecord record);

    int updateByPrimaryKey(GetRecord record);
}