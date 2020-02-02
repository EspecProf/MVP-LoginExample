package com.especprof.loginexample.activitiy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.especprof.loginexample.mvp.model.Model;
import com.especprof.loginexample.mvp.presenter.Presenter;
import com.especprof.loginexample.mvp.view.View;
import com.especprof.loginexample.R;

public class MainActivity extends AppCompatActivity {

    private Presenter presenter;

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(new View(this), new Model());

        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onLoginButtonClicked();
            }
        });
    }

    public void onLoginButtonClicked() {
        presenter.onLoginButtonClicked();
    }
}
