package com.example.android.zahra_1202150246_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PhoneNumber extends AppCompatActivity {
    // Define TAG for logging.
    private static final String TAG = PhoneNumber.class.getSimpleName();
    // Define mSpinnerLabel for the label (the spinner item that the user chooses).
    //private String mSpinnerLabel = "";

    /**
     * Set the content view, create the spinner, and create the array adapter for the spinner.
     * @param savedInstanceState    Saved instance.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);


    }

    /**
     * Retrieves the text and spinner item and shows them in text_phonelabel.
     * @param view  The view containing editText_main.
     */
    public void showText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText_main);
        EditText editText1 = (EditText) findViewById(R.id.editText_second);
        EditText editText2 = (EditText) findViewById(R.id.editText_nama);
        if (editText2 != null) {
            // Assign to showString both the entered edit Text
            String showString = ("Name: " + editText.getText().toString());
            // Assign to phoneNumberResult the view for title_namelabel to prepare to show it.
            TextView phoneNumberResult = (TextView) findViewById(R.id.title_namelabel);
            // Show the showString in the phoneNumberResult.
            if (phoneNumberResult != null) phoneNumberResult.setText(showString);
        }
        if (editText != null) {
            // Assign to showString both the entered edit Text
            String showString = ("Phone Number: " + editText.getText().toString());
            // Assign to phoneNumberResult the view for title_phonelabel to prepare to show it.
            TextView phoneNumberResult = (TextView) findViewById(R.id.title_phonelabel);
            // Show the showString in the phoneNumberResult.
            if (phoneNumberResult != null) phoneNumberResult.setText(showString);
        }
        if (editText1 != null) {
            // Assign to showString both the entered edit Text
            String showString = ("Address: " + editText1.getText().toString());
            // Assign to phoneNumberResult the view for text_phonelabel to prepare to show it.
            TextView phoneNumberResult = (TextView) findViewById(R.id.text_phonelabel);
            // Show the showString in the phoneNumberResult.
            if (phoneNumberResult != null) phoneNumberResult.setText(showString);
        }

    }


    public void chooseMenu(View view) {
        Intent intent = new Intent(this, ListMenu.class);
        startActivity(intent);
    }

    public void next(View view) {
        Intent intent = new Intent(this, DateTimePicker.class);
        startActivity(intent);
    }
}

