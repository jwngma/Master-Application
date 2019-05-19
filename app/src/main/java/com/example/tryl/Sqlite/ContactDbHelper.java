package com.example.tryl.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

public class ContactDbHelper extends SQLiteOpenHelper {

    private static final String TAG = "ContactDbHelper";
    public  static  final  String DATABASE_NAME="contact_db";
    public  static  final  int DATABASE_VERSION=1;



    public  static  final  String CREATE_TABLE="create table "+ ContactContract.contactEntry.TABLE_NAME+"("+ContactContract.contactEntry.CONTACT_ID+"number,"+
            ContactContract.contactEntry.NAME+" text,"+ContactContract.contactEntry.EMAIL+" text)";



    public  static  final  String DROP_TALE="drop table if exists "+ContactContract.contactEntry.TABLE_NAME;

    public ContactDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

        Log.d(TAG, "ContactDbHelper: Database created ");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

        Log.d(TAG, "onCreate:  Table Created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_TALE);
        onCreate(db);


    }
}
