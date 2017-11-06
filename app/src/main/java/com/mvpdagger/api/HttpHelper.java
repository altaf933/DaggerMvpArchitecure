package com.mvpdagger.api;

import com.mvpdagger.model.FixerModel;

import io.reactivex.Flowable;

/**
 * Created by altafshaikh on 03/11/17.
 */

public interface HttpHelper {

    Flowable<FixerModel> getForexExchangeRate();
}
