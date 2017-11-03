package com.mvpdagger.di;

import android.app.Application;

import com.mvpdagger.api.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by altafshaikh on 03/11/17.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {

    RetrofitHelper getRetrofitHeloper();

    Application getContext();


}
