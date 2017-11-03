package com.mvpdagger.util;

import android.content.Context;
import android.net.ConnectivityManager;

import com.mvpdagger.android.ExchangeApp;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class SystemUtil {

    public static boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ExchangeApp.getInstance().getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null;
    }
}
