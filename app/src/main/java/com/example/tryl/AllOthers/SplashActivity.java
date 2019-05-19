package com.example.tryl.AllOthers;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.tryl.R;

public class SplashActivity extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mrunnable;
    ImageView splashImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage=findViewById(R.id.cycle);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.splash_load);
        splashImage.startAnimation(animation);

        mrunnable=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        };
        mHandler = new Handler();
        mHandler.postDelayed(mrunnable,9000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mHandler!=null && mrunnable!=null){
            mHandler.removeCallbacks(mrunnable);
        }
    }
}
