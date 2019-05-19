package com.example.tryl.SharedPreference.CheckLogedInStatus;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.tryl.R;

public class PreferenceManager {

    private Context context;
    private SharedPreferences sharedPreferences;

    public PreferenceManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preference), Context.MODE_PRIVATE);
    }


//    public void writeStatus(boolean status){
////        SharedPreferences.Editor editor=sharedPreferences.edit();
////
////        editor.putBoolean(context.getResources().getString(R.string.login_status_preference),status);
////        editor.commit();
////
////    }


    public void writeUsedStatus() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.login_status_preference), "INIT_OK");
        editor.commit();
    }

//    public boolean readLoginStatus() {
//
//        boolean status;
//        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preference), false);
//        return status;
//    }


    public boolean checkLoggedInStatus() {
        boolean status;

        if (sharedPreferences.getString(context.getResources().getString(R.string.login_status_preference),"null").equals("null")){
            status= false;
        }
        else {
            status= true;
        }

        return  status;
    }

    public void clearPreference() {
        sharedPreferences.edit().clear().commit();
    }
}
