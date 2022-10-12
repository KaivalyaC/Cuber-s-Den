package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cubeNotations(View v){
        Intent cNotation = new Intent();
        cNotation.setClass(this,CubeNotations.class);
        startActivity(cNotation);
    }

    public void algoNotations(View v){
        Intent aNotation = new Intent();
        aNotation.setClass(this,AlgorithmNotations.class);
        startActivity(aNotation);
    }

    public void layerList(View v){
        Intent layer = new Intent();
        layer.setClass(this,LayersList.class);
        startActivity(layer);
    }

}