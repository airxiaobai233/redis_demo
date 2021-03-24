package com.xja.redis.service;

import com.xja.redis.entity.Admin;

public interface AdminService {
    //根据用户名获取该对象
    Admin selectAdminByName(String adminName);
}
