package com.xtp.xclient.library.base;

import android.app.Application;

import com.xtp.xclient.library.di.component.AppComponent;
import com.xtp.xclient.library.di.component.DaggerAppComponent;
import com.xtp.xclient.library.di.module.AppModule;

public class BaseApplication extends Application {
    private static AppComponent mAppComponent;
    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        mAppComponent.inject(this);
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }
}
