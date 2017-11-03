package com.mvpdagger.android;

import android.app.Application;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class ExchangeApp extends Application {

    public static ExchangeApp INSTANCE;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public static ExchangeApp getInstance() {
        return INSTANCE;
    }
}
