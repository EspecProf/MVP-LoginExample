package com.especprof.loginexample.mvp.model;

public class Model {

    private static String MOCK_VALID_USERNAME = "mauro";
    private static String MOCK_VALID_PASSWORD = "password1";

    public Boolean authLogin(String username, String password) {
        if (username.equals(MOCK_VALID_USERNAME) && password.equals(MOCK_VALID_PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
