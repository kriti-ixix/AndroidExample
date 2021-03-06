package com.example.example;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class TimePickerFragment extends DialogFragment
{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState)
    {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        boolean hourFormat = android.text.format.DateFormat.is24HourFormat(getActivity());

        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(),
                (TimePickerDialog.OnTimeSetListener) getActivity(), hour, minute, hourFormat);

        return timePickerDialog;
    }
}
