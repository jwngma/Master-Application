package com.example.tryl.TimePicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;

import java.util.Calendar;

public class DialogHandler  extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        Calendar calendar= Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int min=calendar.get(Calendar.MINUTE);

        TimePickerDialog  pickerDialog=new TimePickerDialog(getActivity(),(TimePickerDialog.OnTimeSetListener)getActivity(),hour,min,
                DateFormat.is24HourFormat(getActivity()));

        return  pickerDialog;

    }
}
