package com.amap.api.services.a;

import android.database.sqlite.SQLiteDatabase;

public class ct implements cd {

    /* renamed from: a  reason: collision with root package name */
    private static ct f6750a;

    public String a() {
        return "dafile.db";
    }

    public void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public int b() {
        return 1;
    }

    private ct() {
    }

    public static synchronized ct c() {
        ct ctVar;
        synchronized (ct.class) {
            if (f6750a == null) {
                f6750a = new ct();
            }
            ctVar = f6750a;
        }
        return ctVar;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            cv.a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
