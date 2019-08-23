package com.bytedance.android.livesdkapi.k.a;

import com.bytedance.android.livesdkapi.k.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements c, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18825a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18826b;

    /* renamed from: c  reason: collision with root package name */
    private final String f18827c;

    public final String a() {
        return this.f18826b;
    }

    public final String b() {
        return this.f18827c;
    }

    public Object clone() throws CloneNotSupportedException {
        if (!PatchProxy.isSupport(new Object[0], this, f18825a, false, 15116, new Class[0], Object.class)) {
            return super.clone();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f18825a, false, 15116, new Class[0], Object.class);
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f18825a, false, 15115, new Class[0], Integer.TYPE)) {
            return b.a(b.a(17, this.f18826b), this.f18827c);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18825a, false, 15115, new Class[0], Integer.TYPE)).intValue();
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f18825a, false, 15113, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f18825a, false, 15113, new Class[0], String.class);
        }
        int length = this.f18826b.length();
        if (this.f18827c != null) {
            length += this.f18827c.length() + 1;
        }
        b bVar = new b(length);
        bVar.a(this.f18826b);
        if (this.f18827c != null) {
            bVar.a("=");
            bVar.a(this.f18827c);
        }
        return bVar.toString();
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f18825a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 15114(0x3b0a, float:2.1179E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f18825a
            r3 = 0
            r4 = 15114(0x3b0a, float:2.1179E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            if (r8 != 0) goto L_0x0040
            return r10
        L_0x0040:
            if (r7 != r8) goto L_0x0043
            return r9
        L_0x0043:
            boolean r0 = r8 instanceof com.bytedance.android.livesdkapi.k.a.c
            if (r0 == 0) goto L_0x00ae
            r0 = r8
            com.bytedance.android.livesdkapi.k.a.a r0 = (com.bytedance.android.livesdkapi.k.a.a) r0
            java.lang.String r1 = r7.f18826b
            java.lang.String r2 = r0.f18826b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ad
            java.lang.String r1 = r7.f18827c
            java.lang.String r0 = r0.f18827c
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdkapi.k.b.f18836a
            r14 = 1
            r15 = 15110(0x3b06, float:2.1174E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r10] = r4
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x009e
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdkapi.k.b.f18836a
            r14 = 1
            r15 = 15110(0x3b06, float:2.1174E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00aa
        L_0x009e:
            if (r1 != 0) goto L_0x00a6
            if (r0 != 0) goto L_0x00a4
            r0 = 1
            goto L_0x00aa
        L_0x00a4:
            r0 = 0
            goto L_0x00aa
        L_0x00a6:
            boolean r0 = r1.equals(r0)
        L_0x00aa:
            if (r0 == 0) goto L_0x00ad
            return r9
        L_0x00ad:
            return r10
        L_0x00ae:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.k.a.a.equals(java.lang.Object):boolean");
    }

    public a(String str, String str2) {
        if (str != null) {
            this.f18826b = str;
            this.f18827c = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
