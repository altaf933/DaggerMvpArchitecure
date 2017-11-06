package com.mvpdagger.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mvpdagger.android.ExchangeApp;
import com.mvpdagger.di.component.ActivityComponent;
import com.mvpdagger.di.component.DaggerActivityComponent;
import com.mvpdagger.di.module.ActivityModule;

/**
 * Created by altafshaikh on 04/11/17.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {


    protected T mPresenter;

    protected abstract int getLayout();

    protected ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        initInject();

        if (mPresenter != null)
            mPresenter.attachView(this);

    }


    public ActivityComponent getActivityComponent() {

        activityComponent = DaggerActivityComponent.builder()
                .appComponent(ExchangeApp.getInstance().getAppComponent())
                .activityModule(new ActivityModule(this))
                .build();
        return activityComponent;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.detachView();
    }

    protected abstract void initInject();


}
