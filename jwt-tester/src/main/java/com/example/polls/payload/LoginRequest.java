package com.example.polls.payload;

import javax.validation.constraints.NotBlank;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsernameOrEmail() {
        return username;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.username = usernameOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
