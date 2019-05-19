package com.example.tryl.DatePickerDialog;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.tryl.R;

public class DatePickerActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        date=findViewById(R.id.date);
    }

    public void DatePicker(View view) {
        DialogFragment datePicker= new DialogHandler();
        datePicker.show(getSupportFragmentManager(),"DatePicker");
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        date.setText("Year :"+year+" Month :"+month+" Day :"+dayOfMonth);
    }
}
