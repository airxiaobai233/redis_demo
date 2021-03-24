package com.xja.redis.mapper;

import com.xja.redis.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    //根据用户名获取该对象
    Admin selectAdminByName(String  adminName);
}