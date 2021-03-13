package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class FitTipsActivity extends AppCompatActivity {

  //Layout Variable

    LinearLayout linearLayout_water,linearLayout_run,linearLayout_walk;

    GifImageView imageView_water,imageView_run,imageView_walk;
    TextView textView_water,textView_run,textView_walk;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit_tips);

        intFunctiom();

        intLisener();


    }



    private void intLisener() {  //start click

        //CardWater
        linearLayout_water.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent intentwater = new Intent(FitTipsActivity.this,DetailsWaterActivity.class);
                startActivity(intentwater);


            }
        });  //water card end


        //card run

        linearLayout_run.setOnClickListener(new View.OnClickListener() {  //run card start
            @Override
            public void onClick(View v) {

                Intent intentrun = new Intent(FitTipsActivity.this,DetailsRunActivity.class);
                startActivity(intentrun);

            }
        }); // end run card


        //card walk
        linearLayout_walk.setOnClickListener(new View.OnClickListener() {  //Walk card start
            @Override
            public void onClick(View v) {
                Intent intentwalk = new Intent(FitTipsActivity.this,DetaisWalkActivity.class);
                startActivity(intentwalk);



            }
        });  //walk card end




    } //end cick


    //inital


    private void intFunctiom() {



          linearLayout_water=findViewById(R.id.waterlayoutid);
          linearLayout_run=findViewById(R.id.runlayoutid);
          linearLayout_walk=findViewById(R.id.walklayoutid);



        //ImagevIEW

        imageView_water =  findViewById(R.id.waterid);

        imageView_run = findViewById(R.id.runid);

        imageView_walk = findViewById(R.id.walkid);

        //TextView

        textView_water=findViewById(R.id.drinkwaterid);

        textView_run = findViewById(R.id.wayrunid);

        textView_walk= findViewById(R.id.howwalkid);


    }






}