package com.mvpdagger.api;

import com.mvpdagger.model.FixerModel;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by altafshaikh on 03/11/17.
 */

public interface ApiFixer {

    //  public String HOST = "http://api.fixer.io/2017-01-03";
    public String HOST = "http://api.fixer.io/";

    @GET("{date}")
    Flowable<FixerModel> getExchangePrice(@Path("date") String date);
}
