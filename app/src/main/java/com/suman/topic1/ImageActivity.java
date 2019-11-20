package com.suman.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener
{

    RadioGroup rdgrp;
    RadioButton rdbat, rddor, rddog;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        //binding
        rdgrp=findViewById(R.id.rdgrp);
        rdbat=findViewById(R.id.rdbat);
        rddog=findViewById(R.id.rddog);
        rddor=findViewById(R.id.rddor);
        img=findViewById(R.id.img);

        rdbat.setOnClickListener(this);
        rddog.setOnClickListener(this);
        rddor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.rdbat :
                img.setImageResource(R.drawable.batman);
                break;

            case  R.id.rddor :
                img.setImageResource(R.drawable.doremon);
                break;

            case R.id.rddog :
                img.setImageResource(R.drawable.dog);
                break;
        }
    }
}
