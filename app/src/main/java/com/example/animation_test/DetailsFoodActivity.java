package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsFoodActivity extends AppCompatActivity {


    TextView textViewfood_ok;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_food);

        intFunction();
        intLisiner();



    }
        //clcikable
    private void intLisiner() {


       textViewfood_ok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });

    }

    //initial

    private void intFunction() {


        textViewfood_ok = findViewById(R.id.textviewfood_okid);

    }
}