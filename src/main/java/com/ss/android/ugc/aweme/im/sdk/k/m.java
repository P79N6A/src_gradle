package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class m implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51755a;

    /* renamed from: b  reason: collision with root package name */
    public z f51756b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f51757c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f51758d;

    public final z e() {
        return this.f51756b;
    }

    public final z b() {
        if (PatchProxy.isSupport(new Object[0], this, f51755a, false, 54258, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f51755a, false, 54258, new Class[0], z.class);
        } else if (this.f51758d != null) {
            return new z(this.f51758d.length);
        } else {
            return d();
        }
    }

    public final byte[] c() {
        if (!PatchProxy.isSupport(new Object[0], this, f51755a, false, 54256, new Class[0], byte[].class)) {
            return aa.a(this.f51757c);
        }
        return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51755a, false, 54256, new Class[0], byte[].class);
    }

    public final z d() {
        if (!PatchProxy.isSupport(new Object[0], this, f51755a, false, 54255, new Class[0], z.class)) {
            return new z(this.f51757c.length);
        }
        return (z) PatchProxy.accessDispatch(new Object[0], this, f51755a, false, 54255, new Class[0], z.class);
    }

    public final byte[] a() {
        if (PatchProxy.isSupport(new Object[0], this, f51755a, false, 54259, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51755a, false, 54259, new Class[0], byte[].class);
        } else if (this.f51758d != null) {
            return aa.a(this.f51758d);
        } else {
            return c();
        }
    }

    private void a(byte[] bArr) {
        if (PatchProxy.isSupport(new Object[]{bArr}, this, f51755a, false, 54254, new Class[]{byte[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr}, this, f51755a, false, 54254, new Class[]{byte[].class}, Void.TYPE);
            return;
        }
        this.f51757c = aa.a(bArr);
    }

    public final void a(byte[] bArr, int i, int i2) {
        Object obj = bArr;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51755a, false, 54260, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51755a, false, 54260, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(obj, i, bArr2, 0, i3);
        a(bArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(byte[] r15, int r16, int r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r12 = 1
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51755a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54261(0xd3f5, float:7.6036E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0060
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51755a
            r3 = 0
            r4 = 54261(0xd3f5, float:7.6036E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0060:
            byte[] r10 = new byte[r9]
            r0 = r16
            java.lang.System.arraycopy(r15, r0, r10, r11, r9)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51755a
            r3 = 0
            r4 = 54257(0xd3f1, float:7.603E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f51755a
            r3 = 0
            r4 = 54257(0xd3f1, float:7.603E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x009d
        L_0x0097:
            byte[] r0 = com.ss.android.ugc.aweme.im.sdk.k.aa.a((byte[]) r10)
            r7.f51758d = r0
        L_0x009d:
            byte[] r0 = r7.f51757c
            if (r0 != 0) goto L_0x00a4
            r14.a(r10)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.m.b(byte[], int, int):void");
    }
}
