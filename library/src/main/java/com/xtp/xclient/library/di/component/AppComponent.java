package com.xtp.xclient.library.di.component;

import android.app.Application;

import com.xtp.xclient.library.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(Application application);
}

