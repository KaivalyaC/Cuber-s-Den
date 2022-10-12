package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LayersList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layers_list);
    }

    Intent intent = new Intent();

    public void home(View v) {
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
    }

    public void layer1(View v) {
        intent.setClass(this, L1P1.class);
        startActivity(intent);
    }

    public void layer2(View v) {
        intent.setClass(this, L2P1.class);
        startActivity(intent);
    }

    public void layer3(View v) {
        intent.setClass(this, L3P1.class);
        startActivity(intent);
    }

}