package com.ss.android.ugc.aweme.anim;

import android.content.Context;
import android.util.LruCache;
import com.facebook.c.b.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Deprecated
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33331a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f33332b = "b";

    /* renamed from: c  reason: collision with root package name */
    public LruCache<String, k> f33333c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f33349a = new b((byte) 0);
    }

    public static b a() {
        return a.f33349a;
    }

    private b() {
        this.f33333c = new LruCache<String, k>(5242880) {
            public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
                k kVar = (k) obj2;
                if (kVar == null || kVar.f23383e == null || kVar.f23383e.length <= 0) {
                    return 1;
                }
                float f2 = 1.0f;
                for (float f3 : kVar.f23383e) {
                    f2 += f3;
                }
                return (int) f2;
            }
        };
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[SYNTHETIC, Splitter:B:24:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[SYNTHETIC, Splitter:B:30:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.c.b.k b(android.content.Context r19, java.lang.String r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f33331a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.facebook.c.b.k> r9 = com.facebook.c.b.k.class
            r4 = 0
            r6 = 1
            r7 = 21630(0x547e, float:3.031E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0044
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f33331a
            r15 = 1
            r16 = 21630(0x547e, float:3.031E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.facebook.c.b.k> r18 = com.facebook.c.b.k.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.facebook.c.b.k r0 = (com.facebook.c.b.k) r0
            return r0
        L_0x0044:
            r2 = 0
            if (r19 != 0) goto L_0x0048
            return r2
        L_0x0048:
            android.content.res.Resources r0 = r19.getResources()     // Catch:{ IOException -> 0x006d, all -> 0x006a }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x006d, all -> 0x006a }
            java.io.InputStream r1 = r0.open(r1)     // Catch:{ IOException -> 0x006d, all -> 0x006a }
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IOException -> 0x0068 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0068 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0068 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0068 }
            com.facebook.c.b.k r0 = com.facebook.c.a.k.a(r0)     // Catch:{ IOException -> 0x0068 }
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        L_0x0068:
            r0 = move-exception
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            r1 = r2
            goto L_0x0079
        L_0x006d:
            r0 = move-exception
            r1 = r2
        L_0x006f:
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0077
            r1.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            return r2
        L_0x0078:
            r0 = move-exception
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.anim.b.b(android.content.Context, java.lang.String):com.facebook.c.b.k");
    }

    public final k a(Context context, String str) {
        if (!PatchProxy.isSupport(new Object[]{context, str}, this, f33331a, false, 21629, new Class[]{Context.class, String.class}, k.class)) {
            return b(context, str);
        }
        return (k) PatchProxy.accessDispatch(new Object[]{context, str}, this, f33331a, false, 21629, new Class[]{Context.class, String.class}, k.class);
    }

    public final void a(Context context, String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{context, str2, dVar2}, this, f33331a, false, 21626, new Class[]{Context.class, String.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, dVar2}, this, f33331a, false, 21626, new Class[]{Context.class, String.class, d.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context, str2, dVar2, (byte) 1}, this, f33331a, false, 21627, new Class[]{Context.class, String.class, d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2, dVar2, (byte) 1}, this, f33331a, false, 21627, new Class[]{Context.class, String.class, d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (str2 != null) {
            k kVar = this.f33333c.get(str2);
            if (kVar != null) {
                dVar2.a(kVar, str2);
                return;
            }
            final String str3 = str;
            final Context context2 = context;
            final d dVar3 = dVar;
            AnonymousClass3 r0 = new Runnable(true) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33340a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f33340a, false, 21632, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33340a, false, 21632, new Class[0], Void.TYPE);
                        return;
                    }
                    final k a2 = b.this.a(context2, str3);
                    if (a2 != null) {
                        if (true) {
                            b.this.f33333c.put(str3, a2);
                        }
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33346a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f33346a, false, 21633, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f33346a, false, 21633, new Class[0], Void.TYPE);
                                    return;
                                }
                                dVar3.a(a2, str3);
                            }
                        });
                    }
                }
            };
            com.ss.android.b.a.a.a.a(r0);
        }
    }
}
