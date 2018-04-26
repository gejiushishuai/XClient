package com.xtp.xclient.library.base;

import android.app.Application;

import com.xtp.xclient.library.di.AppComponent;
import com.xtp.xclient.library.di.AppModule;
import com.xtp.xclient.library.di.DaggerAppComponent;

public class BaseApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
