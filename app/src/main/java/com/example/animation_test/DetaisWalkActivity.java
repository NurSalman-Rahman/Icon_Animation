package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetaisWalkActivity extends AppCompatActivity {

    TextView textViewwalk_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detais_walk);

        intFunction();
        intLisener();



    }





    private void intLisener() {

        textViewwalk_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    //Initial

    private void intFunction() {
        textViewwalk_ok=findViewById(R.id.textviewwalk_okid);

    }




}