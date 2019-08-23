package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class t extends SQLiteOpenHelper {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Context f80685b;

    /* renamed from: a  reason: collision with root package name */
    private String f80686a;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final t f80687a;

        private a() {
        }

        static {
            t tVar = new t(t.f80685b, v.a(t.f80685b), "ua.db", null, 1);
            f80687a = tVar;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private void b() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!v.a("__sd", writableDatabase)) {
                c(writableDatabase);
            }
            if (!v.a("__et", writableDatabase)) {
                b(writableDatabase);
            }
            if (!v.a("__er", writableDatabase)) {
                a(writableDatabase);
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized t a(Context context) {
        t a2;
        synchronized (t.class) {
            f80685b = context;
            a2 = a.f80687a;
        }
        return a2;
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80686a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL(this.f80686a);
        } catch (SQLException unused) {
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80686a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT)";
            sQLiteDatabase.execSQL(this.f80686a);
        } catch (SQLException unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80686a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL(this.f80686a);
        } catch (SQLException unused) {
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            c(sQLiteDatabase);
            b(sQLiteDatabase);
            a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private t(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, (str == null || str.equals("")) ? "ua.db" : "ua.db", cursorFactory, i);
        this.f80686a = null;
        b();
    }

    private t(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new r(context, str), str2, cursorFactory, i);
    }
}
