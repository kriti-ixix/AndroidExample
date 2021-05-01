package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CurrencyConverter extends AppCompatActivity {

    EditText amount; Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        amount = findViewById(R.id.editTextAmount);
        convert = findViewById(R.id.buttonConvert);

    }
}