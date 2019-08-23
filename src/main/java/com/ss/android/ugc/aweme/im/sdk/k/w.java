package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class w implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51782a;
    private static final long n = x.a(y.i);

    /* renamed from: b  reason: collision with root package name */
    public final List<u> f51783b;

    /* renamed from: c  reason: collision with root package name */
    public final String f51784c;

    /* renamed from: d  reason: collision with root package name */
    public final RandomAccessFile f51785d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, LinkedList<u>> f51786e;

    /* renamed from: f  reason: collision with root package name */
    private final s f51787f;
    private final String g;
    private final boolean h;
    private volatile boolean i;
    private final byte[] j;
    private final byte[] k;
    private final byte[] l;
    private final byte[] m;
    private final Comparator<u> o;

    public class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51792a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f51793b;

        /* renamed from: d  reason: collision with root package name */
        private long f51795d;

        /* renamed from: e  reason: collision with root package name */
        private long f51796e;

        public final int read() throws IOException {
            int read;
            if (PatchProxy.isSupport(new Object[0], this, f51792a, false, 54341, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51792a, false, 54341, new Class[0], Integer.TYPE)).intValue();
            }
            long j = this.f51795d;
            this.f51795d = j - 1;
            if (j > 0) {
                synchronized (w.this.f51785d) {
                    RandomAccessFile randomAccessFile = w.this.f51785d;
                    long j2 = this.f51796e;
                    this.f51796e = 1 + j2;
                    randomAccessFile.seek(j2);
                    read = w.this.f51785d.read();
                }
                return read;
            } else if (!this.f51793b) {
                return -1;
            } else {
                this.f51793b = false;
                return 0;
            }
        }

        public a(long j, long j2) {
            this.f51795d = j2;
            this.f51796e = j;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            int read;
            byte[] bArr2 = bArr;
            int i4 = i;
            int i5 = i2;
            if (PatchProxy.isSupport(new Object[]{bArr2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51792a, false, 54342, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{bArr2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51792a, false, 54342, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
            } else if (this.f51795d <= 0) {
                if (!this.f51793b) {
                    return -1;
                }
                this.f51793b = false;
                bArr2[i4] = 0;
                return 1;
            } else if (i5 <= 0) {
                return 0;
            } else {
                if (((long) i5) > this.f51795d) {
                    i3 = (int) this.f51795d;
                } else {
                    i3 = i5;
                }
                synchronized (w.this.f51785d) {
                    w.this.f51785d.seek(this.f51796e);
                    read = w.this.f51785d.read(bArr2, i4, i3);
                }
                if (read > 0) {
                    long j = (long) read;
                    this.f51796e += j;
                    this.f51795d -= j;
                }
                return read;
            }
        }
    }

    public static class b extends u {
        public static ChangeQuickRedirect h;
        public final d i;

        public final int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, h, false, 54343, new Class[0], Integer.TYPE)) {
                return (super.hashCode() * 3) + ((int) (this.i.f51799a % 2147483647L));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 54343, new Class[0], Integer.TYPE)).intValue();
        }

        b(d dVar) {
            this.i = dVar;
        }

        public final boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, h, false, 54344, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, h, false, 54344, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (!super.equals(obj)) {
                return false;
            } else {
                b bVar = (b) obj;
                if (this.i.f51799a == bVar.i.f51799a && this.i.f51800b == bVar.i.f51800b) {
                    return true;
                }
                return false;
            }
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f51797a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f51798b;

        private c(byte[] bArr, byte[] bArr2) {
            this.f51797a = bArr;
            this.f51798b = bArr2;
        }

        /* synthetic */ c(byte[] bArr, byte[] bArr2, byte b2) {
            this(bArr, bArr2);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public long f51799a;

        /* renamed from: b  reason: collision with root package name */
        public long f51800b;

        private d() {
            this.f51799a = -1;
            this.f51800b = -1;
        }

        /* synthetic */ d(byte b2) {
            this();
        }
    }

    public final void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f51782a, false, 54321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51782a, false, 54321, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        this.f51785d.close();
    }

    public final void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f51782a, false, 54328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51782a, false, 54328, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (!this.i) {
                System.err.printf("Cleaning up unclosed %s for archive %s%n", new Object[]{getClass().getSimpleName(), this.g});
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r12v1, types: [long, boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<com.ss.android.ugc.aweme.im.sdk.k.u, com.ss.android.ugc.aweme.im.sdk.k.w.c> a() throws java.io.IOException {
        /*
            r32 = this;
            r7 = r32
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r3 = 0
            r4 = 54329(0xd439, float:7.6131E-41)
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54329(0xd439, float:7.6131E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x002c:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54332(0xd43c, float:7.6135E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r10 = 16
            r11 = 4
            r12 = 1
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54332(0xd43c, float:7.6135E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0166
        L_0x005c:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54335(0xd43f, float:7.614E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0082
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54335(0xd43f, float:7.614E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0091
        L_0x0082:
            r1 = 22
            r3 = 65557(0x10015, double:3.23895E-319)
            byte[] r5 = com.ss.android.ugc.aweme.im.sdk.k.y.j
            r0 = r32
            boolean r0 = r0.a(r1, r3, r5)
            if (r0 == 0) goto L_0x065b
        L_0x0091:
            java.io.RandomAccessFile r0 = r7.f51785d
            long r0 = r0.getFilePointer()
            r2 = 20
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            if (r0 == 0) goto L_0x00be
            java.io.RandomAccessFile r1 = r7.f51785d
            java.io.RandomAccessFile r4 = r7.f51785d
            long r4 = r4.getFilePointer()
            long r4 = r4 - r2
            r1.seek(r4)
            java.io.RandomAccessFile r1 = r7.f51785d
            byte[] r2 = r7.k
            r1.readFully(r2)
            byte[] r1 = com.ss.android.ugc.aweme.im.sdk.k.y.l
            byte[] r2 = r7.k
            boolean r1 = java.util.Arrays.equals(r1, r2)
            goto L_0x00bf
        L_0x00be:
            r1 = 0
        L_0x00bf:
            if (r1 != 0) goto L_0x0103
            if (r0 == 0) goto L_0x00c6
            r7.a((int) r10)
        L_0x00c6:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54334(0xd43e, float:7.6138E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ed
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54334(0xd43e, float:7.6138E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0166
        L_0x00ed:
            r7.a((int) r10)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.k
            r0.readFully(r1)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.k
            long r1 = com.ss.android.ugc.aweme.im.sdk.k.x.a((byte[]) r1)
            r0.seek(r1)
            goto L_0x0166
        L_0x0103:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54333(0xd43d, float:7.6137E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0129
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54333(0xd43d, float:7.6137E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0166
        L_0x0129:
            r7.a((int) r11)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.j
            r0.readFully(r1)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.j
            long r1 = com.ss.android.ugc.aweme.im.sdk.k.r.a((byte[]) r1)
            r0.seek(r1)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.k
            r0.readFully(r1)
            byte[] r0 = r7.k
            byte[] r1 = com.ss.android.ugc.aweme.im.sdk.k.y.k
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L_0x0653
            r0 = 44
            r7.a((int) r0)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.j
            r0.readFully(r1)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.j
            long r1 = com.ss.android.ugc.aweme.im.sdk.k.r.a((byte[]) r1)
            r0.seek(r1)
        L_0x0166:
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.k
            r0.readFully(r1)
            byte[] r0 = r7.k
            long r13 = com.ss.android.ugc.aweme.im.sdk.k.x.a((byte[]) r0)
            long r0 = n
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01c7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54339(0xd443, float:7.6145E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01a6
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54339(0xd443, float:7.6145E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01bc
        L_0x01a6:
            java.io.RandomAccessFile r0 = r7.f51785d
            r1 = 0
            r0.seek(r1)
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.k
            r0.readFully(r1)
            byte[] r0 = r7.k
            byte[] r1 = com.ss.android.ugc.aweme.im.sdk.k.y.g
            boolean r0 = java.util.Arrays.equals(r0, r1)
        L_0x01bc:
            if (r0 != 0) goto L_0x01bf
            goto L_0x01c7
        L_0x01bf:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "central directory is empty, can't expand corrupt archive."
            r0.<init>(r1)
            throw r0
        L_0x01c7:
            long r0 = n
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0651
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54330(0xd43a, float:7.6133E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0203
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54330(0xd43a, float:7.6133E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r0 = r9
            r2 = 0
            r5 = 4
            goto L_0x063d
        L_0x0203:
            java.io.RandomAccessFile r0 = r7.f51785d
            byte[] r1 = r7.l
            r0.readFully(r1)
            com.ss.android.ugc.aweme.im.sdk.k.w$d r13 = new com.ss.android.ugc.aweme.im.sdk.k.w$d
            r13.<init>(r8)
            com.ss.android.ugc.aweme.im.sdk.k.w$b r14 = new com.ss.android.ugc.aweme.im.sdk.k.w$b
            r14.<init>(r13)
            byte[] r0 = r7.l
            int r0 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r8)
            r15 = 8
            int r0 = r0 >> r15
            r0 = r0 & 15
            r14.f51778c = r0
            byte[] r0 = r7.l
            r6 = 2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r8] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1[r12] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.im.sdk.k.f.f51731a
            r19 = 1
            r20 = 54235(0xd3db, float:7.6E-41)
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class<byte[]> r3 = byte[].class
            r2[r8] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r12] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.f> r22 = com.ss.android.ugc.aweme.im.sdk.k.f.class
            r16 = r1
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0277
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r12] = r0
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.im.sdk.k.f.f51731a
            r19 = 1
            r20 = 54235(0xd3db, float:7.6E-41)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<byte[]> r2 = byte[].class
            r0[r8] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r12] = r2
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.f> r22 = com.ss.android.ugc.aweme.im.sdk.k.f.class
            r16 = r1
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.ss.android.ugc.aweme.im.sdk.k.f r0 = (com.ss.android.ugc.aweme.im.sdk.k.f) r0
            goto L_0x02a9
        L_0x0277:
            int r0 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r11)
            com.ss.android.ugc.aweme.im.sdk.k.f r1 = new com.ss.android.ugc.aweme.im.sdk.k.f
            r1.<init>()
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0286
            r2 = 1
            goto L_0x0287
        L_0x0286:
            r2 = 0
        L_0x0287:
            r1.f51733c = r2
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x028f
            r2 = 1
            goto L_0x0290
        L_0x028f:
            r2 = 0
        L_0x0290:
            r1.f51732b = r2
            r2 = r0 & 64
            if (r2 == 0) goto L_0x0298
            r2 = 1
            goto L_0x0299
        L_0x0298:
            r2 = 0
        L_0x0299:
            r1.f51735e = r2
            if (r2 == 0) goto L_0x029f
            r1.f51734d = r12
        L_0x029f:
            r0 = r0 & 1
            if (r0 == 0) goto L_0x02a5
            r0 = 1
            goto L_0x02a6
        L_0x02a5:
            r0 = 0
        L_0x02a6:
            r1.f51734d = r0
            r0 = r1
        L_0x02a9:
            boolean r5 = r0.f51732b
            if (r5 == 0) goto L_0x02b1
            com.ss.android.ugc.aweme.im.sdk.k.s r1 = com.ss.android.ugc.aweme.im.sdk.k.t.f51770b
        L_0x02af:
            r4 = r1
            goto L_0x02b4
        L_0x02b1:
            com.ss.android.ugc.aweme.im.sdk.k.s r1 = r7.f51787f
            goto L_0x02af
        L_0x02b4:
            r14.g = r0
            byte[] r0 = r7.l
            r1 = 6
            int r0 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r1)
            r14.setMethod(r0)
            byte[] r0 = r7.l
            long r0 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r0, r15)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            r2[r8] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r19 = 1
            r20 = 54408(0xd488, float:7.6242E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class r16 = java.lang.Long.TYPE
            r3[r8] = r16
            java.lang.Class r22 = java.lang.Long.TYPE
            r16 = r2
            r21 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            r3 = 12
            if (r2 == 0) goto L_0x0317
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r0)
            r2[r8] = r15
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r19 = 1
            r20 = 54408(0xd488, float:7.6242E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r8] = r1
            java.lang.Class r22 = java.lang.Long.TYPE
            r16 = r2
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r23 = r9
            goto L_0x0369
        L_0x0317:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r15 = 25
            long r15 = r0 >> r15
            r17 = 127(0x7f, double:6.27E-322)
            r23 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            int r8 = r8 + 1980
            r2.set(r12, r8)
            r8 = 21
            long r8 = r0 >> r8
            r15 = 15
            long r8 = r8 & r15
            int r8 = (int) r8
            int r8 = r8 - r12
            r2.set(r6, r8)
            long r8 = r0 >> r10
            int r8 = (int) r8
            r8 = r8 & 31
            r9 = 5
            r2.set(r9, r8)
            r8 = 11
            long r10 = r0 >> r8
            int r10 = (int) r10
            r10 = r10 & 31
            r2.set(r8, r10)
            long r8 = r0 >> r9
            int r8 = (int) r8
            r8 = r8 & 63
            r2.set(r3, r8)
            r8 = 13
            long r0 = r0 << r12
            int r0 = (int) r0
            r0 = r0 & 62
            r2.set(r8, r0)
            r0 = 14
            r1 = 0
            r2.set(r0, r1)
            java.util.Date r0 = r2.getTime()
            long r0 = r0.getTime()
        L_0x0369:
            r14.setTime(r0)
            byte[] r0 = r7.l
            long r0 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r0, r3)
            r14.setCrc(r0)
            byte[] r0 = r7.l
            r8 = 16
            long r0 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r0, r8)
            r14.setCompressedSize(r0)
            byte[] r0 = r7.l
            r1 = 20
            long r0 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r0, r1)
            r14.setSize(r0)
            byte[] r0 = r7.l
            r1 = 24
            int r0 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r1)
            byte[] r1 = r7.l
            r2 = 26
            int r9 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r2)
            byte[] r1 = r7.l
            r2 = 28
            int r10 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r2)
            byte[] r1 = r7.l
            r2 = 30
            int r11 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r2)
            byte[] r1 = r7.l
            r2 = 32
            int r1 = com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r2)
            r14.f51777b = r1
            byte[] r1 = r7.l
            r2 = 34
            long r1 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r1, r2)
            r14.f51779d = r1
            byte[] r15 = new byte[r0]
            java.io.RandomAccessFile r0 = r7.f51785d
            r0.readFully(r15)
            java.lang.String r3 = r4.a((byte[]) r15)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r1 = 0
            r0[r1] = r3
            r0[r12] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.im.sdk.k.u.f51776a
            r16 = 0
            r17 = 54315(0xd42b, float:7.6112E-41)
            java.lang.Class[] r8 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r8[r1] = r18
            java.lang.Class<byte[]> r1 = byte[].class
            r8[r12] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r1 = r14
            r12 = r3
            r3 = r16
            r24 = r4
            r4 = r17
            r16 = r5
            r5 = r8
            r8 = 2
            r6 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x041c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            r0[r1] = r12
            r2 = 1
            r0[r2] = r15
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.im.sdk.k.u.f51776a
            r4 = 0
            r5 = 54315(0xd42b, float:7.6112E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r6[r1] = r12
            java.lang.Class<byte[]> r1 = byte[].class
            r6[r2] = r1
            java.lang.Class r12 = java.lang.Void.TYPE
            r1 = r14
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0421
        L_0x041c:
            r14.a((java.lang.String) r12)
            r14.f51781f = r15
        L_0x0421:
            byte[] r0 = r7.l
            r1 = 38
            long r0 = com.ss.android.ugc.aweme.im.sdk.k.x.b(r0, r1)
            r13.f51799a = r0
            java.util.List<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = r7.f51783b
            r0.add(r14)
            byte[] r0 = new byte[r9]
            java.io.RandomAccessFile r1 = r7.f51785d
            r1.readFully(r0)
            r14.a((byte[]) r0)
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r1 = 0
            r0[r1] = r14
            r2 = 1
            r0[r2] = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f51782a
            r4 = 0
            r5 = 54331(0xd43b, float:7.6134E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r12 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r6[r1] = r12
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.w$d> r1 = com.ss.android.ugc.aweme.im.sdk.k.w.d.class
            r6[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r8] = r1
            java.lang.Class r12 = java.lang.Void.TYPE
            r1 = r32
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x049e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r1 = 0
            r0[r1] = r14
            r2 = 1
            r0[r2] = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f51782a
            r4 = 0
            r5 = 54331(0xd43b, float:7.6134E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r9 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r6[r1] = r9
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.w$d> r1 = com.ss.android.ugc.aweme.im.sdk.k.w.d.class
            r6[r2] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6[r8] = r1
            java.lang.Class r8 = java.lang.Void.TYPE
            r1 = r32
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x049a:
            r5 = 4
            r12 = 1
            goto L_0x0618
        L_0x049e:
            com.ss.android.ugc.aweme.im.sdk.k.z r0 = com.ss.android.ugc.aweme.im.sdk.k.o.f51761b
            com.ss.android.ugc.aweme.im.sdk.k.v r0 = r14.b((com.ss.android.ugc.aweme.im.sdk.k.z) r0)
            com.ss.android.ugc.aweme.im.sdk.k.o r0 = (com.ss.android.ugc.aweme.im.sdk.k.o) r0
            if (r0 == 0) goto L_0x049a
            long r1 = r14.getSize()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x04b7
            r1 = 1
            goto L_0x04b8
        L_0x04b7:
            r1 = 0
        L_0x04b8:
            long r5 = r14.getCompressedSize()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04c2
            r2 = 1
            goto L_0x04c3
        L_0x04c2:
            r2 = 0
        L_0x04c3:
            long r5 = r13.f51799a
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x04cb
            r3 = 1
            goto L_0x04cc
        L_0x04cb:
            r3 = 0
        L_0x04cc:
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r4) goto L_0x04d4
            r4 = 1
        L_0x04d2:
            r5 = 4
            goto L_0x04d6
        L_0x04d4:
            r4 = 0
            goto L_0x04d2
        L_0x04d6:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            r11 = 0
            r6[r11] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r2)
            r11 = 1
            r6[r11] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r3)
            r6[r8] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r4)
            r6[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r27 = com.ss.android.ugc.aweme.im.sdk.k.o.f51760a
            r28 = 0
            r29 = 54268(0xd3fc, float:7.6046E-41)
            r5 = 4
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r12 = 0
            r11[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r12 = 1
            r11[r12] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r11[r8] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r11[r9] = r5
            java.lang.Class r31 = java.lang.Void.TYPE
            r25 = r6
            r26 = r0
            r30 = r11
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r25, r26, r27, r28, r29, r30, r31)
            if (r5 == 0) goto L_0x0562
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            r11 = 0
            r6[r11] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r2)
            r11 = 1
            r6[r11] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r3)
            r6[r8] = r5
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r6[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r27 = com.ss.android.ugc.aweme.im.sdk.k.o.f51760a
            r28 = 0
            r29 = 54268(0xd3fc, float:7.6046E-41)
            r5 = 4
            java.lang.Class[] r4 = new java.lang.Class[r5]
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r12 = 0
            r4[r12] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r12 = 1
            r4[r12] = r11
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r4[r8] = r11
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r4[r9] = r8
            java.lang.Class r31 = java.lang.Void.TYPE
            r25 = r6
            r26 = r0
            r30 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x05dc
        L_0x0562:
            r5 = 4
            r12 = 1
            byte[] r6 = r0.g
            if (r6 == 0) goto L_0x05dc
            if (r1 == 0) goto L_0x056d
            r6 = 8
            goto L_0x056e
        L_0x056d:
            r6 = 0
        L_0x056e:
            if (r2 == 0) goto L_0x0573
            r8 = 8
            goto L_0x0574
        L_0x0573:
            r8 = 0
        L_0x0574:
            int r6 = r6 + r8
            if (r3 == 0) goto L_0x057a
            r8 = 8
            goto L_0x057b
        L_0x057a:
            r8 = 0
        L_0x057b:
            int r6 = r6 + r8
            if (r4 == 0) goto L_0x0580
            r8 = 4
            goto L_0x0581
        L_0x0580:
            r8 = 0
        L_0x0581:
            int r6 = r6 + r8
            byte[] r8 = r0.g
            int r8 = r8.length
            if (r8 < r6) goto L_0x05bd
            if (r1 == 0) goto L_0x0596
            com.ss.android.ugc.aweme.im.sdk.k.r r6 = new com.ss.android.ugc.aweme.im.sdk.k.r
            byte[] r8 = r0.g
            r9 = 0
            r6.<init>(r8, r9)
            r0.f51762c = r6
            r6 = 8
            goto L_0x0597
        L_0x0596:
            r6 = 0
        L_0x0597:
            if (r2 == 0) goto L_0x05a4
            com.ss.android.ugc.aweme.im.sdk.k.r r8 = new com.ss.android.ugc.aweme.im.sdk.k.r
            byte[] r9 = r0.g
            r8.<init>(r9, r6)
            r0.f51763d = r8
            int r6 = r6 + 8
        L_0x05a4:
            if (r3 == 0) goto L_0x05b1
            com.ss.android.ugc.aweme.im.sdk.k.r r8 = new com.ss.android.ugc.aweme.im.sdk.k.r
            byte[] r9 = r0.g
            r8.<init>(r9, r6)
            r0.f51764e = r8
            int r6 = r6 + 8
        L_0x05b1:
            if (r4 == 0) goto L_0x05dc
            com.ss.android.ugc.aweme.im.sdk.k.x r4 = new com.ss.android.ugc.aweme.im.sdk.k.x
            byte[] r8 = r0.g
            r4.<init>(r8, r6)
            r0.f51765f = r4
            goto L_0x05dc
        L_0x05bd:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = " but is "
            r2.append(r3)
            byte[] r0 = r0.g
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x05dc:
            if (r1 == 0) goto L_0x05e8
            com.ss.android.ugc.aweme.im.sdk.k.r r4 = r0.f51762c
            long r8 = r4.b()
            r14.setSize(r8)
            goto L_0x05f5
        L_0x05e8:
            if (r2 == 0) goto L_0x05f5
            com.ss.android.ugc.aweme.im.sdk.k.r r4 = new com.ss.android.ugc.aweme.im.sdk.k.r
            long r8 = r14.getSize()
            r4.<init>((long) r8)
            r0.f51762c = r4
        L_0x05f5:
            if (r2 == 0) goto L_0x0601
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = r0.f51763d
            long r1 = r1.b()
            r14.setCompressedSize(r1)
            goto L_0x060e
        L_0x0601:
            if (r1 == 0) goto L_0x060e
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            long r8 = r14.getCompressedSize()
            r1.<init>((long) r8)
            r0.f51763d = r1
        L_0x060e:
            if (r3 == 0) goto L_0x0618
            com.ss.android.ugc.aweme.im.sdk.k.r r0 = r0.f51764e
            long r0 = r0.b()
            r13.f51799a = r0
        L_0x0618:
            byte[] r0 = new byte[r10]
            java.io.RandomAccessFile r1 = r7.f51785d
            r1.readFully(r0)
            r1 = r24
            java.lang.String r1 = r1.a((byte[]) r0)
            r14.setComment(r1)
            if (r16 != 0) goto L_0x063a
            boolean r1 = r7.h
            if (r1 == 0) goto L_0x063a
            com.ss.android.ugc.aweme.im.sdk.k.w$c r1 = new com.ss.android.ugc.aweme.im.sdk.k.w$c
            r2 = 0
            r1.<init>(r15, r0, r2)
            r0 = r23
            r0.put(r14, r1)
            goto L_0x063d
        L_0x063a:
            r0 = r23
            r2 = 0
        L_0x063d:
            java.io.RandomAccessFile r1 = r7.f51785d
            byte[] r3 = r7.k
            r1.readFully(r3)
            byte[] r1 = r7.k
            long r13 = com.ss.android.ugc.aweme.im.sdk.k.x.a((byte[]) r1)
            r9 = r0
            r8 = 0
            r10 = 16
            r11 = 4
            goto L_0x01c7
        L_0x0651:
            r0 = r9
            return r0
        L_0x0653:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "archive's ZIP64 end of central directory locator is corrupt."
            r0.<init>(r1)
            throw r0
        L_0x065b:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.String r1 = "archive is not a ZIP archive"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.w.a():java.util.Map");
    }

    public w(String str) throws IOException {
        this(new File(str), null);
    }

    private void a(int i2) throws IOException {
        int i3 = i2;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51782a, false, 54337, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51782a, false, 54337, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        while (i4 < i3) {
            int skipBytes = this.f51785d.skipBytes(i3 - i4);
            if (skipBytes > 0) {
                i4 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.Map<com.ss.android.ugc.aweme.im.sdk.k.u, com.ss.android.ugc.aweme.im.sdk.k.w.c> r19) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54338(0xd442, float:7.6144E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f51782a
            r3 = 0
            r4 = 54338(0xd442, float:7.6144E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.util.List<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = r7.f51783b
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0147
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.im.sdk.k.u r1 = (com.ss.android.ugc.aweme.im.sdk.k.u) r1
            com.ss.android.ugc.aweme.im.sdk.k.w$b r1 = (com.ss.android.ugc.aweme.im.sdk.k.w.b) r1
            com.ss.android.ugc.aweme.im.sdk.k.w$d r2 = r1.i
            long r3 = r2.f51799a
            java.io.RandomAccessFile r5 = r7.f51785d
            r11 = 26
            long r3 = r3 + r11
            r5.seek(r3)
            java.io.RandomAccessFile r5 = r7.f51785d
            byte[] r6 = r7.m
            r5.readFully(r6)
            byte[] r5 = r7.m
            int r5 = com.ss.android.ugc.aweme.im.sdk.k.z.a((byte[]) r5)
            java.io.RandomAccessFile r6 = r7.f51785d
            byte[] r11 = r7.m
            r6.readFully(r11)
            byte[] r6 = r7.m
            int r6 = com.ss.android.ugc.aweme.im.sdk.k.z.a((byte[]) r6)
            r11 = r5
        L_0x0073:
            if (r11 <= 0) goto L_0x0087
            java.io.RandomAccessFile r12 = r7.f51785d
            int r12 = r12.skipBytes(r11)
            if (r12 <= 0) goto L_0x007f
            int r11 = r11 - r12
            goto L_0x0073
        L_0x007f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "failed to skip file name in local file header"
            r0.<init>(r1)
            throw r0
        L_0x0087:
            byte[] r11 = new byte[r6]
            java.io.RandomAccessFile r12 = r7.f51785d
            r12.readFully(r11)
            r1.setExtra(r11)
            r11 = 2
            long r3 = r3 + r11
            long r3 = r3 + r11
            long r11 = (long) r5
            long r3 = r3 + r11
            long r5 = (long) r6
            long r3 = r3 + r5
            r2.f51800b = r3
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x012a
            java.lang.Object r2 = r8.get(r1)
            com.ss.android.ugc.aweme.im.sdk.k.w$c r2 = (com.ss.android.ugc.aweme.im.sdk.k.w.c) r2
            byte[] r3 = r2.f51797a
            byte[] r2 = r2.f51798b
            r4 = 3
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r1
            r11[r9] = r3
            r5 = 2
            r11[r5] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r14 = 1
            r15 = 54409(0xd489, float:7.6243E-41)
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r16 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r6[r10] = r16
            java.lang.Class<byte[]> r16 = byte[].class
            r6[r9] = r16
            java.lang.Class<byte[]> r16 = byte[].class
            r6[r5] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r6 == 0) goto L_0x00f9
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r10] = r1
            r11[r9] = r3
            r11[r5] = r2
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r14 = 1
            r15 = 54409(0xd489, float:7.6243E-41)
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r3 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r2[r10] = r3
            java.lang.Class<byte[]> r3 = byte[].class
            r2[r9] = r3
            java.lang.Class<byte[]> r3 = byte[].class
            r2[r5] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x012a
        L_0x00f9:
            com.ss.android.ugc.aweme.im.sdk.k.z r4 = com.ss.android.ugc.aweme.im.sdk.k.k.f51750d
            com.ss.android.ugc.aweme.im.sdk.k.v r4 = r1.b((com.ss.android.ugc.aweme.im.sdk.k.z) r4)
            com.ss.android.ugc.aweme.im.sdk.k.k r4 = (com.ss.android.ugc.aweme.im.sdk.k.k) r4
            java.lang.String r5 = r1.getName()
            java.lang.String r3 = com.ss.android.ugc.aweme.im.sdk.k.aa.a(r4, r3)
            if (r3 == 0) goto L_0x0114
            boolean r4 = r5.equals(r3)
            if (r4 != 0) goto L_0x0114
            r1.a((java.lang.String) r3)
        L_0x0114:
            if (r2 == 0) goto L_0x012a
            int r3 = r2.length
            if (r3 <= 0) goto L_0x012a
            com.ss.android.ugc.aweme.im.sdk.k.z r3 = com.ss.android.ugc.aweme.im.sdk.k.j.f51749d
            com.ss.android.ugc.aweme.im.sdk.k.v r3 = r1.b((com.ss.android.ugc.aweme.im.sdk.k.z) r3)
            com.ss.android.ugc.aweme.im.sdk.k.j r3 = (com.ss.android.ugc.aweme.im.sdk.k.j) r3
            java.lang.String r2 = com.ss.android.ugc.aweme.im.sdk.k.aa.a(r3, r2)
            if (r2 == 0) goto L_0x012a
            r1.setComment(r2)
        L_0x012a:
            java.lang.String r2 = r1.getName()
            java.util.Map<java.lang.String, java.util.LinkedList<com.ss.android.ugc.aweme.im.sdk.k.u>> r3 = r7.f51786e
            java.lang.Object r3 = r3.get(r2)
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            if (r3 != 0) goto L_0x0142
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.Map<java.lang.String, java.util.LinkedList<com.ss.android.ugc.aweme.im.sdk.k.u>> r4 = r7.f51786e
            r4.put(r2, r3)
        L_0x0142:
            r3.addLast(r1)
            goto L_0x003e
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.w.a(java.util.Map):void");
    }

    private w(File file, String str) throws IOException {
        this(file, null, true);
    }

    private w(File file, String str, boolean z) throws IOException {
        this.f51783b = new LinkedList();
        this.f51786e = new HashMap(509);
        this.j = new byte[8];
        this.k = new byte[4];
        this.l = new byte[42];
        this.m = new byte[2];
        this.o = new Comparator<u>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                b bVar;
                u uVar = (u) obj;
                u uVar2 = (u) obj2;
                if (uVar == uVar2) {
                    return 0;
                }
                b bVar2 = null;
                if (uVar instanceof b) {
                    bVar = (b) uVar;
                } else {
                    bVar = null;
                }
                if (uVar2 instanceof b) {
                    bVar2 = (b) uVar2;
                }
                if (bVar != null) {
                    if (bVar2 == null) {
                        return -1;
                    }
                    long j = bVar.i.f51799a - bVar2.i.f51799a;
                    if (j == 0) {
                        return 0;
                    }
                    if (j < 0) {
                        return -1;
                    }
                }
                return 1;
            }
        };
        this.g = file.getAbsolutePath();
        this.f51784c = str;
        this.f51787f = t.a(str);
        this.h = true;
        this.f51785d = new RandomAccessFile(file, "r");
        try {
            a((Map) a());
            this.i = false;
        } catch (Throwable th) {
            this.i = true;
            try {
                this.f51785d.close();
            } catch (IOException unused) {
            }
            throw th;
        }
    }

    private boolean a(long j2, long j3, byte[] bArr) throws IOException {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{22L, 65557L, bArr}, this, f51782a, false, 54336, new Class[]{Long.TYPE, Long.TYPE, byte[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{22L, 65557L, bArr}, this, f51782a, false, 54336, new Class[]{Long.TYPE, Long.TYPE, byte[].class}, Boolean.TYPE)).booleanValue();
        }
        long length = this.f51785d.length() - 22;
        long max = Math.max(0, this.f51785d.length() - 65557);
        if (length >= 0) {
            while (true) {
                if (length < max) {
                    break;
                }
                this.f51785d.seek(length);
                int read = this.f51785d.read();
                if (read != -1) {
                    if (read == bArr[0] && this.f51785d.read() == bArr[1] && this.f51785d.read() == bArr[2] && this.f51785d.read() == bArr[3]) {
                        z = true;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        if (z) {
            this.f51785d.seek(length);
        }
        return z;
    }
}
