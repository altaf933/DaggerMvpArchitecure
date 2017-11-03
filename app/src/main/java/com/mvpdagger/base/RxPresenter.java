package com.mvpdagger.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by altafshaikh on 03/11/17.
 */

public abstract class RxPresenter<T extends BaseView> implements BasePresenter<T> {

    protected T mView;
    protected CompositeDisposable mCompositeDisposable;


    public void unSubscribe() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }

    @Override
    public void attachView(T mView) {
        this.mView = mView;
    }

    public void addSubcriber(Disposable subscription) {

        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(subscription);
    }


    @Override
    public void detachView() {
        unSubscribe();
    }
}
