package com.ss.android.ad.splash.core.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f27530b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public Context f27531a;

    /* renamed from: c  reason: collision with root package name */
    private c f27532c;

    protected class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        Context f27533a;

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + "trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "id TEXT UNIQUE," + "url TEXT ," + "replaceholder INTEGER default 0, " + "retry INTEGER default 0, " + "type INTEGER default 0, " + "cid BIGINT default 0, " + "log_extraTEXT" + ")");
        }

        public a(Context context) {
            super(context, "splashsdk.db", null, 1);
            this.f27533a = context;
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.a.b$b  reason: collision with other inner class name */
    public class C0320b extends AbstractCursor {
        public final String[] getColumnNames() {
            return new String[0];
        }

        public final int getCount() {
            return 0;
        }

        public final double getDouble(int i) {
            return 0.0d;
        }

        public final float getFloat(int i) {
            return 0.0f;
        }

        public final int getInt(int i) {
            return 0;
        }

        public final long getLong(int i) {
            return 0;
        }

        public final short getShort(int i) {
            return 0;
        }

        public final String getString(int i) {
            return null;
        }

        public final boolean isNull(int i) {
            return true;
        }

        public C0320b() {
        }
    }

    public class c {

        /* renamed from: b  reason: collision with root package name */
        private volatile SQLiteDatabase f27537b;

        private void a() {
            try {
                synchronized (b.f27530b) {
                    if (this.f27537b == null || !this.f27537b.isOpen()) {
                        this.f27537b = new a(b.this.f27531a).getWritableDatabase();
                        this.f27537b.setLockingEnabled(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }

        public c() {
        }

        public final int a(String str, String str2, String[] strArr) {
            try {
                a();
                return this.f27537b.delete(str, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        public final long a(String str, String str2, ContentValues contentValues) {
            try {
                a();
                return this.f27537b.insert(str, null, contentValues);
            } catch (Exception unused) {
                return -1;
            }
        }

        public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                a();
                return this.f27537b.update(str, contentValues, str2, strArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                a();
                return this.f27537b.query(str, null, null, null, null, null, null);
            } catch (Throwable unused) {
                return new C0320b();
            }
        }
    }

    public c a() {
        return this.f27532c;
    }

    b(Context context) {
        this.f27531a = context.getApplicationContext();
        if (this.f27532c == null) {
            this.f27532c = new c();
        }
    }
}
