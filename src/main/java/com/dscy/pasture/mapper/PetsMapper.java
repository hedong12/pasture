package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.Pets;
import com.dscy.pasture.entity.PetsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetsMapper {
    int countByExample(PetsExample example);

    int deleteByExample(PetsExample example);

    int deleteByPrimaryKey(Integer petsId);

    int insert(Pets record);

    int insertSelective(Pets record);

    List<Pets> selectByExample(PetsExample example);

    Pets selectByPrimaryKey(Integer petsId);

    int updateByExampleSelective(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByExample(@Param("record") Pets record, @Param("example") PetsExample example);

    int updateByPrimaryKeySelective(Pets record);

    int updateByPrimaryKey(Pets record);

    List<Pets> selectPetsList(String petsName);
}