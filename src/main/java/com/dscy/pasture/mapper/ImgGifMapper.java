package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.ImgGif;
import com.dscy.pasture.entity.ImgGifExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgGifMapper {
    int countByExample(ImgGifExample example);

    int deleteByExample(ImgGifExample example);

    int deleteByPrimaryKey(Integer imgGifId);

    int insert(ImgGif record);

    int insertSelective(ImgGif record);

    List<ImgGif> selectByExample(ImgGifExample example);

    ImgGif selectByPrimaryKey(Integer imgGifId);

    int updateByExampleSelective(@Param("record") ImgGif record, @Param("example") ImgGifExample example);

    int updateByExample(@Param("record") ImgGif record, @Param("example") ImgGifExample example);

    int updateByPrimaryKeySelective(ImgGif record);

    int updateByPrimaryKey(ImgGif record);
}