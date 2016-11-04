package com.kukuhsain.simpletour.host.view;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;

import com.kukuhsain.simpletour.host.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

/**
 * Created by kukuh on 08/10/16.
 */

public class SignUpActivity extends AppCompatActivity {
    @BindView(R.id.et_name) TextInputEditText etName;
    @BindView(R.id.et_email) TextInputEditText etEmail;
    @BindView(R.id.et_password) TextInputEditText etPassword;
    @BindView(R.id.et_phone) TextInputEditText etPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_sign_up)
    public void signUp() {
        Timber.d("Sign Up...");
        Timber.d(etName.getText().toString());
        Timber.d(etEmail.getText().toString());
        Timber.d(etPassword.getText().toString());
    }
}
