package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CubeNotations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_notations);
    }

    public void home(View v){
        Intent home = new Intent();
        home.setClass(this,MainActivity.class);
        startActivity(home);
    }
}