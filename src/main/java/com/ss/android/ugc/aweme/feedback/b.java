package com.ss.android.ugc.aweme.feedback;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47137a;
    @SuppressLint({"CI_StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    private static b f47138e;

    /* renamed from: f  reason: collision with root package name */
    private static Object f47139f = new Object();
    private static final String[] g = {"item_id", "timestamp", PushConstants.CONTENT, "image_url", "avatar_url", "image_width", "image_height", "type", "links"};

    /* renamed from: b  reason: collision with root package name */
    private final Context f47140b;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f47141c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f47142d;

    static class a extends SQLiteOpenHelper {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47143a;

        a(Context context) {
            super(context, "feedback.db", null, 2);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f47143a, false, 43770, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f47143a, false, 43770, new Class[]{SQLiteDatabase.class}, Void.TYPE);
                return;
            }
            sQLiteDatabase2.execSQL("CREATE TABLE feedback (auto_id INTEGER PRIMARY KEY AUTOINCREMENT,item_id INTEGER NOT NULL,timestamp INTEGER NOT NULL DEFAULT 0,content VARCHAR,image_url VARCHAR,avatar_url VARCHAR,image_width INTEGER NOT NULL DEFAULT 0,image_height INTEGER NOT NULL DEFAULT 0,type INTEGER NOT NULL DEFAULT 0,links VARCHAR )");
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f47143a, false, 43771, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f47143a, false, 43771, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i < 2) {
                try {
                    sQLiteDatabase2.execSQL("ALTER TABLE feedback ADD COLUMN links VARCHAR");
                } catch (Exception unused) {
                }
            }
        }
    }

    public final synchronized void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47137a, false, 43763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47137a, false, 43763, new Class[0], Void.TYPE);
        } else if (c()) {
            try {
                this.f47141c.delete("feedback", null, null);
            } catch (Exception unused) {
            }
        }
    }

    private boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f47137a, false, 43760, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47137a, false, 43760, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f47142d) {
            return false;
        } else {
            if (this.f47141c == null) {
                this.f47141c = b(this.f47140b);
            }
            if (this.f47141c == null || !this.f47141c.isOpen()) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|(0)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[SYNTHETIC, Splitter:B:30:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c A[SYNTHETIC, Splitter:B:36:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.ss.android.ugc.aweme.feedback.d> b() {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0071 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x0071 }
            r4 = 0
            r5 = 43766(0xaaf6, float:6.1329E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0071 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0071 }
            com.meituan.robust.ChangeQuickRedirect r4 = f47137a     // Catch:{ all -> 0x0071 }
            r5 = 0
            r6 = 43766(0xaaf6, float:6.1329E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0071 }
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0071 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r10)
            return r0
        L_0x002a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            boolean r1 = r10.c()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0037
            monitor-exit(r10)
            return r0
        L_0x0037:
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.f47141c     // Catch:{ Exception -> 0x006a, all -> 0x0063 }
            java.lang.String r3 = "feedback"
            java.lang.String[] r4 = g     // Catch:{ Exception -> 0x006a, all -> 0x0063 }
            java.lang.String r5 = "type == 2"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006a, all -> 0x0063 }
        L_0x0048:
            if (r2 == 0) goto L_0x005d
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            if (r1 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.feedback.d r1 = r10.a((android.database.Cursor) r2)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            r0.add(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
            goto L_0x0048
        L_0x0058:
            r0 = move-exception
            r1 = r2
            goto L_0x0064
        L_0x005b:
            r1 = r2
            goto L_0x006a
        L_0x005d:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ Exception -> 0x006f }
            goto L_0x006f
        L_0x0063:
            r0 = move-exception
        L_0x0064:
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            monitor-exit(r10)
            return r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.b.b():java.util.List");
    }

    private b(Context context) {
        this.f47140b = context;
    }

    public static b a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f47137a, true, 43758, new Class[]{Context.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{context}, null, f47137a, true, 43758, new Class[]{Context.class}, b.class);
        }
        synchronized (f47139f) {
            if (f47138e == null) {
                f47138e = new b(context.getApplicationContext());
            }
        }
        return f47138e;
    }

    private SQLiteDatabase b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f47137a, false, 43762, new Class[]{Context.class}, SQLiteDatabase.class)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[]{context2}, this, f47137a, false, 43762, new Class[]{Context.class}, SQLiteDatabase.class);
        }
        try {
            return new a(context2).getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    private d a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (PatchProxy.isSupport(new Object[]{cursor2}, this, f47137a, false, 43769, new Class[]{Cursor.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{cursor2}, this, f47137a, false, 43769, new Class[]{Cursor.class}, d.class);
        }
        d dVar = new d(cursor2.getLong(0));
        dVar.f47148e = cursor2.getLong(1);
        dVar.f47149f = cursor2.getString(2);
        dVar.g = cursor2.getString(3);
        dVar.h = cursor2.getString(4);
        dVar.i = cursor2.getInt(5);
        dVar.j = cursor2.getInt(6);
        dVar.k = cursor2.getInt(7);
        dVar.l = cursor2.getString(8);
        return dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(0)|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00a1 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e A[SYNTHETIC, Splitter:B:42:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4 A[SYNTHETIC, Splitter:B:48:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long a(boolean r20) {
        /*
            r19 = this;
            r8 = r19
            monitor-enter(r19)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r20)     // Catch:{ all -> 0x00a9 }
            r9 = 0
            r1[r9] = r2     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x00a9 }
            r4 = 0
            r5 = 43767(0xaaf7, float:6.133E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00a9 }
            r6[r9] = r2     // Catch:{ all -> 0x00a9 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a9 }
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0047
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r20)     // Catch:{ all -> 0x00a9 }
            r1[r9] = r2     // Catch:{ all -> 0x00a9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x00a9 }
            r4 = 0
            r5 = 43767(0xaaf7, float:6.133E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00a9 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00a9 }
            r6[r9] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a9 }
            r2 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00a9 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x00a9 }
            monitor-exit(r19)
            return r0
        L_0x0047:
            boolean r1 = r19.c()     // Catch:{ all -> 0x00a9 }
            r2 = -1
            if (r1 != 0) goto L_0x0051
            monitor-exit(r19)
            return r2
        L_0x0051:
            r1 = 0
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.String r0 = "item_id"
            r12[r9] = r0     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.String r4 = "item_id"
            r0.<init>(r4)     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            if (r20 == 0) goto L_0x0064
            java.lang.String r4 = " DESC"
            goto L_0x0066
        L_0x0064:
            java.lang.String r4 = " ASC"
        L_0x0066:
            r0.append(r4)     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.String r17 = r0.toString()     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.String r13 = "type < 2"
            android.database.sqlite.SQLiteDatabase r10 = r8.f47141c     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            java.lang.String r11 = "feedback"
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r18 = "1"
            android.database.Cursor r4 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00a2, all -> 0x009b }
            if (r4 == 0) goto L_0x0095
            boolean r0 = r4.moveToNext()     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            if (r0 == 0) goto L_0x0095
            long r0 = r4.getLong(r9)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            if (r4 == 0) goto L_0x008e
            r4.close()     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            monitor-exit(r19)
            return r0
        L_0x0090:
            r0 = move-exception
            r1 = r4
            goto L_0x009c
        L_0x0093:
            r1 = r4
            goto L_0x00a2
        L_0x0095:
            if (r4 == 0) goto L_0x00a7
            r4.close()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00a7
        L_0x009b:
            r0 = move-exception
        L_0x009c:
            if (r1 == 0) goto L_0x00a1
            r1.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            r1.close()     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            monitor-exit(r19)
            return r2
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.b.a(boolean):long");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x011c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<com.ss.android.ugc.aweme.feedback.d> r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0127 }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x0127 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x0127 }
            r4 = 0
            r5 = 43764(0xaaf4, float:6.1326E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0127 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r9] = r2     // Catch:{ all -> 0x0127 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0127 }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0127 }
            r1[r9] = r12     // Catch:{ all -> 0x0127 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x0127 }
            r4 = 0
            r5 = 43764(0xaaf4, float:6.1326E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0127 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r9] = r0     // Catch:{ all -> 0x0127 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0127 }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0127 }
            monitor-exit(r11)
            return
        L_0x0034:
            boolean r1 = r11.c()     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x0125
            int r1 = r12.size()     // Catch:{ all -> 0x0127 }
            if (r1 > 0) goto L_0x0042
            goto L_0x0125
        L_0x0042:
            android.database.sqlite.SQLiteDatabase r1 = r11.f47141c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.beginTransaction()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.util.Iterator r0 = r12.iterator()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
        L_0x004b:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            if (r1 == 0) goto L_0x0107
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r10 = r1
            com.ss.android.ugc.aweme.feedback.d r10 = (com.ss.android.ugc.aweme.feedback.d) r10     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1[r9] = r10     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r4 = 0
            r5 = 43768(0xaaf8, float:6.1332E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Class<com.ss.android.ugc.aweme.feedback.d> r2 = com.ss.android.ugc.aweme.feedback.d.class
            r6[r9] = r2     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Class<android.content.ContentValues> r7 = android.content.ContentValues.class
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            if (r1 == 0) goto L_0x008b
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1[r9] = r10     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r4 = 0
            r5 = 43768(0xaaf8, float:6.1332E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Class<com.ss.android.ugc.aweme.feedback.d> r2 = com.ss.android.ugc.aweme.feedback.d.class
            r6[r9] = r2     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Class<android.content.ContentValues> r7 = android.content.ContentValues.class
            r2 = r11
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            android.content.ContentValues r1 = (android.content.ContentValues) r1     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            goto L_0x00e3
        L_0x008b:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.<init>()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "item_id"
            long r3 = r10.f47146c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "timestamp"
            long r3 = r10.f47148e     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "content"
            java.lang.String r3 = r10.f47149f     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "image_url"
            java.lang.String r3 = r10.g     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "avatar_url"
            java.lang.String r3 = r10.h     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "image_width"
            int r3 = r10.i     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "image_height"
            int r3 = r10.j     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "type"
            int r3 = r10.k     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r2 = "links"
            java.lang.String r3 = r10.l     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
        L_0x00e3:
            java.lang.String r2 = "item_id=?"
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            long r4 = r10.f47146c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r3[r9] = r4     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            boolean r4 = r10.o     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            if (r4 != 0) goto L_0x00fd
            android.database.sqlite.SQLiteDatabase r4 = r11.f47141c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r5 = "feedback"
            int r2 = r4.update(r5, r1, r2, r3)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            if (r2 > 0) goto L_0x004b
        L_0x00fd:
            android.database.sqlite.SQLiteDatabase r2 = r11.f47141c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            java.lang.String r3 = "feedback"
            r4 = 0
            r2.insert(r3, r4, r1)     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            goto L_0x004b
        L_0x0107:
            android.database.sqlite.SQLiteDatabase r0 = r11.f47141c     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x011c, all -> 0x0115 }
            android.database.sqlite.SQLiteDatabase r0 = r11.f47141c     // Catch:{ Exception -> 0x0113 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0113 }
            monitor-exit(r11)
            return
        L_0x0113:
            monitor-exit(r11)
            return
        L_0x0115:
            r0 = move-exception
            android.database.sqlite.SQLiteDatabase r1 = r11.f47141c     // Catch:{ Exception -> 0x011b }
            r1.endTransaction()     // Catch:{ Exception -> 0x011b }
        L_0x011b:
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x011c:
            android.database.sqlite.SQLiteDatabase r0 = r11.f47141c     // Catch:{ Exception -> 0x0123 }
            r0.endTransaction()     // Catch:{ Exception -> 0x0123 }
            monitor-exit(r11)
            return
        L_0x0123:
            monitor-exit(r11)
            return
        L_0x0125:
            monitor-exit(r11)
            return
        L_0x0127:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.b.a(java.util.List):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:39|40|(0)|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x011e */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011b A[SYNTHETIC, Splitter:B:48:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121 A[SYNTHETIC, Splitter:B:54:0x0121] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.ss.android.ugc.aweme.feedback.d> a(long r19, long r21, int r23, java.lang.String r24) {
        /*
            r18 = this;
            r8 = r18
            r9 = r21
            monitor-enter(r18)
            r11 = 4
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0126 }
            r12 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0126 }
            r14 = 0
            r1[r14] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0126 }
            r2.<init>(r9)     // Catch:{ all -> 0x0126 }
            r15 = 1
            r1[r15] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0126 }
            r16 = 2
            r1[r16] = r2     // Catch:{ all -> 0x0126 }
            r17 = 3
            r1[r17] = r24     // Catch:{ all -> 0x0126 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x0126 }
            r4 = 0
            r5 = 43765(0xaaf5, float:6.1328E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0126 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0126 }
            r6[r14] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0126 }
            r6[r15] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0126 }
            r6[r16] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r17] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0082
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0126 }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0126 }
            r1[r14] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x0126 }
            r2.<init>(r9)     // Catch:{ all -> 0x0126 }
            r1[r15] = r2     // Catch:{ all -> 0x0126 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0126 }
            r1[r16] = r2     // Catch:{ all -> 0x0126 }
            r1[r17] = r24     // Catch:{ all -> 0x0126 }
            com.meituan.robust.ChangeQuickRedirect r3 = f47137a     // Catch:{ all -> 0x0126 }
            r4 = 0
            r5 = 43765(0xaaf5, float:6.1328E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0126 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0126 }
            r6[r14] = r0     // Catch:{ all -> 0x0126 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0126 }
            r6[r15] = r0     // Catch:{ all -> 0x0126 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0126 }
            r6[r16] = r0     // Catch:{ all -> 0x0126 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r17] = r0     // Catch:{ all -> 0x0126 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0126 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0126 }
            monitor-exit(r18)
            return r0
        L_0x0082:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0126 }
            r1.<init>()     // Catch:{ all -> 0x0126 }
            boolean r2 = r18.c()     // Catch:{ all -> 0x0126 }
            if (r2 != 0) goto L_0x008f
            monitor-exit(r18)
            return r1
        L_0x008f:
            r2 = 0
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r3.<init>()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            int r4 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b5
            int r4 = r3.length()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            if (r4 <= 0) goto L_0x00a4
            java.lang.String r4 = " AND "
            r3.append(r4)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
        L_0x00a4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r5 = "item_id>"
            r4.<init>(r5)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r4.append(r9)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r3.append(r4)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
        L_0x00b5:
            int r4 = r3.length()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            if (r4 <= 0) goto L_0x00c0
            java.lang.String r4 = " AND "
            r3.append(r4)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
        L_0x00c0:
            java.lang.String r4 = "type < 2"
            r3.append(r4)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            if (r23 <= 0) goto L_0x00ce
            java.lang.String r4 = java.lang.String.valueOf(r23)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r17 = r4
            goto L_0x00d0
        L_0x00ce:
            r17 = r2
        L_0x00d0:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r24)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            if (r4 == 0) goto L_0x00d9
            java.lang.String r0 = " ASC"
            goto L_0x00db
        L_0x00d9:
            r0 = r24
        L_0x00db:
            android.database.sqlite.SQLiteDatabase r9 = r8.f47141c     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r10 = "feedback"
            java.lang.String[] r11 = g     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r12 = r3.toString()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r4 = "item_id"
            r3.<init>(r4)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            r3.append(r0)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            java.lang.String r16 = r3.toString()     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
            android.database.Cursor r3 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x011f, all -> 0x0118 }
        L_0x00fa:
            if (r3 == 0) goto L_0x0112
            boolean r0 = r3.moveToNext()     // Catch:{ Exception -> 0x0110, all -> 0x010d }
            if (r0 == 0) goto L_0x0112
            com.ss.android.ugc.aweme.feedback.d r0 = r8.a((android.database.Cursor) r3)     // Catch:{ Exception -> 0x0110, all -> 0x010d }
            r0.a()     // Catch:{ Exception -> 0x0110, all -> 0x010d }
            r1.add(r0)     // Catch:{ Exception -> 0x0110, all -> 0x010d }
            goto L_0x00fa
        L_0x010d:
            r0 = move-exception
            r2 = r3
            goto L_0x0119
        L_0x0110:
            r2 = r3
            goto L_0x011f
        L_0x0112:
            if (r3 == 0) goto L_0x0124
            r3.close()     // Catch:{ Exception -> 0x0124 }
            goto L_0x0124
        L_0x0118:
            r0 = move-exception
        L_0x0119:
            if (r2 == 0) goto L_0x011e
            r2.close()     // Catch:{ Exception -> 0x011e }
        L_0x011e:
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x011f:
            if (r2 == 0) goto L_0x0124
            r2.close()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            monitor-exit(r18)
            return r1
        L_0x0126:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.b.a(long, long, int, java.lang.String):java.util.List");
    }
}
