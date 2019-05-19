package com.example.tryl.PagerAdapter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tryl.R;

public class PagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);
        viewPager=findViewById(R.id.viewPager);
        pagerAdapter= new PagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
    }
}
