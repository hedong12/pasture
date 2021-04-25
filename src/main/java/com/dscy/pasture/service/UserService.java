package com.dscy.pasture.service;

import com.dscy.pasture.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {


    PageInfo getUserList(Integer currentPage,String username,String userPhone);

    Boolean delUserById(Integer id);

    List<User> queryUserList();

    User selectUserById(Integer userId);
}
