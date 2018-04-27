package com.xtp.xclient.library.di.component;

import android.app.Activity;


import com.xtp.xclient.library.di.module.ActivityModule;
import com.xtp.xclient.library.di.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    /**
     * 获取注入的Activity
     *
     * @return Activity
     */
    Activity getActivity();
}
