package com.example.news.adapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.List;

public class DBManager extends SQLiteOpenHelper {

    private final Context context;

    private static String TABLE_NAME_SANPHAM = "sanpham";

    private static String ID = "id";
    private static String TENSANPHAM = "tensanpham";
    private static String HINHANH = "hinhanh";
    private static String LOAI = "loai";


    private static String TABLE_NAME_LOAI = "loai";
    private static String TENLOAI = "tenloai";


    public DBManager(Context context) {
        super(context, "banhang", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = "CREATE TABLE " + TABLE_NAME_SANPHAM + " (" +
                ID + " integer primary key, " +
                TENSANPHAM + " TEXT, " +
                HINHANH + " BLOB, " +
                LOAI + " int)";

        String sqlQueryLoai = "CREATE TABLE " + TABLE_NAME_LOAI + " (" +
                ID + " integer primary key, " +
                TENLOAI + " TEXT)";

        db.execSQL(sqlQuery);
        db.execSQL(sqlQueryLoai);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}