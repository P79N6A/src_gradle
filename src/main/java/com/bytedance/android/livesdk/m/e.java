package com.bytedance.android.livesdk.m;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16360a;

    /* renamed from: b  reason: collision with root package name */
    Map<String, List<Object>> f16361b = new HashMap();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16362a = new e();
    }

    public static final e a() {
        return a.f16362a;
    }

    public final List<Object> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16360a, false, 12621, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f16360a, false, 12621, new Class[]{String.class}, List.class);
        }
        List<Object> list = this.f16361b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f16361b.put(str, list);
        }
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f16360a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 12615(0x3147, float:1.7677E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f16360a
            r13 = 0
            r14 = 12615(0x3147, float:1.7677E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            int r1 = r0.length
        L_0x0035:
            if (r9 >= r1) goto L_0x0050
            r2 = r0[r9]
            r3 = r17
            java.util.List r2 = r3.a((java.lang.String) r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0043:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x004d
            r2.next()
            goto L_0x0043
        L_0x004d:
            int r9 = r9 + 1
            goto L_0x0035
        L_0x0050:
            r3 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.e.a(java.lang.String[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String[] r20, java.lang.String[] r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16360a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 12617(0x3149, float:1.768E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f16360a
            r15 = 0
            r16 = 12617(0x3149, float:1.768E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            int r0 = r1.length
        L_0x0044:
            if (r10 >= r0) goto L_0x005f
            r2 = r1[r10]
            r3 = r19
            java.util.List r2 = r3.a((java.lang.String) r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005c
            r2.next()
            goto L_0x0052
        L_0x005c:
            int r10 = r10 + 1
            goto L_0x0044
        L_0x005f:
            r3 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.e.b(java.lang.String[], java.lang.String[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String[] r20, java.lang.String[] r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f16360a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 12616(0x3148, float:1.7679E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f16360a
            r15 = 0
            r16 = 12616(0x3148, float:1.7679E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            int r0 = r1.length
        L_0x0044:
            if (r10 >= r0) goto L_0x005f
            r2 = r1[r10]
            r3 = r19
            java.util.List r2 = r3.a((java.lang.String) r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005c
            r2.next()
            goto L_0x0052
        L_0x005c:
            int r10 = r10 + 1
            goto L_0x0044
        L_0x005f:
            r3 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.e.a(java.lang.String[], java.lang.String[]):void");
    }
}
