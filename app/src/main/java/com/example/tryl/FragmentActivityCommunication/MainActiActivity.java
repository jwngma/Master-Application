package com.example.tryl.FragmentActivityCommunication;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tryl.R;

public class MainActiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acti);

        if(findViewById(R.id.fragment_container)!=null){
            if (savedInstanceState!=null){
                return;
            }


            MessageFragment messageFragment= new MessageFragment();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,messageFragment,null);
            fragmentTransaction.commit();
        }
    }
}
