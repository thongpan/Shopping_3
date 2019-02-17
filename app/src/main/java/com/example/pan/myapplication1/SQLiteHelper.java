package com.example.pan.myapplication1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static SQLiteHelper sqLiteDB;
    private static final String DB_NAME = "db_product";
    private static final int DB_VERSION = 1;

    private SQLiteHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    public static synchronized SQLiteHelper getInstance(Context context){
        if (sqLiteDB == null){
            sqLiteDB = new SQLiteHelper(context.getApplicationContext());
        }
        return sqLiteDB;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql =
                "CREATE TABLE IF NOT EXISTS list_product(" +
                        "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "pro_name TEXT, " +
                        "title_sample TEXT, "+
                        "price INTEGER," +
                        "pro_image BLOB)";
        db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV){

    }

    @Override
    public  void onDowngrade(SQLiteDatabase db, int oldV, int newV){

    }
}



