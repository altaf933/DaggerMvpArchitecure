package com.mvpdagger.di.component;

import android.app.Activity;

import com.mvpdagger.android.SampleDaggerMainActivity;
import com.mvpdagger.di.module.ActivityModule;
import com.mvpdagger.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by altafshaikh on 04/11/17.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();
    void inject(SampleDaggerMainActivity activity);

}
