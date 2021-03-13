package com.example.animation_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HealthyHooksActivity extends AppCompatActivity {


    //layout

    LinearLayout linearLayout_food;



    // Imageview

    ImageView imageView_food;
    //TextView
    TextView textView_preparefood;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy__hooks);


        intFunction();

        intLisener();

    }
     //clickable

    private void intLisener() {  //start clickable



        linearLayout_food.setOnClickListener(new View.OnClickListener() {  //start lisener
            @Override
            public void onClick(View v)
            {

                //Intentr

                Intent intentfood = new Intent(HealthyHooksActivity.this, DetailsFoodActivity.class);
                startActivity(intentfood);

            }

        });   //end lisiner






    }  // end clickable

    //Initial

    private void intFunction() {

        linearLayout_food = findViewById(R.id.layoutfoodid);
        imageView_food = findViewById(R.id.foodid);
        textView_preparefood=findViewById(R.id.preparefoodid);

    }
}