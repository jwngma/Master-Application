package com.example.tryl.AllOthers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.tryl.R;

public class rating_bar extends AppCompatActivity {
    RatingBar rb;
    Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
         bn=findViewById(R.id.button5);
         rb=findViewById(R.id.rating);

         bn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String rating = String.valueOf(rb.getRating());
                // Toast.makeText(this,"rating",Toast.LENGTH_LONG).show();
                 Toast.makeText(getApplicationContext(), ""+rating, Toast.LENGTH_SHORT).show();
             }
         });
    }

}
