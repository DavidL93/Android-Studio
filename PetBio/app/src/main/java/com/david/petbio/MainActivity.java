package com.david.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catID);
        dogView = (ImageView) findViewById(R.id.dogID);

//        catView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Cat touched", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        dogView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Dog touched", Toast.LENGTH_LONG).show();
//            }
//        });

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.catID:
                //go to second activity
                //Toast.makeText(MainActivity.this, "CAT", Toast.LENGTH_LONG).show();

                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Jarvis");
                catIntent.putExtra("bio", "Great cat. Loves people and meows a lot!");
                startActivity(catIntent);
                break;

            case R.id.dogID:
                //go to second activity
                //Toast.makeText(MainActivity.this, "DOG", Toast.LENGTH_LONG).show();

                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Dufus");
                dogIntent.putExtra("bio", "Great Dog. Loves people and barks and eat a lot!");
                startActivity(dogIntent);
                break;
        }
    }
}
