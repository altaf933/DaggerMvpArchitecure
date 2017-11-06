package com.mvpdagger.android;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.mvpdagger.base.BaseActivity;
import com.mvpdagger.exchange.ExchangePresenter;
import com.mvpdagger.exchange.IExchange;
import com.mvpdagger.model.FixerModel;

import javax.inject.Inject;

public class SampleDaggerMainActivity extends BaseActivity<ExchangePresenter> implements IExchange.View {


    @Inject
    ExchangePresenter mPresenter;

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //getActivityComponent().inject(this);
//       // mPresenter.loadData();
//    }


    @Override
    protected void onResume() {
        super.onResume();
       // mPresenter = new ExchangePresenter();
        mPresenter.loadData();

    }

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_sample_dagger_main;
    }

    @Override
    public void showData(FixerModel fixerModel) {

    }

    @Override
    public void showErrorMessage(String msg) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
