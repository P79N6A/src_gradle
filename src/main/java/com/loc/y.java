package com.loc;

import android.database.sqlite.SQLiteDatabase;

public final class y implements m {

    /* renamed from: a  reason: collision with root package name */
    private static y f25902a;

    private y() {
    }

    public static synchronized y b() {
        y yVar;
        synchronized (y.class) {
            if (f25902a == null) {
                f25902a = new y();
            }
            yVar = f25902a;
        }
        return yVar;
    }

    public final String a() {
        return "dafile.db";
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS file (_id integer primary key autoincrement, sname  varchar(20), fname varchar(100),md varchar(20),version varchar(20),dversion varchar(20),status varchar(20),reservedfield varchar(20));");
        } catch (Throwable th) {
            f.a(th, "DynamicFileDBCreator", "onCreate");
        }
    }
}
