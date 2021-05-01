package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class NumberGuessingGame extends AppCompatActivity implements View.OnClickListener{

    Button guess; EditText number;
    Random random = new Random();
    int randomNum = random.nextInt(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_guessing_game);

        //Registering all the views
        number = findViewById(R.id.editTextGuess);
        guess = findViewById(R.id.buttonGuess);

        guess.setOnClickListener(this);

        SharedPreferences spref = getSharedPreferences("userDetails", MODE_PRIVATE);
        String userEmail = spref.getString("email", "User");
        Toast.makeText(this, userEmail, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view)
    {
        int userGuess = Integer.parseInt(number.getText().toString());

        if (userGuess == randomNum)
        {
            Toast.makeText(this, "Your guess was correct!", Toast.LENGTH_SHORT).show();
        }
        else if (userGuess > randomNum)
        {
            Toast.makeText(this, "Your guess was too high", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Your guess was too low", Toast.LENGTH_SHORT).show();
        }
    }
}