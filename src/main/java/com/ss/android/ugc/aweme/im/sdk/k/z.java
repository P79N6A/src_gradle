package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class z implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51819a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51820b;

    public final int hashCode() {
        return this.f51820b;
    }

    public final Object clone() {
        if (PatchProxy.isSupport(new Object[0], this, f51819a, false, 54401, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f51819a, false, 54401, new Class[0], Object.class);
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f51819a, false, 54402, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51819a, false, 54402, new Class[0], String.class);
        }
        return "ZipShort value: " + this.f51820b;
    }

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f51819a, false, 54399, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51819a, false, 54399, new Class[0], byte[].class);
        }
        byte[] bArr = new byte[2];
        a(this.f51820b, bArr, 0);
        return bArr;
    }

    public z(int i) {
        this.f51820b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z) || this.f51820b != ((z) obj).f51820b) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51819a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = 0
            r5 = 1
            r6 = 54400(0xd480, float:7.623E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51819a
            r13 = 1
            r14 = 54400(0xd480, float:7.623E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003b:
            int r0 = a(r0, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.z.a(byte[]):int");
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i & 65280) >> 8)};
    }

    public z(byte[] bArr, int i) {
        this.f51820b = a(bArr, i);
    }

    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    public static void a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i & 65280) >> 8);
    }
}
