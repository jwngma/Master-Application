package com.example.tryl.recyclerView.Recyclerview_prabesh_image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.tryl.R;

import java.util.Arrays;
import java.util.List;

public class RecyclerviewwActivity extends AppCompatActivity {

    private static final String TAG = "RecyclerviewwActivity";
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private  int[] images={
            R.drawable.picture1,
            R.drawable.picture2,
            R.drawable.picture3,
            R.drawable.picture4,
            R.drawable.picture5,
            R.drawable.picture6,
            R.drawable.picture7,
            R.drawable.picture8,
            R.drawable.picture9,
            R.drawable.picture10,
            R.drawable.picture11,
            R.drawable.picture12,
            R.drawable.picture13,
            R.drawable.picture14,
            R.drawable.picture15,
            R.drawable.picture16,
            R.drawable.picture17,
            R.drawable.picture18,
            R.drawable.picture19,
            R.drawable.picture20,
            R.drawable.picture21,
            R.drawable.picture22,
            R.drawable.picture23,
            R.drawable.picture24,

    };

    private List<String> list;

    private RecyclerViewAdapterr adapterr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclervieww);

        Log.d(TAG, "onCreate: doneee");
        recyclerView=findViewById(R.id.recyclerviewwww);
        list= Arrays.asList(getResources().getStringArray(R.array.countries_name));
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        
        adapterr= new RecyclerViewAdapterr(this,images,list);
        recyclerView.setAdapter(adapterr);





    }
}
