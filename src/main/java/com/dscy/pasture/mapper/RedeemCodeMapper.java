package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.RedeemCode;
import com.dscy.pasture.entity.RedeemCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RedeemCodeMapper {
    int countByExample(RedeemCodeExample example);

    int deleteByExample(RedeemCodeExample example);

    int deleteByPrimaryKey(Integer rcId);

    int insert(RedeemCode record);

    int insertSelective(RedeemCode record);

    List<RedeemCode> selectByExample(RedeemCodeExample example);

    RedeemCode selectByPrimaryKey(Integer rcId);

    int updateByExampleSelective(@Param("record") RedeemCode record, @Param("example") RedeemCodeExample example);

    int updateByExample(@Param("record") RedeemCode record, @Param("example") RedeemCodeExample example);

    int updateByPrimaryKeySelective(RedeemCode record);

    int updateByPrimaryKey(RedeemCode record);
}