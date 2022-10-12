package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class L3P3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3_p3);
    }

    Intent intent = new Intent();

    public void home(View v){
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
    }

    public void next(View v){
        intent.setClass(this,L3P4.class);
        startActivity(intent);
    }

    public void back(View v){
        intent.setClass(this,L3P2.class);
        startActivity(intent);
    }
}