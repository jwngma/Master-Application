package com.example.tryl.FragmentStatePagerAdapter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tryl.R;

public class FragmentStatePagerAdapterActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SwipeAdapter swipeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_state_pager_adapter);
        viewPager=findViewById(R.id.viewPager);
        swipeAdapter= new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter);
    }
}
