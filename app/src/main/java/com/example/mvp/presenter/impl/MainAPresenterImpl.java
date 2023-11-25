package com.example.mvp.presenter.impl;

import com.example.mvp.model.impl.MainAModelImpl;
import com.example.mvp.model.inter.IMainAModel;
import com.example.mvp.presenter.callback.LoginCallBack;
import com.example.mvp.presenter.inter.IMainAPresenter;
import com.example.mvp.view.inter.IMainAView;

public class MainAPresenterImpl implements IMainAPresenter {
    private IMainAView mIMainAView;
    private IMainAModel mIMainAModel;

    public MainAPresenterImpl(IMainAView aIMainAView) {
        mIMainAView = aIMainAView;
        mIMainAModel = new MainAModelImpl();
    }


    @Override
    public void login() {
        mIMainAModel.login(mIMainAView.getUserName(), mIMainAView.getPassword(), new LoginCallBack<Integer>() {
            @Override
            public void onSuccess(Integer response) {
                mIMainAView.toast("登录成功 response为"+response);
            }

            @Override
            public void onError(Throwable t) {
                mIMainAView.toast("登录失败"+t.getMessage());
            }
        });
    }
}
