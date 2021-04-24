package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.VideoRecord;
import com.dscy.pasture.entity.VideoRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoRecordMapper {
    int countByExample(VideoRecordExample example);

    int deleteByExample(VideoRecordExample example);

    int deleteByPrimaryKey(Integer vrId);

    int insert(VideoRecord record);

    int insertSelective(VideoRecord record);

    List<VideoRecord> selectByExample(VideoRecordExample example);

    VideoRecord selectByPrimaryKey(Integer vrId);

    int updateByExampleSelective(@Param("record") VideoRecord record, @Param("example") VideoRecordExample example);

    int updateByExample(@Param("record") VideoRecord record, @Param("example") VideoRecordExample example);

    int updateByPrimaryKeySelective(VideoRecord record);

    int updateByPrimaryKey(VideoRecord record);
}