package com.david.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lecture 35 - Using Variables and Linking layout elements to Java Code
        Button rollButton = (Button)findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView)findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.image_rightDice);

        //Lecture 38 Java Arrays and How to use them
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        //Lecture 36 - Use the Logcat and a listener to check if a button is pressed
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze Button has been pressed");

                //Lecture 37
                Random randomNumberGenerator = new Random();
                int first_number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The first random number is " + first_number );

                int second_number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The second random number is " + second_number);

                //Lecture 38
                leftDice.setImageResource(diceArray[first_number]);
                rightDice.setImageResource(diceArray[second_number]);
            }
        });





    }
}
