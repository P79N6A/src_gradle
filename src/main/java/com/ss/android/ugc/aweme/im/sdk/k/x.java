package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class x implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51801a;

    /* renamed from: c  reason: collision with root package name */
    public static final x f51802c = new x(33639248);

    /* renamed from: d  reason: collision with root package name */
    public static final x f51803d = new x(67324752);

    /* renamed from: e  reason: collision with root package name */
    public static final x f51804e = new x(134695760);

    /* renamed from: f  reason: collision with root package name */
    static final x f51805f = new x(4294967295L);

    /* renamed from: b  reason: collision with root package name */
    public final long f51806b;

    public final int hashCode() {
        return (int) this.f51806b;
    }

    public final Object clone() {
        if (PatchProxy.isSupport(new Object[0], this, f51801a, false, 54349, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f51801a, false, 54349, new Class[0], Object.class);
        }
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f51801a, false, 54350, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51801a, false, 54350, new Class[0], String.class);
        }
        return "ZipLong value: " + this.f51806b;
    }

    public final byte[] a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51801a, false, 54345, new Class[0], byte[].class)) {
            return a(this.f51806b);
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51801a, false, 54345, new Class[0], byte[].class);
    }

    private x(long j) {
        this.f51806b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x) || this.f51806b != ((x) obj).f51806b) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51801a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r3 = 0
            r5 = 1
            r6 = 54348(0xd44c, float:7.6158E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51801a
            r13 = 1
            r14 = 54348(0xd44c, float:7.6158E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x003b:
            long r0 = b(r0, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.x.a(byte[]):long");
    }

    public static byte[] a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f51801a, true, 54346, new Class[]{Long.TYPE}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f51801a, true, 54346, new Class[]{Long.TYPE}, byte[].class);
        }
        byte[] bArr = new byte[4];
        a(j2, bArr, 0);
        return bArr;
    }

    public x(byte[] bArr, int i) {
        this.f51806b = b(bArr, i);
    }

    public static long b(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] << 24)) & 4278190080L) + ((long) ((bArr[i + 2] << 16) & 16711680)) + ((long) ((bArr[i + 1] << 8) & 65280)) + ((long) (bArr[i] & 255));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f51801a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 54347(0xd44b, float:7.6156E-41)
            r3 = r18
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004d
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = f51801a
            r14 = 0
            r15 = 54347(0xd44b, float:7.6156E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r18
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x004d:
            r1 = r18
            long r2 = r1.f51806b
            r4 = r20
            a(r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.x.a(byte[], int):void");
    }

    public static void a(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (255 & j));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((65280 & j) >> 8));
        bArr[i3] = (byte) ((int) ((16711680 & j) >> 16));
        bArr[i3 + 1] = (byte) ((int) ((j & 4278190080L) >> 24));
    }
}
