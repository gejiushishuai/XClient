package com.xtp.xclient.library.base;

import android.app.Application;

import com.xtp.xclient.library.di.component.DaggerAppComponent;

public class BaseApplication extends Application {

    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        DaggerAppComponent.builder().build().inject(this);
    }
}
