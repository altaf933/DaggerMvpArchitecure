package com.mvpdagger.android;

import android.app.Application;

import com.mvpdagger.di.component.AppComponent;
import com.mvpdagger.di.component.DaggerAppComponent;
import com.mvpdagger.di.module.AppModule;
import com.mvpdagger.di.module.NetModule;


/**
 * Created by altafshaikh on 03/11/17.
 */

public class ExchangeApp extends Application {

    public static ExchangeApp INSTANCE;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule())
                .build();
    }

    public static ExchangeApp getInstance() {
        return INSTANCE;
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
