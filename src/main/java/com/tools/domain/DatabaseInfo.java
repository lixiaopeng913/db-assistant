package com.tools.domain;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA
 * ProjectName: DatabaseAssistant
 * CreateUser:  lixiaopeng
 * CreateTime : 2018/6/26 17:50
 * ModifyUser: bjlixiaopeng
 * Class Description:
 * To change this template use File | Settings | File and Code Template
 */


public class DatabaseInfo implements Serializable {

    private static final long serialVersionUID = 8255016177558491954L;

    //别名
    private String alias;
    //服务器IP
    private String host;
    //服务器端口
    private Integer port;
    //数据库用户名
    private String databaseUser;
    //数据库密码
    private String databasePassword;

    //数据库厂商
    private String databaseVendor;

    public DatabaseInfo() {
    }

    public DatabaseInfo(String host, Integer port, String databaseUser, String databasePassword,String databaseVendor) {
        this.host = host;
        this.port = port;
        this.databaseUser = databaseUser;
        this.databasePassword = databasePassword;
        this.databaseVendor = databaseVendor;
    }

    public DatabaseInfo(String alias, String host, Integer port, String databaseUser, String databasePassword,String databaseVendor) {
        this.alias = alias;
        this.host = host;
        this.port = port;
        this.databaseUser = databaseUser;
        this.databasePassword = databasePassword;
        this.databaseVendor = databaseVendor;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    @Override
    public String toString() {
        return "DatabaseInfo {" +
                "alias='" + alias + '\'' +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", databaseUser='" + databaseUser + '\'' +
                ", databasePassword='" + databasePassword + '\'' +
                ", databaseVendor='" + databaseVendor + '\'' +
                '}';
    }

}
