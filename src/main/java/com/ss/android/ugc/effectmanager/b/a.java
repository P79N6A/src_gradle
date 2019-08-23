package com.ss.android.ugc.effectmanager.b;

import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f77218a = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream h = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final File f77219b;

    /* renamed from: c  reason: collision with root package name */
    public final int f77220c;

    /* renamed from: d  reason: collision with root package name */
    public int f77221d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f77222e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f77223f;
    final ThreadPoolExecutor g;
    private final File i;
    private final File j;
    private final File k;
    private final int l;
    private long m;
    private long n;
    private Writer o;
    private final LinkedHashMap<String, b> p = new LinkedHashMap<>(0, 0.75f, true);
    private long q = 0;
    private final Callable<Void> r;

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$a  reason: collision with other inner class name */
    public final class C0807a {

        /* renamed from: a  reason: collision with root package name */
        public final b f77225a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f77226b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f77227c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f77228d;

        /* renamed from: com.ss.android.ugc.effectmanager.b.a$a$a  reason: collision with other inner class name */
        class C0808a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0807a.this.f77227c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0807a.this.f77227c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0807a.this.f77227c = true;
                }
            }

            private C0808a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0808a(C0807a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0807a.this.f77227c = true;
                }
            }
        }

        public final void a() throws IOException {
            a.this.a(this, false);
        }

        public final void b() {
            if (!this.f77228d) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.b.a r4 = com.ss.android.ugc.effectmanager.b.a.this
                int r4 = r4.f77220c
                r0 = 0
                if (r4 <= 0) goto L_0x0047
                com.ss.android.ugc.effectmanager.b.a r4 = com.ss.android.ugc.effectmanager.b.a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f77225a     // Catch:{ all -> 0x0044 }
                com.ss.android.ugc.effectmanager.b.a$a r1 = r1.f77234d     // Catch:{ all -> 0x0044 }
                if (r1 != r3) goto L_0x003e
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f77225a     // Catch:{ all -> 0x0044 }
                boolean r1 = r1.f77233c     // Catch:{ all -> 0x0044 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f77226b     // Catch:{ all -> 0x0044 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0044 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f77225a     // Catch:{ all -> 0x0044 }
                java.io.File r1 = r1.b((int) r0)     // Catch:{ all -> 0x0044 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.b.a r2 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x0044 }
                java.io.File r2 = r2.f77219b     // Catch:{ all -> 0x0044 }
                r2.mkdirs()     // Catch:{ all -> 0x0044 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003a }
                r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x003a }
            L_0x0033:
                com.ss.android.ugc.effectmanager.b.a$a$a r1 = new com.ss.android.ugc.effectmanager.b.a$a$a     // Catch:{ all -> 0x0044 }
                r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x0044 }
                monitor-exit(r4)     // Catch:{ all -> 0x0044 }
                return r1
            L_0x003a:
                java.io.OutputStream r0 = com.ss.android.ugc.effectmanager.b.a.h     // Catch:{ all -> 0x0044 }
                monitor-exit(r4)     // Catch:{ all -> 0x0044 }
                return r0
            L_0x003e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0044 }
                r0.<init>()     // Catch:{ all -> 0x0044 }
                throw r0     // Catch:{ all -> 0x0044 }
            L_0x0044:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0044 }
                throw r0
            L_0x0047:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r0)
                com.ss.android.ugc.effectmanager.b.a r0 = com.ss.android.ugc.effectmanager.b.a.this
                int r0 = r0.f77220c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.C0807a.a(int):java.io.OutputStream");
        }

        private C0807a(b bVar) {
            boolean[] zArr;
            this.f77225a = bVar;
            if (bVar.f77233c) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f77220c];
            }
            this.f77226b = zArr;
        }

        /* synthetic */ C0807a(a aVar, b bVar, byte b2) {
            this(bVar);
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f77231a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f77232b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f77233c;

        /* renamed from: d  reason: collision with root package name */
        public C0807a f77234d;

        /* renamed from: e  reason: collision with root package name */
        public long f77235e;

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f77232b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            File file = a.this.f77219b;
            return new File(file, this.f77231a + ClassUtils.PACKAGE_SEPARATOR + i);
        }

        public final File b(int i) {
            File file = a.this.f77219b;
            return new File(file, this.f77231a + ClassUtils.PACKAGE_SEPARATOR + i + ".tmp");
        }

        public final void a(String[] strArr) throws IOException {
            if (strArr.length == a.this.f77220c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f77232b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        private b(String str) {
            this.f77231a = str;
            this.f77232b = new long[a.this.f77220c];
        }

        /* synthetic */ b(a aVar, String str, byte b2) {
            this(str);
        }
    }

    public final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f77237a;

        /* renamed from: c  reason: collision with root package name */
        private final String f77239c;

        /* renamed from: d  reason: collision with root package name */
        private final long f77240d;

        /* renamed from: e  reason: collision with root package name */
        private final InputStream[] f77241e;

        /* renamed from: f  reason: collision with root package name */
        private final long[] f77242f;

        public final void close() {
            for (InputStream a2 : this.f77241e) {
                c.a((Closeable) a2);
            }
        }

        private c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f77239c = str;
            this.f77240d = j;
            this.f77237a = fileArr;
            this.f77241e = inputStreamArr;
            this.f77242f = jArr;
        }

        /* synthetic */ c(a aVar, String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, byte b2) {
            this(str, j, fileArr, inputStreamArr, jArr);
        }
    }

    private synchronized boolean h() {
        return this.f77223f;
    }

    private void i() {
        if (h()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean b() {
        if (this.f77221d < 2000 || this.f77221d < this.p.size()) {
            return false;
        }
        return true;
    }

    public final Set<String> d() throws IOException {
        Set<String> unmodifiableSet;
        synchronized (this) {
            e();
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.p.keySet()));
        }
        return unmodifiableSet;
    }

    private void g() throws IOException {
        a(this.j);
        Iterator<b> it2 = this.p.values().iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            int i2 = 0;
            if (next.f77234d == null) {
                while (i2 < this.f77220c) {
                    this.n += next.f77232b[i2];
                    i2++;
                }
            } else {
                next.f77234d = null;
                while (i2 < this.f77220c) {
                    a(next.a(i2));
                    a(next.b(i2));
                    i2++;
                }
                it2.remove();
            }
        }
    }

    public final void c() throws IOException {
        while (this.n > this.m) {
            b((String) this.p.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f77222e) {
            if (!this.f77223f) {
                Iterator it2 = new ArrayList(this.p.values()).iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    if (bVar.f77234d != null) {
                        bVar.f77234d.a();
                    }
                }
                c();
                this.o.close();
                this.o = null;
                this.f77223f = true;
                return;
            }
        }
        this.f77223f = true;
    }

    private synchronized void e() throws IOException {
        if (!this.f77222e) {
            if (this.k.exists()) {
                if (!this.i.exists()) {
                    a(this.k, this.i, false);
                } else if (this.k.delete()) {
                    if (this.k.exists()) {
                        throw new IOException("failed to delete " + this.k);
                    }
                }
            }
            if (this.i.exists()) {
                try {
                    f();
                    g();
                    this.f77222e = true;
                    return;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + this.f77219b + " is corrupt: " + e2.getMessage() + ", removing");
                    close();
                    c.a(this.f77219b);
                    this.f77223f = false;
                } catch (Throwable th) {
                    this.f77223f = false;
                    throw th;
                }
            }
            a();
            this.f77222e = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:49|50|(1:52)|(1:54)(1:55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.f77221d = r2 - r11.p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        if (r0.f77244b == -1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r1 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0116, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r11.o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r11.i, true), com.ss.android.ugc.effectmanager.b.c.f77249a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0106 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0133=Splitter:B:58:0x0133, B:14:0x0056=Splitter:B:14:0x0056} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() throws java.io.IOException {
        /*
            r11 = this;
            com.ss.android.ugc.effectmanager.b.b r0 = new com.ss.android.ugc.effectmanager.b.b
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r11.i
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.ss.android.ugc.effectmanager.b.c.f77249a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r4 = r0.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = r0.a()     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0133
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0133
            int r6 = r11.l     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0164 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            int r3 = r11.f77220c     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0164 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            r1 = 0
            r2 = 0
        L_0x0054:
            r3 = 1
            r4 = -1
            java.lang.String r5 = r0.a()     // Catch:{ EOFException -> 0x0106 }
            r6 = 32
            int r7 = r5.indexOf(r6)     // Catch:{ EOFException -> 0x0106 }
            if (r7 == r4) goto L_0x00f2
            int r8 = r7 + 1
            int r6 = r5.indexOf(r6, r8)     // Catch:{ EOFException -> 0x0106 }
            if (r6 != r4) goto L_0x007f
            java.lang.String r8 = r5.substring(r8)     // Catch:{ EOFException -> 0x0106 }
            r9 = 6
            if (r7 != r9) goto L_0x0083
            java.lang.String r9 = "REMOVE"
            boolean r9 = r5.startsWith(r9)     // Catch:{ EOFException -> 0x0106 }
            if (r9 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r5 = r11.p     // Catch:{ EOFException -> 0x0106 }
            r5.remove(r8)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x007f:
            java.lang.String r8 = r5.substring(r8, r6)     // Catch:{ EOFException -> 0x0106 }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r9 = r11.p     // Catch:{ EOFException -> 0x0106 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x0106 }
            com.ss.android.ugc.effectmanager.b.a$b r9 = (com.ss.android.ugc.effectmanager.b.a.b) r9     // Catch:{ EOFException -> 0x0106 }
            if (r9 != 0) goto L_0x0097
            com.ss.android.ugc.effectmanager.b.a$b r9 = new com.ss.android.ugc.effectmanager.b.a$b     // Catch:{ EOFException -> 0x0106 }
            r9.<init>(r11, r8, r1)     // Catch:{ EOFException -> 0x0106 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r10 = r11.p     // Catch:{ EOFException -> 0x0106 }
            r10.put(r8, r9)     // Catch:{ EOFException -> 0x0106 }
        L_0x0097:
            r8 = 5
            if (r6 == r4) goto L_0x00b9
            if (r7 != r8) goto L_0x00b9
            java.lang.String r10 = "CLEAN"
            boolean r10 = r5.startsWith(r10)     // Catch:{ EOFException -> 0x0106 }
            if (r10 == 0) goto L_0x00b9
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r6 = " "
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ EOFException -> 0x0106 }
            r9.f77233c = r3     // Catch:{ EOFException -> 0x0106 }
            r6 = 0
            r9.f77234d = r6     // Catch:{ EOFException -> 0x0106 }
            r9.a((java.lang.String[]) r5)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00b9:
            if (r6 != r4) goto L_0x00cd
            if (r7 != r8) goto L_0x00cd
            java.lang.String r8 = "DIRTY"
            boolean r8 = r5.startsWith(r8)     // Catch:{ EOFException -> 0x0106 }
            if (r8 == 0) goto L_0x00cd
            com.ss.android.ugc.effectmanager.b.a$a r5 = new com.ss.android.ugc.effectmanager.b.a$a     // Catch:{ EOFException -> 0x0106 }
            r5.<init>(r11, r9, r1)     // Catch:{ EOFException -> 0x0106 }
            r9.f77234d = r5     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00cd:
            if (r6 != r4) goto L_0x00de
            r6 = 4
            if (r7 != r6) goto L_0x00de
            java.lang.String r6 = "READ"
            boolean r6 = r5.startsWith(r6)     // Catch:{ EOFException -> 0x0106 }
            if (r6 == 0) goto L_0x00de
        L_0x00da:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x00de:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r8 = "unexpected journal line: "
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x00f2:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r8 = "unexpected journal line: "
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x0106:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r5 = r11.p     // Catch:{ all -> 0x0164 }
            int r5 = r5.size()     // Catch:{ all -> 0x0164 }
            int r2 = r2 - r5
            r11.f77221d = r2     // Catch:{ all -> 0x0164 }
            int r2 = r0.f77244b     // Catch:{ all -> 0x0164 }
            if (r2 != r4) goto L_0x0114
            r1 = 1
        L_0x0114:
            if (r1 == 0) goto L_0x011a
            r11.a()     // Catch:{ all -> 0x0164 }
            goto L_0x012f
        L_0x011a:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0164 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0164 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0164 }
            java.io.File r5 = r11.i     // Catch:{ all -> 0x0164 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0164 }
            java.nio.charset.Charset r3 = com.ss.android.ugc.effectmanager.b.c.f77249a     // Catch:{ all -> 0x0164 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0164 }
            r1.<init>(r2)     // Catch:{ all -> 0x0164 }
            r11.o = r1     // Catch:{ all -> 0x0164 }
        L_0x012f:
            com.ss.android.ugc.effectmanager.b.c.a((java.io.Closeable) r0)
            return
        L_0x0133:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0164 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x0164 }
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r2)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r4)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r5)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0164 }
            r3.<init>(r1)     // Catch:{ all -> 0x0164 }
            throw r3     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r1 = move-exception
            com.ss.android.ugc.effectmanager.b.c.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.f():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(1:4)|5|6|7|8|9|10|(8:11|12|(4:15|(2:17|34)(2:18|35)|33|13)|19|20|(1:22)|23|24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.o     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x000a
            java.io.Writer r0 = r6.o     // Catch:{ all -> 0x00f0 }
            r0.close()     // Catch:{ all -> 0x00f0 }
        L_0x000a:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0012 }
            java.io.File r1 = r6.j     // Catch:{ FileNotFoundException -> 0x0012 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0012 }
            goto L_0x0022
        L_0x0012:
            java.io.File r0 = r6.j     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ all -> 0x00f0 }
            r0.mkdirs()     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r1 = r6.j     // Catch:{ all -> 0x00f0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x0022:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r3 = com.ss.android.ugc.effectmanager.b.c.f77249a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "1"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.l     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.f77220c     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r6.p     // Catch:{ all -> 0x00eb }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00eb }
        L_0x006d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$b r2 = (com.ss.android.ugc.effectmanager.b.a.b) r2     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$a r3 = r2.f77234d     // Catch:{ all -> 0x00eb }
            r4 = 10
            if (r3 == 0) goto L_0x0096
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DIRTY "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.f77231a     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x0096:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "CLEAN "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = r2.f77231a     // Catch:{ all -> 0x00eb }
            r3.append(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x00b4:
            r1.close()     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.i     // Catch:{ all -> 0x00f0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00f0 }
            r1 = 1
            if (r0 == 0) goto L_0x00c7
            java.io.File r0 = r6.i     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.k     // Catch:{ all -> 0x00f0 }
            a(r0, r2, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00c7:
            java.io.File r0 = r6.j     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.i     // Catch:{ all -> 0x00f0 }
            r3 = 0
            a(r0, r2, r3)     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.k     // Catch:{ all -> 0x00f0 }
            r0.delete()     // Catch:{ all -> 0x00f0 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r4 = r6.i     // Catch:{ all -> 0x00f0 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r1 = com.ss.android.ugc.effectmanager.b.c.f77249a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00f0 }
            r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
            r6.o = r0     // Catch:{ all -> 0x00f0 }
            monitor-exit(r6)
            return
        L_0x00eb:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.a():void");
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void c(String str) {
        if (!f77218a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.f77221d++;
        r12.o.append("READ " + r13 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (b() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r12.g.submit(r12.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r3 = new com.ss.android.ugc.effectmanager.b.a.c(r12, r13, r0.f77235e, r8, r9, r0.f77232b, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.ugc.effectmanager.b.a.c a(java.lang.String r13) throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.e()     // Catch:{ all -> 0x0089 }
            r12.i()     // Catch:{ all -> 0x0089 }
            c(r13)     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r12.p     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0089 }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.ss.android.ugc.effectmanager.b.a.b) r0     // Catch:{ all -> 0x0089 }
            r1 = 0
            if (r0 != 0) goto L_0x0017
            monitor-exit(r12)
            return r1
        L_0x0017:
            boolean r2 = r0.f77233c     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r12)
            return r1
        L_0x001d:
            int r2 = r12.f77220c     // Catch:{ all -> 0x0089 }
            java.io.InputStream[] r9 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0089 }
            int r2 = r12.f77220c     // Catch:{ all -> 0x0089 }
            java.io.File[] r8 = new java.io.File[r2]     // Catch:{ all -> 0x0089 }
            r2 = 0
            r3 = 0
        L_0x0027:
            int r4 = r12.f77220c     // Catch:{ FileNotFoundException -> 0x0077 }
            if (r3 >= r4) goto L_0x003d
            java.io.File r4 = r0.a((int) r3)     // Catch:{ FileNotFoundException -> 0x0077 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0077 }
            r5 = r8[r3]     // Catch:{ FileNotFoundException -> 0x0077 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0077 }
            r9[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x0027
        L_0x003d:
            int r1 = r12.f77221d     // Catch:{ all -> 0x0089 }
            int r1 = r1 + 1
            r12.f77221d = r1     // Catch:{ all -> 0x0089 }
            java.io.Writer r1 = r12.o     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0089 }
            r2.append(r13)     // Catch:{ all -> 0x0089 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0089 }
            r1.append(r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = r12.b()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0068
            java.util.concurrent.ThreadPoolExecutor r1 = r12.g     // Catch:{ all -> 0x0089 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r12.r     // Catch:{ all -> 0x0089 }
            r1.submit(r2)     // Catch:{ all -> 0x0089 }
        L_0x0068:
            com.ss.android.ugc.effectmanager.b.a$c r1 = new com.ss.android.ugc.effectmanager.b.a$c     // Catch:{ all -> 0x0089 }
            long r6 = r0.f77235e     // Catch:{ all -> 0x0089 }
            long[] r10 = r0.f77232b     // Catch:{ all -> 0x0089 }
            r11 = 0
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r8, r9, r10, r11)     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)
            return r1
        L_0x0077:
            int r13 = r12.f77220c     // Catch:{ all -> 0x0089 }
            if (r2 >= r13) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            if (r13 == 0) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            com.ss.android.ugc.effectmanager.b.c.a((java.io.Closeable) r13)     // Catch:{ all -> 0x0089 }
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0087:
            monitor-exit(r12)
            return r1
        L_0x0089:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.a(java.lang.String):com.ss.android.ugc.effectmanager.b.a$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.e()     // Catch:{ all -> 0x008a }
            r7.i()     // Catch:{ all -> 0x008a }
            c(r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.p     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.ss.android.ugc.effectmanager.b.a.b) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.b.a$a r2 = r0.f77234d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x001a
            goto L_0x0088
        L_0x001a:
            int r2 = r7.f77220c     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0056
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.n     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f77232b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            r4 = 0
            long r2 = r2 - r5
            r7.n = r2     // Catch:{ all -> 0x008a }
            long[] r2 = r0.f77232b     // Catch:{ all -> 0x008a }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0056:
            int r0 = r7.f77221d     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f77221d = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.o     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.p     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.b()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.g     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.r     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.b(java.lang.String):boolean");
    }

    public final synchronized C0807a a(String str, long j2) throws IOException {
        e();
        i();
        c(str);
        b bVar = this.p.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.p.put(str, bVar);
        } else if (bVar.f77234d != null) {
            return null;
        }
        C0807a aVar = new C0807a(this, bVar, (byte) 0);
        bVar.f77234d = aVar;
        Writer writer = this.o;
        writer.write("DIRTY " + str + 10);
        this.o.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.effectmanager.b.a.C0807a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.b.a$b r0 = r10.f77225a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.b.a$a r1 = r0.f77234d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f77233c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f77220c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f77226b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.b((int) r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.a()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.a()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f77220c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.b((int) r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f77232b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f77232b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.n     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.n = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            a((java.io.File) r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f77221d     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f77221d = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f77234d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f77233c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f77233c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f77231a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.q     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.q = r1     // Catch:{ all -> 0x00f1 }
            r0.f77235e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r10 = r9.p     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f77231a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f77231a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.o     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.n     // Catch:{ all -> 0x00f1 }
            long r0 = r9.m     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.g     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.r     // Catch:{ all -> 0x00f1 }
            r10.submit(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00e9:
            monitor-exit(r9)
            return
        L_0x00eb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            r10.<init>()     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.a(com.ss.android.ugc.effectmanager.b.a$a, boolean):void");
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public a(File file, int i2, int i3, long j2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.g = threadPoolExecutor;
        this.r = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.b.a r0 = com.ss.android.ugc.effectmanager.b.a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.b.a r1 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.f77222e     // Catch:{ all -> 0x002c }
                    r1 = r1 ^ 1
                    com.ss.android.ugc.effectmanager.b.a r2 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    boolean r2 = r2.f77223f     // Catch:{ all -> 0x002c }
                    r1 = r1 | r2
                    r2 = 0
                    if (r1 == 0) goto L_0x0013
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x0013:
                    com.ss.android.ugc.effectmanager.b.a r1 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    r1.c()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.b()     // Catch:{ all -> 0x002c }
                    if (r1 == 0) goto L_0x002a
                    com.ss.android.ugc.effectmanager.b.a r1 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    r1.a()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ all -> 0x002c }
                    r3 = 0
                    r1.f77221d = r3     // Catch:{ all -> 0x002c }
                L_0x002a:
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x002c:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.b.a.AnonymousClass1.call():java.lang.Void");
            }
        };
        this.f77219b = file;
        this.l = i2;
        this.i = new File(file, "journal");
        this.j = new File(file, "journal.tmp");
        this.k = new File(file, "journal.bkp");
        this.f77220c = i3;
        this.m = j2;
    }
}
