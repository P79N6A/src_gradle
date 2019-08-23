package com.amap.api.services.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ch extends SQLiteOpenHelper {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6711b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6712c;

    /* renamed from: a  reason: collision with root package name */
    private cd f6713a;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f6713a.a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f6713a.a(sQLiteDatabase, i, i2);
    }

    public ch(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, cd cdVar) {
        super(context, str, cursorFactory, i);
        this.f6713a = cdVar;
    }
}
