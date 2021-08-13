package com.example.tkddlab1_ps16752.ASM.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Mydatabase extends SQLiteOpenHelper {
    public Mydatabase(@Nullable Context context) {
        super(context, "LoginDBBB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create Table userss(username TEXT primary key, password TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
        super.onConfigure(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists userss");
        db.execSQL("drop Table if exists class");
        db.execSQL("drop Table if exists sinhvien");
    }
}
