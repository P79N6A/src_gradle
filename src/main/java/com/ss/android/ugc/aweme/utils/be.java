package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class be implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75589a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f75590b = Charset.forName("UTF-8");
    private static final String h = "be";

    /* renamed from: c  reason: collision with root package name */
    public final File f75591c;

    /* renamed from: d  reason: collision with root package name */
    public final long f75592d;

    /* renamed from: e  reason: collision with root package name */
    public final int f75593e;

    /* renamed from: f  reason: collision with root package name */
    public Writer f75594f;
    public int g;
    private final File i;
    private final File j;
    private final int k;
    private long l;
    private final LinkedHashMap<String, b> m = new LinkedHashMap<>(0, 0.75f, true);
    private long n = 0;
    private final ExecutorService o;
    private final Callable<Void> p;

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75597a;

        /* renamed from: b  reason: collision with root package name */
        public final b f75598b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f75599c;

        /* renamed from: com.ss.android.ugc.aweme.utils.be$a$a  reason: collision with other inner class name */
        class C0791a extends FilterOutputStream {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75601a;

            public final void close() {
                if (PatchProxy.isSupport(new Object[0], this, f75601a, false, 88253, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f75601a, false, 88253, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    this.out.close();
                } catch (IOException unused) {
                    a.this.f75599c = true;
                }
            }

            public final void flush() {
                if (PatchProxy.isSupport(new Object[0], this, f75601a, false, 88254, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f75601a, false, 88254, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    a.this.f75599c = true;
                }
            }

            public final void write(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75601a, false, 88251, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75601a, false, 88251, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    a.this.f75599c = true;
                }
            }

            private C0791a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0791a(a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                Object obj = bArr;
                if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f75601a, false, 88252, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, f75601a, false, 88252, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                try {
                    int i3 = i;
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    a.this.f75599c = true;
                }
            }
        }

        public final void a() throws IOException {
            if (PatchProxy.isSupport(new Object[0], this, f75597a, false, 88249, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75597a, false, 88249, new Class[0], Void.TYPE);
            } else if (this.f75599c) {
                be.this.a(this, false);
                be.this.c(this.f75598b.f75604b);
            } else {
                be.this.a(this, true);
            }
        }

        public final void b() throws IOException {
            if (PatchProxy.isSupport(new Object[0], this, f75597a, false, 88250, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75597a, false, 88250, new Class[0], Void.TYPE);
                return;
            }
            be.this.a(this, false);
        }

        public final OutputStream a(int i) throws IOException {
            C0791a aVar;
            if (PatchProxy.isSupport(new Object[]{0}, this, f75597a, false, 88247, new Class[]{Integer.TYPE}, OutputStream.class)) {
                return (OutputStream) PatchProxy.accessDispatch(new Object[]{0}, this, f75597a, false, 88247, new Class[]{Integer.TYPE}, OutputStream.class);
            }
            synchronized (be.this) {
                if (this.f75598b.f75607e == this) {
                    aVar = new C0791a(this, new FileOutputStream(this.f75598b.b(0)), (byte) 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private a(b bVar) {
            this.f75598b = bVar;
        }

        /* synthetic */ a(be beVar, b bVar, byte b2) {
            this(bVar);
        }
    }

    final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75603a;

        /* renamed from: b  reason: collision with root package name */
        public final String f75604b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f75605c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f75606d;

        /* renamed from: e  reason: collision with root package name */
        public a f75607e;

        /* renamed from: f  reason: collision with root package name */
        public long f75608f;

        public final String a() throws IOException {
            if (PatchProxy.isSupport(new Object[0], this, f75603a, false, 88255, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f75603a, false, 88255, new Class[0], String.class);
            }
            StringBuilder sb = new StringBuilder();
            for (long append : this.f75605c) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private IOException b(String[] strArr) throws IOException {
            if (PatchProxy.isSupport(new Object[]{strArr}, this, f75603a, false, 88257, new Class[]{String[].class}, IOException.class)) {
                return (IOException) PatchProxy.accessDispatch(new Object[]{strArr}, this, f75603a, false, 88257, new Class[]{String[].class}, IOException.class);
            }
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75603a, false, 88258, new Class[]{Integer.TYPE}, File.class)) {
                return (File) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75603a, false, 88258, new Class[]{Integer.TYPE}, File.class);
            }
            File file = be.this.f75591c;
            return new File(file, this.f75604b + ClassUtils.PACKAGE_SEPARATOR + i);
        }

        public final File b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75603a, false, 88259, new Class[]{Integer.TYPE}, File.class)) {
                return (File) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75603a, false, 88259, new Class[]{Integer.TYPE}, File.class);
            }
            File file = be.this.f75591c;
            return new File(file, this.f75604b + ClassUtils.PACKAGE_SEPARATOR + i + ".tmp");
        }

        public final void a(String[] strArr) throws IOException {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{strArr}, this, f75603a, false, 88256, new Class[]{String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr}, this, f75603a, false, 88256, new Class[]{String[].class}, Void.TYPE);
            } else if (strArr.length == be.this.f75593e) {
                while (i < strArr.length) {
                    try {
                        this.f75605c[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
            } else {
                throw b(strArr);
            }
        }

        private b(String str) {
            this.f75604b = str;
            this.f75605c = new long[be.this.f75593e];
        }

        /* synthetic */ b(be beVar, String str, byte b2) {
            this(str);
        }
    }

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75609a;

        /* renamed from: c  reason: collision with root package name */
        private final String f75611c;

        /* renamed from: d  reason: collision with root package name */
        private final long f75612d;

        /* renamed from: e  reason: collision with root package name */
        private final InputStream[] f75613e;

        public final void close() {
            if (PatchProxy.isSupport(new Object[0], this, f75609a, false, 88262, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75609a, false, 88262, new Class[0], Void.TYPE);
                return;
            }
            for (InputStream a2 : this.f75613e) {
                be.a((Closeable) a2);
            }
        }

        public final InputStream a(int i) {
            return this.f75613e[0];
        }

        private c(String str, long j, InputStream[] inputStreamArr) {
            this.f75611c = str;
            this.f75612d = j;
            this.f75613e = inputStreamArr;
        }

        /* synthetic */ c(be beVar, String str, long j, InputStream[] inputStreamArr, byte b2) {
            this(str, j, inputStreamArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.utils.be.a r15, boolean r16) throws java.io.IOException {
        /*
            r14 = this;
            r8 = r14
            r0 = r15
            monitor-enter(r14)
            r9 = 2
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x012a }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x012a }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r16)     // Catch:{ all -> 0x012a }
            r11 = 1
            r1[r11] = r2     // Catch:{ all -> 0x012a }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ all -> 0x012a }
            r4 = 0
            r5 = 88234(0x158aa, float:1.23642E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x012a }
            java.lang.Class<com.ss.android.ugc.aweme.utils.be$a> r2 = com.ss.android.ugc.aweme.utils.be.a.class
            r6[r10] = r2     // Catch:{ all -> 0x012a }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x012a }
            r6[r11] = r2     // Catch:{ all -> 0x012a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x012a }
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x012a }
            if (r1 == 0) goto L_0x004b
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x012a }
            r1[r10] = r0     // Catch:{ all -> 0x012a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)     // Catch:{ all -> 0x012a }
            r1[r11] = r0     // Catch:{ all -> 0x012a }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ all -> 0x012a }
            r4 = 0
            r5 = 88234(0x158aa, float:1.23642E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x012a }
            java.lang.Class<com.ss.android.ugc.aweme.utils.be$a> r0 = com.ss.android.ugc.aweme.utils.be.a.class
            r6[r10] = r0     // Catch:{ all -> 0x012a }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x012a }
            r6[r11] = r0     // Catch:{ all -> 0x012a }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x012a }
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x012a }
            monitor-exit(r14)
            return
        L_0x004b:
            com.ss.android.ugc.aweme.utils.be$b r1 = r0.f75598b     // Catch:{ all -> 0x012a }
            com.ss.android.ugc.aweme.utils.be$a r2 = r1.f75607e     // Catch:{ all -> 0x012a }
            if (r2 != r0) goto L_0x0124
            if (r16 == 0) goto L_0x0080
            boolean r2 = r1.f75606d     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x0080
            r2 = 0
        L_0x0058:
            int r3 = r8.f75593e     // Catch:{ all -> 0x012a }
            if (r2 >= r3) goto L_0x0080
            java.io.File r3 = r1.b((int) r2)     // Catch:{ all -> 0x012a }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x012a }
            if (r3 == 0) goto L_0x0069
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0069:
            r15.b()     // Catch:{ all -> 0x012a }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r3 = "edit didn't create file "
            r1.<init>(r3)     // Catch:{ all -> 0x012a }
            r1.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012a }
            r0.<init>(r1)     // Catch:{ all -> 0x012a }
            throw r0     // Catch:{ all -> 0x012a }
        L_0x0080:
            int r0 = r8.f75593e     // Catch:{ all -> 0x012a }
            if (r10 >= r0) goto L_0x00b1
            java.io.File r0 = r1.b((int) r10)     // Catch:{ all -> 0x012a }
            if (r16 == 0) goto L_0x00ab
            boolean r2 = r0.exists()     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x00ae
            java.io.File r2 = r1.a((int) r10)     // Catch:{ all -> 0x012a }
            r0.renameTo(r2)     // Catch:{ all -> 0x012a }
            long[] r0 = r1.f75605c     // Catch:{ all -> 0x012a }
            r3 = r0[r10]     // Catch:{ all -> 0x012a }
            long r5 = r2.length()     // Catch:{ all -> 0x012a }
            long[] r0 = r1.f75605c     // Catch:{ all -> 0x012a }
            r0[r10] = r5     // Catch:{ all -> 0x012a }
            long r12 = r8.l     // Catch:{ all -> 0x012a }
            r0 = 0
            long r12 = r12 - r3
            long r12 = r12 + r5
            r8.l = r12     // Catch:{ all -> 0x012a }
            goto L_0x00ae
        L_0x00ab:
            b((java.io.File) r0)     // Catch:{ all -> 0x012a }
        L_0x00ae:
            int r10 = r10 + 1
            goto L_0x0080
        L_0x00b1:
            int r0 = r8.g     // Catch:{ all -> 0x012a }
            int r0 = r0 + r11
            r8.g = r0     // Catch:{ all -> 0x012a }
            r0 = 0
            r1.f75607e = r0     // Catch:{ all -> 0x012a }
            boolean r0 = r1.f75606d     // Catch:{ all -> 0x012a }
            r0 = r0 | r16
            r2 = 10
            if (r0 == 0) goto L_0x00ee
            r1.f75606d = r11     // Catch:{ all -> 0x012a }
            java.io.Writer r0 = r8.f75594f     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "CLEAN "
            r3.<init>(r4)     // Catch:{ all -> 0x012a }
            java.lang.String r4 = r1.f75604b     // Catch:{ all -> 0x012a }
            r3.append(r4)     // Catch:{ all -> 0x012a }
            java.lang.String r4 = r1.a()     // Catch:{ all -> 0x012a }
            r3.append(r4)     // Catch:{ all -> 0x012a }
            r3.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x012a }
            r0.write(r2)     // Catch:{ all -> 0x012a }
            if (r16 == 0) goto L_0x010d
            long r2 = r8.n     // Catch:{ all -> 0x012a }
            r4 = 1
            long r4 = r4 + r2
            r8.n = r4     // Catch:{ all -> 0x012a }
            r1.f75608f = r2     // Catch:{ all -> 0x012a }
            goto L_0x010d
        L_0x00ee:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r0 = r8.m     // Catch:{ all -> 0x012a }
            java.lang.String r3 = r1.f75604b     // Catch:{ all -> 0x012a }
            r0.remove(r3)     // Catch:{ all -> 0x012a }
            java.io.Writer r0 = r8.f75594f     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "REMOVE "
            r3.<init>(r4)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r1.f75604b     // Catch:{ all -> 0x012a }
            r3.append(r1)     // Catch:{ all -> 0x012a }
            r3.append(r2)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x012a }
            r0.write(r1)     // Catch:{ all -> 0x012a }
        L_0x010d:
            long r0 = r8.l     // Catch:{ all -> 0x012a }
            long r2 = r8.f75592d     // Catch:{ all -> 0x012a }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x011b
            boolean r0 = r14.b()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0122
        L_0x011b:
            java.util.concurrent.ExecutorService r0 = r8.o     // Catch:{ all -> 0x012a }
            java.util.concurrent.Callable<java.lang.Void> r1 = r8.p     // Catch:{ all -> 0x012a }
            r0.submit(r1)     // Catch:{ all -> 0x012a }
        L_0x0122:
            monitor-exit(r14)
            return
        L_0x0124:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x012a }
            r0.<init>()     // Catch:{ all -> 0x012a }
            throw r0     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.be.a(com.ss.android.ugc.aweme.utils.be$a, boolean):void");
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88237, new Class[0], Void.TYPE);
        } else if (this.f75594f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88235, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88235, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.g < 2000 || this.g < this.m.size()) {
            return false;
        } else {
            return true;
        }
    }

    public final synchronized void c() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88238, new Class[0], Void.TYPE);
            return;
        }
        h();
        d();
        this.f75594f.flush();
    }

    public final void e() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88241, new Class[0], Void.TYPE);
            return;
        }
        close();
        a(this.f75591c);
    }

    private void g() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88227, new Class[0], Void.TYPE);
            return;
        }
        b(this.j);
        Iterator<b> it2 = this.m.values().iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f75607e == null) {
                for (int i2 = 0; i2 < this.f75593e; i2++) {
                    this.l += next.f75605c[i2];
                }
            } else {
                next.f75607e = null;
                for (int i3 = 0; i3 < this.f75593e; i3++) {
                    b(next.a(i3));
                    b(next.b(i3));
                }
                it2.remove();
            }
        }
    }

    public final synchronized void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88239, new Class[0], Void.TYPE);
        } else if (this.f75594f != null) {
            Iterator it2 = new ArrayList(this.m.values()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar.f75607e != null) {
                    bVar.f75607e.b();
                }
            }
            d();
            this.f75594f.close();
            this.f75594f = null;
        }
    }

    public final void d() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88240, new Class[0], Void.TYPE);
            return;
        }
        while (this.l > this.f75592d) {
            c((String) this.m.entrySet().iterator().next().getKey());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() throws java.io.IOException {
        /*
            r19 = this;
            r8 = r19
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 88225(0x158a1, float:1.2363E-40)
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a
            r4 = 0
            r5 = 88225(0x158a1, float:1.2363E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.i
            r1.<init>(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            r9.<init>(r1, r2)
            java.lang.String r1 = a((java.io.InputStream) r9)     // Catch:{ all -> 0x0211 }
            java.lang.String r2 = a((java.io.InputStream) r9)     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = a((java.io.InputStream) r9)     // Catch:{ all -> 0x0211 }
            java.lang.String r4 = a((java.io.InputStream) r9)     // Catch:{ all -> 0x0211 }
            java.lang.String r5 = a((java.io.InputStream) r9)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0211 }
            if (r6 == 0) goto L_0x01e0
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0211 }
            if (r6 == 0) goto L_0x01e0
            int r6 = r8.k     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0211 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x01e0
            int r3 = r8.f75593e     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0211 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x01e0
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x01e0
        L_0x007b:
            java.lang.String r10 = a((java.io.InputStream) r9)     // Catch:{ EOFException -> 0x01dc }
            r11 = 1
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ EOFException -> 0x01dc }
            r1[r0] = r10     // Catch:{ EOFException -> 0x01dc }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ EOFException -> 0x01dc }
            r4 = 0
            r5 = 88226(0x158a2, float:1.23631E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r0] = r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ EOFException -> 0x01dc }
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ EOFException -> 0x01dc }
            if (r1 == 0) goto L_0x00b2
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ EOFException -> 0x01dc }
            r1[r0] = r10     // Catch:{ EOFException -> 0x01dc }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ EOFException -> 0x01dc }
            r4 = 0
            r5 = 88226(0x158a2, float:1.23631E-40)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r0] = r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ EOFException -> 0x01dc }
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ EOFException -> 0x01dc }
            goto L_0x007b
        L_0x00b2:
            java.lang.String r1 = " "
            java.lang.String[] r1 = r10.split(r1)     // Catch:{ EOFException -> 0x01dc }
            int r2 = r1.length     // Catch:{ EOFException -> 0x01dc }
            r3 = 2
            if (r2 < r3) goto L_0x01c8
            r2 = r1[r11]     // Catch:{ EOFException -> 0x01dc }
            r4 = r1[r0]     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r5 = "REMOVE"
            boolean r4 = r4.equals(r5)     // Catch:{ EOFException -> 0x01dc }
            if (r4 == 0) goto L_0x00d1
            int r4 = r1.length     // Catch:{ EOFException -> 0x01dc }
            if (r4 != r3) goto L_0x00d1
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r1 = r8.m     // Catch:{ EOFException -> 0x01dc }
            r1.remove(r2)     // Catch:{ EOFException -> 0x01dc }
            goto L_0x007b
        L_0x00d1:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r4 = r8.m     // Catch:{ EOFException -> 0x01dc }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ EOFException -> 0x01dc }
            com.ss.android.ugc.aweme.utils.be$b r4 = (com.ss.android.ugc.aweme.utils.be.b) r4     // Catch:{ EOFException -> 0x01dc }
            if (r4 != 0) goto L_0x00e5
            com.ss.android.ugc.aweme.utils.be$b r4 = new com.ss.android.ugc.aweme.utils.be$b     // Catch:{ EOFException -> 0x01dc }
            r4.<init>(r8, r2, r0)     // Catch:{ EOFException -> 0x01dc }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r5 = r8.m     // Catch:{ EOFException -> 0x01dc }
            r5.put(r2, r4)     // Catch:{ EOFException -> 0x01dc }
        L_0x00e5:
            r2 = r1[r0]     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r5 = "CLEAN"
            boolean r2 = r2.equals(r5)     // Catch:{ EOFException -> 0x01dc }
            if (r2 == 0) goto L_0x018f
            int r2 = r1.length     // Catch:{ EOFException -> 0x01dc }
            int r5 = r8.f75593e     // Catch:{ EOFException -> 0x01dc }
            int r5 = r5 + r3
            if (r2 != r5) goto L_0x018f
            r4.f75606d = r11     // Catch:{ EOFException -> 0x01dc }
            r2 = 0
            r4.f75607e = r2     // Catch:{ EOFException -> 0x01dc }
            int r2 = r1.length     // Catch:{ EOFException -> 0x01dc }
            r5 = 3
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ EOFException -> 0x01dc }
            r12[r0] = r1     // Catch:{ EOFException -> 0x01dc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ EOFException -> 0x01dc }
            r12[r11] = r6     // Catch:{ EOFException -> 0x01dc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ EOFException -> 0x01dc }
            r12[r3] = r6     // Catch:{ EOFException -> 0x01dc }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75589a     // Catch:{ EOFException -> 0x01dc }
            r15 = 1
            r16 = 88219(0x1589b, float:1.23621E-40)
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.Object[]> r7 = java.lang.Object[].class
            r6[r0] = r7     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ EOFException -> 0x01dc }
            r6[r11] = r7     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ EOFException -> 0x01dc }
            r6[r3] = r7     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.Object[]> r18 = java.lang.Object[].class
            r17 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ EOFException -> 0x01dc }
            if (r6 == 0) goto L_0x015b
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ EOFException -> 0x01dc }
            r12[r0] = r1     // Catch:{ EOFException -> 0x01dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ EOFException -> 0x01dc }
            r12[r11] = r1     // Catch:{ EOFException -> 0x01dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ EOFException -> 0x01dc }
            r12[r3] = r1     // Catch:{ EOFException -> 0x01dc }
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75589a     // Catch:{ EOFException -> 0x01dc }
            r15 = 1
            r16 = 88219(0x1589b, float:1.23621E-40)
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            r1[r0] = r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ EOFException -> 0x01dc }
            r1[r11] = r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ EOFException -> 0x01dc }
            r1[r3] = r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class<java.lang.Object[]> r18 = java.lang.Object[].class
            r17 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ EOFException -> 0x01dc }
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch:{ EOFException -> 0x01dc }
            goto L_0x017c
        L_0x015b:
            int r5 = r1.length     // Catch:{ EOFException -> 0x01dc }
            if (r3 > r2) goto L_0x0189
            if (r3 > r5) goto L_0x0183
            int r2 = r2 + -2
            int r5 = r5 + -2
            int r5 = java.lang.Math.min(r2, r5)     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r6 = r1.getClass()     // Catch:{ EOFException -> 0x01dc }
            java.lang.Class r6 = r6.getComponentType()     // Catch:{ EOFException -> 0x01dc }
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r6, r2)     // Catch:{ EOFException -> 0x01dc }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ EOFException -> 0x01dc }
            java.lang.System.arraycopy(r1, r3, r2, r0, r5)     // Catch:{ EOFException -> 0x01dc }
            r1 = r2
        L_0x017c:
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ EOFException -> 0x01dc }
            r4.a((java.lang.String[]) r1)     // Catch:{ EOFException -> 0x01dc }
            goto L_0x007b
        L_0x0183:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch:{ EOFException -> 0x01dc }
            r0.<init>()     // Catch:{ EOFException -> 0x01dc }
            throw r0     // Catch:{ EOFException -> 0x01dc }
        L_0x0189:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ EOFException -> 0x01dc }
            r0.<init>()     // Catch:{ EOFException -> 0x01dc }
            throw r0     // Catch:{ EOFException -> 0x01dc }
        L_0x018f:
            r2 = r1[r0]     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r5 = "DIRTY"
            boolean r2 = r2.equals(r5)     // Catch:{ EOFException -> 0x01dc }
            if (r2 == 0) goto L_0x01a5
            int r2 = r1.length     // Catch:{ EOFException -> 0x01dc }
            if (r2 != r3) goto L_0x01a5
            com.ss.android.ugc.aweme.utils.be$a r1 = new com.ss.android.ugc.aweme.utils.be$a     // Catch:{ EOFException -> 0x01dc }
            r1.<init>(r8, r4, r0)     // Catch:{ EOFException -> 0x01dc }
            r4.f75607e = r1     // Catch:{ EOFException -> 0x01dc }
            goto L_0x007b
        L_0x01a5:
            r2 = r1[r0]     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r4 = "READ"
            boolean r2 = r2.equals(r4)     // Catch:{ EOFException -> 0x01dc }
            if (r2 == 0) goto L_0x01b4
            int r1 = r1.length     // Catch:{ EOFException -> 0x01dc }
            if (r1 != r3) goto L_0x01b4
            goto L_0x007b
        L_0x01b4:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x01dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r2 = "unexpected journal line: "
            r1.<init>(r2)     // Catch:{ EOFException -> 0x01dc }
            r1.append(r10)     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r1 = r1.toString()     // Catch:{ EOFException -> 0x01dc }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x01dc }
            throw r0     // Catch:{ EOFException -> 0x01dc }
        L_0x01c8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x01dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r2 = "unexpected journal line: "
            r1.<init>(r2)     // Catch:{ EOFException -> 0x01dc }
            r1.append(r10)     // Catch:{ EOFException -> 0x01dc }
            java.lang.String r1 = r1.toString()     // Catch:{ EOFException -> 0x01dc }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x01dc }
            throw r0     // Catch:{ EOFException -> 0x01dc }
        L_0x01dc:
            a((java.io.Closeable) r9)
            return
        L_0x01e0:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0211 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = "unexpected journal header: ["
            r3.<init>(r6)     // Catch:{ all -> 0x0211 }
            r3.append(r1)     // Catch:{ all -> 0x0211 }
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch:{ all -> 0x0211 }
            r3.append(r2)     // Catch:{ all -> 0x0211 }
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch:{ all -> 0x0211 }
            r3.append(r4)     // Catch:{ all -> 0x0211 }
            java.lang.String r1 = ", "
            r3.append(r1)     // Catch:{ all -> 0x0211 }
            r3.append(r5)     // Catch:{ all -> 0x0211 }
            java.lang.String r1 = "]"
            r3.append(r1)     // Catch:{ all -> 0x0211 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0211 }
            r0.<init>(r1)     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r0 = move-exception
            a((java.io.Closeable) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.be.f():void");
    }

    public final synchronized void a() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f75589a, false, 88228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75589a, false, 88228, new Class[0], Void.TYPE);
            return;
        }
        if (this.f75594f != null) {
            this.f75594f.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.j), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.k));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f75593e));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (b next : this.m.values()) {
            if (next.f75607e != null) {
                bufferedWriter.write("DIRTY " + next.f75604b + 10);
            } else {
                bufferedWriter.write("CLEAN " + next.f75604b + next.a() + 10);
            }
        }
        bufferedWriter.close();
        this.j.renameTo(this.i);
        this.f75594f = new BufferedWriter(new FileWriter(this.i, true), 8192);
    }

    public static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f75589a, true, 88222, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f75589a, true, 88222, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static String a(InputStream inputStream) throws IOException {
        if (PatchProxy.isSupport(new Object[]{inputStream}, null, f75589a, true, 88221, new Class[]{InputStream.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{inputStream}, null, f75589a, true, 88221, new Class[]{InputStream.class}, String.class);
        }
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i2 = length - 1;
                    if (sb.charAt(i2) == 13) {
                        sb.setLength(i2);
                    }
                }
                return sb.toString();
            }
        }
    }

    private static void b(File file) throws IOException {
        if (PatchProxy.isSupport(new Object[]{file}, null, f75589a, true, 88229, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, null, f75589a, true, 88229, new Class[]{File.class}, Void.TYPE);
        } else if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75589a, false, 88242, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75589a, false, 88242, new Class[]{String.class}, Void.TYPE);
        } else if (str2.contains(" ") || str2.contains("\n") || str2.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str2 + "\"");
        }
    }

    public final a b(String str) throws IOException {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f75589a, false, 88232, new Class[]{String.class}, a.class)) {
            return a(str2, -1);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f75589a, false, 88232, new Class[]{String.class}, a.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c(java.lang.String r11) throws java.io.IOException {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b8 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x00b8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ all -> 0x00b8 }
            r4 = 0
            r5 = 88236(0x158ac, float:1.23645E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00b8 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2     // Catch:{ all -> 0x00b8 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b8 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b8 }
            r1[r9] = r11     // Catch:{ all -> 0x00b8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f75589a     // Catch:{ all -> 0x00b8 }
            r4 = 0
            r5 = 88236(0x158ac, float:1.23645E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00b8 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0     // Catch:{ all -> 0x00b8 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b8 }
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00b8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r10)
            return r0
        L_0x003b:
            r10.h()     // Catch:{ all -> 0x00b8 }
            r10.d(r11)     // Catch:{ all -> 0x00b8 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r1 = r10.m     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ all -> 0x00b8 }
            com.ss.android.ugc.aweme.utils.be$b r1 = (com.ss.android.ugc.aweme.utils.be.b) r1     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x00b6
            com.ss.android.ugc.aweme.utils.be$a r2 = r1.f75607e     // Catch:{ all -> 0x00b8 }
            if (r2 == 0) goto L_0x0050
            goto L_0x00b6
        L_0x0050:
            int r2 = r10.f75593e     // Catch:{ all -> 0x00b8 }
            if (r9 >= r2) goto L_0x0085
            java.io.File r2 = r1.a((int) r9)     // Catch:{ all -> 0x00b8 }
            boolean r3 = r2.delete()     // Catch:{ all -> 0x00b8 }
            if (r3 == 0) goto L_0x0071
            long r2 = r10.l     // Catch:{ all -> 0x00b8 }
            long[] r4 = r1.f75605c     // Catch:{ all -> 0x00b8 }
            r5 = r4[r9]     // Catch:{ all -> 0x00b8 }
            r4 = 0
            long r2 = r2 - r5
            r10.l = r2     // Catch:{ all -> 0x00b8 }
            long[] r2 = r1.f75605c     // Catch:{ all -> 0x00b8 }
            r3 = 0
            r2[r9] = r3     // Catch:{ all -> 0x00b8 }
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0071:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = "failed to delete "
            r1.<init>(r3)     // Catch:{ all -> 0x00b8 }
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x0085:
            int r1 = r10.g     // Catch:{ all -> 0x00b8 }
            int r1 = r1 + r8
            r10.g = r1     // Catch:{ all -> 0x00b8 }
            java.io.Writer r1 = r10.f75594f     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x00b8 }
            r2.append(r11)     // Catch:{ all -> 0x00b8 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b8 }
            r1.append(r2)     // Catch:{ all -> 0x00b8 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.be$b> r1 = r10.m     // Catch:{ all -> 0x00b8 }
            r1.remove(r11)     // Catch:{ all -> 0x00b8 }
            boolean r0 = r10.b()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b4
            java.util.concurrent.ExecutorService r0 = r10.o     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.Callable<java.lang.Void> r1 = r10.p     // Catch:{ all -> 0x00b8 }
            r0.submit(r1)     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            monitor-exit(r10)
            return r8
        L_0x00b6:
            monitor-exit(r10)
            return r9
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.be.c(java.lang.String):boolean");
    }

    private static void a(File file) throws IOException {
        File file2 = file;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f75589a, true, 88223, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file2}, null, f75589a, true, 88223, new Class[]{File.class}, Void.TYPE);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            while (i2 < length) {
                File file3 = listFiles[i2];
                if (file3.isDirectory()) {
                    a(file3);
                }
                if (file3.delete()) {
                    i2++;
                } else {
                    throw new IOException("failed to delete file: " + file3);
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: " + file2);
    }

    public final synchronized c a(String str) throws IOException {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f75589a, false, 88230, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str}, this, f75589a, false, 88230, new Class[]{String.class}, c.class);
        }
        h();
        d(str);
        b bVar = this.m.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f75606d) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f75593e];
        while (i2 < this.f75593e) {
            try {
                inputStreamArr[i2] = new FileInputStream(bVar.a(i2));
                i2++;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.g++;
        this.f75594f.append("READ " + str + 10);
        if (b()) {
            this.o.submit(this.p);
        }
        c cVar = new c(this, str, bVar.f75608f, inputStreamArr, (byte) 0);
        return cVar;
    }

    private synchronized a a(String str, long j2) throws IOException {
        String str2 = str;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{str2, -1L}, this, f75589a, false, 88233, new Class[]{String.class, Long.TYPE}, a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[]{str2, -1L}, this, f75589a, false, 88233, new Class[]{String.class, Long.TYPE}, a.class);
                return aVar;
            }
            h();
            d(str);
            b bVar = this.m.get(str);
            if (bVar == null) {
                bVar = new b(this, str, (byte) 0);
                this.m.put(str, bVar);
            } else if (bVar.f75607e != null) {
                return null;
            }
            a aVar2 = new a(this, bVar, (byte) 0);
            bVar.f75607e = aVar2;
            Writer writer = this.f75594f;
            writer.write("DIRTY " + str + 10);
            this.f75594f.flush();
            return aVar2;
        }
    }

    private be(File file, int i2, int i3, long j2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.o = threadPoolExecutor;
        this.p = new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75595a;

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r9 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f75595a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                    r4 = 0
                    r5 = 88244(0x158b4, float:1.23656E-40)
                    r2 = r9
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0028
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f75595a
                    r5 = 0
                    r6 = 88244(0x158b4, float:1.23656E-40)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
                    r3 = r9
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Void r0 = (java.lang.Void) r0
                    return r0
                L_0x0028:
                    com.ss.android.ugc.aweme.utils.be r1 = com.ss.android.ugc.aweme.utils.be.this
                    monitor-enter(r1)
                    com.ss.android.ugc.aweme.utils.be r2 = com.ss.android.ugc.aweme.utils.be.this     // Catch:{ all -> 0x004c }
                    java.io.Writer r2 = r2.f75594f     // Catch:{ all -> 0x004c }
                    r3 = 0
                    if (r2 != 0) goto L_0x0034
                    monitor-exit(r1)     // Catch:{ all -> 0x004c }
                    return r3
                L_0x0034:
                    com.ss.android.ugc.aweme.utils.be r2 = com.ss.android.ugc.aweme.utils.be.this     // Catch:{ all -> 0x004c }
                    r2.d()     // Catch:{ all -> 0x004c }
                    com.ss.android.ugc.aweme.utils.be r2 = com.ss.android.ugc.aweme.utils.be.this     // Catch:{ all -> 0x004c }
                    boolean r2 = r2.b()     // Catch:{ all -> 0x004c }
                    if (r2 == 0) goto L_0x004a
                    com.ss.android.ugc.aweme.utils.be r2 = com.ss.android.ugc.aweme.utils.be.this     // Catch:{ all -> 0x004c }
                    r2.a()     // Catch:{ all -> 0x004c }
                    com.ss.android.ugc.aweme.utils.be r2 = com.ss.android.ugc.aweme.utils.be.this     // Catch:{ all -> 0x004c }
                    r2.g = r0     // Catch:{ all -> 0x004c }
                L_0x004a:
                    monitor-exit(r1)     // Catch:{ all -> 0x004c }
                    return r3
                L_0x004c:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x004c }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.be.AnonymousClass1.call():java.lang.Void");
            }
        };
        this.f75591c = file;
        this.k = i2;
        this.i = new File(file, "journal");
        this.j = new File(file, "journal.tmp");
        this.f75593e = i3;
        this.f75592d = j2;
    }

    public static be a(File file, int i2, int i3, long j2) throws IOException {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{file, Integer.valueOf(i2), 1, new Long(j3)}, null, f75589a, true, 88224, new Class[]{File.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, be.class)) {
            Object[] objArr = {file, Integer.valueOf(i2), 1, new Long(j3)};
            return (be) PatchProxy.accessDispatch(objArr, null, f75589a, true, 88224, new Class[]{File.class, Integer.TYPE, Integer.TYPE, Long.TYPE}, be.class);
        } else if (j3 > 0) {
            be beVar = new be(file, i2, 1, j2);
            if (beVar.i.exists()) {
                try {
                    beVar.f();
                    beVar.g();
                    beVar.f75594f = new BufferedWriter(new FileWriter(beVar.i, true), 8192);
                    return beVar;
                } catch (IOException unused) {
                    beVar.e();
                }
            }
            file.mkdirs();
            be beVar2 = new be(file, i2, 1, j2);
            beVar2.a();
            return beVar2;
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
