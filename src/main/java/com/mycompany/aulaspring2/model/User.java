package com.mycompany.aulaspring2.model;

import java.util.UUID;

/**
 *
 * @author Bianca
 */
public class User {
    private UUID id;
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
