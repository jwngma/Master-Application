package com.example.tryl.AsynTask_Second;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void ShowMessage(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
