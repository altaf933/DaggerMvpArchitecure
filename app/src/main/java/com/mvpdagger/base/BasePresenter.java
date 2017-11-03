package com.mvpdagger.base;

/**
 * Created by altafshaikh on 03/11/17.
 */

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();

}
