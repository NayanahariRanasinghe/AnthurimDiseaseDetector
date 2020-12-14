package com.example.anthurium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void goToDiseases (View v){

        if(v.getId()== R.id.button2){
            Intent i = new Intent(MainMenu.this,DiseaseHome.class);
            startActivity(i);
//            finish();
        }
    }

    public void onClickTest (View v){

        if(v.getId()== R.id.button){
            Intent i = new Intent(MainMenu.this,Detector.class);
            startActivity(i);
//            finish();
        }
    }

}
