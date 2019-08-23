package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class c extends SQLiteOpenHelper {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Context f80547b;

    /* renamed from: a  reason: collision with root package name */
    private String f80548a;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final c f80549a;

        private a() {
        }

        static {
            c cVar = new c(c.f80547b, d.a(c.f80547b), "cc.db", null, 1);
            f80549a = cVar;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            java.lang.String r1 = "aggregated"
            boolean r1 = r2.a(r1, r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "aggregated_cache"
            boolean r1 = r2.a(r1, r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r1 != 0) goto L_0x0017
        L_0x0014:
            r2.c(r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
        L_0x0017:
            java.lang.String r1 = "system"
            boolean r1 = r2.a(r1, r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r1 != 0) goto L_0x0022
            r2.b(r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
        L_0x0022:
            java.lang.String r1 = "limitedck"
            boolean r1 = r2.a(r1, r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
            if (r1 != 0) goto L_0x002d
            r2.a((android.database.sqlite.SQLiteDatabase) r0)     // Catch:{ Exception -> 0x0030, all -> 0x002e }
        L_0x002d:
            return
        L_0x002e:
            r0 = move-exception
            throw r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.c.b():void");
    }

    public static synchronized c a(Context context) {
        c a2;
        synchronized (c.class) {
            f80547b = context;
            a2 = a.f80549a;
        }
        return a2;
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80548a = "create table if not exists limitedck(Id INTEGER primary key autoincrement, ck TEXT unique)";
            sQLiteDatabase.execSQL(this.f80548a);
            return true;
        } catch (SQLException unused) {
            by.e("create reference table error!");
            return false;
        }
    }

    private boolean b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80548a = "create table if not exists system(Id INTEGER primary key autoincrement, key TEXT, timeStamp INTEGER, count INTEGER)";
            sQLiteDatabase.execSQL(this.f80548a);
            return true;
        } catch (SQLException unused) {
            by.e("create system table error!");
            return false;
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f80548a = "create table if not exists aggregated_cache(Id INTEGER primary key autoincrement, key TEXT, totalTimestamp TEXT, value INTEGER, count INTEGER, label TEXT, timeWindowNum TEXT)";
            sQLiteDatabase.execSQL(this.f80548a);
            this.f80548a = "create table if not exists aggregated(Id INTEGER primary key autoincrement, key TEXT, totalTimestamp TEXT, value INTEGER, count INTEGER, label TEXT, timeWindowNum TEXT)";
            sQLiteDatabase.execSQL(this.f80548a);
            return true;
        } catch (SQLException unused) {
            by.e("create aggregated table error!");
            return false;
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r5 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r5 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r5, android.database.sqlite.SQLiteDatabase r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r3 = "select count(*) as c from sqlite_master where type ='table' and name ='"
            r2.<init>(r3)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r5 = r5.trim()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            r2.append(r5)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r5 = "' "
            r2.append(r5)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            android.database.Cursor r5 = r6.rawQuery(r5, r1)     // Catch:{ Exception -> 0x003e, all -> 0x0037 }
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x003f, all -> 0x0034 }
            if (r6 == 0) goto L_0x002e
            int r6 = r5.getInt(r0)     // Catch:{ Exception -> 0x003f, all -> 0x0034 }
            if (r6 <= 0) goto L_0x002e
            r6 = 1
            r0 = 1
        L_0x002e:
            if (r5 == 0) goto L_0x0042
        L_0x0030:
            r5.close()
            goto L_0x0042
        L_0x0034:
            r6 = move-exception
            r1 = r5
            goto L_0x0038
        L_0x0037:
            r6 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r1.close()
        L_0x003d:
            throw r6
        L_0x003e:
            r5 = r1
        L_0x003f:
            if (r5 == 0) goto L_0x0042
            goto L_0x0030
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.c.a(java.lang.String, android.database.sqlite.SQLiteDatabase):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, (str == null || str.equals("")) ? "cc.db" : "cc.db", cursorFactory, i);
        b();
    }

    private c(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new e(context, str), str2, cursorFactory, i);
    }
}
