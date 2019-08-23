package com.ss.android.ugc.aweme.effectplatform;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.effectmanager.common.d.c;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43849a;

    /* renamed from: b  reason: collision with root package name */
    private Gson f43850b = a.f61120c;

    public final <T> String a(T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{t2}, this, f43849a, false, 38992, new Class[]{Object.class}, String.class)) {
            return this.f43850b.toJson((Object) t2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{t2}, this, f43849a, false, 38992, new Class[]{Object.class}, String.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[SYNTHETIC, Splitter:B:21:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d A[SYNTHETIC, Splitter:B:29:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T a(java.io.InputStream r20, java.lang.Class<T> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f43849a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            r8[r10] = r4
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8[r11] = r4
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r6 = 0
            r7 = 38991(0x984f, float:5.4638E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f43849a
            r15 = 0
            r16 = 38991(0x984f, float:5.4638E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r0[r10] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r11] = r1
            java.lang.Class<java.lang.Object> r18 = java.lang.Object.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x004a:
            r2 = 0
            com.google.gson.stream.JsonReader r3 = new com.google.gson.stream.JsonReader     // Catch:{ JsonSyntaxException -> 0x0068, all -> 0x0063 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ JsonSyntaxException -> 0x0068, all -> 0x0063 }
            r4.<init>(r0)     // Catch:{ JsonSyntaxException -> 0x0068, all -> 0x0063 }
            r3.<init>(r4)     // Catch:{ JsonSyntaxException -> 0x0068, all -> 0x0063 }
            r4 = r19
            com.google.gson.Gson r0 = r4.f43850b     // Catch:{ JsonSyntaxException -> 0x0061 }
            java.lang.Object r0 = r0.fromJson((com.google.gson.stream.JsonReader) r3, (java.lang.reflect.Type) r1)     // Catch:{ JsonSyntaxException -> 0x0061 }
            r3.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0089
        L_0x0061:
            r0 = move-exception
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            r4 = r19
            r3 = r2
            goto L_0x008b
        L_0x0068:
            r0 = move-exception
            r4 = r19
            r3 = r2
        L_0x006c:
            java.lang.String r1 = "EFFECTJsonConvertImpl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "convert fail : "
            r5.<init>(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r5.append(r0)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x008a }
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0088
            r3.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            r0 = r2
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
        L_0x008b:
            if (r3 == 0) goto L_0x0090
            r3.close()     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.h.a(java.io.InputStream, java.lang.Class):java.lang.Object");
    }
}
