package com.xtp.xclient.module_main.di;

import com.xtp.xclient.library.di.component.AppComponent;
import com.xtp.xclient.library.di.scope.ActivityScope;
import com.xtp.xclient.module_main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
