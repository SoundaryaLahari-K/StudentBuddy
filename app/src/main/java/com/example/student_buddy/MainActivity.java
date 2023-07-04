package com.example.student_buddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image;

    Animation topAnim,bottomAnim;
    private static int SPLASH_SCREEN= 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.iv);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
//Set animation to elements
        image.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,Login.class);
                startActivity(in);
                finish();
            }
        },SPLASH_SCREEN);
    }
}