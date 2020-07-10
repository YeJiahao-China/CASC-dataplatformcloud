package com.casc.platform.bean;

import java.io.Serializable;

public class User implements Serializable {
    Integer id;
    String username;
    String password;
    String tel;
    String power;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTel() {
        return tel;
    }

    public String getPower() {
        return power;
    }
}
