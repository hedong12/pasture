package com.dscy.pasture.service;

import com.dscy.pasture.entity.Fodder;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FodderService {
    PageInfo getFodderList(String fodderName,Integer current);

    Fodder selectFooderById(Integer fodderId);

    int delFodderById(Integer fodderId);

    List<Fodder> getExpPrizeFodderList();

    int doUpdateFodderById(Fodder fodder);

    int doAddFodder(Fodder fodder);
}
