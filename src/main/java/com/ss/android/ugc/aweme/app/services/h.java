package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34276a;

    /* renamed from: c  reason: collision with root package name */
    private static h f34277c;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f34278b;

    private h(Context context) {
        String a2 = a(context, "assets-map/aweme.json");
        if (!TextUtils.isEmpty(a2)) {
            try {
                this.f34278b = new JSONObject(a2);
            } catch (JSONException unused) {
            }
        }
    }

    public static h a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f34276a, true, 23605, new Class[]{Context.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{context2}, null, f34276a, true, 23605, new Class[]{Context.class}, h.class);
        }
        if (f34277c == null) {
            synchronized (h.class) {
                if (f34277c == null) {
                    f34277c = new h(context2);
                }
            }
        }
        return f34277c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c A[SYNTHETIC, Splitter:B:18:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[SYNTHETIC, Splitter:B:26:0x0073] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r19, java.lang.String r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f34276a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 23608(0x5c38, float:3.3082E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0044
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f34276a
            r15 = 1
            r16 = 23608(0x5c38, float:3.3082E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0044:
            r2 = 0
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ IOException -> 0x0070, all -> 0x0068 }
            java.io.InputStream r1 = r0.open(r1)     // Catch:{ IOException -> 0x0070, all -> 0x0068 }
            int r0 = r1.available()     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            r1.read(r0)     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            r1.close()     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            java.lang.String r4 = "utf-8"
            r3.<init>(r0, r4)     // Catch:{ IOException -> 0x0071, all -> 0x0066 }
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            return r3
        L_0x0066:
            r0 = move-exception
            goto L_0x006a
        L_0x0068:
            r0 = move-exception
            r1 = r2
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r0
        L_0x0070:
            r1 = r2
        L_0x0071:
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.h.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
