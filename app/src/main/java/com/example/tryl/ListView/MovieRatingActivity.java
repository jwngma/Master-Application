package com.example.tryl.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.tryl.R;

public class MovieRatingActivity extends AppCompatActivity {

    private static final String TAG = "MovieRatingActivity";

    private ListView listView;
    private int[] movie_images={
            R.drawable.add,
            R.drawable.bathroom,
            R.drawable.bin,
            R.drawable.clock,
            R.drawable.cloud,
            R.drawable.coffee,
            R.drawable.coin,
            R.drawable.collar,
            R.drawable.compu,
            R.drawable.cycle,
            R.drawable.onion

    };

    private String[] movie_names;
    private String[] movie_rating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_rating);
        listView=findViewById(R.id.movie_listview);
        movie_names=getResources().getStringArray(R.array.movie_name);
        movie_rating=getResources().getStringArray(R.array.movie_rating);

    }
}
