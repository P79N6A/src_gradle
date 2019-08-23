package com.loc;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public final class ad implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f25420a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: e  reason: collision with root package name */
    static ThreadPoolExecutor f25421e;

    /* renamed from: f  reason: collision with root package name */
    static final OutputStream f25422f = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };
    private static final ThreadFactory q = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f25426a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f25426a.getAndIncrement());
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final File f25423b;

    /* renamed from: c  reason: collision with root package name */
    Writer f25424c;

    /* renamed from: d  reason: collision with root package name */
    int f25425d;
    private final File g;
    private final File h;
    private final File i;
    private final int j;
    private long k;
    /* access modifiers changed from: private */
    public final int l;
    private long m;
    private int n = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private final LinkedHashMap<String, c> o = new LinkedHashMap<>(0, 0.75f, true);
    private long p = 0;
    private final Callable<Void> r = new Callable<Void>() {
        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.loc.ad r0 = com.loc.ad.this
                monitor-enter(r0)
                com.loc.ad r1 = com.loc.ad.this     // Catch:{ all -> 0x0025 }
                java.io.Writer r1 = r1.f25424c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000c:
                com.loc.ad r1 = com.loc.ad.this     // Catch:{ all -> 0x0025 }
                r1.d()     // Catch:{ all -> 0x0025 }
                com.loc.ad r1 = com.loc.ad.this     // Catch:{ all -> 0x0025 }
                boolean r1 = r1.b()     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0023
                com.loc.ad r1 = com.loc.ad.this     // Catch:{ all -> 0x0025 }
                r1.a()     // Catch:{ all -> 0x0025 }
                com.loc.ad r1 = com.loc.ad.this     // Catch:{ all -> 0x0025 }
                r3 = 0
                r1.f25425d = r3     // Catch:{ all -> 0x0025 }
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.AnonymousClass2.call():java.lang.Void");
        }
    };

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        final c f25428a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f25429b;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f25431d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f25432e;

        /* renamed from: com.loc.ad$a$a  reason: collision with other inner class name */
        class C0294a extends FilterOutputStream {
            private C0294a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0294a(a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = a.this.f25431d = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = a.this.f25431d = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = a.this.f25431d = true;
                }
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = a.this.f25431d = true;
                }
            }
        }

        private a(c cVar) {
            this.f25428a = cVar;
            this.f25429b = cVar.f25443e ? null : new boolean[ad.this.l];
        }

        /* synthetic */ a(ad adVar, c cVar, byte b2) {
            this(cVar);
        }

        public final void b() throws IOException {
            if (this.f25431d) {
                ad.this.a(this, false);
                ad.this.c(this.f25428a.f25441c);
            } else {
                ad.this.a(this, true);
            }
            this.f25432e = true;
        }

        public final void c() throws IOException {
            ad.this.a(this, false);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream a() throws java.io.IOException {
            /*
                r4 = this;
                com.loc.ad r0 = com.loc.ad.this
                int r0 = r0.l
                if (r0 <= 0) goto L_0x004f
                com.loc.ad r0 = com.loc.ad.this
                monitor-enter(r0)
                com.loc.ad$c r1 = r4.f25428a     // Catch:{ all -> 0x004c }
                com.loc.ad$a r1 = r1.f25444f     // Catch:{ all -> 0x004c }
                if (r1 != r4) goto L_0x0046
                com.loc.ad$c r1 = r4.f25428a     // Catch:{ all -> 0x004c }
                boolean r1 = r1.f25443e     // Catch:{ all -> 0x004c }
                r2 = 0
                if (r1 != 0) goto L_0x0021
                boolean[] r1 = r4.f25429b     // Catch:{ all -> 0x004c }
                r3 = 1
                r1[r2] = r3     // Catch:{ all -> 0x004c }
            L_0x0021:
                com.loc.ad$c r1 = r4.f25428a     // Catch:{ all -> 0x004c }
                java.io.File r1 = r1.b((int) r2)     // Catch:{ all -> 0x004c }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002d }
                r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x002d }
                goto L_0x003b
            L_0x002d:
                com.loc.ad r3 = com.loc.ad.this     // Catch:{ all -> 0x004c }
                java.io.File r3 = r3.f25423b     // Catch:{ all -> 0x004c }
                r3.mkdirs()     // Catch:{ all -> 0x004c }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0042 }
                r3.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0042 }
            L_0x003b:
                com.loc.ad$a$a r1 = new com.loc.ad$a$a     // Catch:{ all -> 0x004c }
                r1.<init>(r4, r3, r2)     // Catch:{ all -> 0x004c }
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return r1
            L_0x0042:
                java.io.OutputStream r1 = com.loc.ad.f25422f     // Catch:{ all -> 0x004c }
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return r1
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004c }
                r1.<init>()     // Catch:{ all -> 0x004c }
                throw r1     // Catch:{ all -> 0x004c }
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x004f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index 0 to be greater than 0 and less than the maximum value count of "
                r1.<init>(r2)
                com.loc.ad r2 = com.loc.ad.this
                int r2 = r2.l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.a.a():java.io.OutputStream");
        }
    }

    public final class b implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        final InputStream[] f25434a;

        /* renamed from: c  reason: collision with root package name */
        private final String f25436c;

        /* renamed from: d  reason: collision with root package name */
        private final long f25437d;

        /* renamed from: e  reason: collision with root package name */
        private final long[] f25438e;

        private b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f25436c = str;
            this.f25437d = j;
            this.f25434a = inputStreamArr;
            this.f25438e = jArr;
        }

        /* synthetic */ b(ad adVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b2) {
            this(str, j, inputStreamArr, jArr);
        }

        public final void close() {
            for (InputStream a2 : this.f25434a) {
                af.a((Closeable) a2);
            }
        }
    }

    final class c {
        /* access modifiers changed from: package-private */

        /* renamed from: a  reason: collision with root package name */
        public long f25439a;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final String f25441c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long[] f25442d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f25443e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public a f25444f;

        private c(String str) {
            this.f25441c = str;
            this.f25442d = new long[ad.this.l];
        }

        /* synthetic */ c(ad adVar, String str, byte b2) {
            this(str);
        }

        private static IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        static /* synthetic */ void a(c cVar, String[] strArr) throws IOException {
            if (strArr.length == ad.this.l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        cVar.f25442d[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw a(strArr);
                    }
                }
                return;
            }
            throw a(strArr);
        }

        public final File a(int i) {
            File b2 = ad.this.f25423b;
            return new File(b2, this.f25441c + ClassUtils.PACKAGE_SEPARATOR + i);
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f25442d) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        public final File b(int i) {
            File b2 = ad.this.f25423b;
            return new File(b2, this.f25441c + ClassUtils.PACKAGE_SEPARATOR + i + ".tmp");
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), q);
        f25421e = threadPoolExecutor;
    }

    private ad(File file, long j2) {
        this.f25423b = file;
        this.j = 1;
        this.g = new File(file, "journal");
        this.h = new File(file, "journal.tmp");
        this.i = new File(file, "journal.bkp");
        this.l = 1;
        this.k = j2;
    }

    public static ad a(File file, long j2) throws IOException {
        if (j2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            ad adVar = new ad(file, j2);
            if (adVar.g.exists()) {
                try {
                    adVar.g();
                    adVar.h();
                    adVar.f25424c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(adVar.g, true), af.f25451a));
                    return adVar;
                } catch (Throwable unused) {
                    adVar.e();
                }
            }
            file.mkdirs();
            ad adVar2 = new ad(file, j2);
            adVar2.a();
            return adVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private synchronized a d(String str) throws IOException {
        i();
        e(str);
        c cVar = this.o.get(str);
        if (cVar == null) {
            cVar = new c(this, str, (byte) 0);
            this.o.put(str, cVar);
        } else if (cVar.f25444f != null) {
            return null;
        }
        a aVar = new a(this, cVar, (byte) 0);
        a unused = cVar.f25444f = aVar;
        Writer writer = this.f25424c;
        writer.write("DIRTY " + str + 10);
        this.f25424c.flush();
        return aVar;
    }

    private static void e(String str) {
        if (!f25420a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private static ThreadPoolExecutor f() {
        try {
            if (f25421e == null || f25421e.isShutdown()) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(256), q);
                f25421e = threadPoolExecutor;
            }
        } catch (Throwable th) {
            com.google.a.a.a.a.a.a.b(th);
        }
        return f25421e;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:48|49|50|51) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r10.f25425d = r2 - r10.o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0100 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0054=Splitter:B:13:0x0054, B:52:0x010d=Splitter:B:52:0x010d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() throws java.io.IOException {
        /*
            r10 = this;
            com.loc.ae r0 = new com.loc.ae
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r10.g
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.loc.af.f25451a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x013e }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x013e }
            java.lang.String r4 = r0.a()     // Catch:{ all -> 0x013e }
            java.lang.String r5 = r0.a()     // Catch:{ all -> 0x013e }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x010d
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x010d
            int r6 = r10.j     // Catch:{ all -> 0x013e }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x013e }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x010d
            int r3 = r10.l     // Catch:{ all -> 0x013e }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x013e }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x010d
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x013e }
            if (r3 == 0) goto L_0x010d
            r1 = 0
            r2 = 0
        L_0x0054:
            java.lang.String r3 = r0.a()     // Catch:{ EOFException -> 0x0100 }
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x0100 }
            r6 = -1
            if (r5 == r6) goto L_0x00f0
            int r7 = r5 + 1
            int r4 = r3.indexOf(r4, r7)     // Catch:{ EOFException -> 0x0100 }
            if (r4 != r6) goto L_0x007e
            java.lang.String r7 = r3.substring(r7)     // Catch:{ EOFException -> 0x0100 }
            r8 = 6
            if (r5 != r8) goto L_0x0082
            java.lang.String r8 = "REMOVE"
            boolean r8 = r3.startsWith(r8)     // Catch:{ EOFException -> 0x0100 }
            if (r8 == 0) goto L_0x0082
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r3 = r10.o     // Catch:{ EOFException -> 0x0100 }
            r3.remove(r7)     // Catch:{ EOFException -> 0x0100 }
            goto L_0x00dc
        L_0x007e:
            java.lang.String r7 = r3.substring(r7, r4)     // Catch:{ EOFException -> 0x0100 }
        L_0x0082:
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r8 = r10.o     // Catch:{ EOFException -> 0x0100 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ EOFException -> 0x0100 }
            com.loc.ad$c r8 = (com.loc.ad.c) r8     // Catch:{ EOFException -> 0x0100 }
            if (r8 != 0) goto L_0x0096
            com.loc.ad$c r8 = new com.loc.ad$c     // Catch:{ EOFException -> 0x0100 }
            r8.<init>(r10, r7, r1)     // Catch:{ EOFException -> 0x0100 }
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r9 = r10.o     // Catch:{ EOFException -> 0x0100 }
            r9.put(r7, r8)     // Catch:{ EOFException -> 0x0100 }
        L_0x0096:
            r7 = 5
            if (r4 == r6) goto L_0x00ba
            if (r5 != r7) goto L_0x00ba
            java.lang.String r9 = "CLEAN"
            boolean r9 = r3.startsWith(r9)     // Catch:{ EOFException -> 0x0100 }
            if (r9 == 0) goto L_0x00ba
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x0100 }
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ EOFException -> 0x0100 }
            boolean unused = r8.f25443e = true     // Catch:{ EOFException -> 0x0100 }
            r4 = 0
            com.loc.ad.a unused = r8.f25444f = r4     // Catch:{ EOFException -> 0x0100 }
            com.loc.ad.c.a((com.loc.ad.c) r8, (java.lang.String[]) r3)     // Catch:{ EOFException -> 0x0100 }
            goto L_0x00dc
        L_0x00ba:
            if (r4 != r6) goto L_0x00cf
            if (r5 != r7) goto L_0x00cf
            java.lang.String r7 = "DIRTY"
            boolean r7 = r3.startsWith(r7)     // Catch:{ EOFException -> 0x0100 }
            if (r7 == 0) goto L_0x00cf
            com.loc.ad$a r3 = new com.loc.ad$a     // Catch:{ EOFException -> 0x0100 }
            r3.<init>(r10, r8, r1)     // Catch:{ EOFException -> 0x0100 }
            com.loc.ad.a unused = r8.f25444f = r3     // Catch:{ EOFException -> 0x0100 }
            goto L_0x00dc
        L_0x00cf:
            if (r4 != r6) goto L_0x00e0
            r4 = 4
            if (r5 != r4) goto L_0x00e0
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch:{ EOFException -> 0x0100 }
            if (r4 == 0) goto L_0x00e0
        L_0x00dc:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x00e0:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0100 }
            java.lang.String r4 = "unexpected journal line: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x0100 }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ EOFException -> 0x0100 }
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0100 }
            throw r1     // Catch:{ EOFException -> 0x0100 }
        L_0x00f0:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0100 }
            java.lang.String r4 = "unexpected journal line: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ EOFException -> 0x0100 }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ EOFException -> 0x0100 }
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0100 }
            throw r1     // Catch:{ EOFException -> 0x0100 }
        L_0x0100:
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r1 = r10.o     // Catch:{ all -> 0x013e }
            int r1 = r1.size()     // Catch:{ all -> 0x013e }
            int r2 = r2 - r1
            r10.f25425d = r2     // Catch:{ all -> 0x013e }
            com.loc.af.a((java.io.Closeable) r0)
            return
        L_0x010d:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r4)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x013e }
            r3.<init>(r1)     // Catch:{ all -> 0x013e }
            throw r3     // Catch:{ all -> 0x013e }
        L_0x013e:
            r1 = move-exception
            com.loc.af.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.g():void");
    }

    private void h() throws IOException {
        a(this.h);
        Iterator<c> it2 = this.o.values().iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            int i2 = 0;
            if (next.f25444f == null) {
                while (i2 < this.l) {
                    this.m += next.f25442d[i2];
                    i2++;
                }
            } else {
                a unused = next.f25444f = null;
                while (i2 < this.l) {
                    a(next.a(i2));
                    a(next.b(i2));
                    i2++;
                }
                it2.remove();
            }
        }
    }

    private void i() {
        if (this.f25424c == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f25425d++;
        r11.f25424c.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (b() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        f().submit(r11.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r3 = new com.loc.ad.b(r11, r12, com.loc.ad.c.f(r0), r8, com.loc.ad.c.c(r0), (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.loc.ad.b a(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.i()     // Catch:{ all -> 0x0086 }
            e(r12)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r0 = r11.o     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0086 }
            com.loc.ad$c r0 = (com.loc.ad.c) r0     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f25443e     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.l     // Catch:{ all -> 0x0086 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0086 }
            r2 = 0
            r3 = 0
        L_0x0022:
            int r4 = r11.l     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0074 }
            java.io.File r5 = r0.a((int) r3)     // Catch:{ FileNotFoundException -> 0x0074 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0074 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.f25425d     // Catch:{ all -> 0x0086 }
            int r1 = r1 + 1
            r11.f25425d = r1     // Catch:{ all -> 0x0086 }
            java.io.Writer r1 = r11.f25424c     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0086 }
            r2.append(r12)     // Catch:{ all -> 0x0086 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0086 }
            r1.append(r2)     // Catch:{ all -> 0x0086 }
            boolean r1 = r11.b()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0061
            java.util.concurrent.ThreadPoolExecutor r1 = f()     // Catch:{ all -> 0x0086 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.r     // Catch:{ all -> 0x0086 }
            r1.submit(r2)     // Catch:{ all -> 0x0086 }
        L_0x0061:
            com.loc.ad$b r1 = new com.loc.ad$b     // Catch:{ all -> 0x0086 }
            long r6 = r0.f25439a     // Catch:{ all -> 0x0086 }
            long[] r9 = r0.f25442d     // Catch:{ all -> 0x0086 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0086 }
            monitor-exit(r11)
            return r1
        L_0x0074:
            int r12 = r11.l     // Catch:{ all -> 0x0086 }
            if (r2 >= r12) goto L_0x0084
            r12 = r8[r2]     // Catch:{ all -> 0x0086 }
            if (r12 == 0) goto L_0x0084
            r12 = r8[r2]     // Catch:{ all -> 0x0086 }
            com.loc.af.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0086 }
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0084:
            monitor-exit(r11)
            return r1
        L_0x0086:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.a(java.lang.String):com.loc.ad$b");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void a() throws IOException {
        String str;
        if (this.f25424c != null) {
            this.f25424c.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h), af.f25451a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.l));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c b2 : this.o.values()) {
                if (b2.f25444f != null) {
                    str = "DIRTY " + b2.f25441c + 10;
                } else {
                    str = "CLEAN " + b2.f25441c + b2.a() + 10;
                }
                bufferedWriter.write(str);
            }
            bufferedWriter.close();
            if (this.g.exists()) {
                a(this.g, this.i, true);
            }
            a(this.h, this.g, false);
            this.i.delete();
            this.f25424c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g, true), af.f25451a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final void a(int i2) {
        if (i2 < 10) {
            i2 = 10;
        } else if (i2 > 10000) {
            i2 = 10000;
        }
        this.n = i2;
    }

    public final a b(String str) throws IOException {
        return d(str);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f25425d >= 2000 && this.f25425d >= this.o.size();
    }

    public final synchronized void c() throws IOException {
        i();
        d();
        this.f25424c.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.i()     // Catch:{ all -> 0x008b }
            e(r8)     // Catch:{ all -> 0x008b }
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r0 = r7.o     // Catch:{ all -> 0x008b }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008b }
            com.loc.ad$c r0 = (com.loc.ad.c) r0     // Catch:{ all -> 0x008b }
            r1 = 0
            if (r0 == 0) goto L_0x0089
            com.loc.ad$a r2 = r0.f25444f     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0019
            goto L_0x0089
        L_0x0019:
            int r2 = r7.l     // Catch:{ all -> 0x008b }
            if (r1 >= r2) goto L_0x0055
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x008b }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x003e
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002e
            goto L_0x003e
        L_0x002e:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "failed to delete "
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x008b }
            r8.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r8     // Catch:{ all -> 0x008b }
        L_0x003e:
            long r2 = r7.m     // Catch:{ all -> 0x008b }
            long[] r4 = r0.f25442d     // Catch:{ all -> 0x008b }
            r5 = r4[r1]     // Catch:{ all -> 0x008b }
            r4 = 0
            long r2 = r2 - r5
            r7.m = r2     // Catch:{ all -> 0x008b }
            long[] r2 = r0.f25442d     // Catch:{ all -> 0x008b }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008b }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0055:
            int r0 = r7.f25425d     // Catch:{ all -> 0x008b }
            r1 = 1
            int r0 = r0 + r1
            r7.f25425d = r0     // Catch:{ all -> 0x008b }
            java.io.Writer r0 = r7.f25424c     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008b }
            r2.append(r8)     // Catch:{ all -> 0x008b }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008b }
            r0.append(r2)     // Catch:{ all -> 0x008b }
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r0 = r7.o     // Catch:{ all -> 0x008b }
            r0.remove(r8)     // Catch:{ all -> 0x008b }
            boolean r8 = r7.b()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x0087
            java.util.concurrent.ThreadPoolExecutor r8 = f()     // Catch:{ all -> 0x008b }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.r     // Catch:{ all -> 0x008b }
            r8.submit(r0)     // Catch:{ all -> 0x008b }
        L_0x0087:
            monitor-exit(r7)
            return r1
        L_0x0089:
            monitor-exit(r7)
            return r1
        L_0x008b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.c(java.lang.String):boolean");
    }

    public final synchronized void close() throws IOException {
        if (this.f25424c != null) {
            Iterator it2 = new ArrayList(this.o.values()).iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                if (cVar.f25444f != null) {
                    cVar.f25444f.c();
                }
            }
            d();
            this.f25424c.close();
            this.f25424c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void d() throws IOException {
        while (true) {
            if (this.m > this.k || this.o.size() > this.n) {
                c((String) this.o.entrySet().iterator().next().getKey());
            } else {
                return;
            }
        }
    }

    public final void e() throws IOException {
        close();
        af.a(this.f25423b);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.loc.ad.a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.loc.ad$c r0 = r10.f25428a     // Catch:{ all -> 0x0101 }
            com.loc.ad$a r1 = r0.f25444f     // Catch:{ all -> 0x0101 }
            if (r1 != r10) goto L_0x00fb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f25443e     // Catch:{ all -> 0x0101 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x0013:
            int r3 = r9.l     // Catch:{ all -> 0x0101 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f25429b     // Catch:{ all -> 0x0101 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0101 }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.b((int) r2)     // Catch:{ all -> 0x0101 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0101 }
            if (r3 != 0) goto L_0x002c
            r10.c()     // Catch:{ all -> 0x0101 }
            monitor-exit(r9)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x002f:
            r10.c()     // Catch:{ all -> 0x0101 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = r11.concat(r0)     // Catch:{ all -> 0x0101 }
            r10.<init>(r11)     // Catch:{ all -> 0x0101 }
            throw r10     // Catch:{ all -> 0x0101 }
        L_0x0042:
            int r10 = r9.l     // Catch:{ all -> 0x0101 }
            if (r1 >= r10) goto L_0x0077
            java.io.File r10 = r0.b((int) r1)     // Catch:{ all -> 0x0101 }
            if (r11 == 0) goto L_0x0071
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x0074
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x0101 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0101 }
            long[] r10 = r0.f25442d     // Catch:{ all -> 0x0101 }
            r3 = r10[r1]     // Catch:{ all -> 0x0101 }
            long r5 = r2.length()     // Catch:{ all -> 0x0101 }
            long[] r10 = r0.f25442d     // Catch:{ all -> 0x0101 }
            r10[r1] = r5     // Catch:{ all -> 0x0101 }
            long r7 = r9.m     // Catch:{ all -> 0x0101 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.m = r7     // Catch:{ all -> 0x0101 }
            goto L_0x0074
        L_0x0071:
            a((java.io.File) r10)     // Catch:{ all -> 0x0101 }
        L_0x0074:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0077:
            int r10 = r9.f25425d     // Catch:{ all -> 0x0101 }
            int r10 = r10 + 1
            r9.f25425d = r10     // Catch:{ all -> 0x0101 }
            r10 = 0
            com.loc.ad.a unused = r0.f25444f = r10     // Catch:{ all -> 0x0101 }
            boolean r10 = r0.f25443e     // Catch:{ all -> 0x0101 }
            r10 = r10 | r11
            r1 = 10
            if (r10 == 0) goto L_0x00ba
            boolean unused = r0.f25443e = true     // Catch:{ all -> 0x0101 }
            java.io.Writer r10 = r9.f25424c     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = "CLEAN "
            r2.<init>(r3)     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = r0.f25441c     // Catch:{ all -> 0x0101 }
            r2.append(r3)     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x0101 }
            r2.append(r3)     // Catch:{ all -> 0x0101 }
            r2.append(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0101 }
            r10.write(r1)     // Catch:{ all -> 0x0101 }
            if (r11 == 0) goto L_0x00dd
            long r10 = r9.p     // Catch:{ all -> 0x0101 }
            r1 = 1
            long r1 = r1 + r10
            r9.p = r1     // Catch:{ all -> 0x0101 }
            r0.f25439a = r10     // Catch:{ all -> 0x0101 }
            goto L_0x00dd
        L_0x00ba:
            java.util.LinkedHashMap<java.lang.String, com.loc.ad$c> r10 = r9.o     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = r0.f25441c     // Catch:{ all -> 0x0101 }
            r10.remove(r11)     // Catch:{ all -> 0x0101 }
            java.io.Writer r10 = r9.f25424c     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = "REMOVE "
            r11.<init>(r2)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = r0.f25441c     // Catch:{ all -> 0x0101 }
            r11.append(r0)     // Catch:{ all -> 0x0101 }
            r11.append(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0101 }
            r10.write(r11)     // Catch:{ all -> 0x0101 }
        L_0x00dd:
            java.io.Writer r10 = r9.f25424c     // Catch:{ all -> 0x0101 }
            r10.flush()     // Catch:{ all -> 0x0101 }
            long r10 = r9.m     // Catch:{ all -> 0x0101 }
            long r0 = r9.k     // Catch:{ all -> 0x0101 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00f0
            boolean r10 = r9.b()     // Catch:{ all -> 0x0101 }
            if (r10 == 0) goto L_0x00f9
        L_0x00f0:
            java.util.concurrent.ThreadPoolExecutor r10 = f()     // Catch:{ all -> 0x0101 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.r     // Catch:{ all -> 0x0101 }
            r10.submit(r11)     // Catch:{ all -> 0x0101 }
        L_0x00f9:
            monitor-exit(r9)
            return
        L_0x00fb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0101 }
            r10.<init>()     // Catch:{ all -> 0x0101 }
            throw r10     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ad.a(com.loc.ad$a, boolean):void");
    }
}
