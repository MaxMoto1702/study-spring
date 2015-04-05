package com.rstyle.maxmoto1702.spitter;

/**
 * Created by m on 05.04.2015.
 */
public class Spitter {

    private String username;
    private String password;
    private String fullName;
    private String email;
    private boolean updateByEmail;
    private long id;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isUpdateByEmail() {
        return updateByEmail;
    }

    public void setId(long id) {
        this.id = id;
    }
}
