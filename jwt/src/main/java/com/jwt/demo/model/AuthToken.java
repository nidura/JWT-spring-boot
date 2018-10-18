package com.jwt.demo.model;

/**
 * Created by Nidura on 2018-10-18.
 */
public class AuthToken {

    private String token;

    public AuthToken() {
    }

    public AuthToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
