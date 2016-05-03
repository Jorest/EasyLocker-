package com.kukusot.androidlockscreen.activity;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.kukusot.androidlockscreen.R;

/**
 * Created by Ivan on 12/26/2014.
 */
public class    StartActivity extends PreferenceActivity {

    private static final String KEY_CONFIRM_STARTED = "confirm_started";

    private boolean mConfirmStarted = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_settings);
    }
}
