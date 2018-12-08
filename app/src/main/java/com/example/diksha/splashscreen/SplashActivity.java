package com.example.diksha.splashscreen;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

/**
 * Created by diksha on 8/12/18.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        VideoView videoView = findViewById(R.id.videoview);
        Uri path = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sns);
        videoView.setVideoURI(path);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                jump();
            }
        });
        videoView.start();
    }

    private void jump() {
        if(isFinishing())
            return;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
