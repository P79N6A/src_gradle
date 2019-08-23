package com.bytedance.android.livesdk.m.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16326a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, d> f16327b;

    /* renamed from: c  reason: collision with root package name */
    private d f16328c;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16329a = new e();
    }

    public static e a() {
        return a.f16329a;
    }

    e() {
        if (PatchProxy.isSupport(new Object[0], this, f16326a, false, 12650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16326a, false, 12650, new Class[0], Void.TYPE);
            return;
        }
        this.f16327b = new HashMap();
        this.f16327b.put("android.permission.CAMERA", new b());
        this.f16327b.put("android.permission.RECORD_AUDIO", new a());
        this.f16327b.put("android.permission.READ_CONTACTS", new f());
        this.f16328c = new c();
    }

    public final boolean a(Context context, String str) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{context, str}, this, f16326a, false, 12651, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f16326a, false, 12651, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f16327b.containsKey(str)) {
            z = this.f16327b.get(str).a(context, str);
        } else {
            z = this.f16328c.a(context, str);
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r20, java.lang.String[] r21) {
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
            com.meituan.robust.ChangeQuickRedirect r5 = f16326a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6 = 0
            r7 = 12652(0x316c, float:1.7729E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f16326a
            r15 = 0
            r16 = 12652(0x316c, float:1.7729E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004c:
            int r2 = r1.length
            r3 = 0
        L_0x004e:
            if (r3 >= r2) goto L_0x005e
            r4 = r1[r3]
            r5 = r19
            boolean r4 = r5.a((android.content.Context) r0, (java.lang.String) r4)
            if (r4 != 0) goto L_0x005b
            return r10
        L_0x005b:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x005e:
            r5 = r19
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.a.e.a(android.content.Context, java.lang.String[]):boolean");
    }
}
