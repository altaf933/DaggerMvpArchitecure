package com.mvpdagger.api;

import com.mvpdagger.model.FixerModel;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class RetrofitHelper implements HttpHelper {

    private ApiFixer apiFixer;

    @Inject
    RetrofitHelper(ApiFixer apiFixer) {
        this.apiFixer = apiFixer;
    }

    @Override
    public Flowable<FixerModel> getForexExchangeRate() {
        return apiFixer.getExchangePrice("2017-01-03");
    }
}
