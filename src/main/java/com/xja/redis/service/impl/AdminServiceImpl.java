package com.xja.redis.service.impl;

import com.xja.redis.entity.Admin;
import com.xja.redis.mapper.AdminMapper;
import com.xja.redis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin selectAdminByName(String adminName) {
        return adminMapper.selectAdminByName(adminName);
    }
}
