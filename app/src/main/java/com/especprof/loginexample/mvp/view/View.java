package com.especprof.loginexample.mvp.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;

import com.especprof.loginexample.R;
import com.especprof.loginexample.mvp.view.base.ActivityView;

public class View extends ActivityView {

    private TextView usernameField;
    private TextView passwordField;

    public View(Activity activity) {
        super(activity);
    }

    public void init() {
        usernameField = getActivity().findViewById(R.id.username_field);
        passwordField = getActivity().findViewById(R.id.password_field);
    }

    public String getUsername() {
        return usernameField.getText().toString();
    }

    public String getPassword() {
        return passwordField.getText().toString();
    }

    public void loginSuccess() {
        Activity activity = getActivity();

        if (activity != null) {
            new AlertDialog.Builder(activity)
                    .setTitle(activity.getString(R.string.success_login_title))
                    .setMessage(activity.getString(R.string.success_login_content))

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setCancelable(false)
                    .show();
        }
    }

    public void loginError() {
        Activity activity = getActivity();

        if (activity != null) {
            new AlertDialog.Builder(activity)
                    .setTitle(activity.getString(R.string.error_login_title))
                    .setMessage(activity.getString(R.string.error_login_content))

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setCancelable(false)
                    .show();
        }
    }
}
