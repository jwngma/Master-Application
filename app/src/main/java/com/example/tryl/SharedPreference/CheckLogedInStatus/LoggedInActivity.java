package com.example.tryl.SharedPreference.CheckLogedInStatus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tryl.R;

import org.w3c.dom.Text;

public class LoggedInActivity extends AppCompatActivity {

    private static final String TAG = "LoggedInActivity";

    private Button logoutBtn;
    private TextView tx;
    String str;
    private PreferenceManager preferenceManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        preferenceManager= new PreferenceManager(getApplicationContext());

        if (getIntent().hasExtra("str")){
             str=getIntent().getStringExtra("str").toString();


        }

        logoutBtn=findViewById(R.id.logout);
        tx=findViewById(R.id.logged_text);

        tx.setText(str);
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferenceManager.clearPreference();
//                startActivity(new Intent(LoggedInActivity.this,CheckLoginStatusActivity.class));
////                finish();
            }
        });
    }
}
