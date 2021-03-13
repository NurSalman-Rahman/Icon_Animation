package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TintTypedArray;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Base64;

public class MainActivity extends AppCompatActivity {

    //Button

    Button button_health,button_fit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intFunction();
        intListener();



    }

    //intListener

    private void intListener() {  //START Click

        //Heath button

        button_health.setOnClickListener(new View.OnClickListener() {   //button_health start
            @Override
            public void onClick(View v) {

                //Intent
                Intent intentHealth = new Intent(MainActivity.this,HealthyHooksActivity.class);
                startActivity(intentHealth);

            }


        });   //button_health end


        //Fit_buttton

        button_fit.setOnClickListener(new View.OnClickListener() {    ////button_fit  start
            @Override
            public void onClick(View v) {


                //Intent

                Intent intentFit = new Intent(MainActivity.this,FitTipsActivity.class);
                startActivity(intentFit);



            }


        });  //button_fit end





    } //End Click

    //intFunction

    private void intFunction() {

        button_health = findViewById(R.id.healthid);
        button_fit =findViewById(R.id.fitid);



    }
}