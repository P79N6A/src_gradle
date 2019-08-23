package com.ss.android.common.applog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import java.util.List;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28160a = null;

    /* renamed from: b  reason: collision with root package name */
    static volatile String f28161b = "ss_app_log.db";

    /* renamed from: c  reason: collision with root package name */
    static final String[] f28162c = {"_id", "name", "duration", "session_id"};

    /* renamed from: d  reason: collision with root package name */
    static final String[] f28163d = {"_id", "value", "is_crash", "timestamp", "retry_count", "retry_time", "log_type"};

    /* renamed from: e  reason: collision with root package name */
    static final String[] f28164e = {"_id", "value", "timestamp", "duration", "non_page", "app_version", "version_code", "pausetime", "launch_sent", "event_index"};

    /* renamed from: f  reason: collision with root package name */
    static final String[] f28165f = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json", "user_id", "timestamp", "session_id", "event_index"};
    static final String[] g = {"_id", "log_type", "value", "session_id"};
    static final String[] h = {"_id", "log_type", "value"};
    static final Object i = new Object();
    static h j;
    private SQLiteDatabase k;
    private final Context l;

    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28166a;

        public a(Context context) {
            super(context, h.f28161b, null, 9);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f28166a, false, 15523, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f28166a, false, 15523, new Class[]{SQLiteDatabase.class}, Void.TYPE);
                return;
            }
            try {
                sQLiteDatabase2.execSQL("CREATE TABLE session ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value VARCHAR NOT NULL, timestamp INTEGER, duration INTEGER, non_page INTEGER, app_version VARCHAR, version_code INTEGER, pausetime INTEGER,launch_sent INTEGER NOT NULL DEFAULT 0, event_index INTEGER NOT NULL DEFAULT 0  )");
                sQLiteDatabase2.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT, user_id INTEGER, timestamp INTEGER, session_id INTEGER, event_index INTEGER NOT NULL DEFAULT 0 )");
                sQLiteDatabase2.execSQL("CREATE TABLE page ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, duration INTEGER, session_id INTEGER )");
                sQLiteDatabase2.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT, is_crash INTEGER NOT NULL DEFAULT 0, log_type INTEGER NOT NULL DEFAULT 0, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
                sQLiteDatabase2.execSQL("CREATE TABLE mon_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT )");
                sQLiteDatabase2.execSQL("CREATE TABLE misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            } catch (Exception unused) {
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            int i3 = i;
            if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f28166a, false, 15524, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f28166a, false, 15524, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i3 < 2) {
                sQLiteDatabase2.execSQL("ALTER TABLE event ADD COLUMN user_id INTEGER");
            }
            if (i3 < 3) {
                sQLiteDatabase2.execSQL("ALTER TABLE session ADD COLUMN launch_sent INTEGER NOT NULL DEFAULT 0");
            }
            if (i3 < 4) {
                sQLiteDatabase2.execSQL("ALTER TABLE queue ADD COLUMN is_crash INTEGER NOT NULL DEFAULT 0");
            }
            if (i3 < 5) {
                sQLiteDatabase2.execSQL("ALTER TABLE event ADD COLUMN ext_json TEXT");
            }
            if (i3 < 6) {
                sQLiteDatabase2.execSQL("ALTER TABLE queue ADD COLUMN log_type INTEGER NOT NULL DEFAULT 0");
                sQLiteDatabase2.execSQL("CREATE TABLE mon_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT )");
            }
            if (i3 < 7) {
                sQLiteDatabase2.execSQL("CREATE TABLE misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            }
            if (i3 < 8) {
                sQLiteDatabase2.execSQL("ALTER TABLE event ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i3 < 9) {
                sQLiteDatabase2.execSQL("ALTER TABLE session ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x003d }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x003d }
            r4 = 0
            r5 = 15503(0x3c8f, float:2.1724E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x003d }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x003d }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x003d }
            com.meituan.robust.ChangeQuickRedirect r4 = f28160a     // Catch:{ all -> 0x003d }
            r5 = 0
            r6 = 15503(0x3c8f, float:2.1724E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x003d }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x003d }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003d }
            monitor-exit(r9)
            return
        L_0x0025:
            android.database.sqlite.SQLiteDatabase r0 = r9.k     // Catch:{ Throwable -> 0x003b }
            if (r0 == 0) goto L_0x0039
            android.database.sqlite.SQLiteDatabase r0 = r9.k     // Catch:{ Throwable -> 0x003b }
            boolean r0 = r0.isOpen()     // Catch:{ Throwable -> 0x003b }
            if (r0 == 0) goto L_0x0039
            android.database.sqlite.SQLiteDatabase r0 = r9.k     // Catch:{ Throwable -> 0x003b }
            r0.close()     // Catch:{ Throwable -> 0x003b }
            r0 = 0
            r9.k = r0     // Catch:{ Throwable -> 0x003b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a():void");
    }

    public final synchronized long a(o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, f28160a, false, 15504, new Class[]{o.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{oVar}, this, f28160a, false, 15504, new Class[]{o.class}, Long.TYPE)).longValue();
        }
        if (this.k != null) {
            if (this.k.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", oVar.f28188b);
                contentValues.put("tag", oVar.f28189c);
                if (!StringUtils.isEmpty(oVar.f28190d)) {
                    contentValues.put("label", oVar.f28190d);
                }
                contentValues.put("value", Long.valueOf(oVar.f28191e));
                contentValues.put("ext_value", Long.valueOf(oVar.f28192f));
                if (!StringUtils.isEmpty(oVar.j)) {
                    contentValues.put("ext_json", oVar.j);
                }
                contentValues.put("user_id", Long.valueOf(oVar.g));
                contentValues.put("timestamp", Long.valueOf(oVar.h));
                contentValues.put("session_id", Long.valueOf(oVar.i));
                contentValues.put("event_index", Long.valueOf(oVar.m));
                return this.k.insert("event", null, contentValues);
            }
        }
        return -1;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.ss.android.common.applog.q r15, long r16) {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            r9 = r16
            monitor-enter(r14)
            r11 = 2
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x00b7 }
            r12 = 0
            r1[r12] = r0     // Catch:{ all -> 0x00b7 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00b7 }
            r2.<init>(r9)     // Catch:{ all -> 0x00b7 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x00b7 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00b7 }
            r4 = 0
            r5 = 15506(0x3c92, float:2.1729E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x00b7 }
            java.lang.Class<com.ss.android.common.applog.q> r2 = com.ss.android.common.applog.q.class
            r6[r12] = r2     // Catch:{ all -> 0x00b7 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b7 }
            r6[r13] = r2     // Catch:{ all -> 0x00b7 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b7 }
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0054
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x00b7 }
            r1[r12] = r0     // Catch:{ all -> 0x00b7 }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x00b7 }
            r0.<init>(r9)     // Catch:{ all -> 0x00b7 }
            r1[r13] = r0     // Catch:{ all -> 0x00b7 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00b7 }
            r4 = 0
            r5 = 15506(0x3c92, float:2.1729E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x00b7 }
            java.lang.Class<com.ss.android.common.applog.q> r0 = com.ss.android.common.applog.q.class
            r6[r12] = r0     // Catch:{ all -> 0x00b7 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b7 }
            r6[r13] = r0     // Catch:{ all -> 0x00b7 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00b7 }
            r2 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00b7 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x00b7 }
            monitor-exit(r14)
            return r0
        L_0x0054:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x00b3
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00b7 }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x0061
            goto L_0x00b3
        L_0x0061:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0082 }
            r1.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "pausetime"
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x0082 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0082 }
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ Exception -> 0x0082 }
            long r3 = r0.f28201c     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0082 }
            r2[r12] = r3     // Catch:{ Exception -> 0x0082 }
            android.database.sqlite.SQLiteDatabase r3 = r8.k     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = "session"
            java.lang.String r5 = "_id = ?"
            r3.update(r4, r1, r5, r2)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x00af }
            r1.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "name"
            java.lang.String r3 = r0.f28199a     // Catch:{ Exception -> 0x00af }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "duration"
            int r3 = r0.f28200b     // Catch:{ Exception -> 0x00af }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00af }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "session_id"
            long r3 = r0.f28201c     // Catch:{ Exception -> 0x00af }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00af }
            r1.put(r2, r0)     // Catch:{ Exception -> 0x00af }
            android.database.sqlite.SQLiteDatabase r0 = r8.k     // Catch:{ Exception -> 0x00af }
            java.lang.String r2 = "page"
            r3 = 0
            long r0 = r0.insert(r2, r3, r1)     // Catch:{ Exception -> 0x00af }
            monitor-exit(r14)
            return r0
        L_0x00af:
            r0 = 0
            monitor-exit(r14)
            return r0
        L_0x00b3:
            r0 = -1
            monitor-exit(r14)
            return r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(com.ss.android.common.applog.q, long):long");
    }

    public final synchronized long a(x xVar) {
        if (PatchProxy.isSupport(new Object[]{xVar}, this, f28160a, false, 15507, new Class[]{x.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{xVar}, this, f28160a, false, 15507, new Class[]{x.class}, Long.TYPE)).longValue();
        }
        if (this.k != null) {
            if (this.k.isOpen()) {
                boolean z = xVar.i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", xVar.f28219b);
                contentValues.put("timestamp", Long.valueOf(xVar.f28220c));
                contentValues.put("duration", Integer.valueOf(xVar.f28222e));
                contentValues.put("non_page", Integer.valueOf(z ? 1 : 0));
                contentValues.put("app_version", xVar.f28223f);
                contentValues.put("version_code", Integer.valueOf(xVar.g));
                contentValues.put("event_index", Long.valueOf(xVar.f28221d));
                return this.k.insert("session", null, contentValues);
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f28160a, false, 15510, new Class[]{String.class, Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f28160a, false, 15510, new Class[]{String.class, Integer.TYPE}, Long.TYPE)).longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", 0);
        contentValues.put("retry_time", 0L);
        contentValues.put("log_type", Integer.valueOf(i2));
        return this.k.insert("queue", null, contentValues);
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f28160a, false, 15511, new Class[]{String.class, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f28160a, false, 15511, new Class[]{String.class, String.class}, Long.TYPE)).longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        return this.k.insert("mon_log", null, contentValues);
    }

    /* access modifiers changed from: package-private */
    public final synchronized long a(long j2, String str, String str2) {
        long j3 = j2;
        String str3 = str;
        String str4 = str2;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{new Long(j3), str3, str4}, this, f28160a, false, 15512, new Class[]{Long.TYPE, String.class, String.class}, Long.TYPE)) {
                long longValue = ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j3), str3, str4}, this, f28160a, false, 15512, new Class[]{Long.TYPE, String.class, String.class}, Long.TYPE)).longValue();
                return longValue;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_type", str3);
            contentValues.put("value", str4);
            contentValues.put("session_id", Long.valueOf(j2));
            long insert = this.k.insert("misc_log", null, contentValues);
            return insert;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x019a */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0131 A[Catch:{ Exception -> 0x00f9, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0155 A[Catch:{ Exception -> 0x00f9, all -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01aa A[SYNTHETIC, Splitter:B:84:0x01aa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r22, boolean r24) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            monitor-enter(r21)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01b9 }
            r2.<init>(r9)     // Catch:{ all -> 0x01b9 }
            r11 = 0
            r1[r11] = r2     // Catch:{ all -> 0x01b9 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r24)     // Catch:{ all -> 0x01b9 }
            r12 = 1
            r1[r12] = r2     // Catch:{ all -> 0x01b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x01b9 }
            r4 = 0
            r5 = 15513(0x3c99, float:2.1738E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x01b9 }
            r6[r11] = r2     // Catch:{ all -> 0x01b9 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01b9 }
            r6[r12] = r2     // Catch:{ all -> 0x01b9 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01b9 }
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x005e
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01b9 }
            r2.<init>(r9)     // Catch:{ all -> 0x01b9 }
            r1[r11] = r2     // Catch:{ all -> 0x01b9 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r24)     // Catch:{ all -> 0x01b9 }
            r1[r12] = r2     // Catch:{ all -> 0x01b9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x01b9 }
            r4 = 0
            r5 = 15513(0x3c99, float:2.1738E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x01b9 }
            r6[r11] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01b9 }
            r6[r12] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01b9 }
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01b9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01b9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01b9 }
            monitor-exit(r21)
            return r0
        L_0x005e:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x01b9 }
            if (r1 == 0) goto L_0x01b7
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x01b9 }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x01b9 }
            if (r1 != 0) goto L_0x006c
            goto L_0x01b7
        L_0x006c:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0074
            monitor-exit(r21)
            return r11
        L_0x0074:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ all -> 0x01b9 }
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch:{ all -> 0x01b9 }
            r3[r11] = r4     // Catch:{ all -> 0x01b9 }
            r4 = 0
            if (r24 != 0) goto L_0x00ff
            r5 = 3
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            java.lang.String r5 = "timestamp"
            r15[r11] = r5     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            java.lang.String r5 = "retry_count"
            r15[r12] = r5     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            java.lang.String r5 = "retry_time"
            r15[r0] = r5     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            android.database.sqlite.SQLiteDatabase r13 = r8.k     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            java.lang.String r14 = "queue"
            java.lang.String r16 = "_id = ?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r3
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00f8, all -> 0x00f2 }
            boolean r6 = r5.moveToNext()     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            if (r6 != 0) goto L_0x00ab
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r21)
            return r11
        L_0x00ab:
            long r6 = r5.getLong(r11)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            int r13 = r5.getInt(r12)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            r16 = 0
            long r6 = r14 - r6
            r16 = 432000000(0x19bfcc00, double:2.13436359E-315)
            int r18 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x00eb
            r6 = 5
            if (r13 >= r6) goto L_0x00eb
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            r6.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            java.lang.String r7 = "retry_count"
            int r13 = r13 + r12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            r6.put(r7, r13)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            java.lang.String r7 = "retry_time"
            java.lang.Long r13 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            r6.put(r7, r13)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            android.database.sqlite.SQLiteDatabase r7 = r8.k     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            java.lang.String r13 = "queue"
            java.lang.String r14 = "_id = ?"
            r7.update(r13, r6, r14, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x00f0 }
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x01b9 }
            monitor-exit(r21)
            return r11
        L_0x00eb:
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x01b9 }
            r5 = 1
            goto L_0x0100
        L_0x00f0:
            r0 = move-exception
            goto L_0x00f4
        L_0x00f2:
            r0 = move-exception
            r5 = r4
        L_0x00f4:
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ all -> 0x01b9 }
        L_0x00f8:
            r5 = r4
        L_0x00f9:
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x01b9 }
            r5 = 0
            r6 = 0
            goto L_0x0101
        L_0x00ff:
            r5 = 0
        L_0x0100:
            r6 = 1
        L_0x0101:
            if (r5 == 0) goto L_0x01a8
            boolean r5 = com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x01b9 }
            if (r5 == 0) goto L_0x01a8
            android.content.Context r5 = r8.l     // Catch:{ all -> 0x01b9 }
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b9 }
            r13[r11] = r5     // Catch:{ all -> 0x01b9 }
            java.lang.Long r7 = new java.lang.Long     // Catch:{ all -> 0x01b9 }
            r7.<init>(r9)     // Catch:{ all -> 0x01b9 }
            r13[r12] = r7     // Catch:{ all -> 0x01b9 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.applog.n.f28180a     // Catch:{ all -> 0x01b9 }
            r16 = 1
            r17 = 15556(0x3cc4, float:2.1799E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r7[r11] = r18     // Catch:{ all -> 0x01b9 }
            java.lang.Class r18 = java.lang.Long.TYPE     // Catch:{ all -> 0x01b9 }
            r7[r12] = r18     // Catch:{ all -> 0x01b9 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x01b9 }
            r18 = r7
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01b9 }
            if (r7 == 0) goto L_0x0155
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b9 }
            r13[r11] = r5     // Catch:{ all -> 0x01b9 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ all -> 0x01b9 }
            r1.<init>(r9)     // Catch:{ all -> 0x01b9 }
            r13[r12] = r1     // Catch:{ all -> 0x01b9 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.common.applog.n.f28180a     // Catch:{ all -> 0x01b9 }
            r16 = 1
            r17 = 15556(0x3cc4, float:2.1799E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b9 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1     // Catch:{ all -> 0x01b9 }
            java.lang.Class r1 = java.lang.Long.TYPE     // Catch:{ all -> 0x01b9 }
            r0[r12] = r1     // Catch:{ all -> 0x01b9 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x01b9 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01b9 }
            goto L_0x01a8
        L_0x0155:
            boolean r0 = com.ss.android.common.applog.n.f28183d     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01a8
            boolean r0 = com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01a8
            if (r5 == 0) goto L_0x01a8
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0166
            goto L_0x01a8
        L_0x0166:
            java.io.File r0 = r5.getExternalCacheDir()     // Catch:{ Throwable -> 0x01a6, all -> 0x01a0 }
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x01a6, all -> 0x01a0 }
            java.lang.String r2 = "discard_logs.log"
            r1.<init>(r0, r2)     // Catch:{ Throwable -> 0x01a6, all -> 0x01a0 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x01a6, all -> 0x01a0 }
            r2.<init>(r1, r12)     // Catch:{ Throwable -> 0x01a6, all -> 0x01a0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            r0.<init>()     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            r0.append(r9)     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            java.util.Date r1 = new java.util.Date     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            r1.<init>()     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            r0.append(r1)     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
            r2.write(r0)     // Catch:{ Throwable -> 0x019a, all -> 0x019e }
        L_0x019a:
            com.ss.android.common.applog.n.a((java.io.Closeable) r2)     // Catch:{ all -> 0x01b9 }
            goto L_0x01a8
        L_0x019e:
            r0 = move-exception
            goto L_0x01a2
        L_0x01a0:
            r0 = move-exception
            r2 = r4
        L_0x01a2:
            com.ss.android.common.applog.n.a((java.io.Closeable) r2)     // Catch:{ all -> 0x01b9 }
            throw r0     // Catch:{ all -> 0x01b9 }
        L_0x01a6:
            r2 = r4
            goto L_0x019a
        L_0x01a8:
            if (r6 == 0) goto L_0x01b4
            android.database.sqlite.SQLiteDatabase r0 = r8.k     // Catch:{ Throwable -> 0x01b4 }
            java.lang.String r1 = "queue"
            java.lang.String r2 = "_id = ?"
            r0.delete(r1, r2, r3)     // Catch:{ Throwable -> 0x01b4 }
            goto L_0x01b5
        L_0x01b4:
            r12 = 0
        L_0x01b5:
            monitor-exit(r21)
            return r12
        L_0x01b7:
            monitor-exit(r21)
            return r11
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(long, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        return null;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00c0=Splitter:B:35:0x00c0, B:28:0x00b7=Splitter:B:28:0x00b7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.common.applog.p a(long r22) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            monitor-enter(r21)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cc }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00cc }
            r2.<init>(r9)     // Catch:{ all -> 0x00cc }
            r11 = 0
            r1[r11] = r2     // Catch:{ all -> 0x00cc }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00cc }
            r4 = 0
            r5 = 15515(0x3c9b, float:2.1741E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00cc }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00cc }
            r6[r11] = r2     // Catch:{ all -> 0x00cc }
            java.lang.Class<com.ss.android.common.applog.p> r7 = com.ss.android.common.applog.p.class
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cc }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00cc }
            r2.<init>(r9)     // Catch:{ all -> 0x00cc }
            r1[r11] = r2     // Catch:{ all -> 0x00cc }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00cc }
            r4 = 0
            r5 = 15515(0x3c9b, float:2.1741E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00cc }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00cc }
            r6[r11] = r0     // Catch:{ all -> 0x00cc }
            java.lang.Class<com.ss.android.common.applog.p> r7 = com.ss.android.common.applog.p.class
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00cc }
            com.ss.android.common.applog.p r0 = (com.ss.android.common.applog.p) r0     // Catch:{ all -> 0x00cc }
            monitor-exit(r21)
            return r0
        L_0x0045:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00cc }
            r2 = 0
            if (r1 == 0) goto L_0x00ca
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00cc }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x0054
            goto L_0x00ca
        L_0x0054:
            java.lang.String r19 = "_id ASC"
            java.lang.String r20 = "1"
            java.lang.String r15 = "_id > ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            java.lang.String r3 = java.lang.String.valueOf(r22)     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            r1[r11] = r3     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            android.database.sqlite.SQLiteDatabase r12 = r8.k     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            java.lang.String r13 = "queue"
            java.lang.String[] r14 = f28163d     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            r17 = 0
            r18 = 0
            r16 = r1
            android.database.Cursor r1 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00c4, all -> 0x00be }
            boolean r3 = r1.moveToNext()     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            if (r3 == 0) goto L_0x00b7
            com.ss.android.common.applog.p r3 = new com.ss.android.common.applog.p     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.<init>()     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            int r4 = r1.getInt(r11)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            long r4 = (long) r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28193a = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            java.lang.String r4 = r1.getString(r0)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28194b = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r4 = 2
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            if (r4 <= 0) goto L_0x0092
            r11 = 1
        L_0x0092:
            r4 = 3
            long r4 = r1.getLong(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28195c = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r4 = 4
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28196d = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r4 = 5
            long r4 = r1.getLong(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28197e = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r4 = 6
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            r3.f28198f = r4     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            int r4 = r3.f28198f     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
            if (r4 != 0) goto L_0x00b6
            if (r11 == 0) goto L_0x00b6
            r3.f28198f = r0     // Catch:{ Exception -> 0x00c5, all -> 0x00bc }
        L_0x00b6:
            r2 = r3
        L_0x00b7:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00cc }
            monitor-exit(r21)
            return r2
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c0
        L_0x00be:
            r0 = move-exception
            r1 = r2
        L_0x00c0:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00cc }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00cc }
            monitor-exit(r21)
            return r2
        L_0x00ca:
            monitor-exit(r21)
            return r2
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(long):com.ss.android.common.applog.p");
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0322, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0338, code lost:
        r6 = r8;
        r10 = r45;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:296:0x06bc */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0322 A[ExcHandler: all (th java.lang.Throwable), PHI: r45 
      PHI: (r45v10 android.database.Cursor) = (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v6 android.database.Cursor), (r45v12 android.database.Cursor), (r45v12 android.database.Cursor) binds: [B:166:0x03e6, B:167:?, B:136:0x0351, B:141:0x035f, B:153:0x03c3, B:154:?, B:127:0x0332, B:128:?, B:116:0x031e, B:117:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:116:0x031e] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0332 A[SYNTHETIC, Splitter:B:127:0x0332] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0351 A[SYNTHETIC, Splitter:B:136:0x0351] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03fa A[Catch:{ Exception -> 0x045b, all -> 0x0459 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0403 A[Catch:{ Exception -> 0x045b, all -> 0x0459 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0453 A[Catch:{ Exception -> 0x045b, all -> 0x0459 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x046d A[Catch:{ Exception -> 0x045b, all -> 0x0459 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04a6 A[Catch:{ Exception -> 0x0441, all -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04a8 A[Catch:{ Exception -> 0x0441, all -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04ac A[Catch:{ Exception -> 0x0441, all -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04b1 A[Catch:{ Exception -> 0x0441, all -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0526 A[Catch:{ Exception -> 0x0441, all -> 0x06e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0546 A[Catch:{ Exception -> 0x06ff, all -> 0x06e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x055e A[Catch:{ Exception -> 0x06ff, all -> 0x06e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0576 A[Catch:{ Exception -> 0x06ff, all -> 0x06e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05ab A[Catch:{ Exception -> 0x06ff, all -> 0x06e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x05ac A[Catch:{ Exception -> 0x06ff, all -> 0x06e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0287  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:308:0x06cb=Splitter:B:308:0x06cb, B:296:0x06bc=Splitter:B:296:0x06bc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(com.ss.android.common.applog.x r47, com.ss.android.common.applog.x r48, org.json.JSONObject r49, boolean r50, long[] r51, java.lang.String[] r52, java.util.List<com.ss.android.common.applog.AppLog.j> r53, boolean r54, org.json.JSONObject r55) {
        /*
            r46 = this;
            r8 = r46
            r0 = r47
            r9 = r48
            r10 = r49
            r7 = r55
            monitor-enter(r46)
            r6 = 9
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x070d }
            r5 = 0
            r1[r5] = r0     // Catch:{ all -> 0x070d }
            r4 = 1
            r1[r4] = r9     // Catch:{ all -> 0x070d }
            r3 = 2
            r1[r3] = r10     // Catch:{ all -> 0x070d }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r50)     // Catch:{ all -> 0x070d }
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x070d }
            r2 = 4
            r1[r2] = r51     // Catch:{ all -> 0x070d }
            r2 = 5
            r1[r2] = r52     // Catch:{ all -> 0x070d }
            r2 = 6
            r1[r2] = r53     // Catch:{ all -> 0x070d }
            java.lang.Byte r19 = java.lang.Byte.valueOf(r54)     // Catch:{ all -> 0x070d }
            r2 = 7
            r1[r2] = r19     // Catch:{ all -> 0x070d }
            r2 = 8
            r1[r2] = r7     // Catch:{ all -> 0x070d }
            com.meituan.robust.ChangeQuickRedirect r19 = f28160a     // Catch:{ all -> 0x070d }
            r22 = 0
            r23 = 15518(0x3c9e, float:2.1745E-41)
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ all -> 0x070d }
            java.lang.Class<com.ss.android.common.applog.x> r25 = com.ss.android.common.applog.x.class
            r2[r5] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<com.ss.android.common.applog.x> r25 = com.ss.android.common.applog.x.class
            r2[r4] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<org.json.JSONObject> r25 = org.json.JSONObject.class
            r16 = 2
            r2[r16] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class r25 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x070d }
            r2[r3] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<long[]> r25 = long[].class
            r17 = 4
            r2[r17] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<java.lang.String[]> r25 = java.lang.String[].class
            r18 = 5
            r2[r18] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<java.util.List> r25 = java.util.List.class
            r20 = 6
            r2[r20] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class r25 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x070d }
            r21 = 7
            r2[r21] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class<org.json.JSONObject> r25 = org.json.JSONObject.class
            r24 = 8
            r2[r24] = r25     // Catch:{ all -> 0x070d }
            java.lang.Class r25 = java.lang.Long.TYPE     // Catch:{ all -> 0x070d }
            r17 = r2
            r2 = r46
            r3 = r19
            r15 = 1
            r4 = r22
            r15 = 0
            r5 = r23
            r15 = 9
            r6 = r17
            r7 = r25
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x070d }
            if (r1 == 0) goto L_0x00f6
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ all -> 0x070d }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x070d }
            r0 = 1
            r1[r0] = r9     // Catch:{ all -> 0x070d }
            r7 = 2
            r1[r7] = r10     // Catch:{ all -> 0x070d }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r50)     // Catch:{ all -> 0x070d }
            r6 = 3
            r1[r6] = r0     // Catch:{ all -> 0x070d }
            r5 = 4
            r1[r5] = r51     // Catch:{ all -> 0x070d }
            r3 = 5
            r1[r3] = r52     // Catch:{ all -> 0x070d }
            r4 = 6
            r1[r4] = r53     // Catch:{ all -> 0x070d }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r54)     // Catch:{ all -> 0x070d }
            r2 = 7
            r1[r2] = r0     // Catch:{ all -> 0x070d }
            r0 = r55
            r9 = 8
            r1[r9] = r0     // Catch:{ all -> 0x070d }
            com.meituan.robust.ChangeQuickRedirect r0 = f28160a     // Catch:{ all -> 0x070d }
            r10 = 0
            r11 = 15518(0x3c9e, float:2.1745E-41)
            java.lang.Class[] r12 = new java.lang.Class[r15]     // Catch:{ all -> 0x070d }
            java.lang.Class<com.ss.android.common.applog.x> r13 = com.ss.android.common.applog.x.class
            r14 = 0
            r12[r14] = r13     // Catch:{ all -> 0x070d }
            java.lang.Class<com.ss.android.common.applog.x> r13 = com.ss.android.common.applog.x.class
            r14 = 1
            r12[r14] = r13     // Catch:{ all -> 0x070d }
            java.lang.Class<org.json.JSONObject> r13 = org.json.JSONObject.class
            r12[r7] = r13     // Catch:{ all -> 0x070d }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x070d }
            r12[r6] = r7     // Catch:{ all -> 0x070d }
            java.lang.Class<long[]> r6 = long[].class
            r12[r5] = r6     // Catch:{ all -> 0x070d }
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r12[r3] = r5     // Catch:{ all -> 0x070d }
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r12[r4] = r3     // Catch:{ all -> 0x070d }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x070d }
            r12[r2] = r3     // Catch:{ all -> 0x070d }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r12[r9] = r2     // Catch:{ all -> 0x070d }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x070d }
            r47 = r1
            r48 = r46
            r49 = r0
            r50 = r10
            r51 = r11
            r52 = r12
            r53 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x070d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x070d }
            long r0 = r0.longValue()     // Catch:{ all -> 0x070d }
            monitor-exit(r46)
            return r0
        L_0x00f6:
            r2 = 7
            r3 = 5
            r4 = 6
            r5 = 4
            r6 = 3
            r7 = 2
            r15 = r55
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x070d }
            if (r1 == 0) goto L_0x0708
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x070d }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x070d }
            if (r1 != 0) goto L_0x010c
            goto L_0x0708
        L_0x010c:
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x070d }
            long r2 = r0.f28218a     // Catch:{ all -> 0x070d }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x070d }
            r2 = 0
            r7[r2] = r1     // Catch:{ all -> 0x070d }
            r25 = 0
            r26 = 0
            java.lang.String r1 = r0.f28223f     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            if (r1 != 0) goto L_0x013e
            int r1 = r0.g     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            if (r1 <= 0) goto L_0x013e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String[] r2 = com.ss.android.common.applog.AppLog.HEADER_KEYS     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.<init>(r10, r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r2 = "app_version"
            java.lang.String r3 = r0.f28223f     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r2 = "version_code"
            int r3 = r0.g     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r10 = r1
        L_0x013e:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r3.<init>()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r2.<init>()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r28 = "_id ASC"
            boolean r1 = r0.i     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            if (r1 != 0) goto L_0x022e
            if (r50 != 0) goto L_0x022e
            java.lang.String r24 = "500"
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r17 = "page"
            java.lang.String[] r18 = f28162c     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r19 = "session_id = ?"
            r21 = 0
            r22 = 0
            r16 = r1
            r20 = r7
            r23 = r28
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r4.<init>()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r5 = 0
            r16 = 0
        L_0x0175:
            boolean r17 = r1.moveToNext()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            if (r17 == 0) goto L_0x01b1
            r29 = r2
            r6 = 1
            java.lang.String r2 = r1.getString(r6)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r30 = r3
            r6 = 2
            int r3 = r1.getInt(r6)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            if (r6 != 0) goto L_0x01a7
            if (r3 <= 0) goto L_0x01a7
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r6.<init>()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r31 = r7
            r7 = 0
            r6.put(r7, r2)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            r2 = 1
            r6.put(r2, r3)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            int r5 = r5 + r3
            int r16 = r16 + 1
            r4.put(r6)     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            goto L_0x01a9
        L_0x01a7:
            r31 = r7
        L_0x01a9:
            r2 = r29
            r3 = r30
            r7 = r31
            r6 = 3
            goto L_0x0175
        L_0x01b1:
            r29 = r2
            r30 = r3
            r31 = r7
            r1.close()     // Catch:{ Exception -> 0x022a, all -> 0x0225 }
            if (r16 <= 0) goto L_0x021e
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r7.<init>()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r1 = "duration"
            r7.put(r1, r5)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r1 = "datetime"
            long r2 = r0.f28220c     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r2 = com.ss.android.common.applog.AppLog.formatDate(r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r1 = "session_id"
            java.lang.String r2 = r0.f28219b     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r1 = "activites"
            r7.put(r1, r4)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r1 = "local_time_ms"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r7.put(r1, r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            com.ss.android.common.applog.AppLog.tryPutEventIndex(r7)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            long r3 = r0.f28218a     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r5 = r0.f28219b     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r6 = 8
            r1 = r46
            r14 = r29
            r13 = 7
            r2 = r53
            r13 = r30
            r15 = 5
            r15 = 4
            r15 = 3
            r6 = r7
            r1.b(r2, r3, r5, r6)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.<init>()     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1.put(r7)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r2 = "terminate"
            r13.put(r2, r1)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            int r1 = com.ss.android.common.applog.AppLog.mLaunchFrom     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            if (r1 <= 0) goto L_0x0233
            java.lang.String r1 = "launch_from"
            int r2 = com.ss.android.common.applog.AppLog.mLaunchFrom     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r13.put(r1, r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r1 = 0
            com.ss.android.common.applog.AppLog.mLaunchFrom = r1     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            goto L_0x0233
        L_0x021b:
            r6 = r8
            goto L_0x06fd
        L_0x021e:
            r14 = r29
            r13 = r30
            r15 = 3
            r4 = 1
            goto L_0x0234
        L_0x0225:
            r0 = move-exception
            r10 = r1
        L_0x0227:
            r6 = r8
            goto L_0x06f7
        L_0x022a:
            r10 = r1
        L_0x022b:
            r6 = r8
            goto L_0x06ff
        L_0x022e:
            r14 = r2
            r13 = r3
            r31 = r7
            r15 = 3
        L_0x0233:
            r4 = 0
        L_0x0234:
            java.lang.String r24 = "200"
            java.lang.String r1 = "session_id = ?"
            if (r50 == 0) goto L_0x025c
            r2 = 0
            r5 = r51[r2]     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            int r3 = (r5 > r26 ? 1 : (r5 == r26 ? 0 : -1))
            if (r3 <= 0) goto L_0x025c
            java.lang.String r1 = "_id > ? AND session_id=?"
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r5 = r51[r2]     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r7[r2] = r3     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            long r2 = r0.f28218a     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r3 = 1
            r7[r3] = r2     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r19 = r1
            r20 = r7
            goto L_0x0260
        L_0x025c:
            r19 = r1
            r20 = r31
        L_0x0260:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            java.lang.String r17 = "event"
            java.lang.String[] r18 = f28165f     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            r21 = 0
            r22 = 0
            r16 = r1
            r23 = r28
            android.database.Cursor r7 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x021b, all -> 0x06f3 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r1.<init>()     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r2.<init>()     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r16 = r26
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x0281:
            boolean r18 = r7.moveToNext()     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            if (r18 == 0) goto L_0x0445
            r15 = 0
            long r11 = r7.getLong(r15)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            r32 = r4
            r15 = 1
            java.lang.String r4 = r7.getString(r15)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            r15 = 2
            java.lang.String r9 = r7.getString(r15)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            r15 = 3
            boolean r18 = r7.isNull(r15)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r18 != 0) goto L_0x02a8
            java.lang.String r18 = r7.getString(r15)     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r33 = r14
            r15 = r18
            goto L_0x02ac
        L_0x02a8:
            r33 = r14
            r15 = r25
        L_0x02ac:
            r14 = 4
            boolean r18 = r7.isNull(r14)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r18 != 0) goto L_0x02ba
            long r18 = r7.getLong(r14)     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r34 = r18
            goto L_0x02bc
        L_0x02ba:
            r34 = r26
        L_0x02bc:
            r14 = 5
            boolean r18 = r7.isNull(r14)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r18 != 0) goto L_0x02ca
            long r18 = r7.getLong(r14)     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r36 = r18
            goto L_0x02cc
        L_0x02ca:
            r36 = r26
        L_0x02cc:
            r14 = 6
            boolean r18 = r7.isNull(r14)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r18 != 0) goto L_0x02da
            java.lang.String r18 = r7.getString(r14)     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r38 = r18
            goto L_0x02dc
        L_0x02da:
            r38 = r25
        L_0x02dc:
            r14 = 7
            boolean r18 = r7.isNull(r14)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r18 != 0) goto L_0x02f2
            long r18 = r7.getLong(r14)     // Catch:{ Exception -> 0x06f0, all -> 0x06ec }
            r41 = r5
            r42 = r6
            r40 = r10
            r39 = r15
            r14 = r18
            goto L_0x02fc
        L_0x02f2:
            r41 = r5
            r42 = r6
            r40 = r10
            r39 = r15
            r14 = r26
        L_0x02fc:
            r10 = 8
            long r5 = r7.getLong(r10)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            r10 = 10
            r43 = r1
            r44 = r2
            long r1 = r7.getLong(r10)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            int r10 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0312
            r16 = r11
        L_0x0312:
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r38)     // Catch:{ Exception -> 0x0440, all -> 0x0437 }
            if (r10 != 0) goto L_0x032c
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x032c, all -> 0x0324 }
            r45 = r7
            r7 = r38
            r10.<init>(r7)     // Catch:{ Exception -> 0x032e, all -> 0x0322 }
            goto L_0x0330
        L_0x0322:
            r0 = move-exception
            goto L_0x0327
        L_0x0324:
            r0 = move-exception
            r45 = r7
        L_0x0327:
            r6 = r8
            r10 = r45
            goto L_0x06f7
        L_0x032c:
            r45 = r7
        L_0x032e:
            r10 = r25
        L_0x0330:
            if (r10 != 0) goto L_0x033d
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0338, all -> 0x0322 }
            r10.<init>()     // Catch:{ Exception -> 0x0338, all -> 0x0322 }
            goto L_0x033d
        L_0x0338:
            r6 = r8
            r10 = r45
            goto L_0x06ff
        L_0x033d:
            java.lang.String r7 = "tea_event_index"
            r10.put(r7, r1)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r1 = "local_time_ms"
            r10.put(r1, r5)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r1 = "_event_v3"
            r2 = 0
            int r1 = r10.optInt(r1, r2)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            r7 = 1
            if (r1 != r7) goto L_0x03d0
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0338, all -> 0x0322 }
            if (r1 != 0) goto L_0x03d0
            java.lang.String r1 = "event_v3"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0338, all -> 0x0322 }
            if (r1 == 0) goto L_0x03d0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            r1.<init>()     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "nt"
            boolean r2 = r10.has(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            if (r2 == 0) goto L_0x0377
            java.lang.String r2 = "nt"
            int r2 = r10.optInt(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r4 = "nt"
            r1.put(r4, r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
        L_0x0377:
            java.lang.String r2 = "nt"
            r10.remove(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "_event_v3"
            r10.remove(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            int r2 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r2 <= 0) goto L_0x038a
            java.lang.String r2 = "user_id"
            r1.put(r2, r14)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
        L_0x038a:
            java.lang.String r2 = "ab_sdk_version"
            boolean r2 = r10.has(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            if (r2 == 0) goto L_0x03a2
            java.lang.String r2 = "ab_sdk_version"
            java.lang.String r2 = r10.optString(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r4 = "ab_sdk_version"
            r1.put(r4, r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "ab_sdk_version"
            r10.remove(r2)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
        L_0x03a2:
            java.lang.String r2 = "event"
            r1.put(r2, r9)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "params"
            r1.put(r2, r10)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "event_id"
            r1.put(r2, r11)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "session_id"
            java.lang.String r4 = r0.f28219b     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            r1.put(r2, r4)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            java.lang.String r2 = "datetime"
            java.lang.String r4 = com.ss.android.common.applog.AppLog.formatDate(r5)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            r1.put(r2, r4)     // Catch:{ Exception -> 0x03c9, all -> 0x0322 }
            r2 = r44
            r2.put(r1)     // Catch:{ Exception -> 0x03cb, all -> 0x0322 }
            int r5 = r41 + 1
            goto L_0x03cd
        L_0x03c9:
            r2 = r44
        L_0x03cb:
            r5 = r41
        L_0x03cd:
            r1 = r43
            goto L_0x0426
        L_0x03d0:
            r2 = r44
            java.lang.String r1 = "category"
            r10.put(r1, r4)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r1 = "tag"
            r10.put(r1, r9)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r39)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            if (r1 != 0) goto L_0x03e9
            java.lang.String r1 = "label"
            r4 = r39
            r10.put(r1, r4)     // Catch:{ Exception -> 0x0338, all -> 0x0322 }
        L_0x03e9:
            r7 = r34
            int r1 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r1 == 0) goto L_0x03f4
            java.lang.String r1 = "value"
            r10.put(r1, r7)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
        L_0x03f4:
            r7 = r36
            int r1 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r1 == 0) goto L_0x03ff
            java.lang.String r1 = "ext_value"
            r10.put(r1, r7)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
        L_0x03ff:
            int r1 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r1 <= 0) goto L_0x0408
            java.lang.String r1 = "user_id"
            r10.put(r1, r14)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
        L_0x0408:
            java.lang.String r1 = "session_id"
            java.lang.String r4 = r0.f28219b     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            r10.put(r1, r4)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r1 = "datetime"
            java.lang.String r4 = com.ss.android.common.applog.AppLog.formatDate(r5)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            r10.put(r1, r4)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r1 = "event_id"
            r10.put(r1, r11)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            r1 = r43
            r1.put(r10)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            int r3 = r3 + 1
            r5 = r41
        L_0x0426:
            int r6 = r42 + 1
            r4 = r32
            r14 = r33
            r10 = r40
            r7 = r45
            r8 = r46
            r9 = r48
            r15 = 3
            goto L_0x0281
        L_0x0437:
            r0 = move-exception
            r45 = r7
        L_0x043a:
            r10 = r45
        L_0x043c:
            r6 = r46
            goto L_0x06f7
        L_0x0440:
            r10 = r7
        L_0x0441:
            r6 = r46
            goto L_0x06ff
        L_0x0445:
            r32 = r4
            r41 = r5
            r42 = r6
            r45 = r7
            r40 = r10
            r33 = r14
            if (r3 <= 0) goto L_0x045e
            java.lang.String r3 = "event"
            r13.put(r3, r1)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            goto L_0x045e
        L_0x0459:
            r0 = move-exception
            goto L_0x043a
        L_0x045b:
            r10 = r45
            goto L_0x0441
        L_0x045e:
            if (r41 <= 0) goto L_0x046b
            boolean r1 = com.ss.android.common.applog.AppLog.getEventV3Switch()     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            if (r1 == 0) goto L_0x046b
            java.lang.String r1 = "event_v3"
            r13.put(r1, r2)     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
        L_0x046b:
            if (r42 <= 0) goto L_0x046f
            r32 = 1
        L_0x046f:
            long r3 = r0.f28218a     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            java.lang.String r5 = r0.f28219b     // Catch:{ Exception -> 0x045b, all -> 0x0459 }
            r1 = r46
            r2 = r54
            r8 = r42
            r6 = r40
            r9 = r31
            r10 = r45
            r11 = 1
            r12 = 2
            r7 = r55
            org.json.JSONArray r1 = r1.a(r2, r3, r5, r6, r7)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r1 == 0) goto L_0x0496
            int r2 = r1.length()     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r2 <= 0) goto L_0x0496
            java.lang.String r2 = "log_data"
            r13.put(r2, r1)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r32 = 1
        L_0x0496:
            long r3 = r0.f28218a     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r5 = r0.f28219b     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r1 = r46
            r2 = r53
            r6 = r13
            r1.a(r2, r3, r5, r6)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            boolean r1 = r0.j     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r1 == 0) goto L_0x04a8
            r5 = 0
            goto L_0x04aa
        L_0x04a8:
            r5 = r32
        L_0x04aa:
            if (r50 == 0) goto L_0x04b1
            r2 = 1
            if (r54 == 0) goto L_0x04b2
            r5 = 0
            goto L_0x04b2
        L_0x04b1:
            r2 = 1
        L_0x04b2:
            if (r5 == 0) goto L_0x04f0
            java.lang.String r3 = "terminate"
            boolean r3 = r13.isNull(r3)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r3 == 0) goto L_0x04f0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r3.<init>()     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r4 = "datetime"
            long r5 = r0.f28220c     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r5 = com.ss.android.common.applog.AppLog.formatDate(r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r4 = "session_id"
            java.lang.String r5 = r0.f28219b     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r4 = "local_time_ms"
            long r5 = r0.f28220c     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r4 = "tea_event_index"
            long r5 = r0.f28221d     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            boolean r4 = r0.i     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r4 == 0) goto L_0x04ea
            java.lang.String r4 = "is_background"
            r3.put(r4, r2)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
        L_0x04ea:
            r4 = r33
            r4.put(r3)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            goto L_0x04f2
        L_0x04f0:
            r4 = r33
        L_0x04f2:
            r3 = r48
            if (r3 == 0) goto L_0x0522
            boolean r5 = r3.i     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            if (r5 != 0) goto L_0x0522
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5.<init>()     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r6 = "datetime"
            long r14 = r3.f28220c     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r7 = com.ss.android.common.applog.AppLog.formatDate(r14)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r6 = "session_id"
            java.lang.String r7 = r3.f28219b     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5.put(r6, r7)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r6 = "local_time_ms"
            long r14 = r3.f28220c     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5.put(r6, r14)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r6 = "tea_event_index"
            long r14 = r3.f28221d     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5.put(r6, r14)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r4.put(r5)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
        L_0x0522:
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 < r3) goto L_0x0546
            java.lang.String r3 = "session_id= ? AND _id<= ?"
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            long r6 = r0.f28218a     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r6 = 0
            r5[r6] = r0     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r5[r2] = r0     // Catch:{ Exception -> 0x0441, all -> 0x06e9 }
            r6 = r46
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r7 = "event"
            r0.delete(r7, r3, r5)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r3 = 0
            r51[r3] = r16     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            goto L_0x055c
        L_0x0546:
            r6 = r46
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r3 = "event"
            java.lang.String r5 = "session_id = ?"
            r0.delete(r3, r5, r9)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r54 == 0) goto L_0x055c
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r3 = "session"
            java.lang.String r5 = "_id = ?"
            r0.delete(r3, r5, r9)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x055c:
            if (r54 == 0) goto L_0x0570
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r1 = "page"
            java.lang.String r3 = "session_id = ?"
            r0.delete(r1, r3, r9)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r1 = "misc_log"
            java.lang.String r3 = "session_id = ?"
            r0.delete(r1, r3, r9)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x0570:
            int r0 = r4.length()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 <= 0) goto L_0x057b
            java.lang.String r0 = "launch"
            r13.put(r0, r4)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x057b:
            java.lang.String r0 = "terminate"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r0 = "event"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r0 = "launch"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r0 = "item_impression"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r0 = "log_data"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r0 = "event_v3"
            boolean r0 = r13.isNull(r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 != 0) goto L_0x05ac
            goto L_0x05b0
        L_0x05ac:
            r3 = r26
            goto L_0x06db
        L_0x05b0:
            java.lang.String r0 = "magic_tag"
            java.lang.String r1 = "ss_app_log"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r0 = r55
            if (r0 == 0) goto L_0x05c0
            java.lang.String r1 = "time_sync"
            r13.put(r1, r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x05c0:
            java.lang.String r0 = "header"
            r1 = r40
            r13.put(r0, r1)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r0 = "_gen_time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r13.put(r0, r3)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r3 = 0
            r52[r3] = r0     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            long r3 = r6.a((java.lang.String) r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            int r1 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r1 > 0) goto L_0x05e6
            java.util.List r1 = com.ss.android.common.applog.v.a((java.lang.String) r0)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            com.ss.android.common.applog.AppLog.tryReportTerminateLost(r1)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x05e6:
            boolean r1 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r1 == 0) goto L_0x06db
            android.content.Context r1 = r6.l     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5 = 3
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5 = 0
            r7[r5] = r1     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Long r5 = new java.lang.Long     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r7[r2] = r5     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r7[r12] = r0     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.common.applog.n.f28180a     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r9 = 1
            r11 = 15555(0x3cc3, float:2.1797E-41)
            r13 = 3
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r15 = 0
            r14[r15] = r13     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r14[r2] = r13     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            r14[r12] = r13     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class r13 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r47 = r7
            r48 = r5
            r49 = r8
            r50 = r9
            r51 = r11
            r52 = r14
            r53 = r13
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r47, r48, r49, r50, r51, r52, r53)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r5 == 0) goto L_0x0663
            r5 = 3
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5 = 0
            r7[r5] = r1     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Long r1 = new java.lang.Long     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r7[r2] = r1     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r7[r12] = r0     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.common.applog.n.f28180a     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r5 = 1
            r8 = 15555(0x3cc3, float:2.1797E-41)
            r9 = 3
            java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r13 = 0
            r9[r13] = r11     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r9[r2] = r11     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r9[r12] = r2     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r47 = r7
            r48 = r0
            r49 = r1
            r50 = r5
            r51 = r8
            r52 = r9
            r53 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r47, r48, r49, r50, r51, r52, r53)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            goto L_0x06db
        L_0x0663:
            boolean r5 = com.ss.android.common.applog.n.f28183d     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r5 == 0) goto L_0x06db
            boolean r5 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r5 == 0) goto L_0x06db
            if (r1 == 0) goto L_0x06db
            int r5 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r5 <= 0) goto L_0x06db
            if (r0 == 0) goto L_0x06db
            int r5 = r0.length()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r5 > 0) goto L_0x067c
            goto L_0x06db
        L_0x067c:
            java.lang.String r5 = "item_impression"
            int r5 = r0.indexOf(r5)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r5 <= 0) goto L_0x06db
            java.io.File r5 = r1.getExternalCacheDir()     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.lang.String r9 = "log_"
            r8.<init>(r9)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            r8.append(r3)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.lang.String r9 = "_.log"
            r8.append(r9)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            r7.<init>(r5, r8)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            r5.<init>(r7)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x06c7, all -> 0x06c3 }
            r5.write(r0)     // Catch:{ Throwable -> 0x06c7, all -> 0x06c3 }
            r5.close()     // Catch:{ Throwable -> 0x06c7, all -> 0x06c3 }
            java.lang.Class<com.ss.android.common.applog.n> r5 = com.ss.android.common.applog.n.class
            monitor-enter(r5)     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
            int r0 = com.ss.android.common.applog.n.f28181b     // Catch:{ all -> 0x06c0 }
            if (r0 < 0) goto L_0x06bb
            int r0 = com.ss.android.common.applog.n.f28181b     // Catch:{ all -> 0x06c0 }
            int r0 = r0 + r2
            com.ss.android.common.applog.n.f28181b = r0     // Catch:{ all -> 0x06c0 }
        L_0x06bb:
            monitor-exit(r5)     // Catch:{ all -> 0x06c0 }
        L_0x06bc:
            com.ss.android.common.applog.n.a((java.io.Closeable) r25)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            goto L_0x06cf
        L_0x06c0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x06c0 }
            throw r0     // Catch:{ Throwable -> 0x06bc, all -> 0x06ca }
        L_0x06c3:
            r0 = move-exception
            r25 = r5
            goto L_0x06cb
        L_0x06c7:
            r25 = r5
            goto L_0x06bc
        L_0x06ca:
            r0 = move-exception
        L_0x06cb:
            com.ss.android.common.applog.n.a((java.io.Closeable) r25)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            throw r0     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x06cf:
            com.ss.android.common.applog.n.a((android.content.Context) r1)     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            java.util.LinkedList<java.io.File> r0 = com.ss.android.common.applog.n.f28182c     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            if (r0 == 0) goto L_0x06db
            java.util.LinkedList<java.io.File> r0 = com.ss.android.common.applog.n.f28182c     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r0.size()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
        L_0x06db:
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x06ff, all -> 0x06e7 }
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ all -> 0x0706 }
            a((android.database.Cursor) r10, (android.database.sqlite.SQLiteDatabase) r0)     // Catch:{ all -> 0x0706 }
            monitor-exit(r46)
            return r3
        L_0x06e7:
            r0 = move-exception
            goto L_0x06f7
        L_0x06e9:
            r0 = move-exception
            goto L_0x043c
        L_0x06ec:
            r0 = move-exception
            r10 = r7
            goto L_0x0227
        L_0x06f0:
            r10 = r7
            goto L_0x022b
        L_0x06f3:
            r0 = move-exception
            r6 = r8
            r10 = r25
        L_0x06f7:
            android.database.sqlite.SQLiteDatabase r1 = r6.k     // Catch:{ all -> 0x0706 }
            a((android.database.Cursor) r10, (android.database.sqlite.SQLiteDatabase) r1)     // Catch:{ all -> 0x0706 }
            throw r0     // Catch:{ all -> 0x0706 }
        L_0x06fd:
            r10 = r25
        L_0x06ff:
            android.database.sqlite.SQLiteDatabase r0 = r6.k     // Catch:{ all -> 0x0706 }
            a((android.database.Cursor) r10, (android.database.sqlite.SQLiteDatabase) r0)     // Catch:{ all -> 0x0706 }
            monitor-exit(r46)
            return r26
        L_0x0706:
            r0 = move-exception
            goto L_0x070f
        L_0x0708:
            r6 = r8
            r0 = -1
            monitor-exit(r46)
            return r0
        L_0x070d:
            r0 = move-exception
            r6 = r8
        L_0x070f:
            monitor-exit(r46)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(com.ss.android.common.applog.x, com.ss.android.common.applog.x, org.json.JSONObject, boolean, long[], java.lang.String[], java.util.List, boolean, org.json.JSONObject):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        r22 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f8, code lost:
        r5 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fa, code lost:
        a(r4);
        r3 = r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea A[Catch:{ Exception -> 0x009b, all -> 0x00ea }, ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100 A[Catch:{ Exception -> 0x009b, all -> 0x00ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(org.json.JSONObject r24, org.json.JSONObject r25) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r9 = r25
            monitor-enter(r23)
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x0109 }
            r11 = 0
            r1[r11] = r0     // Catch:{ all -> 0x0109 }
            r12 = 1
            r1[r12] = r9     // Catch:{ all -> 0x0109 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x0109 }
            r4 = 0
            r5 = 15522(0x3ca2, float:2.1751E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x0109 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r11] = r2     // Catch:{ all -> 0x0109 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r12] = r2     // Catch:{ all -> 0x0109 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0109 }
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0109 }
            if (r1 == 0) goto L_0x004e
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x0109 }
            r1[r11] = r0     // Catch:{ all -> 0x0109 }
            r1[r12] = r9     // Catch:{ all -> 0x0109 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x0109 }
            r4 = 0
            r5 = 15522(0x3ca2, float:2.1751E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x0109 }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r11] = r0     // Catch:{ all -> 0x0109 }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r12] = r0     // Catch:{ all -> 0x0109 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0109 }
            r2 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0109 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0109 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0109 }
            monitor-exit(r23)
            return r0
        L_0x004e:
            r1 = 0
            java.lang.String r20 = "_id ASC"
            android.database.sqlite.SQLiteDatabase r13 = r8.k     // Catch:{ Exception -> 0x00f8, all -> 0x00f0 }
            java.lang.String r14 = "mon_log"
            java.lang.String[] r15 = h     // Catch:{ Exception -> 0x00f8, all -> 0x00f0 }
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r21 = "100"
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00f8, all -> 0x00f0 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            r5.<init>()     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            r6 = r1
        L_0x006c:
            boolean r13 = r4.moveToNext()     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            if (r13 == 0) goto L_0x009d
            long r13 = r4.getLong(r11)     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            java.lang.String r15 = r4.getString(r12)     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            java.lang.String r3 = r4.getString(r10)     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            int r16 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x0083
            r6 = r13
        L_0x0083:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
            r10.<init>(r3)     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
            java.lang.String r3 = "log_id"
            r10.put(r3, r13)     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r15)     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
            if (r3 != 0) goto L_0x0098
            java.lang.String r3 = "log_type"
            r10.put(r3, r15)     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
        L_0x0098:
            r5.put(r10)     // Catch:{ Exception -> 0x009b, all -> 0x00ea }
        L_0x009b:
            r10 = 2
            goto L_0x006c
        L_0x009d:
            r4.close()     // Catch:{ Exception -> 0x00ee, all -> 0x00ea }
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ba
            java.lang.String r3 = "_id<= ?"
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            r4[r11] = r6     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            android.database.sqlite.SQLiteDatabase r6 = r8.k     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            java.lang.String r7 = "mon_log"
            r6.delete(r7, r3, r4)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            r22 = 0
            goto L_0x00f4
        L_0x00ba:
            int r3 = r5.length()     // Catch:{ Exception -> 0x00f8, all -> 0x00f0 }
            if (r3 <= 0) goto L_0x00e4
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            r3.<init>()     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            java.lang.String r4 = "magic_tag"
            java.lang.String r6 = "ss_app_log"
            r3.put(r4, r6)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            if (r9 == 0) goto L_0x00d3
            java.lang.String r4 = "time_sync"
            r3.put(r4, r9)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
        L_0x00d3:
            java.lang.String r4 = "data"
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r4 = "header"
            r3.put(r4, r0)     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
        L_0x00df:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f8, all -> 0x00b6 }
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            r5 = 0
            a((android.database.Cursor) r5)     // Catch:{ all -> 0x0109 }
            goto L_0x00fe
        L_0x00ea:
            r0 = move-exception
            r22 = r4
            goto L_0x00f4
        L_0x00ee:
            r5 = 0
            goto L_0x00fa
        L_0x00f0:
            r0 = move-exception
            r5 = 0
            r22 = r5
        L_0x00f4:
            a((android.database.Cursor) r22)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x00f8:
            r5 = 0
            r4 = r5
        L_0x00fa:
            a((android.database.Cursor) r4)     // Catch:{ all -> 0x0109 }
            r3 = r5
        L_0x00fe:
            if (r3 == 0) goto L_0x0107
            r0 = 2
            long r0 = r8.a((java.lang.String) r3, (int) r0)     // Catch:{ all -> 0x0109 }
            monitor-exit(r23)
            return r0
        L_0x0107:
            monitor-exit(r23)
            return r1
        L_0x0109:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(org.json.JSONObject, org.json.JSONObject):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0052 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r5 = 15514(0x3c9a, float:2.174E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0052 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0052 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0052 }
            com.meituan.robust.ChangeQuickRedirect r4 = f28160a     // Catch:{ all -> 0x0052 }
            r5 = 0
            r6 = 15514(0x3c9a, float:2.174E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0052 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0052 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0052 }
            monitor-exit(r9)
            return
        L_0x0025:
            android.database.sqlite.SQLiteDatabase r1 = r9.k     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0050
            android.database.sqlite.SQLiteDatabase r1 = r9.k     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            java.lang.String r1 = "timestamp <= ? OR retry_count > 5"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0052 }
            r4 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r2 = r2 - r4
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0052 }
            r4[r0] = r2     // Catch:{ all -> 0x0052 }
            android.database.sqlite.SQLiteDatabase r0 = r9.k     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "queue"
            r0.delete(r2, r1, r4)     // Catch:{ Exception -> 0x004e }
            monitor-exit(r9)
            return
        L_0x004e:
            monitor-exit(r9)
            return
        L_0x0050:
            monitor-exit(r9)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.b():void");
    }

    private h(Context context) {
        this.k = new a(context).getWritableDatabase();
        this.l = context;
    }

    private static void a(Cursor cursor) {
        if (PatchProxy.isSupport(new Object[]{cursor}, null, f28160a, true, 15501, new Class[]{Cursor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cursor}, null, f28160a, true, 15501, new Class[]{Cursor.class}, Void.TYPE);
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

    private long a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f28160a, false, 15509, new Class[]{String.class}, Long.TYPE)) {
            return a(str2, 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{str2}, this, f28160a, false, 15509, new Class[]{String.class}, Long.TYPE)).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c(long r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006e }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x006e }
            r2.<init>(r10)     // Catch:{ all -> 0x006e }
            r8 = 0
            r1[r8] = r2     // Catch:{ all -> 0x006e }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x006e }
            r4 = 0
            r5 = 15517(0x3c9d, float:2.1744E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006e }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x006e }
            r6[r8] = r2     // Catch:{ all -> 0x006e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x003c
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006e }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x006e }
            r2.<init>(r10)     // Catch:{ all -> 0x006e }
            r1[r8] = r2     // Catch:{ all -> 0x006e }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x006e }
            r4 = 0
            r5 = 15517(0x3c9d, float:2.1744E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006e }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x006e }
            r6[r8] = r0     // Catch:{ all -> 0x006e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006e }
            r2 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006e }
            monitor-exit(r9)
            return
        L_0x003c:
            android.database.sqlite.SQLiteDatabase r1 = r9.k     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x006c
            android.database.sqlite.SQLiteDatabase r1 = r9.k     // Catch:{ all -> 0x006e }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0049
            goto L_0x006c
        L_0x0049:
            java.lang.String r1 = "_id=?"
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x006a }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x006a }
            r2[r8] = r3     // Catch:{ Exception -> 0x006a }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ Exception -> 0x006a }
            r3.<init>()     // Catch:{ Exception -> 0x006a }
            java.lang.String r4 = "launch_sent"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x006a }
            r3.put(r4, r0)     // Catch:{ Exception -> 0x006a }
            android.database.sqlite.SQLiteDatabase r0 = r9.k     // Catch:{ Exception -> 0x006a }
            java.lang.String r4 = "session"
            r0.update(r4, r3, r1, r2)     // Catch:{ Exception -> 0x006a }
            monitor-exit(r9)
            return
        L_0x006a:
            monitor-exit(r9)
            return
        L_0x006c:
            monitor-exit(r9)
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.c(long):void");
    }

    public static h a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f28160a, true, 15499, new Class[]{Context.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{context}, null, f28160a, true, 15499, new Class[]{Context.class}, h.class);
        }
        synchronized (i) {
            if (j == null) {
                j = new h(context.getApplicationContext());
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        return null;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00d5=Splitter:B:34:0x00d5, B:41:0x00de=Splitter:B:41:0x00de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.common.applog.x b(long r22) {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            monitor-enter(r21)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ea }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00ea }
            r2.<init>(r9)     // Catch:{ all -> 0x00ea }
            r11 = 0
            r1[r11] = r2     // Catch:{ all -> 0x00ea }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00ea }
            r4 = 0
            r5 = 15516(0x3c9c, float:2.1743E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00ea }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x00ea }
            r6[r11] = r2     // Catch:{ all -> 0x00ea }
            java.lang.Class<com.ss.android.common.applog.x> r7 = com.ss.android.common.applog.x.class
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00ea }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x00ea }
            r2.<init>(r9)     // Catch:{ all -> 0x00ea }
            r1[r11] = r2     // Catch:{ all -> 0x00ea }
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a     // Catch:{ all -> 0x00ea }
            r4 = 0
            r5 = 15516(0x3c9c, float:2.1743E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00ea }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x00ea }
            r6[r11] = r0     // Catch:{ all -> 0x00ea }
            java.lang.Class<com.ss.android.common.applog.x> r7 = com.ss.android.common.applog.x.class
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ea }
            com.ss.android.common.applog.x r0 = (com.ss.android.common.applog.x) r0     // Catch:{ all -> 0x00ea }
            monitor-exit(r21)
            return r0
        L_0x0045:
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00ea }
            r2 = 0
            if (r1 == 0) goto L_0x00e8
            android.database.sqlite.SQLiteDatabase r1 = r8.k     // Catch:{ all -> 0x00ea }
            boolean r1 = r1.isOpen()     // Catch:{ all -> 0x00ea }
            if (r1 != 0) goto L_0x0054
            goto L_0x00e8
        L_0x0054:
            java.lang.String r19 = "_id DESC"
            java.lang.String r20 = "1"
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x006c
            java.lang.String r1 = "_id < ?"
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r3[r11] = r4     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r15 = r1
            r16 = r3
            goto L_0x006f
        L_0x006c:
            r15 = r2
            r16 = r15
        L_0x006f:
            android.database.sqlite.SQLiteDatabase r12 = r8.k     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            java.lang.String r13 = "session"
            java.lang.String[] r14 = f28164e     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            r17 = 0
            r18 = 0
            android.database.Cursor r1 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x00e2, all -> 0x00dc }
            boolean r3 = r1.moveToNext()     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            if (r3 == 0) goto L_0x00d5
            com.ss.android.common.applog.x r3 = new com.ss.android.common.applog.x     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.<init>()     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            int r4 = r1.getInt(r11)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            long r4 = (long) r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.f28218a = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            java.lang.String r4 = r1.getString(r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.f28219b = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 2
            long r4 = r1.getLong(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.f28220c = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 4
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            if (r4 <= 0) goto L_0x00a5
            r4 = 1
            goto L_0x00a6
        L_0x00a5:
            r4 = 0
        L_0x00a6:
            r3.i = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 5
            java.lang.String r4 = r1.getString(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.f28223f = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 6
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.g = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 7
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            long r4 = (long) r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.h = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r4 = 8
            int r4 = r1.getInt(r4)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            if (r4 <= 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            r3.j = r0     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r0 = 9
            long r4 = r1.getLong(r0)     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.f28221d = r4     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r3.k = r11     // Catch:{ Exception -> 0x00e3, all -> 0x00da }
            r2 = r3
        L_0x00d5:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00ea }
            monitor-exit(r21)
            return r2
        L_0x00da:
            r0 = move-exception
            goto L_0x00de
        L_0x00dc:
            r0 = move-exception
            r1 = r2
        L_0x00de:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00ea }
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00e2:
            r1 = r2
        L_0x00e3:
            a((android.database.Cursor) r1)     // Catch:{ all -> 0x00ea }
            monitor-exit(r21)
            return r2
        L_0x00e8:
            monitor-exit(r21)
            return r2
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.b(long):com.ss.android.common.applog.x");
    }

    private static void a(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        if (PatchProxy.isSupport(new Object[]{cursor, sQLiteDatabase}, null, f28160a, true, 15502, new Class[]{Cursor.class, SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cursor, sQLiteDatabase}, null, f28160a, true, 15502, new Class[]{Cursor.class, SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        a(cursor);
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused) {
            }
        }
    }

    private void b(List<AppLog.j> list, long j2, String str, JSONObject jSONObject) {
        long j3 = j2;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{list, new Long(j3), str2, jSONObject2}, this, f28160a, false, 15520, new Class[]{List.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {list, new Long(j3), str2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f28160a, false, 15520, new Class[]{List.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE);
        } else if (list != null) {
            synchronized (list) {
                for (AppLog.j a2 : list) {
                    try {
                        a2.a(j3, str2, jSONObject2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    private void a(List<AppLog.j> list, long j2, String str, JSONObject jSONObject) {
        long j3 = j2;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{list, new Long(j3), str2, jSONObject2}, this, f28160a, false, 15519, new Class[]{List.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {list, new Long(j3), str2, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f28160a, false, 15519, new Class[]{List.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE);
        } else if (list != null) {
            synchronized (list) {
                for (AppLog.j b2 : list) {
                    try {
                        b2.b(j3, str2, jSONObject2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0189, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018b, code lost:
        r28 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0189 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray a(boolean r30, long r31, java.lang.String r33, org.json.JSONObject r34, org.json.JSONObject r35) {
        /*
            r29 = this;
            r8 = r29
            r9 = r31
            r11 = r34
            r12 = r35
            r13 = 5
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r30)
            r14 = 0
            r1[r14] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r15 = 1
            r1[r15] = r2
            r7 = 2
            r1[r7] = r33
            r16 = 3
            r1[r16] = r11
            r17 = 4
            r1[r17] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r14] = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r15] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r7] = r2
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r16] = r2
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r17] = r2
            java.lang.Class<org.json.JSONArray> r18 = org.json.JSONArray.class
            r4 = 0
            r5 = 15521(0x3ca1, float:2.175E-41)
            r2 = r29
            r7 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0088
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r30)
            r1[r14] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r1[r15] = r2
            r2 = 2
            r1[r2] = r33
            r1[r16] = r11
            r1[r17] = r12
            com.meituan.robust.ChangeQuickRedirect r3 = f28160a
            r4 = 0
            r5 = 15521(0x3ca1, float:2.175E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r14] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r15] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r2] = r0
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r16] = r0
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r17] = r0
            java.lang.Class<org.json.JSONArray> r7 = org.json.JSONArray.class
            r2 = r29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
        L_0x0088:
            r2 = 2
            r1 = 0
            java.lang.String r0 = "_id > ? AND session_id=?"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r4 = "0"
            r3[r14] = r4     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r4 = java.lang.String.valueOf(r31)     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            r3[r15] = r4     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r4 = "_id<= ? "
            java.lang.String[] r5 = new java.lang.String[r15]     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r6 = "0"
            r5[r14] = r6     // Catch:{ Exception -> 0x019b, all -> 0x0195 }
            java.lang.String r6 = "100"
            java.lang.String r7 = "_id ASC"
            r9 = 0
            r13 = r1
            r25 = r9
        L_0x00a9:
            java.lang.String r16 = java.lang.String.valueOf(r25)     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r3[r14] = r16     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r2.<init>()     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            android.database.sqlite.SQLiteDatabase r15 = r8.k     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            java.lang.String r17 = "misc_log"
            java.lang.String[] r18 = g     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r21 = 0
            r22 = 0
            r16 = r15
            r19 = r0
            r20 = r3
            r23 = r7
            r24 = r6
            android.database.Cursor r15 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0191, all -> 0x018e }
            r15.getCount()     // Catch:{ Exception -> 0x018b, all -> 0x0189 }
            r16 = r9
        L_0x00d1:
            boolean r13 = r15.moveToNext()     // Catch:{ Exception -> 0x018b, all -> 0x0189 }
            if (r13 == 0) goto L_0x0124
            r27 = r0
            r28 = r1
            long r0 = r15.getLong(r14)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            int r13 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x011f
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00e9
            r16 = r0
        L_0x00e9:
            r13 = 1
            java.lang.String r14 = r15.getString(r13)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            r13 = 2
            java.lang.String r9 = r15.getString(r13)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r10 != 0) goto L_0x0117
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r10 != 0) goto L_0x0117
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
            java.lang.String r9 = "log_id"
            r10.put(r9, r0)     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "log_type"
            r10.put(r0, r14)     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
        L_0x0114:
            r2.put(r10)     // Catch:{ Exception -> 0x0117, all -> 0x0189 }
        L_0x0117:
            r0 = r27
            r1 = r28
            r9 = 0
            r14 = 0
            goto L_0x00d1
        L_0x011f:
            r0 = r27
            r1 = r28
            goto L_0x00d1
        L_0x0124:
            r27 = r0
            r28 = r1
            r0 = r9
            r13 = 2
            int r9 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x0132
            r28 = r2
            r9 = 0
            goto L_0x0133
        L_0x0132:
            r9 = 1
        L_0x0133:
            int r10 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r10 >= 0) goto L_0x019e
            java.lang.String r10 = java.lang.String.valueOf(r16)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            r14 = 0
            r5[r14] = r10     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            android.database.sqlite.SQLiteDatabase r10 = r8.k     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            java.lang.String r0 = "misc_log"
            r10.delete(r0, r4, r5)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r9 == 0) goto L_0x017c
            int r0 = r2.length()     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r0 <= 0) goto L_0x017c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            r0.<init>()     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            java.lang.String r1 = "magic_tag"
            java.lang.String r9 = "ss_app_log"
            r0.put(r1, r9)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r12 == 0) goto L_0x0160
            java.lang.String r1 = "time_sync"
            r0.put(r1, r12)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
        L_0x0160:
            java.lang.String r1 = "log_data"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            if (r11 == 0) goto L_0x016c
            java.lang.String r1 = "header"
            r0.put(r1, r11)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
        L_0x016c:
            java.lang.String r1 = "_gen_time"
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            r0.put(r1, r9)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
            r8.a((java.lang.String) r0)     // Catch:{ Exception -> 0x019e, all -> 0x0189 }
        L_0x017c:
            r13 = r15
            r25 = r16
            r0 = r27
            r1 = r28
            r2 = 2
            r9 = 0
            r15 = 1
            goto L_0x00a9
        L_0x0189:
            r0 = move-exception
            goto L_0x0197
        L_0x018b:
            r28 = r1
            goto L_0x019e
        L_0x018e:
            r0 = move-exception
            r15 = r13
            goto L_0x0197
        L_0x0191:
            r28 = r1
            r15 = r13
            goto L_0x019e
        L_0x0195:
            r0 = move-exception
            r15 = r1
        L_0x0197:
            a((android.database.Cursor) r15)
            throw r0
        L_0x019b:
            r15 = r1
            r28 = r15
        L_0x019e:
            a((android.database.Cursor) r15)
            return r28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.h.a(boolean, long, java.lang.String, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }
}
