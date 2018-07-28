package com.example.priyamshah.contentprovider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PRIYAM SHAH on 12-01-2018.
 */

public class MyDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="products.db";
    public static final String TABLE_PRODUCTS="products";
    public static final String COLUMN_ID="_id";
    public static final String COLUMN_PRODUCTNAME="productname";

    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE " + TABLE_PRODUCTS + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_PRODUCTNAME + " TEXT "  +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ TABLE_PRODUCTS);
        onCreate(db);
    }

    //Insert Value
    public void addProducts(Products products)
    {
        ContentValues values=new ContentValues();
        values.put(COLUMN_PRODUCTNAME,products.get_productname());
        SQLiteDatabase db=getWritableDatabase();
        db.insert(TABLE_PRODUCTS,null,values);
        db.close();
    }

    //delete value
    public void delete(String productname)
    {
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL(" DELETE FROM "+ TABLE_PRODUCTS + " WHERE " + COLUMN_PRODUCTNAME + " =\" "+ productname + " \";");

    }

    //print value

    public String databaseToString() {
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_PRODUCTS + " WHERE 1";

        // Cursor point to a location in the results
        Cursor c = db.rawQuery(query, null);
        // Move to the first row in the results
        c.moveToFirst();

        while(!c.isAfterLast()) {
            if(c.getString(c.getColumnIndex("productname")) != null) {
                dbString += c.getString(c.getColumnIndex("productname"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }
}
