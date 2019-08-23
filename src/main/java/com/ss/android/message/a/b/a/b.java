package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29893a;

    /* renamed from: b  reason: collision with root package name */
    protected volatile byte[] f29894b;

    /* renamed from: c  reason: collision with root package name */
    protected int f29895c;

    /* renamed from: d  reason: collision with root package name */
    protected int f29896d;

    /* renamed from: e  reason: collision with root package name */
    protected int f29897e;

    /* renamed from: f  reason: collision with root package name */
    protected int f29898f;

    public final boolean markSupported() {
        return true;
    }

    private IOException a() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29893a, false, 17996, new Class[0], IOException.class)) {
            return (IOException) PatchProxy.accessDispatch(new Object[0], this, f29893a, false, 17996, new Class[0], IOException.class);
        }
        throw new IOException("BufferedInputStream is closed");
    }

    public final void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29893a, false, 17997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29893a, false, 17997, new Class[0], Void.TYPE);
            return;
        }
        this.f29894b = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized int available() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29893a, false, 17995, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29893a, false, 17995, new Class[0], Integer.TYPE)).intValue();
        }
        InputStream inputStream = this.in;
        if (this.f29894b == null || inputStream == null) {
            throw a();
        }
        return (this.f29895c - this.f29898f) + inputStream.available();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0043=Splitter:B:18:0x0043, B:34:0x0066=Splitter:B:34:0x0066} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r3 = f29893a     // Catch:{ all -> 0x006b }
            r4 = 0
            r5 = 17999(0x464f, float:2.5222E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x006b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r4 = f29893a     // Catch:{ all -> 0x006b }
            r5 = 0
            r6 = 17999(0x464f, float:2.5222E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x006b }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006b }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            return r0
        L_0x002c:
            byte[] r0 = r9.f29894b     // Catch:{ all -> 0x006b }
            java.io.InputStream r1 = r9.in     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0066
            if (r1 == 0) goto L_0x0066
            int r2 = r9.f29898f     // Catch:{ all -> 0x006b }
            int r3 = r9.f29895c     // Catch:{ all -> 0x006b }
            r4 = -1
            if (r2 < r3) goto L_0x0043
            int r1 = r9.a(r1, r0)     // Catch:{ all -> 0x006b }
            if (r1 != r4) goto L_0x0043
            monitor-exit(r9)
            return r4
        L_0x0043:
            byte[] r1 = r9.f29894b     // Catch:{ all -> 0x006b }
            if (r0 == r1) goto L_0x0051
            byte[] r0 = r9.f29894b     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x004c
            goto L_0x0051
        L_0x004c:
            java.io.IOException r0 = r9.a()     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0051:
            int r1 = r9.f29895c     // Catch:{ all -> 0x006b }
            int r2 = r9.f29898f     // Catch:{ all -> 0x006b }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0064
            int r1 = r9.f29898f     // Catch:{ all -> 0x006b }
            int r2 = r1 + 1
            r9.f29898f = r2     // Catch:{ all -> 0x006b }
            byte r0 = r0[r1]     // Catch:{ all -> 0x006b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r9)
            return r0
        L_0x0064:
            monitor-exit(r9)
            return r4
        L_0x0066:
            java.io.IOException r0 = r9.a()     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.b.read():int");
    }

    public final synchronized void reset() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f29893a, false, 18001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29893a, false, 18001, new Class[0], Void.TYPE);
        } else if (this.f29894b == null) {
            throw new IOException("Stream is closed");
        } else if (this.f29897e != -1) {
            this.f29898f = this.f29897e;
        } else {
            throw new IOException("Mark has been invalidated.");
        }
    }

    public b(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public final synchronized void mark(int i) {
        this.f29896d = i;
        this.f29897e = this.f29898f;
    }

    public final synchronized long skip(long j) throws IOException {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f29893a, false, 18002, new Class[]{Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f29893a, false, 18002, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
        }
        byte[] bArr = this.f29894b;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw a();
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                throw a();
            } else if (((long) (this.f29895c - this.f29898f)) >= j) {
                this.f29898f = (int) (((long) this.f29898f) + j);
                return j;
            } else {
                long j2 = (long) (this.f29895c - this.f29898f);
                this.f29898f = this.f29895c;
                if (this.f29897e == -1 || j > ((long) this.f29896d)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f29895c - this.f29898f)) >= j3) {
                        this.f29898f = (int) (((long) this.f29898f) + j3);
                        return j;
                    }
                    long j4 = j2 + ((long) (this.f29895c - this.f29898f));
                    this.f29898f = this.f29895c;
                    return j4;
                }
            }
        }
    }

    private b(InputStream inputStream, int i) {
        super(inputStream);
        this.f29897e = -1;
        this.f29894b = new byte[8192];
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2;
        int i;
        if (PatchProxy.isSupport(new Object[]{inputStream, bArr}, this, f29893a, false, 17998, new Class[]{InputStream.class, byte[].class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{inputStream, bArr}, this, f29893a, false, 17998, new Class[]{InputStream.class, byte[].class}, Integer.TYPE)).intValue();
        } else if (this.f29897e == -1 || this.f29898f - this.f29897e >= this.f29896d) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f29897e = -1;
                this.f29898f = 0;
                this.f29895c = read;
            }
            return read;
        } else {
            if (this.f29897e != 0 || this.f29896d <= bArr.length) {
                if (this.f29897e > 0) {
                    System.arraycopy(bArr, this.f29897e, bArr, 0, bArr.length - this.f29897e);
                }
                bArr2 = bArr;
            } else {
                int length = bArr.length * 2;
                if (length > this.f29896d) {
                    length = this.f29896d;
                }
                bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f29894b = bArr2;
            }
            this.f29898f -= this.f29897e;
            this.f29897e = 0;
            this.f29895c = 0;
            int read2 = inputStream.read(bArr2, this.f29898f, bArr2.length - this.f29898f);
            if (read2 <= 0) {
                i = this.f29898f;
            } else {
                i = this.f29898f + read2;
            }
            this.f29895c = i;
            return read2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r16, int r17, int r18) throws java.io.IOException {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            r9 = r17
            r10 = r18
            monitor-enter(r15)
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x010f }
            r12 = 0
            r1[r12] = r0     // Catch:{ all -> 0x010f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x010f }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x010f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x010f }
            r14 = 2
            r1[r14] = r2     // Catch:{ all -> 0x010f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29893a     // Catch:{ all -> 0x010f }
            r4 = 0
            r5 = 18000(0x4650, float:2.5223E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x010f }
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r12] = r2     // Catch:{ all -> 0x010f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r6[r13] = r2     // Catch:{ all -> 0x010f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r6[r14] = r2     // Catch:{ all -> 0x010f }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x006a
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x010f }
            r1[r12] = r0     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x010f }
            r1[r13] = r0     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x010f }
            r1[r14] = r0     // Catch:{ all -> 0x010f }
            com.meituan.robust.ChangeQuickRedirect r3 = f29893a     // Catch:{ all -> 0x010f }
            r4 = 0
            r5 = 18000(0x4650, float:2.5223E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x010f }
            java.lang.Class<byte[]> r0 = byte[].class
            r6[r12] = r0     // Catch:{ all -> 0x010f }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r6[r13] = r0     // Catch:{ all -> 0x010f }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r6[r14] = r0     // Catch:{ all -> 0x010f }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r2 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x010f }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x010f }
            int r0 = r0.intValue()     // Catch:{ all -> 0x010f }
            monitor-exit(r15)
            return r0
        L_0x006a:
            byte[] r1 = r8.f29894b     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x010a
            int r2 = r0.length     // Catch:{ all -> 0x010f }
            com.ss.android.message.a.b.a.a.a(r2, r9, r10)     // Catch:{ all -> 0x010f }
            if (r10 != 0) goto L_0x0076
            monitor-exit(r15)
            return r12
        L_0x0076:
            java.io.InputStream r2 = r8.in     // Catch:{ all -> 0x010f }
            if (r2 == 0) goto L_0x0105
            int r3 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r4 = r8.f29895c     // Catch:{ all -> 0x010f }
            if (r3 >= r4) goto L_0x00a8
            int r3 = r8.f29895c     // Catch:{ all -> 0x010f }
            int r4 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r3 = r3 - r4
            if (r3 < r10) goto L_0x0089
            r3 = r10
            goto L_0x008e
        L_0x0089:
            int r3 = r8.f29895c     // Catch:{ all -> 0x010f }
            int r4 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r3 = r3 - r4
        L_0x008e:
            int r4 = r8.f29898f     // Catch:{ all -> 0x010f }
            java.lang.System.arraycopy(r1, r4, r0, r9, r3)     // Catch:{ all -> 0x010f }
            int r4 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r4 = r4 + r3
            r8.f29898f = r4     // Catch:{ all -> 0x010f }
            if (r3 == r10) goto L_0x00a6
            int r4 = r2.available()     // Catch:{ all -> 0x010f }
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            int r4 = r9 + r3
            int r3 = r10 - r3
            goto L_0x00aa
        L_0x00a6:
            monitor-exit(r15)
            return r3
        L_0x00a8:
            r4 = r9
            r3 = r10
        L_0x00aa:
            int r5 = r8.f29897e     // Catch:{ all -> 0x010f }
            r6 = -1
            if (r5 != r6) goto L_0x00c0
            int r5 = r1.length     // Catch:{ all -> 0x010f }
            if (r3 < r5) goto L_0x00c0
            int r5 = r2.read(r0, r4, r3)     // Catch:{ all -> 0x010f }
            if (r5 != r6) goto L_0x00f4
            if (r3 != r10) goto L_0x00bc
            monitor-exit(r15)
            return r6
        L_0x00bc:
            int r0 = r10 - r3
            monitor-exit(r15)
            return r0
        L_0x00c0:
            int r5 = r15.a(r2, r1)     // Catch:{ all -> 0x010f }
            if (r5 != r6) goto L_0x00ce
            if (r3 != r10) goto L_0x00ca
            monitor-exit(r15)
            return r6
        L_0x00ca:
            int r0 = r10 - r3
            monitor-exit(r15)
            return r0
        L_0x00ce:
            byte[] r5 = r8.f29894b     // Catch:{ all -> 0x010f }
            if (r1 == r5) goto L_0x00dc
            byte[] r1 = r8.f29894b     // Catch:{ all -> 0x010f }
            if (r1 == 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            java.io.IOException r0 = r15.a()     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x00dc:
            int r5 = r8.f29895c     // Catch:{ all -> 0x010f }
            int r6 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r5 = r5 - r6
            if (r5 < r3) goto L_0x00e5
            r5 = r3
            goto L_0x00ea
        L_0x00e5:
            int r5 = r8.f29895c     // Catch:{ all -> 0x010f }
            int r6 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r5 = r5 - r6
        L_0x00ea:
            int r6 = r8.f29898f     // Catch:{ all -> 0x010f }
            java.lang.System.arraycopy(r1, r6, r0, r4, r5)     // Catch:{ all -> 0x010f }
            int r6 = r8.f29898f     // Catch:{ all -> 0x010f }
            int r6 = r6 + r5
            r8.f29898f = r6     // Catch:{ all -> 0x010f }
        L_0x00f4:
            int r3 = r3 - r5
            if (r3 != 0) goto L_0x00f9
            monitor-exit(r15)
            return r10
        L_0x00f9:
            int r6 = r2.available()     // Catch:{ all -> 0x010f }
            if (r6 != 0) goto L_0x0103
            int r0 = r10 - r3
            monitor-exit(r15)
            return r0
        L_0x0103:
            int r4 = r4 + r5
            goto L_0x00aa
        L_0x0105:
            java.io.IOException r0 = r15.a()     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010a:
            java.io.IOException r0 = r15.a()     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.b.a.b.read(byte[], int, int):int");
    }
}
