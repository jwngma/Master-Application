package com.example.tryl.AllOthers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tryl.R;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence>arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=findViewById(R.id.spinner);

        arrayAdapter=ArrayAdapter.createFromResource(this,R.array.countries_name,android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selected_country=parent.getItemAtPosition(position).toString();

                if (selected_country.equals("Select Your Country")){
                    Toast.makeText(SpinnerActivity.this, "Please select your country", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SpinnerActivity.this, selected_country, Toast.LENGTH_SHORT).show();
                }
                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
