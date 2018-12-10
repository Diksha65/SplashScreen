package com.example.diksha.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by diksha on 10/12/18.
 */

public class SplashActivityOne extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_one);

        ImageView imageView = findViewById(R.id.imageview);
        //Glide.with(this).load(R.drawable.ss).into(imageView);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(SplashActivityOne.this,
                        SplashActivityTwo.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}