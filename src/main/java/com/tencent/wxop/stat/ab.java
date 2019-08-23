package com.tencent.wxop.stat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.wxop.stat.a.b;

public final class ab extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private String f79829a = "";

    /* renamed from: b  reason: collision with root package name */
    private Context f79830b;

    public ab(Context context, String str) {
        super(context, str, null, 3);
        this.f79829a = str;
        this.f79830b = context.getApplicationContext();
        if (d.b()) {
            b c2 = t.h;
            c2.a("SQLiteOpenHelper " + this.f79829a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.database.Cursor} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.database.sqlite.SQLiteDatabase r9) {
        /*
            r0 = 0
            java.lang.String r2 = "user"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r9
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0052, all -> 0x004a }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r2.<init>()     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            boolean r3 = r1.moveToNext()     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.String r0 = r1.getString(r5)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r1.getInt(r4)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r3 = 2
            r1.getString(r3)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r3 = 3
            r1.getLong(r3)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            java.lang.String r3 = com.tencent.wxop.stat.a.s.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            java.lang.String r6 = "uid"
            r2.put(r6, r3)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
        L_0x0033:
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = "user"
            java.lang.String r6 = "uid=?"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r4[r5] = r0     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
            r9.update(r3, r2, r6, r4)     // Catch:{ Throwable -> 0x0048, all -> 0x0046 }
        L_0x0040:
            if (r1 == 0) goto L_0x0057
            r1.close()
            return
        L_0x0046:
            r9 = move-exception
            goto L_0x004c
        L_0x0048:
            r0 = r1
            goto L_0x0052
        L_0x004a:
            r9 = move-exception
            r1 = r0
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            throw r9
        L_0x0052:
            if (r0 == 0) goto L_0x0057
            r0.close()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.ab.a(android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.database.sqlite.SQLiteDatabase r11) {
        /*
            r0 = 0
            java.lang.String r2 = "events"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x007b, all -> 0x0073 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r0.<init>()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
        L_0x0013:
            boolean r2 = r1.moveToNext()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0037
            long r6 = r1.getLong(r4)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.lang.String r8 = r1.getString(r3)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r2 = 2
            int r9 = r1.getInt(r2)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r2 = 3
            int r10 = r1.getInt(r2)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            com.tencent.wxop.stat.ac r2 = new com.tencent.wxop.stat.ac     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r5 = r2
            r5.<init>(r6, r8, r9, r10)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r0.add(r2)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            goto L_0x0013
        L_0x0037:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r2.<init>()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
        L_0x0040:
            boolean r5 = r0.hasNext()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            if (r5 == 0) goto L_0x0069
            java.lang.Object r5 = r0.next()     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            com.tencent.wxop.stat.ac r5 = (com.tencent.wxop.stat.ac) r5     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.lang.String r6 = "content"
            java.lang.String r7 = r5.f79832b     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.lang.String r7 = com.tencent.wxop.stat.a.s.b((java.lang.String) r7)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r2.put(r6, r7)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.lang.String r6 = "events"
            java.lang.String r7 = "event_id=?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            long r9 = r5.f79831a     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            java.lang.String r5 = java.lang.Long.toString(r9)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r8[r4] = r5     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            r11.update(r6, r2, r7, r8)     // Catch:{ Throwable -> 0x0071, all -> 0x006f }
            goto L_0x0040
        L_0x0069:
            if (r1 == 0) goto L_0x0080
            r1.close()
            return
        L_0x006f:
            r11 = move-exception
            goto L_0x0075
        L_0x0071:
            r0 = r1
            goto L_0x007b
        L_0x0073:
            r11 = move-exception
            r1 = r0
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            r1.close()
        L_0x007a:
            throw r11
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.ab.b(android.database.sqlite.SQLiteDatabase):void");
    }

    public final synchronized void close() {
        super.close();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists events(event_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, content TEXT, status INTEGER, send_count INTEGER, timestamp LONG)");
        sQLiteDatabase.execSQL("create table if not exists user(uid TEXT PRIMARY KEY, user_type INTEGER, app_ver TEXT, ts INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists config(type INTEGER PRIMARY KEY NOT NULL, content TEXT, md5sum TEXT, version INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
        sQLiteDatabase.execSQL("CREATE INDEX if not exists status_idx ON events(status)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b c2 = t.h;
        c2.f("upgrade DB from oldVersion " + i + " to newVersion " + i2);
        if (i == 1) {
            sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
            a(sQLiteDatabase);
            b(sQLiteDatabase);
        }
        if (i == 2) {
            a(sQLiteDatabase);
            b(sQLiteDatabase);
        }
    }
}
