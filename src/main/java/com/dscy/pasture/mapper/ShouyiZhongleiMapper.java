package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ShouyiZhonglei;
import com.dscy.pasture.entity.ShouyiZhongleiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShouyiZhongleiMapper {
    int countByExample(ShouyiZhongleiExample example);

    int deleteByExample(ShouyiZhongleiExample example);

    int deleteByPrimaryKey(Integer szId);

    int insert(ShouyiZhonglei record);

    int insertSelective(ShouyiZhonglei record);

    List<ShouyiZhonglei> selectByExample(ShouyiZhongleiExample example);

    ShouyiZhonglei selectByPrimaryKey(Integer szId);

    int updateByExampleSelective(@Param("record") ShouyiZhonglei record, @Param("example") ShouyiZhongleiExample example);

    int updateByExample(@Param("record") ShouyiZhonglei record, @Param("example") ShouyiZhongleiExample example);

    int updateByPrimaryKeySelective(ShouyiZhonglei record);

    int updateByPrimaryKey(ShouyiZhonglei record);
}