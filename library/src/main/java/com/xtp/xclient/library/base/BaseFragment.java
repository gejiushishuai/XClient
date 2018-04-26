package com.xtp.xclient.library.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.xtp.xclient.library.mvp.BasePresenter;
import com.xtp.xclient.library.mvp.BaseView;

import javax.inject.Inject;

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseView {
    @Inject
    protected T mPresenter;

    protected abstract void initInject();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        mPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null) mPresenter.detachView();
        super.onDestroyView();
    }

    @Override
    public void showErrorUI() {

    }

    @Override
    public void showEmptyUI() {

    }

    @Override
    public void showLoadingUI() {

    }

    @Override
    public void showMainUI() {

    }
}
