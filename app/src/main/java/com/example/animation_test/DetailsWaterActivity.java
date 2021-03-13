package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsWaterActivity extends AppCompatActivity {

    TextView textViewwater_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_water);


        intFunction();
        intLisener();

    }





    private void intLisener() {

        textViewwater_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    //Initial

    private void intFunction() {
        textViewwater_ok=findViewById(R.id.textviewwater_okid);

    }


}