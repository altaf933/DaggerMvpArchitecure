package com.mvpdagger.util;

import com.mvpdagger.android.ExchangeApp;

import java.io.File;

/**
 * Created by altafshaikh on 03/11/17.
 */

public class Constant {

    //================= PATH ====================

    public static final String PATH_DATA = ExchangeApp.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/ExchangRate";
}
