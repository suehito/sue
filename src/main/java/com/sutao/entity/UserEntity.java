package com.sutao.entity;

/**
 * Created by sue on 2018/4/19.
 */
public class UserEntity {

    private String uId;

    private String userName;

    private String password;

    public String getUId() {
        return uId;
    }

    public void setUId(String userId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId='" + uId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
