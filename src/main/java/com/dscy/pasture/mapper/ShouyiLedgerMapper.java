package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ShouyiLedger;
import com.dscy.pasture.entity.ShouyiLedgerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShouyiLedgerMapper {
    int countByExample(ShouyiLedgerExample example);

    int deleteByExample(ShouyiLedgerExample example);

    int deleteByPrimaryKey(Integer slId);

    int insert(ShouyiLedger record);

    int insertSelective(ShouyiLedger record);

    List<ShouyiLedger> selectByExample(ShouyiLedgerExample example);

    ShouyiLedger selectByPrimaryKey(Integer slId);

    int updateByExampleSelective(@Param("record") ShouyiLedger record, @Param("example") ShouyiLedgerExample example);

    int updateByExample(@Param("record") ShouyiLedger record, @Param("example") ShouyiLedgerExample example);

    int updateByPrimaryKeySelective(ShouyiLedger record);

    int updateByPrimaryKey(ShouyiLedger record);
}