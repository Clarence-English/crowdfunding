package com.dhw.service.impl;

import com.dhw.dao.AdminMapper;
import com.dhw.entity.Admin;
import com.dhw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DHW
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void addAdmin(Admin admin) {
        adminMapper.insertSelective(admin);
        int num = 1 / 0;
        admin.setUserName("李四");
        adminMapper.insertSelective(admin);
    }
}
