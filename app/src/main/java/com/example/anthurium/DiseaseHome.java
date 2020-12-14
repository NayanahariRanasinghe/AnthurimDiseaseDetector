package com.example.anthurium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class DiseaseHome extends AppCompatActivity {

    Button camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_home);

        camera = findViewById(R.id.button3);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public void getDiseasesInfo (View v){

        if(v.getId()== R.id.button4){
            Intent i = new Intent(DiseaseHome.this,DiseasesInfo.class);
            startActivity(i);
//            finish();
        }
    }


}
