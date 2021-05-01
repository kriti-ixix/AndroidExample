package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText emailEditText, passwordEditText;
    String email = "", password = "";
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.buttonLogin);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        email = emailEditText.getText().toString();
        password = passwordEditText.getText().toString();

        SharedPreferences sp = getSharedPreferences("userDetails", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("email", email);
        editor.putString("password", password);
        editor.apply();

        //Intent intent = new Intent(this, HomeActivity.class);
        //intent.putExtra("email", email);
        Intent intent = new Intent(this, NumberGuessingGame.class);
        startActivity(intent);
    }
}