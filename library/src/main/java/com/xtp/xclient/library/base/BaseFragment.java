package com.xtp.xclient.library.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.xtp.xclient.library.mvp.IBasePresenter;
import com.xtp.xclient.library.mvp.IBaseView;

import javax.inject.Inject;

public abstract class BaseFragment<T extends IBasePresenter> extends Fragment implements IBaseView {
    @Inject
    protected T mPresenter;

    protected abstract void initInject();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        initInject();
        if (mPresenter != null)
            mPresenter.attachView(this);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        if (mPresenter != null)
            mPresenter.detachView();
        super.onDestroyView();
    }
}
