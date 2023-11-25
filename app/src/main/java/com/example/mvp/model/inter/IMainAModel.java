package com.example.mvp.model.inter;

import com.example.mvp.presenter.callback.LoginCallBack;

public interface IMainAModel {
    void login(String username, String password, LoginCallBack<Integer> callBack);
}
