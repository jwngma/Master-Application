package com.example.tryl.Recyclerview_Package;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tryl.R;

public class RecyclerViewwActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private RecyclerviewAdapter recyclerviewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_vieww);
        String[] pro_list={"as","sddd","fffff","ggggg"};

        recyclerView=findViewById(R.id.recyclervieww);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerviewAdapter= new RecyclerviewAdapter(pro_list);
        recyclerView.setAdapter(recyclerviewAdapter);
    }
}
