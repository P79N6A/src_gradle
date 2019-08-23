package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.math.BigInteger;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51766a;

    /* renamed from: c  reason: collision with root package name */
    public static final r f51767c = new r(0);

    /* renamed from: b  reason: collision with root package name */
    public final BigInteger f51768b;

    public final byte[] a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51766a, false, 54273, new Class[0], byte[].class)) {
            return a(this.f51768b);
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51766a, false, 54273, new Class[0], byte[].class);
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f51766a, false, 54274, new Class[0], Long.TYPE)) {
            return this.f51768b.longValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f51766a, false, 54274, new Class[0], Long.TYPE)).longValue();
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f51766a, false, 54282, new Class[0], Integer.TYPE)) {
            return this.f51768b.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51766a, false, 54282, new Class[0], Integer.TYPE)).intValue();
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f51766a, false, 54283, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51766a, false, 54283, new Class[0], String.class);
        }
        return "ZipEightByteInteger value: " + this.f51768b;
    }

    public r(long j) {
        this(BigInteger.valueOf(j));
    }

    private r(BigInteger bigInteger) {
        this.f51768b = bigInteger;
    }

    public static byte[] a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f51766a, true, 54275, new Class[]{Long.TYPE}, byte[].class)) {
            return a(BigInteger.valueOf(j));
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f51766a, true, 54275, new Class[]{Long.TYPE}, byte[].class);
    }

    public final boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f51766a, false, 54281, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f51766a, false, 54281, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj2 != null && (obj2 instanceof r)) {
            return this.f51768b.equals(((r) obj2).f51768b);
        } else {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51766a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Long.TYPE
            r3 = 0
            r5 = 1
            r6 = 54279(0xd407, float:7.6061E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51766a
            r13 = 1
            r14 = 54279(0xd407, float:7.6061E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x003b:
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r10[r1] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51766a
            r13 = 1
            r14 = 54277(0xd405, float:7.6058E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<byte[]> r3 = byte[].class
            r15[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r15[r1] = r3
            java.lang.Class r16 = java.lang.Long.TYPE
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0087
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51766a
            r13 = 1
            r14 = 54277(0xd405, float:7.6058E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r1] = r0
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0087:
            java.math.BigInteger r0 = a(r0, r9)
            long r0 = r0.longValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.r.a(byte[]):long");
    }

    private static byte[] a(BigInteger bigInteger) {
        BigInteger bigInteger2 = bigInteger;
        if (PatchProxy.isSupport(new Object[]{bigInteger2}, null, f51766a, true, 54276, new Class[]{BigInteger.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{bigInteger2}, null, f51766a, true, 54276, new Class[]{BigInteger.class}, byte[].class);
        }
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) ((int) (255 & longValue)), (byte) ((int) ((65280 & longValue) >> 8)), (byte) ((int) ((16711680 & longValue) >> 16)), (byte) ((int) ((4278190080L & longValue) >> 24)), (byte) ((int) ((1095216660480L & longValue) >> 32)), (byte) ((int) ((280375465082880L & longValue) >> 40)), (byte) ((int) ((71776119061217280L & longValue) >> 48)), (byte) ((int) ((9151314442816847872L & longValue) >> 56))};
        if (bigInteger2.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public r(byte[] bArr, int i) {
        this.f51768b = a(bArr, i);
    }

    private static BigInteger a(byte[] bArr, int i) {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i)}, null, f51766a, true, 54278, new Class[]{byte[].class, Integer.TYPE}, BigInteger.class)) {
            return (BigInteger) PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i)}, null, f51766a, true, 54278, new Class[]{byte[].class, Integer.TYPE}, BigInteger.class);
        }
        int i2 = i + 7;
        BigInteger valueOf = BigInteger.valueOf(((((long) bArr[i2]) << 56) & 9151314442816847872L) + ((((long) bArr[i + 6]) << 48) & 71776119061217280L) + ((((long) bArr[i + 5]) << 40) & 280375465082880L) + ((((long) bArr[i + 4]) << 32) & 1095216660480L) + ((((long) bArr[i + 3]) << 24) & 4278190080L) + ((((long) bArr[i + 2]) << 16) & 16711680) + ((((long) bArr[i + 1]) << 8) & 65280) + (((long) bArr[i]) & 255));
        if ((bArr[i2] & Byte.MIN_VALUE) == Byte.MIN_VALUE) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }
}
