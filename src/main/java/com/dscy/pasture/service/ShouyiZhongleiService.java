package com.dscy.pasture.service;

import com.dscy.pasture.entity.ShouyiZhonglei;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ShouyiZhongleiService {


    PageInfo getRevenueTypeList(Integer currentPage, String szName);

    ShouyiZhonglei selectRTypeById(Integer id);

    int delRTypeById(Integer szId);

    int addRevenueTyper(ShouyiZhonglei shouyiZhonglei);

    int doUpdateRevenueTypeById(ShouyiZhonglei shouyiZhonglei);

    List<ShouyiZhonglei> selectZhongLeiList();
}
