package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.User;
import com.dscy.pasture.entity.UserExample;
import com.dscy.pasture.mapper.UserMapper;
import com.dscy.pasture.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo getUserList(Integer currentPage,String username,String userPhone) {
        PageHelper.startPage(currentPage,10);
        List<User> userList = userMapper.selectUserList(username,userPhone);
        PageInfo pageInfo = new PageInfo(userList);
        return pageInfo;
    }

    @Override
    public Boolean delUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        Boolean flag = false;
        if (user != null) {
            int result = userMapper.deleteByPrimaryKey(user.getUserId());
            if (result > 0) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public List<User> queryUserList() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> userList = userMapper.selectByExample(example);
        return userList;
    }

    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
