package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public final class e implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final Object clone() throws CloneNotSupportedException {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34, new Class[0], Object.class)) {
            return super.clone();
        }
        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34, new Class[0], Object.class);
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33, new Class[0], Integer.TYPE)) {
            return c.a(c.a(17, this.name), this.value);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33, new Class[0], Integer.TYPE)).intValue();
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31, new Class[0], String.class);
        } else if (this.value == null) {
            return this.name;
        } else {
            StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
            sb.append(this.name);
            sb.append("=");
            sb.append(this.value);
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 32
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 32
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
            if (r7 != r8) goto L_0x0040
            return r9
        L_0x0040:
            boolean r0 = r8 instanceof com.bytedance.android.live.base.model.e
            if (r0 == 0) goto L_0x00ab
            r0 = r8
            com.bytedance.android.live.base.model.e r0 = (com.bytedance.android.live.base.model.e) r0
            java.lang.String r1 = r7.name
            java.lang.String r2 = r0.name
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = r7.value
            java.lang.String r0 = r0.value
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.base.c.f7690a
            r14 = 1
            r15 = 16
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r10] = r4
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x009b
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r1
            r11[r9] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.base.c.f7690a
            r14 = 1
            r15 = 16
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
            goto L_0x00a7
        L_0x009b:
            if (r1 != 0) goto L_0x00a3
            if (r0 != 0) goto L_0x00a1
            r0 = 1
            goto L_0x00a7
        L_0x00a1:
            r0 = 0
            goto L_0x00a7
        L_0x00a3:
            boolean r0 = r1.equals(r0)
        L_0x00a7:
            if (r0 == 0) goto L_0x00aa
            return r9
        L_0x00aa:
            return r10
        L_0x00ab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.base.model.e.equals(java.lang.Object):boolean");
    }

    public e(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
