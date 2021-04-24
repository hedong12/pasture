package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.VideoRecord;
import com.dscy.pasture.entity.VideoRecordExample;
import com.dscy.pasture.mapper.VideoRecordMapper;
import com.dscy.pasture.service.VideoRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class VideoRecordServiceImpl implements VideoRecordService {

    @Autowired
    private VideoRecordMapper videoRecordMapper;


    @Override
    public PageInfo getVideoRecordList(Integer currentPage, String username, String videoFodderName) {
        VideoRecordExample example = new VideoRecordExample();
        VideoRecordExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(videoFodderName)) {
            criteria.andVideoFodderNameLike('%'+videoFodderName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<VideoRecord> videoRecordList = videoRecordMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(videoRecordList);
        return pageInfo;
    }
}
