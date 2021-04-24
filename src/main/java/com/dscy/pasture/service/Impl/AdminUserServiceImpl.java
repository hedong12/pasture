package com.dscy.pasture.service.Impl;

import com.dscy.pasture.entity.AdminUser;
import com.dscy.pasture.mapper.AdminUserMapper;
import com.dscy.pasture.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String phone, String password) {
        AdminUser adminUser = adminUserMapper.login(phone,password);
        return adminUser;
    }

    @Override
    public AdminUser getAdminByPhone(String phone) {
        AdminUser adminUser =  adminUserMapper.selectByPhone(phone);
        return adminUser;
    }

    @Override
    public int addAdminUser(AdminUser adminUser) {
        return adminUserMapper.insert(adminUser);
    }

}
