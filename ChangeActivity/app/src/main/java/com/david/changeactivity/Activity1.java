package com.david.changeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button Act1button = (Button) findViewById(R.id.Act1Button);

        Act1button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent myIntent = new Intent(view.getContext(), Activity2.class);
                        //view.getContext = where we are
                        //Activity2.class = where we are going
                        startActivity(myIntent);
                    }
                }

        );
    }



}
