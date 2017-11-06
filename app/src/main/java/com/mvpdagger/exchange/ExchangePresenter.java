package com.mvpdagger.exchange;

import android.util.Log;

import com.mvpdagger.api.ApiFixer;
import com.mvpdagger.base.RxPresenter;
import com.mvpdagger.model.FixerModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
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
        addSubcriber(apiFixer.getExchangePrice("2017-01-03"
        ).subscribeOn(AndroidSchedulers.mainThread()).subscribeWith(new ResourceSubscriber<FixerModel>() {
            @Override
            public void onNext(FixerModel fixerModel) {
                mView.showData(fixerModel);
                Log.d("TAG", "" + fixerModel.getRates().getAUD());
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
