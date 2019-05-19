package com.example.tryl.AsynTask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tryl.R;

public class AsynTaskActivity extends AppCompatActivity {
    private static final String TAG = "AsynTaskActivity";
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asyn_task);

        tv=findViewById(R.id.text);
        btn=findViewById(R.id.asynBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyTask myTask= new MyTask(getApplicationContext(),tv,btn);
                myTask.execute();
                btn.setEnabled(false);

            }
        });
    }
}
