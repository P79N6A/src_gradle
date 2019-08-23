package com.toutiao.proxyserver.b;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80015a;

    /* renamed from: f  reason: collision with root package name */
    private static volatile c f80016f;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Map<String, a>> f80017b = new SparseArray<>(2);

    /* renamed from: c  reason: collision with root package name */
    public final d f80018c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f80019d;

    /* renamed from: e  reason: collision with root package name */
    public volatile SQLiteStatement f80020e;

    private c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f80019d = threadPoolExecutor;
        this.f80018c = new d(context.getApplicationContext());
        this.f80017b.put(0, new ConcurrentHashMap());
        this.f80017b.put(1, new ConcurrentHashMap());
    }

    public static c a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f80015a, true, 91776, new Class[]{Context.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context2}, null, f80015a, true, 91776, new Class[]{Context.class}, c.class);
        }
        if (f80016f == null) {
            synchronized (c.class) {
                if (f80016f == null) {
                    f80016f = new c(context2);
                }
            }
        }
        return f80016f;
    }

    public final void b(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f80015a, false, 91782, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f80015a, false, 91782, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Map map = this.f80017b.get(i);
        if (map != null) {
            map.clear();
        }
        this.f80019d.execute(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f80024a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f80024a, false, 91785, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f80024a, false, 91785, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    c.this.f80018c.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f80015a, false, 91781, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f80015a, false, 91781, new Class[]{Integer.TYPE}, String.class);
        } else if (i2 <= 0) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder(i2 << 1);
            sb.append("?");
            for (int i3 = 1; i3 < i2; i3++) {
                sb.append(",?");
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.toutiao.proxyserver.b.a a(java.lang.String r22, int r23) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            r9 = 2
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r11 = 1
            r1[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f80015a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class<com.toutiao.proxyserver.b.a> r7 = com.toutiao.proxyserver.b.a.class
            r4 = 0
            r5 = 91777(0x16681, float:1.28607E-40)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0050
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f80015a
            r4 = 0
            r5 = 91777(0x16681, float:1.28607E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class<com.toutiao.proxyserver.b.a> r7 = com.toutiao.proxyserver.b.a.class
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.toutiao.proxyserver.b.a r0 = (com.toutiao.proxyserver.b.a) r0
            return r0
        L_0x0050:
            boolean r1 = android.text.TextUtils.isEmpty(r22)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            return r2
        L_0x0058:
            android.util.SparseArray<java.util.Map<java.lang.String, com.toutiao.proxyserver.b.a>> r1 = r8.f80017b
            r3 = r23
            java.lang.Object r1 = r1.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x0066
            r4 = r2
            goto L_0x006c
        L_0x0066:
            java.lang.Object r4 = r1.get(r0)
            com.toutiao.proxyserver.b.a r4 = (com.toutiao.proxyserver.b.a) r4
        L_0x006c:
            if (r4 == 0) goto L_0x006f
            return r4
        L_0x006f:
            com.toutiao.proxyserver.b.d r5 = r8.f80018c     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            android.database.sqlite.SQLiteDatabase r12 = r5.getReadableDatabase()     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            java.lang.String r13 = "video_http_header_t"
            r14 = 0
            java.lang.String r15 = "key=? AND flag=?"
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            r5[r10] = r0     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            java.lang.String r6 = java.lang.String.valueOf(r23)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            r5[r11] = r6     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r20 = "1"
            r16 = r5
            android.database.Cursor r5 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x00e8, all -> 0x00e0 }
            if (r5 == 0) goto L_0x00d3
            int r6 = r5.getCount()     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            if (r6 <= 0) goto L_0x00d3
            boolean r6 = r5.moveToNext()     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            if (r6 == 0) goto L_0x00d3
            java.lang.String r4 = "key"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r13 = r5.getString(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r4 = "mime"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r14 = r5.getString(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r4 = "contentLength"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            int r15 = r5.getInt(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r4 = "extra"
            int r4 = r5.getColumnIndex(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            java.lang.String r17 = r5.getString(r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            com.toutiao.proxyserver.b.a r4 = new com.toutiao.proxyserver.b.a     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            r12 = r4
            r16 = r23
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
            goto L_0x00d3
        L_0x00d1:
            r0 = move-exception
            goto L_0x00e2
        L_0x00d3:
            if (r4 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00da
            r1.put(r0, r4)     // Catch:{ Throwable -> 0x00e9, all -> 0x00d1 }
        L_0x00da:
            if (r5 == 0) goto L_0x00df
            r5.close()
        L_0x00df:
            return r4
        L_0x00e0:
            r0 = move-exception
            r5 = r2
        L_0x00e2:
            if (r5 == 0) goto L_0x00e7
            r5.close()
        L_0x00e7:
            throw r0
        L_0x00e8:
            r5 = r2
        L_0x00e9:
            if (r5 == 0) goto L_0x00ee
            r5.close()
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.b.c.a(java.lang.String, int):com.toutiao.proxyserver.b.a");
    }
}
