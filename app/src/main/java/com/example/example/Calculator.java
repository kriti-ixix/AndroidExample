package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    EditText first, second;
    Button add, sub;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Registering all the views
        first = findViewById(R.id.editTextFirst);
        second = findViewById(R.id.editTextSecond);
        result = findViewById(R.id.textViewResult);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);

        //Setting the onClickListeners
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        int x = Integer.parseInt(first.getText().toString());
        int y = Integer.parseInt(second.getText().toString());

        if (id==R.id.buttonAdd)
        {
            int z = x + y;
            result.setText(String.valueOf(z));
        }
        else
        {
            int z = x - y;
            result.setText(String.valueOf(z));
        }
    }
}