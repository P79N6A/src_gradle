package com.bytedance.frameworks.baselib.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f19673a = {"_id", "value", "type", "timestamp", "retry_count", "retry_time"};

    /* renamed from: b  reason: collision with root package name */
    private static a f19674b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f19675c;

    /* renamed from: com.bytedance.frameworks.baselib.a.a$a  reason: collision with other inner class name */
    static class C0156a extends SQLiteOpenHelper {
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C0156a(Context context) {
            super(context, "lib_log_queue.db", null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e2) {
                new StringBuilder("create db exception ").append(e2);
            }
        }
    }

    private synchronized boolean b() {
        if (this.f19675c == null || !this.f19675c.isOpen()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (b()) {
            try {
                this.f19675c.execSQL("DROP TABLE IF EXISTS queue");
                this.f19675c.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e2) {
                new StringBuilder("recreateTableQueue db exception ").append(e2);
            }
        }
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

    private a(Context context) {
        if (context != null) {
            try {
                this.f19675c = new C0156a(context.getApplicationContext()).getWritableDatabase();
            } catch (Throwable unused) {
            }
        }
    }

    static a a(Context context) {
        if (f19674b == null) {
            synchronized (a.class) {
                if (f19674b == null) {
                    f19674b = new a(context);
                }
            }
        }
        return f19674b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str) {
        long j = 0;
        if (!b()) {
            return 0;
        }
        Cursor cursor = null;
        String str2 = "select count(*) from queue";
        try {
            if (!TextUtils.isEmpty(null)) {
                str2 = str2 + " " + null;
            }
            Cursor rawQuery = this.f19675c.rawQuery(str2, null);
            try {
                if (rawQuery.moveToNext()) {
                    j = rawQuery.getLong(0);
                }
                a(rawQuery);
            } catch (Throwable th) {
                th = th;
                cursor = rawQuery;
                a(cursor);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a(cursor);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.bytedance.frameworks.baselib.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.bytedance.frameworks.baselib.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.bytedance.frameworks.baselib.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.bytedance.frameworks.baselib.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.bytedance.frameworks.baselib.a.c} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r13 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0026] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x007c=Splitter:B:35:0x007c, B:18:0x005d=Splitter:B:18:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.baselib.a.c a(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.b()     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r11)
            return r1
        L_0x000a:
            java.lang.String r9 = "_id ASC"
            java.lang.String r10 = "1"
            java.lang.String r5 = "_id > ?"
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ Exception -> 0x006a }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x006a }
            r13 = 0
            r6[r13] = r12     // Catch:{ Exception -> 0x006a }
            android.database.sqlite.SQLiteDatabase r2 = r11.f19675c     // Catch:{ Exception -> 0x006a }
            java.lang.String r3 = "queue"
            java.lang.String[] r4 = f19673a     // Catch:{ Exception -> 0x006a }
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x006a }
            boolean r2 = r12.moveToNext()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            if (r2 == 0) goto L_0x005d
            com.bytedance.frameworks.baselib.a.c r2 = new com.bytedance.frameworks.baselib.a.c     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r2.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            long r3 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19681a = r3     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            byte[] r13 = r12.getBlob(r0)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19682b = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 2
            java.lang.String r13 = r12.getString(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19686f = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 3
            long r0 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19683c = r0     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 4
            int r13 = r12.getInt(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19684d = r13     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r13 = 5
            long r0 = r12.getLong(r13)     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r2.f19685e = r0     // Catch:{ Exception -> 0x005b, all -> 0x0061 }
            r1 = r2
            goto L_0x005d
        L_0x005b:
            r13 = move-exception
            goto L_0x0065
        L_0x005d:
            a((android.database.Cursor) r12)     // Catch:{ all -> 0x0080 }
            goto L_0x007a
        L_0x0061:
            r13 = move-exception
            goto L_0x007c
        L_0x0063:
            r13 = move-exception
            r2 = r1
        L_0x0065:
            r1 = r12
            goto L_0x006c
        L_0x0067:
            r13 = move-exception
            r12 = r1
            goto L_0x007c
        L_0x006a:
            r13 = move-exception
            r2 = r1
        L_0x006c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "getLog exception "
            r12.<init>(r0)     // Catch:{ all -> 0x0067 }
            r12.append(r13)     // Catch:{ all -> 0x0067 }
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x0080 }
            r1 = r2
        L_0x007a:
            monitor-exit(r11)
            return r1
        L_0x007c:
            a((android.database.Cursor) r12)     // Catch:{ all -> 0x0080 }
            throw r13     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.a.a.a(long):com.bytedance.frameworks.baselib.a.c");
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str, byte[] bArr) {
        if (b() && bArr != null) {
            if (bArr.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", bArr);
                contentValues.put("type", str);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("retry_count", 0);
                contentValues.put("retry_time", 0L);
                return this.f19675c.insert("queue", null, contentValues);
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str, int i, long j) {
        String[] strArr;
        String str2;
        if (b()) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (TextUtils.isEmpty(str)) {
                str2 = "timestamp <= ? ";
                strArr = new String[]{String.valueOf(currentTimeMillis)};
            } else {
                String str3 = "(timestamp <= ? OR retry_count > " + i + ") and type" + " = ?";
                String[] strArr2 = {String.valueOf(currentTimeMillis), str};
                str2 = str3;
                strArr = strArr2;
            }
            try {
                this.f19675c.delete("queue", str2, strArr);
            } catch (Exception e2) {
                new StringBuilder("delete expire log error:").append(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ab */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2 A[SYNTHETIC, Splitter:B:45:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r16, boolean r18, long r19, int r21) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            monitor-enter(r15)
            boolean r0 = r15.b()     // Catch:{ all -> 0x00bb }
            r4 = 0
            if (r0 == 0) goto L_0x00b9
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0013
            goto L_0x00b9
        L_0x0013:
            r0 = 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x00bb }
            r13[r4] = r5     // Catch:{ all -> 0x00bb }
            if (r18 != 0) goto L_0x00a0
            r14 = 0
            r5 = 2
            java.lang.String[] r7 = new java.lang.String[r5]     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "timestamp"
            r7[r4] = r5     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "retry_count"
            r7[r0] = r5     // Catch:{ Exception -> 0x008c }
            android.database.sqlite.SQLiteDatabase r5 = r1.f19675c     // Catch:{ Exception -> 0x008c }
            java.lang.String r6 = "queue"
            java.lang.String r8 = "_id = ?"
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r13
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x008c }
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            if (r6 != 0) goto L_0x0043
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r4
        L_0x0043:
            long r6 = r5.getLong(r4)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            int r8 = r5.getInt(r0)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r11 = 0
            long r6 = r9 - r6
            int r14 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r14 >= 0) goto L_0x0080
            r6 = r21
            if (r8 >= r6) goto L_0x0080
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.<init>()     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r7 = "retry_count"
            int r8 = r8 + r0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r7 = "retry_time"
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            r6.put(r7, r8)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            android.database.sqlite.SQLiteDatabase r7 = r1.f19675c     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            java.lang.String r8 = "queue"
            java.lang.String r9 = "_id = ?"
            r7.update(r8, r6, r9, r13)     // Catch:{ Exception -> 0x0086, all -> 0x0084 }
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r0
        L_0x0080:
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x00bb }
            goto L_0x00a0
        L_0x0084:
            r0 = move-exception
            goto L_0x009c
        L_0x0086:
            r0 = move-exception
            r14 = r5
            goto L_0x008d
        L_0x0089:
            r0 = move-exception
            r5 = r14
            goto L_0x009c
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "onLogSent exception: "
            r5.<init>(r6)     // Catch:{ all -> 0x0089 }
            r5.append(r0)     // Catch:{ all -> 0x0089 }
            a((android.database.Cursor) r14)     // Catch:{ all -> 0x00bb }
            r0 = 0
            goto L_0x00a0
        L_0x009c:
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00a0:
            if (r0 == 0) goto L_0x00b7
            android.database.sqlite.SQLiteDatabase r0 = r1.f19675c     // Catch:{ Throwable -> 0x00ab }
            java.lang.String r5 = "queue"
            java.lang.String r6 = "_id = ?"
            r0.delete(r5, r6, r13)     // Catch:{ Throwable -> 0x00ab }
        L_0x00ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = "delete app_log: "
            r0.<init>(r5)     // Catch:{ all -> 0x00bb }
            r0.append(r2)     // Catch:{ all -> 0x00bb }
            monitor-exit(r15)
            return r4
        L_0x00b7:
            monitor-exit(r15)
            return r4
        L_0x00b9:
            monitor-exit(r15)
            return r4
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.a.a.a(long, boolean, long, int):boolean");
    }
}
