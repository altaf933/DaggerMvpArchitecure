package com.mvpdagger.exchange;

import android.util.Log;

import com.mvpdagger.api.ApiFixer;
import com.mvpdagger.base.RxPresenter;
import com.mvpdagger.model.FixerModel;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.ResourceSubscriber;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class ExchangePresenter extends RxPresenter<IExchange.View> implements IExchange.Presenter {

    private ApiFixer apiFixer;

    @Inject
    public ExchangePresenter(ApiFixer apiFixer) {
        this.apiFixer = apiFixer;
    }

    @Override
    public void loadData() {
//
//        apiFixer.getExchangePriceObser("2017-01-03")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<FixerModel>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(FixerModel fixerModel) {
//                        Log.d("TAG", "" + fixerModel.getRates().getBGN());
//                        mView.showData(fixerModel);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });

        addSubcriber(apiFixer.getExchangePrice("2017-01-03"
        ).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new ResourceSubscriber<FixerModel>() {
                    @Override
                    public void onNext(FixerModel fixerModel) {
                        Log.d("TAG", "" + fixerModel.getRates().getBGN());
                        mView.showData(fixerModel);

                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.e("TAG", "Error" + t.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                }));
    }
}
