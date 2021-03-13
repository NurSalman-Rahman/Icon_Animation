package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.nio.channels.ClosedSelectorException;

public class DetailsRunActivity extends AppCompatActivity {

    TextView textViewrun_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_run);


        intFunction();
        intLisener();

    }

    private void intLisener() {

        textViewrun_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    //Initial

    private void intFunction() {
        textViewrun_ok =findViewById(R.id.textviewrun_okid);

    }
}