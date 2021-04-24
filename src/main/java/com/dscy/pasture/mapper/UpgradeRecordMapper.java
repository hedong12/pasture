package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.UpgradeRecord;
import com.dscy.pasture.entity.UpgradeRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpgradeRecordMapper {
    int countByExample(UpgradeRecordExample example);

    int deleteByExample(UpgradeRecordExample example);

    int deleteByPrimaryKey(Integer arId);

    int insert(UpgradeRecord record);

    int insertSelective(UpgradeRecord record);

    List<UpgradeRecord> selectByExample(UpgradeRecordExample example);

    UpgradeRecord selectByPrimaryKey(Integer arId);

    int updateByExampleSelective(@Param("record") UpgradeRecord record, @Param("example") UpgradeRecordExample example);

    int updateByExample(@Param("record") UpgradeRecord record, @Param("example") UpgradeRecordExample example);

    int updateByPrimaryKeySelective(UpgradeRecord record);

    int updateByPrimaryKey(UpgradeRecord record);
}