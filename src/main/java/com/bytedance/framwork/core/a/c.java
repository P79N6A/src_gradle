package com.bytedance.framwork.core.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import com.bytedance.framwork.core.a.b.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static boolean f20092a = false;

    /* renamed from: b  reason: collision with root package name */
    static long f20093b = 5000;

    /* renamed from: c  reason: collision with root package name */
    static final String[] f20094c = {"_id", "data"};
    private static c i;
    private static String j = "SELECT count(*) FROM monitor_log WHERE aid = ?";
    private static String k = "SELECT count(*) FROM monitor_log";

    /* renamed from: d  reason: collision with root package name */
    String f20095d = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Integer> f20096e = new HashMap(2);

    /* renamed from: f  reason: collision with root package name */
    private int f20097f = 0;
    private a g;
    private SQLiteDatabase h;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r7, java.util.List<com.bytedance.framwork.core.a.b.a> r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            android.database.sqlite.SQLiteDatabase r0 = r6.h     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            boolean r0 = com.bytedance.framwork.core.a.e.b.a(r8)     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x000d
            goto L_0x0089
        L_0x000d:
            r6.b()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.h     // Catch:{ all -> 0x008b }
            r0.beginTransaction()     // Catch:{ all -> 0x008b }
            android.database.sqlite.SQLiteDatabase r0 = r6.h     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r1 = r6.f20095d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r1)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0021:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            com.bytedance.framwork.core.a.b.a r2 = (com.bytedance.framwork.core.a.b.a) r2     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 1
            java.lang.String r4 = r2.f20087b     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 2
            java.lang.String r4 = r2.f20088c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = ""
            goto L_0x0041
        L_0x003f:
            java.lang.String r4 = r2.f20088c     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0041:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 3
            java.lang.String r4 = r2.f20089d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x004c
            java.lang.String r4 = ""
            goto L_0x004e
        L_0x004c:
            java.lang.String r4 = r2.f20089d     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x004e:
            r0.bindString(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 4
            long r4 = r2.f20091f     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.bindLong(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r3 = 5
            java.lang.String r4 = r2.f20090e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            if (r4 != 0) goto L_0x005f
            java.lang.String r2 = ""
            goto L_0x0061
        L_0x005f:
            java.lang.String r2 = r2.f20090e     // Catch:{ Exception -> 0x0082, all -> 0x007b }
        L_0x0061:
            r0.bindString(r3, r2)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.executeInsert()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            goto L_0x0021
        L_0x0068:
            android.database.sqlite.SQLiteDatabase r0 = r6.h     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            int r8 = r8.size()     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            r6.a((java.lang.String) r7, (int) r8)     // Catch:{ Exception -> 0x0082, all -> 0x007b }
            android.database.sqlite.SQLiteDatabase r7 = r6.h     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x007b:
            r7 = move-exception
            android.database.sqlite.SQLiteDatabase r8 = r6.h     // Catch:{ all -> 0x008b }
            r8.endTransaction()     // Catch:{ all -> 0x008b }
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0082:
            android.database.sqlite.SQLiteDatabase r7 = r6.h     // Catch:{ all -> 0x008b }
            r7.endTransaction()     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.a.c.a(java.lang.String, java.util.List):void");
    }

    private synchronized void b() {
        if (!f20092a) {
            f20092a = true;
            if (((long) a()) >= f20093b) {
                a(500);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.h     // Catch:{ all -> 0x003a }
            r1 = -1
            if (r0 == 0) goto L_0x0038
            android.database.sqlite.SQLiteDatabase r0 = r4.h     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.h     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            java.lang.String r3 = k     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            android.database.Cursor r2 = r2.rawQuery(r3, r0)     // Catch:{ Exception -> 0x0033, all -> 0x002e }
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            if (r0 == 0) goto L_0x0024
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0028 }
            r1 = r0
        L_0x0024:
            a((android.database.Cursor) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L_0x002f
        L_0x002c:
            r0 = r2
            goto L_0x0033
        L_0x002e:
            r1 = move-exception
        L_0x002f:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x0033:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003a }
        L_0x0036:
            monitor-exit(r4)
            return r1
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.a.c.a():int");
    }

    private static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static c a(Context context) {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new c(context);
                }
            }
        }
        return i;
    }

    private c(Context context) {
        this.g = a.a(context);
        this.h = this.g.getWritableDatabase();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        return -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.database.sqlite.SQLiteDatabase r0 = r7.h     // Catch:{ all -> 0x003d }
            r1 = -1
            if (r0 == 0) goto L_0x003b
            android.database.sqlite.SQLiteDatabase r0 = r7.h     // Catch:{ all -> 0x003d }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x000f
            goto L_0x003b
        L_0x000f:
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.h     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            java.lang.String r3 = j     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            r5 = 0
            r4[r5] = r8     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            android.database.Cursor r8 = r2.rawQuery(r3, r4)     // Catch:{ Exception -> 0x0037, all -> 0x0032 }
            boolean r0 = r8.moveToNext()     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            if (r0 == 0) goto L_0x0029
            int r0 = r8.getInt(r5)     // Catch:{ Exception -> 0x0029, all -> 0x002d }
            r1 = r0
        L_0x0029:
            a((android.database.Cursor) r8)     // Catch:{ all -> 0x003d }
            goto L_0x0039
        L_0x002d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0033
        L_0x0032:
            r8 = move-exception
        L_0x0033:
            a((android.database.Cursor) r0)     // Catch:{ all -> 0x003d }
            throw r8     // Catch:{ all -> 0x003d }
        L_0x0037:
            r8 = r0
            goto L_0x0029
        L_0x0039:
            monitor-exit(r7)
            return r1
        L_0x003b:
            monitor-exit(r7)
            return r1
        L_0x003d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.a.c.b(java.lang.String):int");
    }

    private synchronized void a(long j2) {
        if (this.h != null) {
            try {
                this.h.execSQL(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT " + 500 + ")");
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized int a(String str) {
        int i2;
        if (this.f20097f <= 10) {
            if (this.f20096e.containsKey(str)) {
                i2 = this.f20096e.get(str).intValue();
                this.f20097f++;
            }
        }
        int b2 = b(str);
        this.f20096e.put(str, Integer.valueOf(b2));
        this.f20097f = 0;
        i2 = b2;
        return i2;
    }

    private void a(String str, int i2) {
        if (this.f20096e.containsKey(str) || i2 <= 0) {
            this.f20096e.put(str, Integer.valueOf(Math.max(0, i2 + this.f20096e.get(str).intValue())));
            return;
        }
        this.f20096e.put(str, Integer.valueOf(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.lang.String r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.database.sqlite.SQLiteDatabase r0 = r3.h     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            java.lang.String r0 = "aid = ? AND _id<= ? "
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x002d }
            r2 = 0
            r1[r2] = r4     // Catch:{ all -> 0x002d }
            r2 = 1
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x002d }
            r1[r2] = r5     // Catch:{ all -> 0x002d }
            android.database.sqlite.SQLiteDatabase r5 = r3.h     // Catch:{ all -> 0x002d }
            java.lang.String r6 = "monitor_log"
            int r5 = r5.delete(r6, r0, r1)     // Catch:{ all -> 0x002d }
            int r6 = r5 * -1
            r3.a((java.lang.String) r4, (int) r6)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r5
        L_0x002a:
            monitor-exit(r3)
            r4 = -1
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.a.c.a(java.lang.String, long):int");
    }

    @Nullable
    public final List<a> a(int i2, int i3) {
        Cursor cursor;
        try {
            cursor = this.h.query("monitor_log", f20094c, "aid= ?", new String[]{String.valueOf(i2)}, null, null, "_id ASC ", i3);
            try {
                if (cursor.getCount() == 0) {
                    a(cursor);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (cursor.moveToNext()) {
                    linkedList.add(new a(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("data"))));
                }
                a(cursor);
                return linkedList;
            } catch (Throwable th) {
                th = th;
                a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            a(cursor);
            throw th;
        }
    }
}
