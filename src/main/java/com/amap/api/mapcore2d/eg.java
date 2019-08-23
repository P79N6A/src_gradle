package com.amap.api.mapcore2d;

import android.database.sqlite.SQLiteDatabase;

public class eg implements dl {

    /* renamed from: a  reason: collision with root package name */
    private static eg f6021a;

    public String a() {
        return "dafile.db";
    }

    public void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public int b() {
        return 1;
    }

    private eg() {
    }

    public static synchronized eg c() {
        eg egVar;
        synchronized (eg.class) {
            if (f6021a == null) {
                f6021a = new eg();
            }
            egVar = f6021a;
        }
        return egVar;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            ek.a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
