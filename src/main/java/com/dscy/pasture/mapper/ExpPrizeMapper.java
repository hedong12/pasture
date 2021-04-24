package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ExpPrize;
import com.dscy.pasture.entity.ExpPrizeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpPrizeMapper {
    int countByExample(ExpPrizeExample example);

    int deleteByExample(ExpPrizeExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(ExpPrize record);

    int insertSelective(ExpPrize record);

    List<ExpPrize> selectByExample(ExpPrizeExample example);



    ExpPrize selectByPrimaryKey(Integer eId);

    int updateByExampleSelective(@Param("record") ExpPrize record, @Param("example") ExpPrizeExample example);

    int updateByExample(@Param("record") ExpPrize record, @Param("example") ExpPrizeExample example);

    int updateByPrimaryKeySelective(ExpPrize record);

    int updateByPrimaryKey(ExpPrize record);

    int updateExpPrizeByExpId(@Param("expId") Integer fodderId,
                              @Param("expName")String fodderName,
                              @Param("expImg")String fodderImgUrl);
}