package com.ss.android.ugc.aweme.property;

import com.google.common.a.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.Comparable;

public final class i<T extends Comparable<? super T>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63294a;

    /* renamed from: b  reason: collision with root package name */
    public final T f63295b;

    /* renamed from: c  reason: collision with root package name */
    public final T f63296c;

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f63294a, false, 70275, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63294a, false, 70275, new Class[0], String.class);
        }
        return String.format("[%s, %s]", new Object[]{this.f63295b, this.f63296c});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f63294a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 70276(0x11284, float:9.8478E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f63294a
            r5 = 0
            r6 = 70276(0x11284, float:9.8478E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x002c:
            r1 = 2
            java.lang.Comparable[] r2 = new java.lang.Comparable[r1]
            T r3 = r12.f63295b
            r2[r0] = r3
            T r3 = r12.f63296c
            r4 = 1
            r2[r4] = r3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r2
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f63294a
            r8 = 1
            r9 = 70277(0x11285, float:9.8479E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r10[r0] = r3
            java.lang.Class r11 = java.lang.Integer.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r3 == 0) goto L_0x006f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r2
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f63294a
            r8 = 1
            r9 = 70277(0x11285, float:9.8479E-41)
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r10[r0] = r1
            java.lang.Class r11 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x006f:
            r3 = 0
        L_0x0070:
            if (r3 >= r1) goto L_0x0084
            r5 = r2[r3]
            if (r5 != 0) goto L_0x0078
            r5 = 0
            goto L_0x007c
        L_0x0078:
            int r5 = r5.hashCode()
        L_0x007c:
            int r6 = r4 << 5
            int r6 = r6 - r4
            r4 = r6 ^ r5
            int r3 = r3 + 1
            goto L_0x0070
        L_0x0084:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.i.hashCode():int");
    }

    public final boolean a(T t) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{t}, this, f63294a, false, 70266, new Class[]{Comparable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t}, this, f63294a, false, 70266, new Class[]{Comparable.class}, Boolean.TYPE)).booleanValue();
        }
        m.a(t, (Object) "value must not be null");
        if (t.compareTo(this.f63295b) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (t.compareTo(this.f63296c) <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f63294a, false, 70268, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f63294a, false, 70268, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == null) {
            return false;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!this.f63295b.equals(iVar.f63295b) || !this.f63296c.equals(iVar.f63296c)) {
                return false;
            }
            return true;
        }
    }

    public i(T t, T t2) {
        this.f63295b = (Comparable) m.a(t, (Object) "lower must not be null");
        this.f63296c = (Comparable) m.a(t2, (Object) "upper must not be null");
        if (t.compareTo(t2) > 0) {
            throw new IllegalArgumentException("lower must be less than or equal to upper");
        }
    }
}
