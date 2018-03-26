package com.david.fadinganimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView bart = (ImageView) findViewById(R.id.bart);
        //ImageView homer = (ImageView) findViewById(R.id.homer);

        //bart.animate().alpha(0f).setDuration(2000);       //need to put "f" everytime, duration in ms
        //homer.animate().alpha(1f).setDuration(2000);

        //bart.animate().translationYBy(2000f).setDuration(2000);  //translate in Y axis, taken as a pixel float unit
        bart.animate().translationXBy(2000f).setDuration(2000);  //translate to the X axis, left = negative, right = negative

        // can also rotate and scale size, rewatch video 46
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ImageView bart = (ImageView) findViewById(R.id.bart);
        bart.setTranslationX(-2000f);     //instant/intial transition
        */
    }
}
