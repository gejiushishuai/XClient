package com.xtp.xclient.module_main;

import android.app.Activity;
import android.os.Bundle;

import com.xtp.xclient.R;
import com.xtp.xclient.library.base.BaseActivity;
import com.xtp.xclient.library.util.ToastUtil;
import com.xtp.xclient.module_main.di.DaggerMainComponent;
import com.xtp.xclient.module_main.di.MainModule;
import com.xtp.xclient.module_main.mvp.MainContract;
import com.xtp.xclient.module_main.mvp.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initInject() {
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void refreshUI() {

    }

    @Override
    public void showErrorMsg(String msg) {
        ToastUtil.showToast(msg);
    }
}
