package com.app.besthdwallpapers;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FullScreenActivity extends AppCompatActivity {

    ImageView imageView;
    FloatingActionButton btnDownload;

    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = findViewById(R.id.image_view);
        btnDownload = findViewById(R.id.btnDownload);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageView.setImageResource(imageAdapter.imageArray[position]);

        btnDownload.setOnClickListener(v -> {
            BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
            Bitmap bitmap = drawable.getBitmap();

            File filepath = Environment.getExternalStorageDirectory();
            File dir = new File(filepath.getAbsolutePath() + "/Download/BestHDwallpapers/");
            dir.mkdir();
            File file = new File(dir,System.currentTimeMillis() + ".jpg");
            try {
                outputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
            Toast.makeText(FullScreenActivity.this, "Wallpaper Downloaded Successfully...!!!", Toast.LENGTH_SHORT).show();
            try {
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

//    public void btnSetHome(View view) {
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.id.image_view);
//        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
//
//        try {
//            wallpaperManager.setBitmap(bitmap);
//
//            Toast.makeText(this, "Wallpaper Set to Home Screen...", Toast.LENGTH_SHORT).show();
//        } catch (IOException e) {
//            Toast.makeText(this, "Wallpaper Not Set Try Again...", Toast.LENGTH_SHORT).show();
//        }
//    }
}