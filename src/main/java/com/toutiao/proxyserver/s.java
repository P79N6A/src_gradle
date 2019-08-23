package com.toutiao.proxyserver;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.f.c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80250a;

    /* renamed from: b  reason: collision with root package name */
    private final RandomAccessFile f80251b;

    static class a extends Exception {
        a() {
        }

        a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f80250a, false, 91757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80250a, false, 91757, new Class[0], Void.TYPE);
            return;
        }
        c.a(this.f80251b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(byte[] r18) throws com.toutiao.proxyserver.s.a {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f80250a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Integer.TYPE
            r5 = 0
            r6 = 91755(0x1666b, float:1.28576E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f80250a
            r13 = 0
            r14 = 91755(0x1666b, float:1.28576E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x003d:
            r1 = r17
            java.io.RandomAccessFile r2 = r1.f80251b     // Catch:{ IOException -> 0x0046 }
            int r0 = r2.read(r0)     // Catch:{ IOException -> 0x0046 }
            return r0
        L_0x0046:
            r0 = move-exception
            com.toutiao.proxyserver.s$a r2 = new com.toutiao.proxyserver.s$a
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.s.a(byte[]):int");
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) throws a {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f80250a, false, 91753, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f80250a, false, 91753, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            this.f80251b.seek(j2);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    s(File file, String str) throws a {
        try {
            this.f80251b = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e2) {
            throw new a(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r20, int r21, int r22) throws com.toutiao.proxyserver.s.a {
        /*
            r19 = this;
            r0 = r20
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r10 = 1
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r11 = 2
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f80250a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 91754(0x1666a, float:1.28575E-40)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0062
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = f80250a
            r15 = 0
            r16 = 91754(0x1666a, float:1.28575E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0062:
            r1 = r19
            java.io.RandomAccessFile r2 = r1.f80251b     // Catch:{ IOException -> 0x006e }
            r3 = r21
            r4 = r22
            r2.write(r0, r3, r4)     // Catch:{ IOException -> 0x006e }
            return
        L_0x006e:
            r0 = move-exception
            com.toutiao.proxyserver.s$a r2 = new com.toutiao.proxyserver.s$a
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.s.a(byte[], int, int):void");
    }
}
