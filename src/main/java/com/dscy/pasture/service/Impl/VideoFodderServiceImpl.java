package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.VideoFodder;
import com.dscy.pasture.entity.VideoFodderExample;
import com.dscy.pasture.mapper.VideoFodderMapper;
import com.dscy.pasture.service.VideoFodderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class VideoFodderServiceImpl  implements VideoFodderService {

    @Autowired
    private VideoFodderMapper videoFodderMapper;

    @Override
    public PageInfo getVideoFodderList(Integer currentPage, String videoFodderName, String fodderName, String petsName) {
        VideoFodderExample example = new VideoFodderExample();
        VideoFodderExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(videoFodderName)){
            criteria.andVideoFodderNameLike('%'+videoFodderName+'%');
        }
        if (!StringUtils.isEmpty(fodderName)){
            criteria.andFodderNameLike('%'+fodderName+'%');
        }
        if (!StringUtils.isEmpty(petsName)){
            criteria.andPetsNameLike('%'+petsName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<VideoFodder> videoFodderList = videoFodderMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(videoFodderList);
        return pageInfo;
    }

    @Override
    public VideoFodder selectVideoFodderById(Integer id) {
        return videoFodderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delVideoFodderById(Integer vfId) {
        return videoFodderMapper.deleteByPrimaryKey(vfId);
    }

<<<<<<< HEAD
    @Override
    public int doUpdateVideoFodderById(VideoFodder videoFodder) {
        return videoFodderMapper.updateByPrimaryKey(videoFodder);
    }

    @Override
    public int addVideoFodder(VideoFodder videoFodder) {
        return videoFodderMapper.insert(videoFodder);
    }

=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
