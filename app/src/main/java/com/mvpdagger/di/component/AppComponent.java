package com.mvpdagger.di.component;

import android.app.Activity;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.mvpdagger.api.ApiFixer;
import com.mvpdagger.api.RetrofitHelper;
import com.mvpdagger.base.BaseActivity;
import com.mvpdagger.base.BasePresenter;
import com.mvpdagger.base.BaseView;
import com.mvpdagger.di.module.AppModule;
import com.mvpdagger.di.module.NetModule;
import com.mvpdagger.exchange.ExchangePresenter;
import com.mvpdagger.exchange.IExchange;

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

    ApiFixer getApiFixer();

   // ExchangePresenter getPresenter();

    //IExchange.Presenter getPresenter(ApiFixer api);
    //BasePresenter getPresenter();


}
