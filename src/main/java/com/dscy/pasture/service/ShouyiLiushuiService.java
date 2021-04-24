package com.dscy.pasture.service;

import com.github.pagehelper.PageInfo;

public interface ShouyiLiushuiService {


    PageInfo getRevenueLiushuiList(Integer currentPage, String username, String szName);
}
