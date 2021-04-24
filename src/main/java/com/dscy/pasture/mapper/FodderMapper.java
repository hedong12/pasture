package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.Fodder;
import com.dscy.pasture.entity.FodderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FodderMapper {
    int countByExample(FodderExample example);

    int deleteByExample(FodderExample example);

    int deleteByPrimaryKey(Integer fodderId);

    int insert(Fodder record);

    int insertSelective(Fodder record);

    List<Fodder> selectByExample(FodderExample example);

    Fodder selectByPrimaryKey(Integer fodderId);

    int updateByExampleSelective(@Param("record") Fodder record, @Param("example") FodderExample example);

    int updateByExample(@Param("record") Fodder record, @Param("example") FodderExample example);

    int updateByPrimaryKeySelective(Fodder record);

    int updateByPrimaryKey(Fodder record);
}