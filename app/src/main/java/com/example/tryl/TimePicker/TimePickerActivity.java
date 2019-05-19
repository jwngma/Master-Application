package com.example.tryl.TimePicker;

import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.tryl.R;




public class TimePickerActivity extends AppCompatActivity  implements TimePickerDialog.OnTimeSetListener {

    private TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);


        time=findViewById(R.id.time);
    }

    public void TimePicker(View view) {

        DialogFragment timePickerDialog= new DialogHandler();
        timePickerDialog.show(getSupportFragmentManager(),"timePicker");


    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
       // String time= hourOfDay+""+minute;
       time.setText("Hour : "+hourOfDay+" Min :"+minute);

    }
}
