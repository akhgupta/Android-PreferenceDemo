package com.akhgupta.androidpreferencedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class MyAppPreference {
    private static final String SAMPLE_BOOLEAN_KEY = "SAMPLE_BOOLEAN_KEY";
    private static final String SAMPLE_STRING_KEY = "SAMPLE_STRING_KEY";
    private static final String SAMPLE_LONG_KEY = "SAMPLE_LONG_KEY";
    private static final String SAMPLE_INT_KEY = "SAMPLE_INT_KEY";
    private static SharedPreferences mPreferences;
    private static MyAppPreference mInstance;
    private static Editor mEditor;

    private MyAppPreference() {
    }

    public static MyAppPreference getInstance() {
        if (mInstance == null) {
            Context context = MyApplication.mContext;
            mInstance = new MyAppPreference();
            mPreferences = context.getSharedPreferences("myapp", Context.MODE_PRIVATE);
            mEditor = mPreferences.edit();
        }
        return mInstance;
    }

    public boolean isSampleKey() {
        return mPreferences.getBoolean(SAMPLE_BOOLEAN_KEY, false);
    }

    public void setSampleBooleanKey(boolean value) {
        mEditor.putBoolean(SAMPLE_BOOLEAN_KEY, value).apply();
    }

    public String getSampleStringKey() {
        return mPreferences.getString(SAMPLE_STRING_KEY, "");
    }

    public void setSampleStringKey(String value) {
        mEditor.putString(SAMPLE_STRING_KEY, value).apply();
    }

    public void setSampleLongKey(long value) {
        mEditor.putLong(SAMPLE_LONG_KEY, value).apply();
    }

    public long getSampleLongKey() {
        return mPreferences.getLong(SAMPLE_LONG_KEY, 0);
    }

    public void setSampleIntKey(Integer value) {
        mEditor.putInt(SAMPLE_INT_KEY, value).apply();
    }

    public Integer getSampleIntKey() {
        return mPreferences.getInt(SAMPLE_INT_KEY, 0);
    }
}