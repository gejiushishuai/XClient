package com.xtp.xclient.library.mvp;

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
