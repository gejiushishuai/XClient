package com.xtp.xclient.module_main;

import android.os.Bundle;

import com.xtp.xclient.R;
import com.xtp.xclient.library.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void initInject() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
