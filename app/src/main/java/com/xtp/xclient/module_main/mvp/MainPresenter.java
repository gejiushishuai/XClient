package com.xtp.xclient.module_main.mvp;

import android.Manifest;

import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xtp.xclient.library.mvp.RxPresenter;

import javax.inject.Inject;

import io.reactivex.functions.Consumer;

public class MainPresenter extends RxPresenter<MainContract.View> {

    @Inject
    RxPermissions rxPermissions;

    @Inject
    public MainPresenter() {

    }

    public void checkPermissions() {
        addSubscribe(rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean granted) {
                        if (granted) {
                            mView.refreshUI();
                            mView.showErrorMsg("权限请求成功");
                        } else {
                            mView.showErrorMsg("权限请求失败");
                        }
                    }
                })
        );
    }
}
