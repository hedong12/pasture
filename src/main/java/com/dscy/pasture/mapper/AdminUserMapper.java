package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.AdminUser;
import com.dscy.pasture.entity.AdminUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminUserMapper {
    int countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    List<AdminUser> selectByExample(AdminUserExample example);

    AdminUser selectByPrimaryKey(Integer adminId);

    AdminUser login(@Param("phone") String phone,
                    @Param("password") String password);

    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);

    AdminUser selectByPhone(String phone);
}