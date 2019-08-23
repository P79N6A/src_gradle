package com.bytedance.android.livesdk.m;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16358a;

    /* renamed from: b  reason: collision with root package name */
    static final Map<String, Integer> f16359b;

    static {
        HashMap hashMap = new HashMap();
        f16359b = hashMap;
        hashMap.put("android.permission.READ_CALENDAR", Integer.valueOf(C0906R.string.dgw));
        f16359b.put("android.permission.WRITE_CALENDAR", Integer.valueOf(C0906R.string.dgw));
        f16359b.put("android.permission.CAMERA", Integer.valueOf(C0906R.string.dgz));
        f16359b.put("android.permission.READ_CONTACTS", Integer.valueOf(C0906R.string.dh0));
        f16359b.put("android.permission.WRITE_CONTACTS", Integer.valueOf(C0906R.string.dh0));
        f16359b.put("android.permission.GET_ACCOUNTS", Integer.valueOf(C0906R.string.dh0));
        f16359b.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(C0906R.string.dh5));
        f16359b.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(C0906R.string.dh5));
        f16359b.put("android.permission.RECORD_AUDIO", Integer.valueOf(C0906R.string.dh7));
        f16359b.put("android.permission.READ_PHONE_STATE", Integer.valueOf(C0906R.string.dh6));
        f16359b.put("android.permission.CALL_PHONE", Integer.valueOf(C0906R.string.dgx));
        f16359b.put("android.permission.READ_CALL_LOG", Integer.valueOf(C0906R.string.dgy));
        f16359b.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(C0906R.string.dgy));
        f16359b.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(C0906R.string.dgx));
        f16359b.put("android.permission.USE_SIP", Integer.valueOf(C0906R.string.dgx));
        f16359b.put("android.permission.PROCESS_OUTGOING_CALLS", Integer.valueOf(C0906R.string.dgx));
        f16359b.put("android.permission.BODY_SENSORS", Integer.valueOf(C0906R.string.dh8));
        f16359b.put("android.permission.SEND_SMS", Integer.valueOf(C0906R.string.dh9));
        f16359b.put("android.permission.RECEIVE_SMS", Integer.valueOf(C0906R.string.dh9));
        f16359b.put("android.permission.READ_SMS", Integer.valueOf(C0906R.string.dh9));
        f16359b.put("android.permission.RECEIVE_WAP_PUSH", Integer.valueOf(C0906R.string.dh9));
        f16359b.put("android.permission.RECEIVE_MMS", Integer.valueOf(C0906R.string.dh9));
        f16359b.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(C0906R.string.dh4));
        f16359b.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(C0906R.string.dh4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
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
            com.meituan.robust.ChangeQuickRedirect r5 = f16358a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 12612(0x3144, float:1.7673E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16358a
            r15 = 1
            r16 = 12612(0x3144, float:1.7673E-41)
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
            if (r1 != 0) goto L_0x004d
            return r11
        L_0x004d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto L_0x0062
            com.bytedance.android.livesdk.m.c.c r2 = com.bytedance.android.livesdk.m.c.e.c()
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0062
            boolean r0 = com.bytedance.android.livesdk.m.c.a((android.content.Context) r19, (java.lang.String[]) r20)
            return r0
        L_0x0062:
            com.bytedance.android.livesdk.m.a.e r2 = com.bytedance.android.livesdk.m.a.e.a()
            boolean r0 = r2.a((android.content.Context) r0, (java.lang.String[]) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.d.a(android.content.Context, java.lang.String[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(android.app.Activity r19, java.lang.String... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16358a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<java.lang.String[]> r9 = java.lang.String[].class
            r4 = 0
            r6 = 1
            r7 = 12611(0x3143, float:1.7672E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f16358a
            r15 = 1
            r16 = 12611(0x3143, float:1.7672E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String[]> r18 = java.lang.String[].class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0046:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L_0x004d:
            if (r4 >= r3) goto L_0x0061
            r5 = r1[r4]
            java.lang.String[] r6 = new java.lang.String[r11]
            r6[r10] = r5
            boolean r6 = a((android.content.Context) r0, (java.lang.String[]) r6)
            if (r6 != 0) goto L_0x005e
            r2.add(r5)
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x004d
        L_0x0061:
            int r0 = r2.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.d.a(android.app.Activity, java.lang.String[]):java.lang.String[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.app.Activity r21, java.lang.String[] r22, int[] r23) {
        /*
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r22
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f16358a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r9[r11] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r12] = r5
            java.lang.Class<int[]> r5 = int[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 12614(0x3146, float:1.7676E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r22
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f16358a
            r17 = 1
            r18 = 12614(0x3146, float:1.7676E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0056:
            int r3 = r2.length
            if (r3 != 0) goto L_0x005a
            return r11
        L_0x005a:
            int r3 = r2.length
            r4 = 0
        L_0x005c:
            if (r4 >= r3) goto L_0x0066
            r5 = r2[r4]
            if (r5 == 0) goto L_0x0063
            return r11
        L_0x0063:
            int r4 = r4 + 1
            goto L_0x005c
        L_0x0066:
            com.bytedance.android.livesdk.m.c.c r2 = com.bytedance.android.livesdk.m.c.e.c()
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0075
            boolean r0 = a((android.content.Context) r21, (java.lang.String[]) r22)
            return r0
        L_0x0075:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.d.a(android.app.Activity, java.lang.String[], int[]):boolean");
    }
}
