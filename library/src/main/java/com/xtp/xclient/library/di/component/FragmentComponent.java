package com.xtp.xclient.library.di.component;

import android.app.Activity;

import com.xtp.xclient.library.di.module.FragmentModule;
import com.xtp.xclient.library.di.scope.FragmentScope;

import dagger.Component;

@FragmentScope
@Component(modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
}
