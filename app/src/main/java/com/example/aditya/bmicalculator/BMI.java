package com.example.aditya.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.aditya.bmicalculator.R.id.button;
import static com.example.aditya.bmicalculator.R.id.textView;

public class BMI extends AppCompatActivity {

    EditText height;
    EditText weight;
    TextView result;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        height = (EditText) findViewById(R.id.editText);
        weight = (EditText) findViewById(R.id.editText2);
        result = (TextView) findViewById(R.id.result);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float wei = Float.parseFloat(height.getText().toString());
                float hei = Float.parseFloat(weight.getText().toString());
                float res = wei/(hei*2);
                if(res<=18.5)
                    result.setText(res+"\n\n"+"Underweight");
                if(res>=18.5&&res<=24.9)
                    result.setText(res+"\n\n"+"Normal");
                if(res>24.9&&res<=29.9)
                    result.setText(res+"\n\n"+"Overweight");
                if(res>29.9&&res<=34.9)
                    result.setText(res+"\n\n"+"Class I Obess");
                if(res>34.9&&res<=39.9)
                    result.setText(res+"\n\n"+"Class II Obess");
                if(res>39.9)
                    result.setText(res+"\n\n"+"Class III Obess");
            }
        });
    }
}
