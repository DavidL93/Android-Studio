package com.david.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button tryMeButton;
    private View windowView;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLUE, Color.BLACK, Color.DKGRAY,
                           Color.LTGRAY, Color.MAGENTA, Color.YELLOW};

        windowView = (View)findViewById(R.id.windowViewId);     //dont have to cast "(view)", im gonna do it anyways
        windowView.setBackgroundColor(colors[3]);

        tryMeButton = (Button)findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArrayLength = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);
                windowView.setBackgroundColor(colors[randomNum]);
                //Log.d("TEST", "Tap");
                Log.d("Random", String.valueOf(randomNum));
            }
        });
    }
}
