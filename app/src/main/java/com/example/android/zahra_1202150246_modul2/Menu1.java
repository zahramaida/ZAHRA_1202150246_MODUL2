package com.example.android.zahra_1202150246_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Menu1 extends AppCompatActivity {

    private static final String TAG_ACTIVITY = Menu1.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
    }
}
