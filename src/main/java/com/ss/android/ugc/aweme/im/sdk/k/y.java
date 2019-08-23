package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

public final class y extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51807a;
    protected static final byte[] g = x.f51803d.a();
    protected static final byte[] h = x.f51804e.a();
    protected static final byte[] i = x.f51802c.a();
    protected static final byte[] j = x.a(101010256);
    static final byte[] k = x.a(101075792);
    static final byte[] l = x.a(117853008);
    private static final byte[] n = new byte[0];
    private static final byte[] u = {0, 0};
    private static final byte[] v = {0, 0, 0, 0};
    private static final byte[] w = x.a(1);
    private boolean A;
    private boolean B;
    private final Calendar C;

    /* renamed from: b  reason: collision with root package name */
    public String f51808b;

    /* renamed from: c  reason: collision with root package name */
    protected final Deflater f51809c;

    /* renamed from: d  reason: collision with root package name */
    protected byte[] f51810d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f51811e;

    /* renamed from: f  reason: collision with root package name */
    public p f51812f;
    private boolean m;
    private a o;
    private final List<u> p;
    private final CRC32 q;
    private long r;
    private long s;
    private long t;
    private final Map<u, Long> x;
    private s y;
    private final RandomAccessFile z;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final u f51813a;

        /* renamed from: b  reason: collision with root package name */
        public long f51814b;

        /* renamed from: c  reason: collision with root package name */
        public long f51815c;

        /* renamed from: d  reason: collision with root package name */
        public long f51816d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f51817e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f51818f;
    }

    private void c() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54376, new Class[0], Void.TYPE);
            return;
        }
        int deflate = this.f51809c.deflate(this.f51810d, 0, this.f51810d.length);
        if (deflate > 0) {
            a(this.f51810d, 0, deflate);
        }
    }

    private void d() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54390, new Class[0], Void.TYPE);
            return;
        }
        while (!this.f51809c.needsInput()) {
            c();
        }
    }

    public final void flush() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54375, new Class[0], Void.TYPE);
            return;
        }
        if (this.out != null) {
            this.out.flush();
        }
    }

    private void b() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54358, new Class[0], Void.TYPE);
            return;
        }
        if (this.o.f51813a.getMethod() == 8) {
            this.f51809c.finish();
            while (!this.f51809c.finished()) {
                c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x040d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0438  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() throws java.io.IOException {
        /*
            r47 = this;
            r7 = r47
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54354(0xd452, float:7.6166E-41)
            r1 = r47
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54354(0xd452, float:7.6166E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r47
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream
            r0 = 70000(0x11170, float:9.8091E-41)
            r9.<init>(r0)
            java.util.List<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = r7.p
            java.util.Iterator r10 = r0.iterator()
        L_0x0037:
            r11 = 0
        L_0x0038:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x05e8
            java.lang.Object r0 = r10.next()
            r12 = r0
            com.ss.android.ugc.aweme.im.sdk.k.u r12 = (com.ss.android.ugc.aweme.im.sdk.k.u) r12
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54382(0xd46e, float:7.6205E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r1 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r5[r8] = r1
            java.lang.Class<byte[]> r6 = byte[].class
            r1 = r47
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007c
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54382(0xd46e, float:7.6205E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r1 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r5[r8] = r1
            java.lang.Class<byte[]> r6 = byte[].class
            r1 = r47
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            byte[] r0 = (byte[]) r0
            goto L_0x05d3
        L_0x007c:
            java.util.Map<com.ss.android.ugc.aweme.im.sdk.k.u, java.lang.Long> r0 = r7.x
            java.lang.Object r0 = r0.get(r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r14 = r0.longValue()
            boolean r0 = r7.a((com.ss.android.ugc.aweme.im.sdk.k.u) r12)
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 != 0) goto L_0x00ab
            long r0 = r12.getCompressedSize()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ab
            long r0 = r12.getSize()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ab
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r16 = 0
            goto L_0x00ad
        L_0x00ab:
            r16 = 1
        L_0x00ad:
            if (r16 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.im.sdk.k.p r0 = r7.f51812f
            com.ss.android.ugc.aweme.im.sdk.k.p r1 = com.ss.android.ugc.aweme.im.sdk.k.p.Never
            if (r0 == r1) goto L_0x00b6
            goto L_0x00be
        L_0x00b6:
            com.ss.android.ugc.aweme.im.sdk.k.q r0 = new com.ss.android.ugc.aweme.im.sdk.k.q
            java.lang.String r1 = "archive's size exceeds the limit of 4GByte."
            r0.<init>(r1)
            throw r0
        L_0x00be:
            r4 = 3
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r8] = r12
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r0[r13] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r3 = 2
            r0[r3] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r17 = 0
            r18 = 54384(0xd470, float:7.6208E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r19 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r1[r8] = r19
            java.lang.Class r19 = java.lang.Long.TYPE
            r1[r13] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r1[r3] = r19
            java.lang.Class r19 = java.lang.Void.TYPE
            r20 = r1
            r1 = r47
            r3 = r17
            r13 = 3
            r4 = r18
            r5 = r20
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x013a
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r8] = r12
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r2 = 1
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r6 = 2
            r0[r6] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = f51807a
            r4 = 0
            r5 = 54384(0xd470, float:7.6208E-41)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r17 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r1[r8] = r17
            java.lang.Class r17 = java.lang.Long.TYPE
            r1[r2] = r17
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r6] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r47
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            r13 = 2
            r6 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0133:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L_0x01d8
        L_0x013a:
            r13 = 2
            if (r16 == 0) goto L_0x0133
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54393(0xd479, float:7.6221E-41)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r5[r8] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.o> r6 = com.ss.android.ugc.aweme.im.sdk.k.o.class
            r0 = r1
            r1 = r47
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0176
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54393(0xd479, float:7.6221E-41)
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r0 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r5[r8] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.o> r6 = com.ss.android.ugc.aweme.im.sdk.k.o.class
            r0 = r1
            r1 = r47
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.im.sdk.k.o r0 = (com.ss.android.ugc.aweme.im.sdk.k.o) r0
            goto L_0x0198
        L_0x0176:
            com.ss.android.ugc.aweme.im.sdk.k.y$a r0 = r7.o
            if (r0 == 0) goto L_0x0183
            com.ss.android.ugc.aweme.im.sdk.k.y$a r0 = r7.o
            boolean r1 = r7.B
            r2 = 1
            r1 = r1 ^ r2
            r0.f51817e = r1
            goto L_0x0184
        L_0x0183:
            r2 = 1
        L_0x0184:
            r7.B = r2
            com.ss.android.ugc.aweme.im.sdk.k.z r0 = com.ss.android.ugc.aweme.im.sdk.k.o.f51761b
            com.ss.android.ugc.aweme.im.sdk.k.v r0 = r12.b((com.ss.android.ugc.aweme.im.sdk.k.z) r0)
            com.ss.android.ugc.aweme.im.sdk.k.o r0 = (com.ss.android.ugc.aweme.im.sdk.k.o) r0
            if (r0 != 0) goto L_0x0195
            com.ss.android.ugc.aweme.im.sdk.k.o r0 = new com.ss.android.ugc.aweme.im.sdk.k.o
            r0.<init>()
        L_0x0195:
            r12.a((com.ss.android.ugc.aweme.im.sdk.k.v) r0)
        L_0x0198:
            long r1 = r12.getCompressedSize()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x01b4
            long r1 = r12.getSize()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x01ae
            goto L_0x01b4
        L_0x01ae:
            r1 = 0
            r0.f51763d = r1
            r0.f51762c = r1
            goto L_0x01ca
        L_0x01b4:
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            long r2 = r12.getCompressedSize()
            r1.<init>((long) r2)
            r0.f51763d = r1
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            long r2 = r12.getSize()
            r1.<init>((long) r2)
            r0.f51762c = r1
        L_0x01ca:
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x01d5
            com.ss.android.ugc.aweme.im.sdk.k.r r1 = new com.ss.android.ugc.aweme.im.sdk.k.r
            r1.<init>((long) r14)
            r0.f51764e = r1
        L_0x01d5:
            r12.a()
        L_0x01d8:
            java.nio.ByteBuffer r17 = r7.c(r12)
            r4 = 4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r8] = r12
            r1 = 1
            r0[r1] = r17
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r0[r13] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r18 = 54383(0xd46f, float:7.6207E-41)
            java.lang.Class[] r1 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r19 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r1[r8] = r19
            java.lang.Class<java.nio.ByteBuffer> r19 = java.nio.ByteBuffer.class
            r20 = 1
            r1[r20] = r19
            java.lang.Class r19 = java.lang.Long.TYPE
            r1[r13] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r20 = 3
            r1[r20] = r19
            java.lang.Class<byte[]> r19 = byte[].class
            r20 = r1
            r1 = r47
            r13 = 4
            r4 = r18
            r5 = r20
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x025e
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r8] = r12
            r1 = 1
            r0[r1] = r17
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r14)
            r2 = 2
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54383(0xd46f, float:7.6207E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.u> r1 = com.ss.android.ugc.aweme.im.sdk.k.u.class
            r5[r8] = r1
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r6 = 1
            r5[r6] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r6 = 2
            r5[r6] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r6 = 3
            r5[r6] = r1
            java.lang.Class<byte[]> r6 = byte[].class
            r1 = r47
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            byte[] r0 = (byte[]) r0
            goto L_0x05d3
        L_0x025e:
            byte[] r6 = r12.b()
            java.lang.String r0 = r12.getComment()
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = ""
        L_0x026a:
            com.ss.android.ugc.aweme.im.sdk.k.s r1 = r7.b((com.ss.android.ugc.aweme.im.sdk.k.u) r12)
            java.nio.ByteBuffer r18 = r1.b(r0)
            int r0 = r17.limit()
            int r1 = r17.position()
            int r5 = r0 - r1
            int r0 = r18.limit()
            int r1 = r18.position()
            int r4 = r0 - r1
            int r3 = r5 + 46
            int r0 = r6.length
            int r0 = r0 + r3
            int r0 = r0 + r4
            byte[] r2 = new byte[r0]
            byte[] r0 = i
            java.lang.System.arraycopy(r0, r8, r2, r8, r13)
            int r0 = r12.f51778c
            r1 = 8
            int r0 = r0 << r1
            boolean r1 = r7.B
            r19 = 45
            r26 = r4
            if (r1 != 0) goto L_0x02a2
            r1 = 20
            goto L_0x02a4
        L_0x02a2:
            r1 = 45
        L_0x02a4:
            r0 = r0 | r1
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r2, r13)
            int r1 = r12.getMethod()
            com.ss.android.ugc.aweme.im.sdk.k.s r0 = r7.y
            java.lang.String r4 = r12.getName()
            boolean r20 = r0.a((java.lang.String) r4)
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)
            r4[r8] = r21
            java.lang.Byte r21 = java.lang.Byte.valueOf(r16)
            r22 = 1
            r4[r22] = r21
            com.meituan.robust.ChangeQuickRedirect r21 = f51807a
            r23 = 0
            r24 = 54392(0xd478, float:7.622E-41)
            java.lang.Class[] r13 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r13[r8] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r13[r22] = r0
            java.lang.Class r29 = java.lang.Integer.TYPE
            r0 = r4
            r4 = r1
            r30 = 8
            r1 = r47
            r31 = r2
            r2 = r21
            r32 = r3
            r3 = r23
            r34 = r4
            r33 = r26
            r4 = r24
            r35 = r5
            r5 = r13
            r13 = r6
            r6 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0333
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r34)
            r1[r8] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)
            r3 = 1
            r1[r3] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r4 = 0
            r5 = 54392(0xd478, float:7.622E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r8] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r3] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r0 = r1
            r1 = r47
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r19 = r0.intValue()
            r0 = r19
            r6 = r34
            goto L_0x0347
        L_0x0333:
            if (r16 == 0) goto L_0x033a
            r6 = r34
            r0 = 45
            goto L_0x0347
        L_0x033a:
            r6 = r34
            boolean r0 = r7.a((int) r6)
            if (r0 == 0) goto L_0x0345
            r0 = 20
            goto L_0x0347
        L_0x0345:
            r0 = 10
        L_0x0347:
            r1 = 6
            r5 = r31
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r5, r1)
            if (r20 != 0) goto L_0x0357
            boolean r0 = r7.f51811e
            if (r0 == 0) goto L_0x0357
            r0 = 2
            r16 = 1
            goto L_0x035a
        L_0x0357:
            r0 = 2
            r16 = 0
        L_0x035a:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r8] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)
            r3 = 1
            r1[r3] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r19 = 54391(0xd477, float:7.6218E-41)
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r4[r8] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r4[r3] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.f> r20 = com.ss.android.ugc.aweme.im.sdk.k.f.class
            r0 = r1
            r1 = r47
            r3 = 0
            r21 = r4
            r4 = r19
            r39 = r5
            r5 = r21
            r40 = r6
            r6 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03c5
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r40)
            r1[r8] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)
            r3 = 1
            r1[r3] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r4 = 0
            r5 = 54391(0xd477, float:7.6218E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r8] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r3] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.f> r16 = com.ss.android.ugc.aweme.im.sdk.k.f.class
            r0 = r1
            r1 = r47
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.im.sdk.k.f r0 = (com.ss.android.ugc.aweme.im.sdk.k.f) r0
            r1 = r40
        L_0x03c2:
            r2 = 1
        L_0x03c3:
            r3 = 2
            goto L_0x03e2
        L_0x03c5:
            com.ss.android.ugc.aweme.im.sdk.k.f r0 = new com.ss.android.ugc.aweme.im.sdk.k.f
            r0.<init>()
            boolean r1 = r7.A
            if (r1 != 0) goto L_0x03d3
            if (r16 == 0) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r1 = 0
            goto L_0x03d4
        L_0x03d3:
            r1 = 1
        L_0x03d4:
            r0.f51732b = r1
            r1 = r40
            boolean r2 = r7.a((int) r1)
            if (r2 == 0) goto L_0x03c2
            r2 = 1
            r0.f51733c = r2
            goto L_0x03c3
        L_0x03e2:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = r39
            r4[r8] = r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r30)
            r4[r2] = r6
            com.meituan.robust.ChangeQuickRedirect r42 = com.ss.android.ugc.aweme.im.sdk.k.f.f51731a
            r43 = 0
            r44 = 54234(0xd3da, float:7.5998E-41)
            java.lang.Class[] r6 = new java.lang.Class[r3]
            java.lang.Class<byte[]> r3 = byte[].class
            r6[r8] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r6[r2] = r3
            java.lang.Class r46 = java.lang.Void.TYPE
            r40 = r4
            r41 = r0
            r45 = r6
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r40, r41, r42, r43, r44, r45, r46)
            if (r2 == 0) goto L_0x0438
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r8] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r30)
            r6 = 1
            r3[r6] = r4
            com.meituan.robust.ChangeQuickRedirect r42 = com.ss.android.ugc.aweme.im.sdk.k.f.f51731a
            r43 = 0
            r44 = 54234(0xd3da, float:7.5998E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class<byte[]> r2 = byte[].class
            r4[r8] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4[r6] = r2
            java.lang.Class r46 = java.lang.Void.TYPE
            r40 = r3
            r41 = r0
            r45 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r40, r41, r42, r43, r44, r45, r46)
        L_0x0435:
            r0 = 10
            goto L_0x045b
        L_0x0438:
            boolean r2 = r0.f51733c
            if (r2 == 0) goto L_0x043f
            r2 = 8
            goto L_0x0440
        L_0x043f:
            r2 = 0
        L_0x0440:
            boolean r3 = r0.f51732b
            if (r3 == 0) goto L_0x0447
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0448
        L_0x0447:
            r3 = 0
        L_0x0448:
            r2 = r2 | r3
            boolean r3 = r0.f51734d
            r2 = r2 | r3
            boolean r0 = r0.f51735e
            if (r0 == 0) goto L_0x0453
            r0 = 64
            goto L_0x0454
        L_0x0453:
            r0 = 0
        L_0x0454:
            r0 = r0 | r2
            r2 = 8
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r5, r2)
            goto L_0x0435
        L_0x045b:
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r5, r0)
            java.util.Calendar r0 = r7.C
            long r1 = r12.getTime()
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r8] = r0
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r6 = 1
            r4[r6] = r3
            r3 = 2
            r4[r3] = r5
            r3 = 12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r16 = 3
            r4[r16] = r6
            r37 = 0
            com.meituan.robust.ChangeQuickRedirect r38 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r39 = 1
            r40 = 54406(0xd486, float:7.6239E-41)
            r6 = 4
            java.lang.Class[] r3 = new java.lang.Class[r6]
            java.lang.Class<java.util.Calendar> r6 = java.util.Calendar.class
            r3[r8] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r16 = 1
            r3[r16] = r6
            java.lang.Class<byte[]> r6 = byte[].class
            r16 = 2
            r3[r16] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r16 = 3
            r3[r16] = r6
            java.lang.Class r42 = java.lang.Void.TYPE
            r36 = r4
            r41 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r36, r37, r38, r39, r40, r41, r42)
            r4 = 16
            if (r3 == 0) goto L_0x04f1
            r3 = 4
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r8] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r1 = 1
            r6[r1] = r0
            r0 = 2
            r6[r0] = r5
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3
            r6[r1] = r0
            r26 = 0
            com.meituan.robust.ChangeQuickRedirect r27 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51715a
            r0 = 1
            r29 = 54406(0xd486, float:7.6239E-41)
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.util.Calendar> r2 = java.util.Calendar.class
            r1[r8] = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 1
            r1[r3] = r2
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 2
            r1[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 3
            r1[r3] = r2
            java.lang.Class r31 = java.lang.Void.TYPE
            r25 = r6
            r28 = r0
            r30 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x053b
        L_0x04f1:
            r0.setTimeInMillis(r1)
            r1 = 1
            int r2 = r0.get(r1)
            r3 = 1980(0x7bc, float:2.775E-42)
            if (r2 >= r3) goto L_0x0508
            byte[] r0 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51716b
            byte[] r2 = com.ss.android.ugc.aweme.im.sdk.k.aa.f51716b
            int r2 = r2.length
            r3 = 12
            java.lang.System.arraycopy(r0, r8, r5, r3, r2)
            goto L_0x053b
        L_0x0508:
            r3 = 2
            int r6 = r0.get(r3)
            int r6 = r6 + r1
            int r2 = r2 + -1980
            int r1 = r2 << 25
            int r2 = r6 << 21
            r1 = r1 | r2
            r2 = 5
            int r2 = r0.get(r2)
            int r2 = r2 << r4
            r1 = r1 | r2
            r2 = 11
            int r2 = r0.get(r2)
            int r2 = r2 << 11
            r1 = r1 | r2
            r2 = 12
            int r3 = r0.get(r2)
            int r3 = r3 << 5
            r1 = r1 | r3
            r3 = 13
            int r0 = r0.get(r3)
            r3 = 1
            int r0 = r0 >> r3
            r0 = r0 | r1
            long r0 = (long) r0
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r0, r5, r2)
        L_0x053b:
            long r0 = r12.getCrc()
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r0, r5, r4)
            long r0 = r12.getCompressedSize()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x056b
            long r0 = r12.getSize()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0558
            goto L_0x056b
        L_0x0558:
            long r0 = r12.getCompressedSize()
            r4 = 20
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r0, r5, r4)
            long r0 = r12.getSize()
            r4 = 24
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r0, r5, r4)
            goto L_0x0579
        L_0x056b:
            r4 = 20
            com.ss.android.ugc.aweme.im.sdk.k.x r0 = com.ss.android.ugc.aweme.im.sdk.k.x.f51805f
            r0.a(r5, r4)
            com.ss.android.ugc.aweme.im.sdk.k.x r0 = com.ss.android.ugc.aweme.im.sdk.k.x.f51805f
            r1 = 24
            r0.a(r5, r1)
        L_0x0579:
            r0 = 28
            r1 = r35
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r1, r5, r0)
            int r0 = r13.length
            r4 = 30
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r5, r4)
            r0 = 32
            r4 = r33
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r4, r5, r0)
            byte[] r0 = u
            r6 = 34
            r2 = 2
            java.lang.System.arraycopy(r0, r8, r5, r6, r2)
            int r0 = r12.f51777b
            r2 = 36
            com.ss.android.ugc.aweme.im.sdk.k.z.a(r0, r5, r2)
            long r2 = r12.f51779d
            r0 = 38
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r2, r5, r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = java.lang.Math.min(r14, r2)
            r0 = 42
            com.ss.android.ugc.aweme.im.sdk.k.x.a(r2, r5, r0)
            byte[] r0 = r17.array()
            int r2 = r17.arrayOffset()
            r3 = 46
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            int r0 = r13.length
            r1 = r32
            java.lang.System.arraycopy(r13, r8, r5, r1, r0)
            int r0 = r13.length
            int r3 = r1 + r0
            byte[] r0 = r18.array()
            int r1 = r18.arrayOffset()
            java.lang.System.arraycopy(r0, r1, r5, r3, r4)
            r0 = r5
        L_0x05d3:
            r9.write(r0)
            r0 = 1
            int r11 = r11 + r0
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r11 <= r0) goto L_0x0038
            byte[] r0 = r9.toByteArray()
            r7.a((byte[]) r0)
            r9.reset()
            goto L_0x0037
        L_0x05e8:
            byte[] r0 = r9.toByteArray()
            r7.a((byte[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.y.a():void");
    }

    public final void close() throws IOException {
        p pVar;
        p pVar2;
        boolean z2;
        String str;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54374, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54374, new Class[0], Void.TYPE);
            return;
        }
        if (!this.m) {
            if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54353, new Class[0], Void.TYPE);
            } else if (!this.m) {
                if (this.o != null) {
                    if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54355, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54355, new Class[0], Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54357, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54357, new Class[0], Void.TYPE);
                        } else if (this.m) {
                            throw new IOException("Stream has already been finished");
                        } else if (this.o == null) {
                            throw new IOException("No current entry to close");
                        } else if (!this.o.f51818f) {
                            write(n, 0, 0);
                        }
                        b();
                        u uVar = this.o.f51813a;
                        if (PatchProxy.isSupport(new Object[]{uVar}, this, f51807a, false, 54395, new Class[]{u.class}, p.class)) {
                            pVar = (p) PatchProxy.accessDispatch(new Object[]{uVar}, this, f51807a, false, 54395, new Class[]{u.class}, p.class);
                        } else if (this.f51812f == p.AsNeeded && this.z == null && uVar.getMethod() == 8 && uVar.getSize() == -1) {
                            pVar = p.Never;
                        } else {
                            pVar = this.f51812f;
                        }
                        p pVar3 = pVar;
                        long j2 = this.r - this.o.f51815c;
                        long value = this.q.getValue();
                        this.q.reset();
                        p pVar4 = pVar3;
                        long j3 = value;
                        if (PatchProxy.isSupport(new Object[]{new Long(j2), new Long(value), pVar3}, this, f51807a, false, 54359, new Class[]{Long.TYPE, Long.TYPE, p.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), new Long(j3), pVar4}, this, f51807a, false, 54359, new Class[]{Long.TYPE, Long.TYPE, p.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            if (this.o.f51813a.getMethod() == 8) {
                                this.o.f51813a.setSize(this.o.f51816d);
                                this.o.f51813a.setCompressedSize(j2);
                                this.o.f51813a.setCrc(j3);
                                this.f51809c.reset();
                            } else if (this.z != null) {
                                this.o.f51813a.setSize(j2);
                                this.o.f51813a.setCompressedSize(j2);
                                this.o.f51813a.setCrc(j3);
                            } else if (this.o.f51813a.getCrc() != j3) {
                                throw new ZipException("bad CRC checksum for entry " + this.o.f51813a.getName() + ": " + Long.toHexString(this.o.f51813a.getCrc()) + " instead of " + Long.toHexString(j3));
                            } else if (this.o.f51813a.getSize() != j2) {
                                throw new ZipException("bad size for entry " + this.o.f51813a.getName() + ": " + this.o.f51813a.getSize() + " instead of " + j2);
                            }
                            if (PatchProxy.isSupport(new Object[]{pVar4}, this, f51807a, false, 54360, new Class[]{p.class}, Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{pVar4}, this, f51807a, false, 54360, new Class[]{p.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                u uVar2 = this.o.f51813a;
                                if (PatchProxy.isSupport(new Object[]{uVar2, pVar4}, this, f51807a, false, 54361, new Class[]{u.class, p.class}, Boolean.TYPE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{uVar2, pVar4}, this, f51807a, false, 54361, new Class[]{u.class, p.class}, Boolean.TYPE)).booleanValue();
                                    pVar2 = pVar4;
                                } else {
                                    pVar2 = pVar4;
                                    if (pVar2 != p.Always) {
                                        if (PatchProxy.isSupport(new Object[]{uVar2}, this, f51807a, false, 54362, new Class[]{u.class}, Boolean.TYPE)) {
                                            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{uVar2}, this, f51807a, false, 54362, new Class[]{u.class}, Boolean.TYPE)).booleanValue();
                                        } else if (uVar2.getSize() >= 4294967295L || uVar2.getCompressedSize() >= 4294967295L) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            z2 = false;
                                        }
                                    }
                                    z2 = true;
                                }
                                if (z2 && pVar2 == p.Never) {
                                    u uVar3 = this.o.f51813a;
                                    if (PatchProxy.isSupport(new Object[]{uVar3}, null, q.changeQuickRedirect, true, 54272, new Class[]{u.class}, String.class)) {
                                        str = (String) PatchProxy.accessDispatch(new Object[]{uVar3}, null, q.changeQuickRedirect, true, 54272, new Class[]{u.class}, String.class);
                                    } else {
                                        str = uVar3.getName() + "'s size exceeds the limit of 4GByte.";
                                    }
                                    throw new q(str);
                                }
                            }
                        }
                        boolean z4 = z2;
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z4 ? (byte) 1 : 0)}, this, f51807a, false, 54356, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z4)}, this, f51807a, false, 54356, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            if (this.z != null) {
                                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z4)}, this, f51807a, false, 54363, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z4)}, this, f51807a, false, 54363, new Class[]{Boolean.TYPE}, Void.TYPE);
                                } else {
                                    long filePointer = this.z.getFilePointer();
                                    this.z.seek(this.o.f51814b);
                                    b(x.a(this.o.f51813a.getCrc()));
                                    if (!a(this.o.f51813a) || !z4) {
                                        b(x.a(this.o.f51813a.getCompressedSize()));
                                        b(x.a(this.o.f51813a.getSize()));
                                    } else {
                                        b(x.f51805f.a());
                                        b(x.f51805f.a());
                                    }
                                    if (a(this.o.f51813a)) {
                                        this.z.seek(this.o.f51814b + 12 + 4 + ((long) c(this.o.f51813a).limit()) + 4);
                                        b(r.a(this.o.f51813a.getSize()));
                                        b(r.a(this.o.f51813a.getCompressedSize()));
                                        if (!z4) {
                                            this.z.seek(this.o.f51814b - 10);
                                            b(z.a(10));
                                            this.o.f51813a.a(o.f51761b);
                                            this.o.f51813a.a();
                                            if (this.o.f51817e) {
                                                this.B = false;
                                            }
                                        }
                                    }
                                    this.z.seek(filePointer);
                                }
                            }
                            u uVar4 = this.o.f51813a;
                            if (PatchProxy.isSupport(new Object[]{uVar4}, this, f51807a, false, 54380, new Class[]{u.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{uVar4}, this, f51807a, false, 54380, new Class[]{u.class}, Void.TYPE);
                            } else if (uVar4.getMethod() == 8 && this.z == null) {
                                a(h);
                                a(x.a(uVar4.getCrc()));
                                if (!a(uVar4)) {
                                    a(x.a(uVar4.getCompressedSize()));
                                    a(x.a(uVar4.getSize()));
                                } else {
                                    a(r.a(uVar4.getCompressedSize()));
                                    a(r.a(uVar4.getSize()));
                                }
                            }
                            this.o = null;
                        }
                    }
                }
                this.s = this.r;
                a();
                this.t = this.r - this.s;
                if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54387, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54387, new Class[0], Void.TYPE);
                } else if (this.f51812f != p.Never) {
                    if (!this.B && (this.s >= 4294967295L || this.t >= 4294967295L || this.p.size() >= 65535)) {
                        this.B = true;
                    }
                    if (this.B) {
                        long j4 = this.r;
                        b(k);
                        b(r.a(44));
                        b(z.a(45));
                        b(z.a(45));
                        b(v);
                        b(v);
                        byte[] a2 = r.a((long) this.p.size());
                        b(a2);
                        b(a2);
                        b(r.a(this.t));
                        b(r.a(this.s));
                        b(l);
                        b(v);
                        b(r.a(j4));
                        b(w);
                    }
                }
                if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54385, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54385, new Class[0], Void.TYPE);
                } else {
                    a(j);
                    a(u);
                    a(u);
                    int size = this.p.size();
                    if (size > 65535 && this.f51812f == p.Never) {
                        throw new q("archive contains more than 65535 entries.");
                    } else if (this.s <= 4294967295L || this.f51812f != p.Never) {
                        byte[] a3 = z.a(Math.min(size, 65535));
                        a(a3);
                        a(a3);
                        a(x.a(Math.min(this.t, 4294967295L)));
                        a(x.a(Math.min(this.s, 4294967295L)));
                        ByteBuffer b2 = this.y.b(this.f51808b);
                        int limit = b2.limit() - b2.position();
                        a(z.a(limit));
                        a(b2.array(), b2.arrayOffset(), limit);
                    } else {
                        throw new q("archive's size exceeds the limit of 4GByte.");
                    }
                }
                this.x.clear();
                this.p.clear();
                this.f51809c.end();
                this.m = true;
            } else {
                throw new IOException("This archive has already been finished");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f51807a, false, 54398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51807a, false, 54398, new Class[0], Void.TYPE);
            return;
        }
        if (this.z != null) {
            this.z.close();
        }
        if (this.out != null) {
            this.out.close();
        }
    }

    private boolean a(int i2) {
        if (i2 == 8 && this.z == null) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte[] r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51807a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 54371(0xd463, float:7.619E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51807a
            r13 = 0
            r14 = 54371(0xd463, float:7.619E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r1 = r0.length
            r2 = r17
            r2.a(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.y.a(byte[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(byte[] r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51807a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 54388(0xd474, float:7.6214E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51807a
            r13 = 0
            r14 = 54388(0xd474, float:7.6214E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            int r1 = r0.length
            r2 = r17
            r2.c(r0, r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.y.b(byte[]):void");
    }

    private s b(u uVar) {
        if (PatchProxy.isSupport(new Object[]{uVar}, this, f51807a, false, 54396, new Class[]{u.class}, s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[]{uVar}, this, f51807a, false, 54396, new Class[]{u.class}, s.class);
        } else if (this.y.a(uVar.getName()) || !this.f51811e) {
            return this.y;
        } else {
            return t.f51770b;
        }
    }

    private ByteBuffer c(u uVar) throws IOException {
        if (!PatchProxy.isSupport(new Object[]{uVar}, this, f51807a, false, 54397, new Class[]{u.class}, ByteBuffer.class)) {
            return b(uVar).b(uVar.getName());
        }
        return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{uVar}, this, f51807a, false, 54397, new Class[]{u.class}, ByteBuffer.class);
    }

    private boolean a(u uVar) {
        u uVar2 = uVar;
        if (PatchProxy.isSupport(new Object[]{uVar2}, this, f51807a, false, 54394, new Class[]{u.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uVar2}, this, f51807a, false, 54394, new Class[]{u.class}, Boolean.TYPE)).booleanValue();
        } else if (uVar2.b(o.f51761b) != null) {
            return true;
        } else {
            return false;
        }
    }

    private void a(byte[] bArr, int i2, int i3) throws IOException {
        if (PatchProxy.isSupport(new Object[]{bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51807a, false, 54372, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51807a, false, 54372, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        c(bArr, i2, i3);
        this.r += (long) i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(byte[] r16, int r17, int r18) throws java.io.IOException {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54389(0xd475, float:7.6215E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54389(0xd475, float:7.6215E-41)
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
            java.io.RandomAccessFile r0 = r7.z
            if (r0 == 0) goto L_0x006d
            java.io.RandomAccessFile r0 = r7.z
            r0.write(r8, r9, r10)
            return
        L_0x006d:
            java.io.OutputStream r0 = r7.out
            r0.write(r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.y.c(byte[], int, int):void");
    }

    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        Object obj = bArr;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51807a, false, 54370, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51807a, false, 54370, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.o != null) {
            aa.a(this.o.f51813a);
            this.o.f51818f = true;
            if (this.o.f51813a.getMethod() == 8) {
                b(bArr, i2, i3);
            } else {
                a(bArr, i2, i3);
            }
            int i4 = i2;
            this.q.update(bArr, i2, i3);
        } else {
            throw new IllegalStateException("No current entry");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(byte[] r16, int r17, int r18) throws java.io.IOException {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<byte[]> r1 = byte[].class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 54373(0xd465, float:7.6193E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f51807a
            r3 = 0
            r4 = 54373(0xd465, float:7.6193E-41)
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
            if (r10 <= 0) goto L_0x00a4
            java.util.zip.Deflater r0 = r7.f51809c
            boolean r0 = r0.finished()
            if (r0 != 0) goto L_0x00a4
            com.ss.android.ugc.aweme.im.sdk.k.y$a r0 = r7.o
            long r1 = r0.f51816d
            long r3 = (long) r10
            long r1 = r1 + r3
            r0.f51816d = r1
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r10 > r0) goto L_0x0082
            java.util.zip.Deflater r0 = r7.f51809c
            r0.setInput(r8, r9, r10)
            r15.d()
            return
        L_0x0082:
            int r1 = r10 / 8192
        L_0x0084:
            if (r12 >= r1) goto L_0x0094
            java.util.zip.Deflater r2 = r7.f51809c
            int r3 = r12 * 8192
            int r3 = r3 + r9
            r2.setInput(r8, r3, r0)
            r15.d()
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0094:
            int r1 = r1 * 8192
            if (r1 >= r10) goto L_0x00a4
            java.util.zip.Deflater r0 = r7.f51809c
            int r2 = r9 + r1
            int r1 = r10 - r1
            r0.setInput(r8, r2, r1)
            r15.d()
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.y.b(byte[], int, int):void");
    }
}
