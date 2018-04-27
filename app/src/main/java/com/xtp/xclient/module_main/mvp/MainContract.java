package com.xtp.xclient.module_main.mvp;

import android.app.Activity;

import com.xtp.xclient.library.mvp.IBasePresenter;
import com.xtp.xclient.library.mvp.IBaseView;

public interface MainContract {
    interface View extends IBaseView {
        Activity getActivity();
        void refreshUI();
        void showErrorMsg(String msg);
    }

    interface Presenter extends IBasePresenter<View> {
        void checkVersion(String currentVersion);
    }
}
