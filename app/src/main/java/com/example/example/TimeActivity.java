package com.example.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimeActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    TextView time; Button getTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        time = findViewById(R.id.timeTextView);
        getTime = findViewById(R.id.buttonOpenTimer);

        getTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "time picker");
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minuteOfHour)
    {
        String hourString = String.valueOf(hourOfDay);
        String minString = "";

        if (minuteOfHour<10)
        {
            minString = "0" + String.valueOf(minuteOfHour);
        }
        else
        {
            minString = String.valueOf(minuteOfHour);
        }

        String selectedTime = hourString + ":" + minString;
        time.setText(selectedTime);

    }
}