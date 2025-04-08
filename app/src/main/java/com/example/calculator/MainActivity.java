package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText firstValue, secondValue;
    TextView result1;
    Button add, subtract, multiply, divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.firstValue);
        secondValue = findViewById(R.id.secondValue);
        result1 = findViewById(R.id.result);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firVal, secVal, res;

                Toast.makeText(MainActivity.this, "Addition", Toast.LENGTH_SHORT).show();
                if(firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : 0");
                }
                else if(firstValue.getText().toString().isEmpty() && !secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+ Float.parseFloat(secondValue.getText().toString()));
                }
                else if(!firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+Float.parseFloat(firstValue.getText().toString()));
                }
                else{
                    firVal = Float.parseFloat(firstValue.getText().toString());
                    secVal = Float.parseFloat(secondValue.getText().toString());
                    res = firVal + secVal;

                    result1.setText("Ans : "+res);
                }

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firVal, secVal, res;
                Toast.makeText(MainActivity.this, "Subtraction", Toast.LENGTH_SHORT).show();
                if(firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : 0");
                }
                else if(firstValue.getText().toString().isEmpty() && !secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+ Float.parseFloat(secondValue.getText().toString()));
                }
                else if(!firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+Float.parseFloat(firstValue.getText().toString()));
                }
                else{
                    firVal = Float.parseFloat(firstValue.getText().toString());
                    secVal = Float.parseFloat(secondValue.getText().toString());
                    res = firVal - secVal;

                    result1.setText("Ans : "+res);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firVal, secVal, res;


                Toast.makeText(MainActivity.this, "Multiplication", Toast.LENGTH_SHORT).show();
                if(firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : 0");
                }
                else if(firstValue.getText().toString().isEmpty() && !secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+ Float.parseFloat(secondValue.getText().toString()));
                }
                else if(!firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+Float.parseFloat(firstValue.getText().toString()));
                }
                else{
                    firVal = Float.parseFloat(firstValue.getText().toString());
                    secVal = Float.parseFloat(secondValue.getText().toString());
                    res = firVal * secVal;

                    result1.setText("Ans : "+res);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float firVal, secVal, res;

                Toast.makeText(MainActivity.this, "Division", Toast.LENGTH_SHORT).show();
                if(firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : 0");
                }
                else if(firstValue.getText().toString().isEmpty() && !secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+ Float.parseFloat(secondValue.getText().toString()));
                }
                else if(!firstValue.getText().toString().isEmpty() && secondValue.getText().toString().isEmpty()){
                    result1.setText("Ans : "+Float.parseFloat(firstValue.getText().toString()));
                }
                else{
                    firVal = Float.parseFloat(firstValue.getText().toString());
                    secVal = Float.parseFloat(secondValue.getText().toString());
                    res = firVal / secVal;

                    result1.setText("Ans : "+res);
                }
            }
        });
    }
}