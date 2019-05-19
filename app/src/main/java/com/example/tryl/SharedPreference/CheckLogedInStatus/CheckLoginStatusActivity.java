package com.example.tryl.SharedPreference.CheckLogedInStatus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tryl.R;

public class CheckLoginStatusActivity extends AppCompatActivity {

    private static final String TAG = "CheckLoginStatusActivit";
    private EditText name,password;
    private Button loginBtn;

    private PreferenceManager sharedPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_login_status);
        sharedPreference=new PreferenceManager(getApplicationContext());

        if (sharedPreference.checkLoggedInStatus()){
            startActivity(new Intent(this,LoggedInActivity.class));
            finish();
        }

        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        loginBtn=findViewById(R.id.login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namee=name.getText().toString();
                String pass=password.getText().toString();

                if (namee.equals(getString(R.string.username)) && pass.equals(getString(R.string.password))){
                    startActivity(new Intent(getApplicationContext(),LoggedInActivity.class));
                    sharedPreference.writeUsedStatus();
                    finish();
                }
                else {
                    Toast.makeText(CheckLoginStatusActivity.this, "name and password does not match", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
