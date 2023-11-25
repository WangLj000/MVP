package com.example.mvp.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mvp.R;
import com.example.mvp.databinding.ActivityMainLayoutBinding;
import com.example.mvp.presenter.impl.MainAPresenterImpl;
import com.example.mvp.presenter.inter.IMainAPresenter;
import com.example.mvp.view.inter.IMainAView;

public class MainActivity extends AppCompatActivity implements IMainAView {
    private IMainAPresenter mIMainAPresenter;
    private ActivityMainLayoutBinding mainLayoutBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIMainAPresenter = new MainAPresenterImpl(this);
        mainLayoutBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_layout);
        mainLayoutBinding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIMainAPresenter.login();
            }
        });
    }

    @Override
    public <T> T request(int requestFlag) {
        return null;
    }

    @Override
    public <T> void response(T response, int responseFlag) {

    }

    @Override
    public String getUserName() {
        return mainLayoutBinding.username.toString();
    }

    @Override
    public String getPassword() {
        return mainLayoutBinding.password.toString();
    }

    @Override
    public void toast(String content) {
        Toast.makeText(this, content, Toast.LENGTH_SHORT).show();
    }
}
