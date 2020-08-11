package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText et3, et4;
    TextView textView;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et3 = findViewById(R.id.eNum1);
        et4 = findViewById(R.id.eNum2);
        textView = findViewById(R.id.calc);
        b1 = findViewById(R.id.btn_add);
        b2 = findViewById(R.id.btn_sub);
        b3 = findViewById(R.id.btn_mul);
        b4 = findViewById(R.id.btn_div);

        Intent intent = getIntent();
        final String num1 = intent.getStringExtra("num1");
        final String num2 = intent.getStringExtra("num2");

        et3.setText(num1);
        et4.setText(num2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = add(Integer.parseInt(num1), Integer.parseInt(num2));
                textView.setText(num1 + " + " + num2 + " = " + res);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = sub(Integer.parseInt(num1), Integer.parseInt(num2));
                textView.setText(num1 + " - " + num2 + " = " + res);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = mul(Integer.parseInt(num1), Integer.parseInt(num2));
                textView.setText(num1 + " * " + num2 + " = " + res);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = div(Integer.parseInt(num1), Integer.parseInt(num2));
                textView.setText(num1 + " / " + num2 + " = " + res);
            }
        });
    }
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }

}