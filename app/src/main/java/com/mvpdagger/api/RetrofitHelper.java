package com.mvpdagger.api;

import javax.inject.Inject;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class RetrofitHelper implements HttpHelper{

    private ApiFixer apiFixer;

    @Inject
    RetrofitHelper(ApiFixer apiFixer) {
        this.apiFixer = apiFixer;
    }

}
