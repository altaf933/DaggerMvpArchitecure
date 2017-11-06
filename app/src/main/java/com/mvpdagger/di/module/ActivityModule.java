package com.mvpdagger.di.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by altafshaikh on 04/11/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    public Activity getActivity() {
        return mActivity;
    }
}
