package com.david.metrestoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1m = 39.370in
    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText)findViewById(R.id.metersEditText);
        resultTextView = (TextView)findViewById(R.id.resultID);
        convertButton = (Button)findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversion Logic
                double multiplyer = 39.37;
                double result = 0.0;

                if(enterMeters.getText().toString().equals("")){
                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);
                } else{
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue*multiplyer;

                    //resultTextView.setText(Double.toString(result) + " inches");
                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText(String.format("%.2f",result) + " inches");   //this converts to 2 decimal places only based on the C++ libraries I believe
                }
            }
        });
    }
}
