package com.dhw.service;

import com.dhw.entity.Admin;

/**
 * @author DHW
 */
public interface AdminService {

    /**
     * 添加管理员
     * @param admin 管理员对象
     * @return
     */
    int addAdmin(Admin admin);
}
