package com.app.besthdwallpapers;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WallpapersActivity extends AppCompatActivity {

    GridLayout mainGridLayout;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpapers);

        mainGridLayout = findViewById(R.id.mainGridLayout);

        setSingleEvent(mainGridLayout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_view);

        //Set Wallpapers Selected
        bottomNavigationView.setSelectedItemId(R.id.nav_wallpapers);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.nav_home:
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    finish();
                    overridePendingTransition(0,0);
                    return true;
                case R.id.nav_wallpapers:
                    return true;
            }
            return false;
        });
    }

    private void setSingleEvent(GridLayout mainGridLayout) {

        for (int i = 0; i<mainGridLayout.getChildCount();i++) {
            CardView cardView = (CardView) mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(v -> {
                if (finalI == 0) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                } else if (finalI == 1) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                } else if (finalI == 2) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                } else if (finalI == 3) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                } else if (finalI == 4) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                } else if (finalI == 5) {
                    Intent intent = new Intent(WallpapersActivity.this,WallpapersActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}