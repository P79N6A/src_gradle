package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class o implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51760a;

    /* renamed from: b  reason: collision with root package name */
    static final z f51761b = new z(1);
    private static final byte[] h = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public r f51762c;

    /* renamed from: d  reason: collision with root package name */
    public r f51763d;

    /* renamed from: e  reason: collision with root package name */
    public r f51764e;

    /* renamed from: f  reason: collision with root package name */
    public x f51765f;
    byte[] g;

    public final z e() {
        return f51761b;
    }

    public final z d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f51760a, false, 54262, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51760a, false, 54262, new Class[0], z.class);
        }
        if (this.f51762c != null) {
            i = 16;
        }
        return new z(i);
    }

    public final z b() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f51760a, false, 54263, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51760a, false, 54263, new Class[0], z.class);
        }
        int i4 = 8;
        if (this.f51762c != null) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f51763d != null) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        int i5 = i + i2;
        if (this.f51764e == null) {
            i4 = 0;
        }
        int i6 = i5 + i4;
        if (this.f51765f != null) {
            i3 = 4;
        }
        return new z(i6 + i3);
    }

    public final byte[] c() {
        if (PatchProxy.isSupport(new Object[0], this, f51760a, false, 54264, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51760a, false, 54264, new Class[0], byte[].class);
        } else if (this.f51762c == null && this.f51763d == null) {
            return h;
        } else {
            if (this.f51762c == null || this.f51763d == null) {
                throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
            }
            byte[] bArr = new byte[16];
            a(bArr);
            return bArr;
        }
    }

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f51760a, false, 54265, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51760a, false, 54265, new Class[0], byte[].class);
        }
        byte[] bArr = new byte[b().f51820b];
        int a2 = a(bArr);
        if (this.f51764e != null) {
            System.arraycopy(this.f51764e.a(), 0, bArr, a2, 8);
            a2 += 8;
        }
        if (this.f51765f != null) {
            System.arraycopy(this.f51765f.a(), 0, bArr, a2, 4);
        }
        return bArr;
    }

    private int a(byte[] bArr) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f51760a, false, 54269, new Class[]{byte[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr}, this, f51760a, false, 54269, new Class[]{byte[].class}, Integer.TYPE)).intValue();
        }
        if (this.f51762c != null) {
            System.arraycopy(this.f51762c.a(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        if (this.f51763d != null) {
            System.arraycopy(this.f51763d.a(), 0, bArr, i, 8);
            i += 8;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r16, int r17, int r18) throws java.util.zip.ZipException {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51760a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54266(0xd3fa, float:7.6043E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51760a
            r3 = 0
            r4 = 54266(0xd3fa, float:7.6043E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0063:
            if (r10 != 0) goto L_0x0066
            return
        L_0x0066:
            r0 = 16
            if (r10 < r0) goto L_0x0097
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r1.<init>(r8, r9)
            r7.f51762c = r1
            r1 = 8
            int r2 = r9 + 8
            com.ss.android.ugc.aweme.im.sdk.k.r r3 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r3.<init>(r8, r2)
            r7.f51763d = r3
            int r2 = r2 + r1
            int r0 = r10 + -16
            if (r0 < r1) goto L_0x008c
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r1.<init>(r8, r2)
            r7.f51764e = r1
            int r2 = r2 + 8
            int r0 = r0 + -8
        L_0x008c:
            r1 = 4
            if (r0 < r1) goto L_0x0096
            com.ss.android.ugc.aweme.im.sdk.k.x r0 = new com.ss.android.ugc.aweme.im.sdk.k.x
            r0.<init>(r8, r2)
            r7.f51765f = r0
        L_0x0096:
            return
        L_0x0097:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "Zip64 extended information must contain both size values in the local file header."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.o.a(byte[], int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(byte[] r16, int r17, int r18) throws java.util.zip.ZipException {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r14 = 2
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51760a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54267(0xd3fb, float:7.6044E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51760a
            r3 = 0
            r4 = 54267(0xd3fb, float:7.6044E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0063:
            byte[] r0 = new byte[r10]
            r7.g = r0
            byte[] r0 = r7.g
            java.lang.System.arraycopy(r8, r9, r0, r12, r10)
            r0 = 28
            if (r10 < r0) goto L_0x0074
            r15.a(r16, r17, r18)
            return
        L_0x0074:
            r0 = 24
            if (r10 != r0) goto L_0x0092
            com.ss.android.ugc.aweme.im.sdk.k.r r0 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r0.<init>(r8, r9)
            r7.f51762c = r0
            int r0 = r9 + 8
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r1.<init>(r8, r0)
            r7.f51763d = r1
            int r0 = r0 + 8
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r1.<init>(r8, r0)
            r7.f51764e = r1
            return
        L_0x0092:
            int r0 = r10 % 8
            r1 = 4
            if (r0 != r1) goto L_0x00a1
            com.ss.android.ugc.aweme.im.sdk.k.x r0 = new com.ss.android.ugc.aweme.im.sdk.k.x
            int r2 = r9 + r10
            int r2 = r2 - r1
            r0.<init>(r8, r2)
            r7.f51765f = r0
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.o.b(byte[], int, int):void");
    }
}
