package com.example.tryl.Alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tryl.R;

public class AlarmActivity extends AppCompatActivity {
     private  Button start;
     private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        start= findViewById(R.id.button);
        editText=findViewById(R.id.time);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAlert();
            }
        });
    }


    public void startAlert(){
        int i=Integer.parseInt(editText.getText().toString());

        Intent intent= new Intent(this,MyBroadcastReceiver.class);

        PendingIntent pendingIntent=PendingIntent.getBroadcast(this.getApplicationContext(),12345,intent,0);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pendingIntent);

        Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_SHORT).show();
    }




}
