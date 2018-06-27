package com.tools.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA
 * ProjectName: DatabaseAssistant
 * CreateUser:  lixiaopeng
 * CreateTime : 2018/6/26 17:57
 * ModifyUser: bjlixiaopeng
 * Class Description:
 * To change this template use File | Settings | File and Code Template
 */


public class User implements Serializable {

    private static final long serialVersionUID = -8555535280590699348L;

    //登录账号
    private String account;
    //登录密码
    private String password;
    //邮箱
    private String email;
    //联系电话
    private String mobile;

    public User() {
    }

    public User(String account, String email, String mobile) {
        this.account = account;
        this.email = email;
        this.mobile = mobile;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User {" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

}
