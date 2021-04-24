package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.CashRule;
import com.dscy.pasture.entity.CashRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CashRuleMapper {
    int countByExample(CashRuleExample example);

    int deleteByExample(CashRuleExample example);

    int deleteByPrimaryKey(Integer crId);

    int insert(CashRule record);

    int insertSelective(CashRule record);

    List<CashRule> selectByExample(CashRuleExample example);

    CashRule selectByPrimaryKey(Integer crId);

    int updateByExampleSelective(@Param("record") CashRule record, @Param("example") CashRuleExample example);

    int updateByExample(@Param("record") CashRule record, @Param("example") CashRuleExample example);

    int updateByPrimaryKeySelective(CashRule record);

    int updateByPrimaryKey(CashRule record);
}