package com.venture.teamohuaycan.presentation.activity;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.venture.teamohuaycan.R;
import com.venture.teamohuaycan.core.BaseActivity;
import com.venture.teamohuaycan.presentation.fragments.LoginFragment;
import com.venture.teamohuaycan.presentation.presenter.LoginPresenter;
import com.venture.teamohuaycan.utils.ActivityUtils;

public class LoginActivity extends BaseActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);
        LoginFragment fragmentLogin = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.body);
        if (fragmentLogin == null) {
            fragmentLogin = LoginFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragmentLogin, R.id.body);
        }

        new LoginPresenter(fragmentLogin, this);
    }

    public void showMessageError(String message) {
        super.showMessage(message);
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
