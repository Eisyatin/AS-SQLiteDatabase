package com.example.lab3_eisyatin;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    //1.Create database
    private static final String database_Name = "personalbiodata.db";
    private static final int database_Version = 1;

    //Create constructor
    public DataHelper( Context context){
        super(context, database_Name, null, database_Version);
    }

    @Override
    //create table
    public void onCreate (SQLiteDatabase db){
        String sql = "Create table biodata (no integer primary key, name text null, dob text null, " +
                "gender text null, address text null); ";
        Log.d("Data","onCreate:" + sql);
        db.execSQL(sql);
    }

    //create method to upgrage DB if db exist
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){
    }
}
