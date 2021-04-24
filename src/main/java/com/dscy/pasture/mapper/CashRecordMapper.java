package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.CashRecord;
import com.dscy.pasture.entity.CashRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CashRecordMapper {
    int countByExample(CashRecordExample example);

    int deleteByExample(CashRecordExample example);

    int deleteByPrimaryKey(Integer crId);

    int insert(CashRecord record);

    int insertSelective(CashRecord record);

    List<CashRecord> selectByExample(CashRecordExample example);

    CashRecord selectByPrimaryKey(Integer crId);

    int updateByExampleSelective(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByExample(@Param("record") CashRecord record, @Param("example") CashRecordExample example);

    int updateByPrimaryKeySelective(CashRecord record);

    int updateByPrimaryKey(CashRecord record);
}