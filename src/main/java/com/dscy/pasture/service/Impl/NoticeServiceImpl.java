package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.Notice;
import com.dscy.pasture.entity.NoticeExample;
import com.dscy.pasture.mapper.NoticeMapper;
import com.dscy.pasture.service.NoticeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {


    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public PageInfo getNoticeList(Integer currentPage, String noticeName) {
        NoticeExample example = new NoticeExample();
        NoticeExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(noticeName)) {
            criteria.andNoticeNameLike('%'+noticeName+'%');
        }
        PageHelper.startPage(currentPage,10,"sort desc");
        List<Notice> noticeList = noticeMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(noticeList);
        return pageInfo;
    }

    @Override
    public Notice selectNoticeById(Integer nId) {
        return noticeMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int delNoticeById(Integer getnId) {
        return noticeMapper.deleteByPrimaryKey(getnId);
    }

    @Override
    public int addNotice(Notice notice) {
        return noticeMapper.insert(notice);
    }

    @Override
    public int doUpdateNoticeByNotice(Notice notice) {
        return noticeMapper.updateByPrimaryKey(notice);
    }

}



