package com.example.tryl.recyclerView.RecyclerView_Prabesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.tryl.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    private static final String TAG = "RecyclerViewActivity";

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView=findViewById(R.id.recyclerviewww);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        list= Arrays.asList(getResources().getStringArray(R.array.countries_name));
        adapter=new RecyclerAdapter(list);
        recyclerView.setAdapter(adapter);






    }
}
