package com.example.tryl.AsynTask;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import static android.support.constraint.Constraints.TAG;

public class L {
    public static void m(String message){
        Log.d(TAG, "m: "+message);
    }

    public static void s(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
