package com.xtp.xclient.module_main.di;

import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xtp.xclient.library.di.scope.ActivityScope;
import com.xtp.xclient.module_main.mvp.MainContract;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainContract.View view;

    public MainModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    RxPermissions provideRxPermissions() {
        return new RxPermissions(view.getActivity());
    }
}
