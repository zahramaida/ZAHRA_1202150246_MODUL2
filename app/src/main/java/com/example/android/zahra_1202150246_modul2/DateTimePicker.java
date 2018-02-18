package com.example.android.zahra_1202150246_modul2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DateTimePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        // The month integer returned by the date picker starts counting at 0
        // for January, so you need to add 1 to show months starting at 1.
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (day_string + "/" + month_string + "/" + year_string);
        //Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
        TextView date = (TextView) findViewById(R.id.title_datelabel);
        // Show the showString in the phoneNumberResult.
       date.setText(dateMessage);
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        //Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
        TextView time = (TextView) findViewById(R.id.text_timelabel);
        // Show the showString in the phoneNumberResult.
        time.setText(timeMessage);
    }

    public void chooseMenu(View view) {
        Intent intent = new Intent(this, ListMenu.class);
        startActivity(intent);
    }
}