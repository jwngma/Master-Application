package com.example.tryl.ShareIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tryl.R;

public class ShareActivity extends AppCompatActivity {
    private Button sharebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        sharebtn=findViewById(R.id.shareBtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareintent= new Intent(Intent.ACTION_SEND);
                shareintent.setType("text/plain");
                String shareSub=" Your Body Here";
                String shareBody=" Your sms will appear here";
                shareintent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                shareintent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(shareintent,"Share Using"));

            }
        });
    }
}
