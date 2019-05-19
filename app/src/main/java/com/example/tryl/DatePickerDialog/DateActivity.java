package com.example.tryl.DatePickerDialog;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.tryl.R;

import java.util.Calendar;

public class DateActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView date;
    private Button button;
    private DatePicker datePicker;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);


        date = findViewById(R.id.date_text);
        button = findViewById(R.id.dateBtn);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == button) {
            final Calendar calendar = Calendar.getInstance();

            mYear = calendar.get(Calendar.YEAR);
            mMonth = calendar.get(Calendar.MONTH);
            mDay = calendar.get(Calendar.DAY_OF_MONTH);
            mHour = calendar.get(Calendar.HOUR_OF_DAY);
            mMinute = calendar.get(Calendar.MINUTE);

//            DatePickerDialog datePickerDialog = new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
//                @Override
//                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                    date.setText(year + "-" + month + "-" + dayOfMonth);
//
//                }
//            }, mYear, mMonth, mDay);

            DatePickerDialog datePickerDialog=new DatePickerDialog(getApplicationContext(), new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    date.setText(year+"-"+month+"-"+dayOfMonth);

                }
            },mYear,mMonth,mDay);


        }

    }
}
