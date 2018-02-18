package com.example.android.zahra_1202150246_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TableNumberSpinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Define TAG for logging.
    private static final String TAG = TableNumberSpinner.class.getSimpleName();
    // Define mSpinnerLabel for the label (the spinner item that the user chooses).
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_number_spinner);

        // Create the spinner.
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        ArrayAdapter<CharSequence> adapter = null;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);

            // Create ArrayAdapter using the string array and default spinner layout.
            adapter = ArrayAdapter.createFromResource(this,
                    R.array.labels_array, android.R.layout.simple_spinner_item);
        }

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void showText(View view) {

            // Assign to showString mSpinnerLabel.
            String showString = (mSpinnerLabel);
            // Assign to phoneNumberResult the view for text_tablelabel to prepare to show it.
            TextView tableNumberResult = (TextView) findViewById(R.id.text_tablelabel);
            // Show the showString in the phoneNumberResult.
            if (tableNumberResult != null) tableNumberResult.setText(showString);
        }

    /**
     * Retrieves the selected item in the spinner using getItemAtPosition,
     * and assigns it to mSpinnerLabel.
     *
     * @param adapterView The adapter for the spinner, where the selection occurred.
     * @param view        The view within the adapterView that was clicked.
     * @param pos         The position of the view in the adapter.
     * @param id          The row id of the item that is selected (not used here).
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
        mSpinnerLabel = adapterView.getItemAtPosition(pos).toString();
        showText(view);
    }

    /**
     * Logs the fact that nothing was selected in the spinner.
     *
     * @param adapterView The adapter for the spinner, where the selection should have occurred.
     */
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }

    public void chooseMenu(View view) {
        Intent intent = new Intent(this, ListMenu.class);
        startActivity(intent);
    }
}