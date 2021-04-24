package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ShouyiRule;
import com.dscy.pasture.entity.ShouyiRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShouyiRuleMapper {
    int countByExample(ShouyiRuleExample example);

    int deleteByExample(ShouyiRuleExample example);

    int deleteByPrimaryKey(Integer srId);

    int insert(ShouyiRule record);

    int insertSelective(ShouyiRule record);

    List<ShouyiRule> selectByExample(ShouyiRuleExample example);

    ShouyiRule selectByPrimaryKey(Integer srId);

    int updateByExampleSelective(@Param("record") ShouyiRule record, @Param("example") ShouyiRuleExample example);

    int updateByExample(@Param("record") ShouyiRule record, @Param("example") ShouyiRuleExample example);

    int updateByPrimaryKeySelective(ShouyiRule record);

    int updateByPrimaryKey(ShouyiRule record);
}