package com.example.android.zahra_1202150246_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();

    /**
     * Sets the content view to activity_order.
     *
     * @param savedInstanceState Saved instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the actual message in a toast message.
     *
     * @param message Message to display.
     */
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Checks which radio button was clicked
     * and displays a toast message to show the choice.
     *
     * @param view The radio button view.
     */

    public void DineIn(View view) {
        displayToast(getString(R.string.chosen) + getString(R.string.dine_in_messenger_service));
        Intent intent = new Intent(this, TableNumberSpinner.class);
        startActivity(intent);
    }

    public void TakeAway(View view) {
        displayToast(getString(R.string.chosen) + getString(R.string.take_away_messenger_service));
        Intent intent = new Intent(this, PhoneNumber.class);
        startActivity(intent);
    }
    public void chooseMenu(View view) {
        Intent intent = new Intent(this, ListMenu.class);
        startActivity(intent);
    }
}