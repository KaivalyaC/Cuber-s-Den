package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Congratulations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
    }

    Intent intent = new Intent();

    public void home(View v){
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
    }
}