package com.example.android.zahra_1202150246_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    TextView tv_Splash;
    private static int splashInterval = 3000; //interval splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //menampilkan splash screen secara full
        //menghilangkan action bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "ZAHRA_1202150246", Toast.LENGTH_LONG);
            toast.show();

            tv_Splash = (TextView) findViewById(R.id.tv_Splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                //jeda selesai Splashscreen. Menyelesaikan splash screen, jadi tidak akan kembali ke
                //splashscreen meskipun menekan back
                this.finish();
            }

            private void finish() {
                //
            }

        }, splashInterval);

    }
}

