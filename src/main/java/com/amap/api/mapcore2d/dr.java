package com.amap.api.mapcore2d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dr extends SQLiteOpenHelper {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5973b = true;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5974c;

    /* renamed from: a  reason: collision with root package name */
    private dl f5975a;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f5975a.a(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f5975a.a(sQLiteDatabase, i, i2);
    }

    public dr(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, dl dlVar) {
        super(context, str, cursorFactory, i);
        this.f5975a = dlVar;
    }
}
