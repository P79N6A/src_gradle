package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29899a;

    /* renamed from: b  reason: collision with root package name */
    protected byte[] f29900b;

    /* renamed from: c  reason: collision with root package name */
    protected int f29901c;

    private void a() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29899a, false, 18004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29899a, false, 18004, new Class[0], Void.TYPE);
        } else if (this.f29900b == null) {
            throw new IOException("BufferedOutputStream is closed");
        }
    }

    private void b() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29899a, false, 18008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29899a, false, 18008, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29901c > 0) {
            this.out.write(this.f29900b, 0, this.f29901c);
            this.f29901c = 0;
        }
    }

    public final synchronized void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29899a, false, 18006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29899a, false, 18006, new Class[0], Void.TYPE);
        } else if (this.f29900b != null) {
            try {
                super.close();
            } finally {
                this.f29900b = null;
            }
        }
    }

    public final synchronized void flush() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29899a, false, 18003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29899a, false, 18003, new Class[0], Void.TYPE);
            return;
        }
        a();
        b();
        this.out.flush();
    }

    public c(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    public final synchronized void write(int i) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29899a, false, 18007, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29899a, false, 18007, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
        if (this.f29901c == this.f29900b.length) {
            this.out.write(this.f29900b, 0, this.f29901c);
            this.f29901c = 0;
        }
        byte[] bArr = this.f29900b;
        int i2 = this.f29901c;
        this.f29901c = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private c(OutputStream outputStream, int i) {
        super(outputStream);
        this.f29900b = new byte[8192];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void write(byte[] r16, int r17, int r18) throws java.io.IOException {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            r9 = r17
            r10 = r18
            monitor-enter(r15)
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0098 }
            r12 = 0
            r1[r12] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0098 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x0098 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0098 }
            r14 = 2
            r1[r14] = r2     // Catch:{ all -> 0x0098 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29899a     // Catch:{ all -> 0x0098 }
            r4 = 0
            r5 = 18005(0x4655, float:2.523E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0098 }
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r12] = r2     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0098 }
            r6[r13] = r2     // Catch:{ all -> 0x0098 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0098 }
            r6[r14] = r2     // Catch:{ all -> 0x0098 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0098 }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0098 }
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0098 }
            r1[r12] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0098 }
            r1[r13] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0098 }
            r1[r14] = r0     // Catch:{ all -> 0x0098 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29899a     // Catch:{ all -> 0x0098 }
            r4 = 0
            r5 = 18005(0x4655, float:2.523E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0098 }
            java.lang.Class<byte[]> r0 = byte[].class
            r6[r12] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0098 }
            r6[r13] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0098 }
            r6[r14] = r0     // Catch:{ all -> 0x0098 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0098 }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0098 }
            monitor-exit(r15)
            return
        L_0x0063:
            r15.a()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            byte[] r1 = r8.f29900b     // Catch:{ all -> 0x0098 }
            int r2 = r1.length     // Catch:{ all -> 0x0098 }
            if (r10 < r2) goto L_0x0077
            r15.b()     // Catch:{ all -> 0x0098 }
            java.io.OutputStream r1 = r8.out     // Catch:{ all -> 0x0098 }
            r1.write(r0, r9, r10)     // Catch:{ all -> 0x0098 }
            monitor-exit(r15)
            return
        L_0x0077:
            int r2 = r0.length     // Catch:{ all -> 0x0098 }
            com.ss.android.message.a.b.a.a.a(r2, r9, r10)     // Catch:{ all -> 0x0098 }
            int r2 = r1.length     // Catch:{ all -> 0x0098 }
            int r3 = r8.f29901c     // Catch:{ all -> 0x0098 }
            int r2 = r2 - r3
            if (r10 <= r2) goto L_0x0084
            r15.b()     // Catch:{ all -> 0x0098 }
        L_0x0084:
            int r2 = r8.f29901c     // Catch:{ all -> 0x0098 }
            java.lang.System.arraycopy(r0, r9, r1, r2, r10)     // Catch:{ all -> 0x0098 }
            int r0 = r8.f29901c     // Catch:{ all -> 0x0098 }
            int r0 = r0 + r10
            r8.f29901c = r0     // Catch:{ all -> 0x0098 }
            monitor-exit(r15)
            return
        L_0x0090:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "buffer == null"
            r0.<init>(r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.c.write(byte[], int, int):void");
    }
}
