package com.dscy.pasture.mapper;

import com.dscy.pasture.entity.UserFodder;
import com.dscy.pasture.entity.UserFodderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserFodderMapper {
    int countByExample(UserFodderExample example);

    int deleteByExample(UserFodderExample example);

    int deleteByPrimaryKey(Integer ufId);

    int insert(UserFodder record);

    int insertSelective(UserFodder record);

    List<UserFodder> selectByExample(UserFodderExample example);

    UserFodder selectByPrimaryKey(Integer ufId);

    int updateByExampleSelective(@Param("record") UserFodder record, @Param("example") UserFodderExample example);

    int updateByExample(@Param("record") UserFodder record, @Param("example") UserFodderExample example);

    int updateByPrimaryKeySelective(UserFodder record);

    int updateByPrimaryKey(UserFodder record);
}