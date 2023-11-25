package com.example.mvp.model.impl;

import com.example.mvp.model.inter.IMainAModel;
import com.example.mvp.presenter.callback.LoginCallBack;

public class MainAModelImpl implements IMainAModel {
    @Override
    public void login(String username, String password, LoginCallBack<Integer> callBack) {
        if (username.equals("111") && password.equals("222")) {
            callBack.onSuccess(200);
        } else callBack.onError(new Throwable("用户名 密码错误 请重新输入"));

    }
}
