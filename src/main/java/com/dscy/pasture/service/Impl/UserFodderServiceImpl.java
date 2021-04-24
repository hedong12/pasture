package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.UserFodder;
import com.dscy.pasture.entity.UserFodderExample;
import com.dscy.pasture.mapper.UserFodderMapper;
import com.dscy.pasture.service.UserFodderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserFodderServiceImpl implements UserFodderService {

    @Autowired
    private UserFodderMapper userFodderMapper;

    @Override
    public PageInfo getUserFodderList(Integer currentPage, String username, String fodderName) {
        UserFodderExample example = new UserFodderExample();
        UserFodderExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike('%'+username+'%');
        }
        if (!StringUtils.isEmpty(fodderName)) {
            criteria.andFodderNameLike('%'+fodderName+'%');
        }
        PageHelper.startPage(currentPage,10);
        List<UserFodder> userFodderList = userFodderMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(userFodderList);
        return pageInfo;
    }

    @Override
    public UserFodder selectUserFodderById(Integer id) {
        return userFodderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delUserFodderById(Integer ufId) {
        return userFodderMapper.deleteByPrimaryKey(ufId);
    }
<<<<<<< HEAD

    @Override
    public int doUpdateUserFodderById(UserFodder userFodder) {
        return userFodderMapper.updateByPrimaryKey(userFodder);
    }

    @Override
    public int addUserFodder(UserFodder userFodder) {
        return userFodderMapper.insert(userFodder);
    }
=======
>>>>>>> 22668223364caae28f5c9fc0cd08bcf25ed1f183
}
