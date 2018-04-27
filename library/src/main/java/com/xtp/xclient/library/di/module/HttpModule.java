package com.xtp.xclient.library.di.module;

import com.xtp.xclient.library.http.HttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpModule {

    @Singleton
    @Provides
    HttpClient provideHttpClient() {
        return new HttpClient();
    }
}
