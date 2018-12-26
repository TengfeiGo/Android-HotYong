package com.example.tengfei.contentproviderdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author tengfei
 */
public class DbOpenHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "book_provider.db";
    private static final int DB_VERSION = 1;
    public static final String BOOK_TABLE_NAME = "book";
    public static final String USER_TABLE_NAME = "user";

    private static final String CREATE_BOOK_TABLE = "CREATE TABLE " + BOOK_TABLE_NAME + "(_ID INTEGER PRIMARY KEY,name TEXT)";
    private static final String CREATE_USER_TABLE = "CREATE TABLE " + USER_TABLE_NAME + "(_ID INTEGER PRIMARY KEY,name TEXT,sex INT)";

    public DbOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK_TABLE);
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
