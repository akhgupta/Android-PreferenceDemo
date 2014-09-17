package com.akhgupta.androidpreferencedemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by akhil on 17/9/14.
 */
public class MyApplication extends Application{
    private static final String TAG = MyApplication.class.getSimpleName();
    public static Context mContext = null;

    public MyApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}