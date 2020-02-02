package com.especprof.loginexample.mvp.presenter;

import com.especprof.loginexample.mvp.view.View;
import com.especprof.loginexample.mvp.model.Model;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;

        view.init();
    }

    public void onLoginButtonClicked() {
        String username = view.getUsername();
        String password = view.getPassword();

        Boolean loggedIn = model.authLogin(username, password);

        if (loggedIn) {
            view.loginSuccess();
        } else {
            view.loginError();
        }
    }
}
