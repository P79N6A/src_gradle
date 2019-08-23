package com.bytedance.android.livesdk.m;

import android.content.Context;
import android.support.v4.content.PermissionChecker;
import android.support.v4.util.SimpleArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16346a;

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleArrayMap<String, Integer> f16347b;

    static {
        SimpleArrayMap<String, Integer> simpleArrayMap = new SimpleArrayMap<>(8);
        f16347b = simpleArrayMap;
        simpleArrayMap.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        f16347b.put("android.permission.BODY_SENSORS", 20);
        f16347b.put("android.permission.READ_CALL_LOG", 16);
        f16347b.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        f16347b.put("android.permission.USE_SIP", 9);
        f16347b.put("android.permission.WRITE_CALL_LOG", 16);
        f16347b.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        f16347b.put("android.permission.WRITE_SETTINGS", 23);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.app.Activity r19, java.lang.String... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16346a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 12609(0x3141, float:1.7669E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16346a
            r15 = 1
            r16 = 12609(0x3141, float:1.7669E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            int r2 = r1.length
            r3 = 0
        L_0x004c:
            if (r3 >= r2) goto L_0x005a
            r4 = r1[r3]
            boolean r4 = android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r4)
            if (r4 == 0) goto L_0x0057
            return r11
        L_0x0057:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x005a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.c.a(android.app.Activity, java.lang.String[]):boolean");
    }

    private static boolean a(Context context, String str) {
        if (PatchProxy.isSupport(new Object[]{context, str}, null, f16346a, true, 12607, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, null, f16346a, true, 12607, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            if (PermissionChecker.checkSelfPermission(context, str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r19, java.lang.String... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16346a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 12606(0x313e, float:1.7665E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16346a
            r15 = 1
            r16 = 12606(0x313e, float:1.7665E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            int r2 = r1.length
            r3 = 0
        L_0x004c:
            if (r3 >= r2) goto L_0x00ab
            r4 = r1[r3]
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16346a
            r15 = 1
            r16 = 12605(0x313d, float:1.7663E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0089
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r4
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16346a
            r15 = 1
            r16 = 12605(0x313d, float:1.7663E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x009f
        L_0x0089:
            android.support.v4.util.SimpleArrayMap<java.lang.String, java.lang.Integer> r5 = f16347b
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x009e
            int r6 = android.os.Build.VERSION.SDK_INT
            int r5 = r5.intValue()
            if (r6 < r5) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r5 = 0
            goto L_0x009f
        L_0x009e:
            r5 = 1
        L_0x009f:
            if (r5 == 0) goto L_0x00a8
            boolean r4 = a((android.content.Context) r0, (java.lang.String) r4)
            if (r4 != 0) goto L_0x00a8
            return r10
        L_0x00a8:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00ab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.c.a(android.content.Context, java.lang.String[]):boolean");
    }
}
