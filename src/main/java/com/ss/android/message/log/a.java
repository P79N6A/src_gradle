package com.ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30031a;

    /* renamed from: b  reason: collision with root package name */
    static final String[] f30032b = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f30033c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static a f30034d;

    /* renamed from: e  reason: collision with root package name */
    private SQLiteDatabase f30035e;

    /* renamed from: com.ss.android.message.log.a$a  reason: collision with other inner class name */
    static class C0363a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30036a;

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C0363a(Context context) {
            super(context, "ss_push_log.db", null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f30036a, false, 17954, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f30036a, false, 17954, new Class[]{SQLiteDatabase.class}, Void.TYPE);
                return;
            }
            try {
                sQLiteDatabase2.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
            } catch (Exception unused) {
            }
        }
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f30031a, true, 17947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f30031a, true, 17947, new Class[0], Void.TYPE);
            return;
        }
        synchronized (f30033c) {
            if (f30034d != null) {
                f30034d.b();
            }
            f30034d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x003d }
            com.meituan.robust.ChangeQuickRedirect r3 = f30031a     // Catch:{ all -> 0x003d }
            r4 = 0
            r5 = 17950(0x461e, float:2.5153E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x003d }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x003d }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x003d }
            com.meituan.robust.ChangeQuickRedirect r4 = f30031a     // Catch:{ all -> 0x003d }
            r5 = 0
            r6 = 17950(0x461e, float:2.5153E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x003d }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x003d }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003d }
            monitor-exit(r9)
            return
        L_0x0025:
            android.database.sqlite.SQLiteDatabase r0 = r9.f30035e     // Catch:{ Throwable -> 0x003b }
            if (r0 == 0) goto L_0x0039
            android.database.sqlite.SQLiteDatabase r0 = r9.f30035e     // Catch:{ Throwable -> 0x003b }
            boolean r0 = r0.isOpen()     // Catch:{ Throwable -> 0x003b }
            if (r0 == 0) goto L_0x0039
            android.database.sqlite.SQLiteDatabase r0 = r9.f30035e     // Catch:{ Throwable -> 0x003b }
            r0.close()     // Catch:{ Throwable -> 0x003b }
            r0 = 0
            r9.f30035e = r0     // Catch:{ Throwable -> 0x003b }
        L_0x0039:
            monitor-exit(r9)
            return
        L_0x003b:
            monitor-exit(r9)
            return
        L_0x003d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.a.b():void");
    }

    private a(Context context) {
        this.f30035e = new C0363a(context).getWritableDatabase();
    }

    public static a a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30031a, true, 17946, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context}, null, f30031a, true, 17946, new Class[]{Context.class}, a.class);
        }
        synchronized (f30033c) {
            if (f30034d == null) {
                f30034d = new a(context.getApplicationContext());
            }
        }
        return f30034d;
    }

    private static void a(Cursor cursor) {
        if (PatchProxy.isSupport(new Object[]{cursor}, null, f30031a, true, 17948, new Class[]{Cursor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cursor}, null, f30031a, true, 17948, new Class[]{Cursor.class}, Void.TYPE);
            return;
        }
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized long a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f30031a, false, 17951, new Class[]{b.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{bVar}, this, f30031a, false, 17951, new Class[]{b.class}, Long.TYPE)).longValue();
        }
        if (this.f30035e != null) {
            if (this.f30035e.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", bVar.f30037a);
                contentValues.put("tag", bVar.f30038b);
                if (!StringUtils.isEmpty(bVar.f30039c)) {
                    contentValues.put("label", bVar.f30039c);
                }
                contentValues.put("value", Long.valueOf(bVar.f30040d));
                contentValues.put("ext_value", Long.valueOf(bVar.f30041e));
                if (!StringUtils.isEmpty(bVar.f30042f)) {
                    contentValues.put("ext_json", bVar.f30042f);
                }
                return this.f30035e.insert("event", null, contentValues);
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006a }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x006a }
            r2.<init>(r10)     // Catch:{ all -> 0x006a }
            r8 = 0
            r1[r8] = r2     // Catch:{ all -> 0x006a }
            com.meituan.robust.ChangeQuickRedirect r3 = f30031a     // Catch:{ all -> 0x006a }
            r4 = 0
            r5 = 17952(0x4620, float:2.5156E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006a }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x006a }
            r6[r8] = r2     // Catch:{ all -> 0x006a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006a }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0043
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006a }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x006a }
            r2.<init>(r10)     // Catch:{ all -> 0x006a }
            r1[r8] = r2     // Catch:{ all -> 0x006a }
            com.meituan.robust.ChangeQuickRedirect r3 = f30031a     // Catch:{ all -> 0x006a }
            r4 = 0
            r5 = 17952(0x4620, float:2.5156E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006a }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x006a }
            r6[r8] = r0     // Catch:{ all -> 0x006a }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x006a }
            r2 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            monitor-exit(r9)
            return r0
        L_0x0043:
            android.database.sqlite.SQLiteDatabase r1 = r9.f30035e     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            android.database.sqlite.SQLiteDatabase r1 = r9.f30035e     // Catch:{ all -> 0x006a }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x006a }
            if (r1 != 0) goto L_0x0050
            goto L_0x0068
        L_0x0050:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x006a }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x006a }
            r1[r8] = r2     // Catch:{ all -> 0x006a }
            android.database.sqlite.SQLiteDatabase r2 = r9.f30035e     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "event"
            java.lang.String r4 = "_id = ?"
            int r1 = r2.delete(r3, r4, r1)     // Catch:{ all -> 0x006a }
            if (r1 <= 0) goto L_0x0066
            monitor-exit(r9)
            return r0
        L_0x0066:
            monitor-exit(r9)
            return r8
        L_0x0068:
            monitor-exit(r9)
            return r8
        L_0x006a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.a.a(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012a, code lost:
        if (r4 > 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x011b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONArray a(long r24, int r26) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            monitor-enter(r23)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0131 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0131 }
            r2.<init>(r9)     // Catch:{ all -> 0x0131 }
            r11 = 0
            r1[r11] = r2     // Catch:{ all -> 0x0131 }
            r12 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0131 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x0131 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30031a     // Catch:{ all -> 0x0131 }
            r4 = 0
            r5 = 17953(0x4621, float:2.5158E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0131 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0131 }
            r6[r11] = r2     // Catch:{ all -> 0x0131 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0131 }
            r6[r13] = r2     // Catch:{ all -> 0x0131 }
            java.lang.Class<org.json.JSONArray> r7 = org.json.JSONArray.class
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0131 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0131 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0131 }
            r2.<init>(r9)     // Catch:{ all -> 0x0131 }
            r1[r11] = r2     // Catch:{ all -> 0x0131 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0131 }
            r1[r13] = r2     // Catch:{ all -> 0x0131 }
            com.meituan.robust.ChangeQuickRedirect r3 = f30031a     // Catch:{ all -> 0x0131 }
            r4 = 0
            r5 = 17953(0x4621, float:2.5158E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0131 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0131 }
            r6[r11] = r0     // Catch:{ all -> 0x0131 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0131 }
            r6[r13] = r0     // Catch:{ all -> 0x0131 }
            java.lang.Class<org.json.JSONArray> r7 = org.json.JSONArray.class
            r2 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0131 }
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ all -> 0x0131 }
            monitor-exit(r23)
            return r0
        L_0x005b:
            java.lang.String r21 = "_id ASC"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r1.<init>()     // Catch:{ all -> 0x0131 }
            r1.append(r12)     // Catch:{ all -> 0x0131 }
            java.lang.String r22 = r1.toString()     // Catch:{ all -> 0x0131 }
            java.lang.String r17 = "_id > ? "
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ all -> 0x0131 }
            java.lang.String r2 = java.lang.String.valueOf(r24)     // Catch:{ all -> 0x0131 }
            r1[r11] = r2     // Catch:{ all -> 0x0131 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x0131 }
            r2.<init>()     // Catch:{ all -> 0x0131 }
            android.database.sqlite.SQLiteDatabase r14 = r8.f30035e     // Catch:{ Throwable -> 0x0127, all -> 0x0121 }
            java.lang.String r15 = "event"
            java.lang.String[] r16 = f30032b     // Catch:{ Throwable -> 0x0127, all -> 0x0121 }
            r19 = 0
            r20 = 0
            r18 = r1
            android.database.Cursor r1 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x0127, all -> 0x0121 }
            r4 = 0
        L_0x0089:
            boolean r5 = r1.moveToNext()     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r5 == 0) goto L_0x011b
            long r5 = r1.getLong(r11)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            java.lang.String r7 = r1.getString(r13)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            java.lang.String r9 = r1.getString(r0)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            r10 = 3
            boolean r14 = r1.isNull(r10)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r14 != 0) goto L_0x00a7
            java.lang.String r10 = r1.getString(r10)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            goto L_0x00a8
        L_0x00a7:
            r10 = 0
        L_0x00a8:
            r14 = 4
            boolean r15 = r1.isNull(r14)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            r16 = 0
            if (r15 != 0) goto L_0x00b6
            long r14 = r1.getLong(r14)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            goto L_0x00b8
        L_0x00b6:
            r14 = r16
        L_0x00b8:
            boolean r18 = r1.isNull(r12)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r18 != 0) goto L_0x00c5
            long r18 = r1.getLong(r12)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            r11 = r18
            goto L_0x00c7
        L_0x00c5:
            r11 = r16
        L_0x00c7:
            r0 = 6
            boolean r18 = r1.isNull(r0)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r18 != 0) goto L_0x00d3
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            r13.<init>()     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            java.lang.String r3 = "_id"
            r13.put(r3, r5)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r3 != 0) goto L_0x00e9
            java.lang.String r3 = "ext_json"
            r13.put(r3, r0)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
        L_0x00e9:
            java.lang.String r0 = "category"
            r13.put(r0, r7)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            java.lang.String r0 = "tag"
            r13.put(r0, r9)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "label"
            r13.put(r0, r10)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
        L_0x00fe:
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            java.lang.String r0 = "value"
            r13.put(r0, r14)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
        L_0x0107:
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = "ext_value"
            r13.put(r0, r11)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
        L_0x0110:
            r2.put(r13)     // Catch:{ Throwable -> 0x011b, all -> 0x011f }
            int r4 = r4 + 1
            r0 = 2
            r11 = 0
            r12 = 5
            r13 = 1
            goto L_0x0089
        L_0x011b:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x0131 }
            goto L_0x012a
        L_0x011f:
            r0 = move-exception
            goto L_0x0123
        L_0x0121:
            r0 = move-exception
            r1 = 0
        L_0x0123:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x0127:
            r1 = 0
            r4 = 0
            goto L_0x011b
        L_0x012a:
            if (r4 <= 0) goto L_0x012e
            monitor-exit(r23)
            return r2
        L_0x012e:
            monitor-exit(r23)
            r1 = 0
            return r1
        L_0x0131:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.a.a(long, int):org.json.JSONArray");
    }
}
