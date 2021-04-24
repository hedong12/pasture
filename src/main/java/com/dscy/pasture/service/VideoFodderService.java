package com.dscy.pasture.service;

import com.dscy.pasture.entity.VideoFodder;
import com.github.pagehelper.PageInfo;

public interface VideoFodderService {

    PageInfo getVideoFodderList(Integer currentPage, String videoFodderName, String fodderName, String petsName);

    VideoFodder selectVideoFodderById(Integer id);

    int delVideoFodderById(Integer vfId);
<<<<<<< HEAD

    int doUpdateVideoFodderById(VideoFodder videoFodder);

    int addVideoFodder(VideoFodder videoFodder);
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
