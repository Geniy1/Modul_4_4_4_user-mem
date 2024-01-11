package com.example.user_member;

import java.io.Serializable;

public class Member implements Serializable {
    private String membername;
    private String email;

    public Member(String username, String email) {
        this.membername = username;
        this.email = email;
    }

    public String getUsername() {
        return membername;
    }

    public String getEmail() {
        return email;
    }
}

