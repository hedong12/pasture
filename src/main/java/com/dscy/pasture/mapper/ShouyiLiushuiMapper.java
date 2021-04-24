package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ShouyiLiushui;
import com.dscy.pasture.entity.ShouyiLiushuiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShouyiLiushuiMapper {
    int countByExample(ShouyiLiushuiExample example);

    int deleteByExample(ShouyiLiushuiExample example);

    int deleteByPrimaryKey(Integer slId);

    int insert(ShouyiLiushui record);

    int insertSelective(ShouyiLiushui record);

    List<ShouyiLiushui> selectByExample(ShouyiLiushuiExample example);

    ShouyiLiushui selectByPrimaryKey(Integer slId);

    int updateByExampleSelective(@Param("record") ShouyiLiushui record, @Param("example") ShouyiLiushuiExample example);

    int updateByExample(@Param("record") ShouyiLiushui record, @Param("example") ShouyiLiushuiExample example);

    int updateByPrimaryKeySelective(ShouyiLiushui record);

    int updateByPrimaryKey(ShouyiLiushui record);
}