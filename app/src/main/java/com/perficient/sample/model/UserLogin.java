package com.perficient.sample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by valamburi.murugan on 3/25/2017.
 */

public class UserLogin {

    @SerializedName("type")
    private String type;
    @SerializedName("name")
    private String name;
    @SerializedName("password")
    private String password;

    public UserLogin() {
    }

    public UserLogin(String type, String name, String password) {
        this.type = type;
        this.name = name;
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLogin{");
        sb.append("type='").append(type).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
