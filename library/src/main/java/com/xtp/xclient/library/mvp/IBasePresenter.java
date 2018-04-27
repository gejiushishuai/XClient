package com.xtp.xclient.library.mvp;

public interface IBasePresenter<T extends IBaseView> {

    void attachView(T view);

    void detachView();
}
