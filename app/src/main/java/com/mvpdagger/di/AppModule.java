package com.mvpdagger.di;

import android.app.Application;

import com.google.gson.annotations.SerializedName;
import com.mvpdagger.api.HttpHelper;
import com.mvpdagger.api.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by altafshaikh on 03/11/17.
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    public Application getApplicationConext() {
        return mApplication;
    }

    @Provides
    @Singleton
    HttpHelper provideRetrofitHelper(RetrofitHelper retrofitHelper){
        return retrofitHelper;
    }
}
