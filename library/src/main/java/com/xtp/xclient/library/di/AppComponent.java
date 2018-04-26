package com.xtp.xclient.library.di;

import com.xtp.xclient.library.base.BaseApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(BaseApplication application);
}

