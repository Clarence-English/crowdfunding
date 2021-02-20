package com.dhw.entity;

import lombok.*;

import java.util.Date;

/**
 * 管理员实体类
 *
 * @author dhw
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 登录账号
     */
    private String loginAcct;

    /**
     * 登录密码
     */
    private String userPassword;

    /**
     * 昵称
     */
    private String userName;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 逻辑删除
     */
    private Integer deleted;

    public Admin(String loginAcct, String userPassword, String userName, String email) {
        this.loginAcct = loginAcct;
        this.userPassword = userPassword;
        this.userName = userName;
        this.email = email;
    }
}