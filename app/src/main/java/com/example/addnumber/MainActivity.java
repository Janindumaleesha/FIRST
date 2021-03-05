package com.example.addnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numOne;
    EditText numTwo;
    Button add;
    Button sub;
    Button div;
    Button multi;
    TextView reuslts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = findViewById(R.id.num1);
        numTwo = findViewById(R.id.num2);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        div = findViewById(R.id.button3);
        multi = findViewById(R.id.button4);
        reuslts = findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int sum = Integer.parseInt(numOne.getText().toString()) +  Integer.parseInt(numTwo.getText().toString());
                reuslts.setText("results is "+sum);
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int su = Integer.parseInt(numOne.getText().toString()) -  Integer.parseInt(numTwo.getText().toString());
                reuslts.setText("results is "+su);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int di = Integer.parseInt(numOne.getText().toString()) / Integer.parseInt(numTwo.getText().toString());
                reuslts.setText("results is "+di);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mu = Integer.parseInt(numOne.getText().toString()) * Integer.parseInt(numTwo.getText().toString());
                reuslts.setText("results is "+mu);
            }
        });



    }
}
