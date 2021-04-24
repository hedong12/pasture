package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ImgCache;
import com.dscy.pasture.entity.ImgCacheExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgCacheMapper {
    int countByExample(ImgCacheExample example);

    int deleteByExample(ImgCacheExample example);

    int deleteByPrimaryKey(Integer imgCacheId);

    int insert(ImgCache record);

    int insertSelective(ImgCache record);

    List<ImgCache> selectByExample(ImgCacheExample example);

    ImgCache selectByPrimaryKey(Integer imgCacheId);

    int updateByExampleSelective(@Param("record") ImgCache record, @Param("example") ImgCacheExample example);

    int updateByExample(@Param("record") ImgCache record, @Param("example") ImgCacheExample example);

    int updateByPrimaryKeySelective(ImgCache record);

    int updateByPrimaryKey(ImgCache record);
}