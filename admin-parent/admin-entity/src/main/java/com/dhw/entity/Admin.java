package com.dhw.entity;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.id
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.login_acct
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String loginAcct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.user_pswd
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String userPswd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.user_name
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.email
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.create_time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.update_Time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private String updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.deleted
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    private Integer deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.id
     *
     * @return the value of t_admin.id
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.id
     *
     * @param id the value for t_admin.id
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.login_acct
     *
     * @return the value of t_admin.login_acct
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getLoginAcct() {
        return loginAcct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.login_acct
     *
     * @param loginAcct the value for t_admin.login_acct
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setLoginAcct(String loginAcct) {
        this.loginAcct = loginAcct == null ? null : loginAcct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.user_pswd
     *
     * @return the value of t_admin.user_pswd
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getUserPswd() {
        return userPswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.user_pswd
     *
     * @param userPswd the value for t_admin.user_pswd
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd == null ? null : userPswd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.user_name
     *
     * @return the value of t_admin.user_name
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.user_name
     *
     * @param userName the value for t_admin.user_name
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.email
     *
     * @return the value of t_admin.email
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.email
     *
     * @param email the value for t_admin.email
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.create_time
     *
     * @return the value of t_admin.create_time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.create_time
     *
     * @param createTime the value for t_admin.create_time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.update_Time
     *
     * @return the value of t_admin.update_Time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.update_Time
     *
     * @param updateTime the value for t_admin.update_Time
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.deleted
     *
     * @return the value of t_admin.deleted
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.deleted
     *
     * @param deleted the value for t_admin.deleted
     *
     * @mbggenerated Fri Feb 05 10:11:12 CST 2021
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}