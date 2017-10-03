package com.github.darsha1509.hwgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(LOG_TAG, "feature 2");

        Log.e(LOG_TAG, "one more log");

        Log.e(LOG_TAG, "writing some log");
    }
}
