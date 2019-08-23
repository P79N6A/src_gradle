package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4298a;

    /* renamed from: d  reason: collision with root package name */
    private static x f4299d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4300b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f4301c;

    public static x a() {
        if (PatchProxy.isSupport(new Object[0], null, f4298a, true, 88024, new Class[0], x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[0], null, f4298a, true, 88024, new Class[0], x.class);
        }
        if (f4299d == null) {
            synchronized (x.class) {
                if (f4299d == null) {
                    f4299d = new x();
                }
            }
        }
        return f4299d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[SYNTHETIC, Splitter:B:18:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[SYNTHETIC, Splitter:B:26:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f4298a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6 = 0
            r7 = 88026(0x157da, float:1.2335E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f4298a
            r15 = 0
            r16 = 88026(0x157da, float:1.2335E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0048:
            r2 = 0
            android.content.res.AssetManager r0 = r20.getAssets()     // Catch:{ IOException -> 0x0074, all -> 0x006c }
            java.io.InputStream r1 = r0.open(r1)     // Catch:{ IOException -> 0x0074, all -> 0x006c }
            int r0 = r1.available()     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            r1.read(r0)     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            r1.close()     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            java.lang.String r4 = "utf-8"
            r3.<init>(r0, r4)     // Catch:{ IOException -> 0x0075, all -> 0x006a }
            if (r1 == 0) goto L_0x0069
            r1.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            return r3
        L_0x006a:
            r0 = move-exception
            goto L_0x006e
        L_0x006c:
            r0 = move-exception
            r1 = r2
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r0
        L_0x0074:
            r1 = r2
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.x.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
