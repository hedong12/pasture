package com.dscy.pasture.service;

import com.dscy.pasture.entity.AdminUser;

public interface AdminUserService {

    AdminUser login(String phone, String password);

    AdminUser getAdminByPhone(String phone);

    int addAdminUser(AdminUser adminUser);
}
