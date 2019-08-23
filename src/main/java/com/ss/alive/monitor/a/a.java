package com.ss.alive.monitor.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f2384a = {"_id", "data_json", "end_time"};

    /* renamed from: b  reason: collision with root package name */
    private static a f2385b;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2386d = new Object();

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f2387c;

    /* renamed from: com.ss.alive.monitor.a.a$a  reason: collision with other inner class name */
    static class C0019a extends SQLiteOpenHelper {
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C0019a(Context context) {
            super(context, "alive_monitor.db", null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE process_start_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, data_json TEXT, end_time INTEGER )");
            } catch (Throwable unused) {
            }
        }
    }

    private a(Context context) {
        this.f2387c = new C0019a(context).getWritableDatabase();
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static a a(Context context) {
        synchronized (f2386d) {
            if (f2385b == null) {
                f2385b = new a(context.getApplicationContext());
            }
        }
        return f2385b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.f2387c     // Catch:{ all -> 0x002a }
            r1 = 0
            if (r0 == 0) goto L_0x0028
            android.database.sqlite.SQLiteDatabase r0 = r4.f2387c     // Catch:{ all -> 0x002a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            java.lang.String r0 = "_id = ?"
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x002a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002a }
            r3[r1] = r5     // Catch:{ all -> 0x002a }
            android.database.sqlite.SQLiteDatabase r5 = r4.f2387c     // Catch:{ all -> 0x002a }
            java.lang.String r6 = "process_start_info"
            int r5 = r5.delete(r6, r0, r3)     // Catch:{ all -> 0x002a }
            if (r5 <= 0) goto L_0x0026
            monitor-exit(r4)
            return r2
        L_0x0026:
            monitor-exit(r4)
            return r1
        L_0x0028:
            monitor-exit(r4)
            return r1
        L_0x002a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.alive.monitor.a.a.a(long):boolean");
    }

    public final synchronized List<b> a(long j, int i) {
        ArrayList arrayList;
        Cursor cursor;
        String str = i;
        String[] strArr = {PushConstants.PUSH_TYPE_NOTIFY};
        Cursor cursor2 = null;
        arrayList = new ArrayList();
        try {
            cursor = this.f2387c.query("process_start_info", f2384a, "_id > ? ", strArr, null, null, "_id ASC", str);
            while (cursor.moveToNext()) {
                try {
                    b bVar = new b();
                    bVar.f2388a = cursor.getLong(0);
                    bVar.f2389b = cursor.getString(1);
                    bVar.f2390c = cursor.getLong(2);
                    arrayList.add(bVar);
                } catch (Throwable th) {
                    th = th;
                    a(cursor);
                    throw th;
                }
            }
            a(cursor);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            a(cursor);
            throw th;
        }
        return arrayList;
    }
}
