package com.example.anthurium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class ImageLoad extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load);

        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(ImageLoad.this,Detector.class);
                startActivity(i);
                finish();
            }
        },5000);
    }
}
