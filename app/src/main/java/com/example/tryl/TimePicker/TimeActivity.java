package com.example.tryl.TimePicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.tryl.R;

public class TimeActivity extends AppCompatActivity {

    private TextView time_text;
    private Button btn;
    private TimePicker timePicker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);


        time_text=findViewById(R.id.time_text);
        btn=findViewById(R.id.timeBtn);
        timePicker=findViewById(R.id.timePicker);

        time_text.setText(getCurrentTime());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePicker.setVisibility(View.VISIBLE);
                time_text.setText(getCurrentTime());


            }
        });

    }

    public  String getCurrentTime(){


        String currentTime="Time :"+timePicker.getCurrentHour()+" Min :"+timePicker.getCurrentMinute();

        return currentTime;
    }
}
