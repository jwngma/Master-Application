package com.example.tryl.AllOthers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tryl.R;
import com.example.tryl.recyclerView.Mitch.RecyclerviewActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView tv, tv3;
ArrayList<String>selection=new ArrayList<>();
Button radioBtn,toggle_page,SpinnerBtn,collapsingBtn,buttn,collapsingBtn1,NavigationDrawerBtn,Recyclerviewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         buttn=findViewById(R.id.button);
        radioBtn=findViewById(R.id.radiopage);
        collapsingBtn=findViewById(R.id.collapsingBtn);
        collapsingBtn1=findViewById(R.id.collapsingBtn1);
        NavigationDrawerBtn=findViewById(R.id.navigation_drawerBtn);
        Recyclerviewbtn=findViewById(R.id.recyclerviewBtn);

        Recyclerviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, RecyclerviewActivity.class);
                startActivity(i);
            }
        });

        NavigationDrawerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, NavigationDrawerActivity.class);
                startActivity(i);
            }
        });
        collapsingBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, CollapsingToolbarActivity.class);
                startActivity(i);
            }
        });
        tv3=findViewById(R.id.tv3);
        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, RadioActivity.class);
                startActivity(i);
            }
        });
        collapsingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, CollapsingActivity.class);
                startActivity(intent);
            }
        });
        radioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, RadioActivity.class);
                startActivity(intent);
            }
        });
        toggle_page=findViewById(R.id.toggle_page);
        toggle_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SwitchActivity.class);
                startActivity(intent);

            }
        });

        SpinnerBtn=findViewById(R.id.Spinner_page);
        SpinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

    }



}
