package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.VideoFodder;
import com.dscy.pasture.entity.VideoFodderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoFodderMapper {
    int countByExample(VideoFodderExample example);

    int deleteByExample(VideoFodderExample example);

    int deleteByPrimaryKey(Integer vfId);

    int insert(VideoFodder record);

    int insertSelective(VideoFodder record);

    List<VideoFodder> selectByExample(VideoFodderExample example);

    VideoFodder selectByPrimaryKey(Integer vfId);

    int updateByExampleSelective(@Param("record") VideoFodder record, @Param("example") VideoFodderExample example);

    int updateByExample(@Param("record") VideoFodder record, @Param("example") VideoFodderExample example);

    int updateByPrimaryKeySelective(VideoFodder record);

    int updateByPrimaryKey(VideoFodder record);
}