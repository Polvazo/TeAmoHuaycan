package com.venture.teamohuaycan.presentation.presenter;

import android.content.Context;

import com.venture.teamohuaycan.presentation.contracts.LoginContracts;

public class LoginPresenter implements LoginContracts.Presenter {
    private LoginContracts.View mView;


    public LoginPresenter(LoginContracts.View mView, Context context) {
        this.mView = mView;
        this.mView.setPresenter(this);
    }
    @Override
    public void start() {

    }
}
