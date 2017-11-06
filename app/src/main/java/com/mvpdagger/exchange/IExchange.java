package com.mvpdagger.exchange;

import com.mvpdagger.base.BasePresenter;
import com.mvpdagger.base.BaseView;
import com.mvpdagger.model.FixerModel;

/**
 * Created by altafshaikh on 03/11/17.
 */

public interface IExchange {

    public interface View extends BaseView{

        void showData(FixerModel fixerModel);

    }

    public interface Presenter extends BasePresenter<View> {

        void loadData();


    }
}
