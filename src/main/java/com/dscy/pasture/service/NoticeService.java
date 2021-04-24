package com.dscy.pasture.service;

import com.dscy.pasture.entity.Notice;
import com.github.pagehelper.PageInfo;

public interface NoticeService {


    PageInfo getNoticeList(Integer currentPage, String noticeName);

    Notice selectNoticeById(Integer nId);

    int delNoticeById(Integer getnId);

    int addNotice(Notice notice);

    int doUpdateNoticeByNotice(Notice notice);
}
