package com.example.mvp.presenter.callback;

public interface LoginCallBack<T> {
    void onSuccess(T response);

    void onError(Throwable t);
}
