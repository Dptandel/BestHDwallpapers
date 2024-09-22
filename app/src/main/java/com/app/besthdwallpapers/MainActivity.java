package com.app.besthdwallpapers;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_SCREEN = 4000;
    //Variables
    Animation topAnim, bottomAnim;
    ImageView imageView;
    TextView welcomeText;
    TextView appText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        imageView = findViewById(R.id.imageView);
        welcomeText = findViewById(R.id.welcomeText);
        appText = findViewById(R.id.appText);

        imageView.setAnimation(topAnim);
        welcomeText.setAnimation(bottomAnim);
        appText.setAnimation(bottomAnim);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, com.app.besthdwallpapers.HomeActivity.class);
            startActivity(intent);
            finish();
        },SPLASH_SCREEN);
    }
}