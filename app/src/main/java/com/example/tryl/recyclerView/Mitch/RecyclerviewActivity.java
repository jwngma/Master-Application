package com.example.tryl.recyclerView.Mitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tryl.R;
import com.example.tryl.recyclerView.Mitch.MyAdapter;
import com.example.tryl.recyclerView.Mitch.NatureModel;

public class RecyclerviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView=findViewById(R.id.recyclerview);
        adapter=new MyAdapter(this, NatureModel.getObjectList());
        recyclerView.setAdapter(adapter);


        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
