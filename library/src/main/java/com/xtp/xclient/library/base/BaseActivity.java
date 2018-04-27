package com.xtp.xclient.library.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xtp.xclient.library.mvp.IBasePresenter;
import com.xtp.xclient.library.mvp.IBaseView;

import javax.inject.Inject;

public abstract class BaseActivity<T extends IBasePresenter> extends AppCompatActivity implements IBaseView {
    @Inject
    protected T mPresenter;

    protected abstract void initInject();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInject();
        if (mPresenter != null)
            mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null)
            mPresenter.detachView();
        super.onDestroy();
    }
}
