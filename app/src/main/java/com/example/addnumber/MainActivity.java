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
    TextView reuslts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOne = findViewById(R.id.num1);
        numTwo = findViewById(R.id.num2);
        add = findViewById(R.id.button);
        reuslts = findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int sum = Integer.parseInt(numOne.getText().toString()) +  Integer.parseInt(numTwo.getText().toString());
                reuslts.setText("results is "+sum);
            }
        });



    }
}