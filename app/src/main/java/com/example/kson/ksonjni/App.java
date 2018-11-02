package com.example.kson.ksonjni;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/11/02
 * Description:
 */
public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
