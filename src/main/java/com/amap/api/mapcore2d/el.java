package com.amap.api.mapcore2d;

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

public final class el implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f6040a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: b  reason: collision with root package name */
    static ThreadPoolExecutor f6041b;
    private static final ThreadFactory q = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6046a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "disklrucache#" + this.f6046a.getAndIncrement());
        }
    };
    /* access modifiers changed from: private */
    public static final OutputStream s = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final File f6042c;

    /* renamed from: d  reason: collision with root package name */
    private final File f6043d;

    /* renamed from: e  reason: collision with root package name */
    private final File f6044e;

    /* renamed from: f  reason: collision with root package name */
    private final File f6045f;
    private final int g;
    private long h;
    /* access modifiers changed from: private */
    public final int i;
    private long j;
    /* access modifiers changed from: private */
    public Writer k;
    private int l = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private final LinkedHashMap<String, c> m = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */
    public int n;
    private em o;
    private long p = 0;
    private final Callable<Void> r = new Callable<Void>() {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.amap.api.mapcore2d.el r0 = com.amap.api.mapcore2d.el.this
                monitor-enter(r0)
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.k     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0028 }
                r1.m()     // Catch:{ all -> 0x0028 }
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.k()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0028 }
                r1.j()     // Catch:{ all -> 0x0028 }
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.n = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.AnonymousClass2.call():java.lang.Void");
        }
    };

    public final class a {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final c f6049b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f6050c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f6051d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6052e;

        /* renamed from: com.amap.api.mapcore2d.el$a$a  reason: collision with other inner class name */
        class C0045a extends FilterOutputStream {
            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = a.this.f6051d = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = a.this.f6051d = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = a.this.f6051d = true;
                }
            }

            private C0045a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = a.this.f6051d = true;
                }
            }
        }

        public final void b() throws IOException {
            el.this.a(this, false);
        }

        public final void a() throws IOException {
            if (this.f6051d) {
                el.this.a(this, false);
                el.this.c(this.f6049b.f6060b);
            } else {
                el.this.a(this, true);
            }
            this.f6052e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                if (r4 < 0) goto L_0x0053
                com.amap.api.mapcore2d.el r0 = com.amap.api.mapcore2d.el.this
                int r0 = r0.i
                if (r4 >= r0) goto L_0x0053
                com.amap.api.mapcore2d.el r0 = com.amap.api.mapcore2d.el.this
                monitor-enter(r0)
                com.amap.api.mapcore2d.el$c r1 = r3.f6049b     // Catch:{ all -> 0x0050 }
                com.amap.api.mapcore2d.el$a r1 = r1.f6063e     // Catch:{ all -> 0x0050 }
                if (r1 != r3) goto L_0x004a
                com.amap.api.mapcore2d.el$c r1 = r3.f6049b     // Catch:{ all -> 0x0050 }
                boolean r1 = r1.f6062d     // Catch:{ all -> 0x0050 }
                if (r1 != 0) goto L_0x0022
                boolean[] r1 = r3.f6050c     // Catch:{ all -> 0x0050 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0050 }
            L_0x0022:
                com.amap.api.mapcore2d.el$c r1 = r3.f6049b     // Catch:{ all -> 0x0050 }
                java.io.File r4 = r1.b((int) r4)     // Catch:{ all -> 0x0050 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002e }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x002e }
                goto L_0x003c
            L_0x002e:
                com.amap.api.mapcore2d.el r1 = com.amap.api.mapcore2d.el.this     // Catch:{ all -> 0x0050 }
                java.io.File r1 = r1.f6042c     // Catch:{ all -> 0x0050 }
                r1.mkdirs()     // Catch:{ all -> 0x0050 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0044 }
            L_0x003c:
                com.amap.api.mapcore2d.el$a$a r4 = new com.amap.api.mapcore2d.el$a$a     // Catch:{ all -> 0x0050 }
                r2 = 0
                r4.<init>(r1)     // Catch:{ all -> 0x0050 }
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return r4
            L_0x0044:
                java.io.OutputStream r4 = com.amap.api.mapcore2d.el.s     // Catch:{ all -> 0x0050 }
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return r4
            L_0x004a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0050 }
                r4.<init>()     // Catch:{ all -> 0x0050 }
                throw r4     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                throw r4
            L_0x0053:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index "
                r1.<init>(r2)
                r1.append(r4)
                java.lang.String r4 = " to be greater than 0 and less than the maximum value count "
                r1.append(r4)
                java.lang.String r4 = "of "
                r1.append(r4)
                com.amap.api.mapcore2d.el r4 = com.amap.api.mapcore2d.el.this
                int r4 = r4.i
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.a.a(int):java.io.OutputStream");
        }

        private a(c cVar) {
            boolean[] zArr;
            this.f6049b = cVar;
            if (cVar.f6062d) {
                zArr = null;
            } else {
                zArr = new boolean[el.this.i];
            }
            this.f6050c = zArr;
        }
    }

    public final class b implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        private final String f6055b;

        /* renamed from: c  reason: collision with root package name */
        private final long f6056c;

        /* renamed from: d  reason: collision with root package name */
        private final InputStream[] f6057d;

        /* renamed from: e  reason: collision with root package name */
        private final long[] f6058e;

        public final void close() {
            for (InputStream a2 : this.f6057d) {
                eo.a((Closeable) a2);
            }
        }

        public final InputStream a(int i) {
            return this.f6057d[i];
        }

        private b(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f6055b = str;
            this.f6056c = j;
            this.f6057d = inputStreamArr;
            this.f6058e = jArr;
        }
    }

    final class c {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final String f6060b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long[] f6061c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f6062d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public a f6063e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public long f6064f;

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f6061c) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void a(String[] strArr) throws IOException {
            if (strArr.length == el.this.i) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f6061c[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw b(strArr);
                    }
                }
                return;
            }
            throw b(strArr);
        }

        public final File b(int i) {
            File f2 = el.this.f6042c;
            return new File(f2, this.f6060b + ClassUtils.PACKAGE_SEPARATOR + i + ".tmp");
        }

        public final File a(int i) {
            File f2 = el.this.f6042c;
            return new File(f2, this.f6060b + ClassUtils.PACKAGE_SEPARATOR + i);
        }

        private c(String str) {
            this.f6060b = str;
            this.f6061c = new long[el.this.i];
        }
    }

    public final File c() {
        return this.f6042c;
    }

    public final void a(em emVar) {
        this.o = emVar;
    }

    public final void a(int i2) {
        if (i2 < 10) {
            i2 = 10;
        } else if (i2 > 10000) {
            i2 = 10000;
        }
        this.l = i2;
    }

    private void l() {
        if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized boolean d() {
        boolean z;
        if (this.k == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void f() throws IOException {
        close();
        eo.a(this.f6042c);
    }

    public static void a() {
        if (f6041b != null && !f6041b.isShutdown()) {
            f6041b.shutdown();
        }
    }

    /* access modifiers changed from: private */
    public boolean k() {
        if (this.n < 2000 || this.n < this.m.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void e() throws IOException {
        l();
        m();
        this.k.flush();
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), q);
        f6041b = threadPoolExecutor;
    }

    public static ThreadPoolExecutor b() {
        try {
            if (f6041b == null || f6041b.isShutdown()) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), q);
                f6041b = threadPoolExecutor;
            }
        } catch (Throwable unused) {
        }
        return f6041b;
    }

    /* access modifiers changed from: private */
    public void m() throws IOException {
        while (true) {
            if (this.j > this.h || this.m.size() > this.l) {
                String str = (String) this.m.entrySet().iterator().next().getKey();
                c(str);
                if (this.o != null) {
                    this.o.a(str);
                }
            } else {
                return;
            }
        }
    }

    public final synchronized void close() throws IOException {
        if (this.k != null) {
            Iterator it2 = new ArrayList(this.m.values()).iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                if (cVar.f6063e != null) {
                    cVar.f6063e.b();
                }
            }
            m();
            this.k.close();
            this.k = null;
        }
    }

    private void i() throws IOException {
        a(this.f6044e);
        Iterator<c> it2 = this.m.values().iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            int i2 = 0;
            if (next.f6063e == null) {
                while (i2 < this.i) {
                    this.j += next.f6061c[i2];
                    i2++;
                }
            } else {
                a unused = next.f6063e = null;
                while (i2 < this.i) {
                    a(next.a(i2));
                    a(next.b(i2));
                    i2++;
                }
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.n = r1 - r8.m.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006a=Splitter:B:20:0x006a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() throws java.io.IOException {
        /*
            r8 = this;
            com.amap.api.mapcore2d.en r0 = new com.amap.api.mapcore2d.en
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.f6043d
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.amap.api.mapcore2d.eo.f6071a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x009b }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x009b }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x009b }
            java.lang.String r4 = r0.a()     // Catch:{ all -> 0x009b }
            java.lang.String r5 = r0.a()     // Catch:{ all -> 0x009b }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x006a
            int r6 = r8.g     // Catch:{ all -> 0x009b }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x009b }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x006a
            int r3 = r8.i     // Catch:{ all -> 0x009b }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x009b }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x006a
            r1 = 0
        L_0x0053:
            java.lang.String r2 = r0.a()     // Catch:{ EOFException -> 0x005d }
            r8.d((java.lang.String) r2)     // Catch:{ EOFException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r2 = r8.m     // Catch:{ all -> 0x009b }
            int r2 = r2.size()     // Catch:{ all -> 0x009b }
            int r1 = r1 - r2
            r8.n = r1     // Catch:{ all -> 0x009b }
            com.amap.api.mapcore2d.eo.a((java.io.Closeable) r0)
            return
        L_0x006a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x009b }
            r6.append(r1)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x009b }
            r6.append(r2)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x009b }
            r6.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x009b }
            r6.append(r5)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x009b }
            r3.<init>(r1)     // Catch:{ all -> 0x009b }
            throw r3     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            com.amap.api.mapcore2d.eo.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.h():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void j() throws IOException {
        if (this.k != null) {
            this.k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6044e), eo.f6071a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c next : this.m.values()) {
                if (next.f6063e != null) {
                    bufferedWriter.write("DIRTY " + next.f6060b + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f6060b + next.a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f6043d.exists()) {
                a(this.f6043d, this.f6045f, true);
            }
            a(this.f6044e, this.f6043d, false);
            this.f6045f.delete();
            this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6043d, true), eo.f6071a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final a b(String str) throws IOException {
        return a(str, -1);
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void e(String str) {
        if (!f6040a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private void d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.m.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            c cVar = this.m.get(str2);
            if (cVar == null) {
                cVar = new c(str2);
                this.m.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = cVar.f6062d = true;
                a unused2 = cVar.f6063e = null;
                cVar.a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                a unused3 = cVar.f6063e = new a(cVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.l()     // Catch:{ all -> 0x008f }
            r7.e((java.lang.String) r8)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r0 = r7.m     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.amap.api.mapcore2d.el$c r0 = (com.amap.api.mapcore2d.el.c) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.amap.api.mapcore2d.el$a r2 = r0.f6063e     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0019
            goto L_0x008d
        L_0x0019:
            int r2 = r7.i     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0042
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002e
            goto L_0x0042
        L_0x002e:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0042:
            long r2 = r7.j     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f6061c     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            r4 = 0
            long r2 = r2 - r5
            r7.j = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f6061c     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0059:
            int r0 = r7.n     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.n = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.k     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008f }
            r2.append(r8)     // Catch:{ all -> 0x008f }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r0 = r7.m     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.k()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = b()     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.r     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.c(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.n++;
        r11.k.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (k() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        b().submit(r11.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r3 = new com.amap.api.mapcore2d.el.b(r11, r12, com.amap.api.mapcore2d.el.c.e(r0), r8, com.amap.api.mapcore2d.el.c.b(r0), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.amap.api.mapcore2d.el.b a(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.l()     // Catch:{ all -> 0x0086 }
            r11.e((java.lang.String) r12)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r0 = r11.m     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0086 }
            com.amap.api.mapcore2d.el$c r0 = (com.amap.api.mapcore2d.el.c) r0     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f6062d     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.i     // Catch:{ all -> 0x0086 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0086 }
            r2 = 0
            r3 = 0
        L_0x0022:
            int r4 = r11.i     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0074 }
            java.io.File r5 = r0.a((int) r3)     // Catch:{ FileNotFoundException -> 0x0074 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0074 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.n     // Catch:{ all -> 0x0086 }
            int r1 = r1 + 1
            r11.n = r1     // Catch:{ all -> 0x0086 }
            java.io.Writer r1 = r11.k     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0086 }
            r2.append(r12)     // Catch:{ all -> 0x0086 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0086 }
            r1.append(r2)     // Catch:{ all -> 0x0086 }
            boolean r1 = r11.k()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0061
            java.util.concurrent.ThreadPoolExecutor r1 = b()     // Catch:{ all -> 0x0086 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.r     // Catch:{ all -> 0x0086 }
            r1.submit(r2)     // Catch:{ all -> 0x0086 }
        L_0x0061:
            com.amap.api.mapcore2d.el$b r1 = new com.amap.api.mapcore2d.el$b     // Catch:{ all -> 0x0086 }
            long r6 = r0.f6064f     // Catch:{ all -> 0x0086 }
            long[] r9 = r0.f6061c     // Catch:{ all -> 0x0086 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r8, r9)     // Catch:{ all -> 0x0086 }
            monitor-exit(r11)
            return r1
        L_0x0074:
            int r12 = r11.i     // Catch:{ all -> 0x0086 }
            if (r2 >= r12) goto L_0x0084
            r12 = r8[r2]     // Catch:{ all -> 0x0086 }
            if (r12 == 0) goto L_0x0084
            r12 = r8[r2]     // Catch:{ all -> 0x0086 }
            com.amap.api.mapcore2d.eo.a((java.io.Closeable) r12)     // Catch:{ all -> 0x0086 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.a(java.lang.String):com.amap.api.mapcore2d.el$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.amap.api.mapcore2d.el.a a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.l()     // Catch:{ all -> 0x005e }
            r5.e((java.lang.String) r6)     // Catch:{ all -> 0x005e }
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r0 = r5.m     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005e }
            com.amap.api.mapcore2d.el$c r0 = (com.amap.api.mapcore2d.el.c) r0     // Catch:{ all -> 0x005e }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r1 = r0.f6064f     // Catch:{ all -> 0x005e }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r3
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            com.amap.api.mapcore2d.el$c r0 = new com.amap.api.mapcore2d.el$c     // Catch:{ all -> 0x005e }
            r0.<init>(r6)     // Catch:{ all -> 0x005e }
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r7 = r5.m     // Catch:{ all -> 0x005e }
            r7.put(r6, r0)     // Catch:{ all -> 0x005e }
            goto L_0x0037
        L_0x002f:
            com.amap.api.mapcore2d.el$a r7 = r0.f6063e     // Catch:{ all -> 0x005e }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            com.amap.api.mapcore2d.el$a r7 = new com.amap.api.mapcore2d.el$a     // Catch:{ all -> 0x005e }
            r7.<init>(r0)     // Catch:{ all -> 0x005e }
            com.amap.api.mapcore2d.el.a unused = r0.f6063e = r7     // Catch:{ all -> 0x005e }
            java.io.Writer r8 = r5.k     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "DIRTY "
            r0.<init>(r1)     // Catch:{ all -> 0x005e }
            r0.append(r6)     // Catch:{ all -> 0x005e }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x005e }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x005e }
            r8.write(r6)     // Catch:{ all -> 0x005e }
            java.io.Writer r6 = r5.k     // Catch:{ all -> 0x005e }
            r6.flush()     // Catch:{ all -> 0x005e }
            monitor-exit(r5)
            return r7
        L_0x005e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.a(java.lang.String, long):com.amap.api.mapcore2d.el$a");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.amap.api.mapcore2d.el.a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.amap.api.mapcore2d.el$c r0 = r10.f6049b     // Catch:{ all -> 0x010a }
            com.amap.api.mapcore2d.el$a r1 = r0.f6063e     // Catch:{ all -> 0x010a }
            if (r1 != r10) goto L_0x0104
            r1 = 0
            if (r11 == 0) goto L_0x004a
            boolean r2 = r0.f6062d     // Catch:{ all -> 0x010a }
            if (r2 != 0) goto L_0x004a
            r2 = 0
        L_0x0015:
            int r3 = r9.i     // Catch:{ all -> 0x010a }
            if (r2 >= r3) goto L_0x004a
            boolean[] r3 = r10.f6050c     // Catch:{ all -> 0x010a }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010a }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.b((int) r2)     // Catch:{ all -> 0x010a }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010a }
            if (r3 != 0) goto L_0x0030
            r10.b()     // Catch:{ all -> 0x010a }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.b()     // Catch:{ all -> 0x010a }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x010a }
            r11.append(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010a }
            r10.<init>(r11)     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x004a:
            int r10 = r9.i     // Catch:{ all -> 0x010a }
            if (r1 >= r10) goto L_0x007f
            java.io.File r10 = r0.b((int) r1)     // Catch:{ all -> 0x010a }
            if (r11 == 0) goto L_0x0079
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010a }
            if (r2 == 0) goto L_0x007c
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x010a }
            r10.renameTo(r2)     // Catch:{ all -> 0x010a }
            long[] r10 = r0.f6061c     // Catch:{ all -> 0x010a }
            r3 = r10[r1]     // Catch:{ all -> 0x010a }
            long r5 = r2.length()     // Catch:{ all -> 0x010a }
            long[] r10 = r0.f6061c     // Catch:{ all -> 0x010a }
            r10[r1] = r5     // Catch:{ all -> 0x010a }
            long r7 = r9.j     // Catch:{ all -> 0x010a }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.j = r7     // Catch:{ all -> 0x010a }
            goto L_0x007c
        L_0x0079:
            a((java.io.File) r10)     // Catch:{ all -> 0x010a }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x007f:
            int r10 = r9.n     // Catch:{ all -> 0x010a }
            r1 = 1
            int r10 = r10 + r1
            r9.n = r10     // Catch:{ all -> 0x010a }
            r10 = 0
            com.amap.api.mapcore2d.el.a unused = r0.f6063e = r10     // Catch:{ all -> 0x010a }
            boolean r10 = r0.f6062d     // Catch:{ all -> 0x010a }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00c3
            boolean unused = r0.f6062d = r1     // Catch:{ all -> 0x010a }
            java.io.Writer r10 = r9.k     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r0.f6060b     // Catch:{ all -> 0x010a }
            r1.append(r3)     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x010a }
            r1.append(r3)     // Catch:{ all -> 0x010a }
            r1.append(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010a }
            r10.write(r1)     // Catch:{ all -> 0x010a }
            if (r11 == 0) goto L_0x00e6
            long r10 = r9.p     // Catch:{ all -> 0x010a }
            r1 = 1
            long r1 = r1 + r10
            r9.p = r1     // Catch:{ all -> 0x010a }
            long unused = r0.f6064f = r10     // Catch:{ all -> 0x010a }
            goto L_0x00e6
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.amap.api.mapcore2d.el$c> r10 = r9.m     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r0.f6060b     // Catch:{ all -> 0x010a }
            r10.remove(r11)     // Catch:{ all -> 0x010a }
            java.io.Writer r10 = r9.k     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x010a }
            java.lang.String r0 = r0.f6060b     // Catch:{ all -> 0x010a }
            r11.append(r0)     // Catch:{ all -> 0x010a }
            r11.append(r2)     // Catch:{ all -> 0x010a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010a }
            r10.write(r11)     // Catch:{ all -> 0x010a }
        L_0x00e6:
            java.io.Writer r10 = r9.k     // Catch:{ all -> 0x010a }
            r10.flush()     // Catch:{ all -> 0x010a }
            long r10 = r9.j     // Catch:{ all -> 0x010a }
            long r0 = r9.h     // Catch:{ all -> 0x010a }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00f9
            boolean r10 = r9.k()     // Catch:{ all -> 0x010a }
            if (r10 == 0) goto L_0x0102
        L_0x00f9:
            java.util.concurrent.ThreadPoolExecutor r10 = b()     // Catch:{ all -> 0x010a }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.r     // Catch:{ all -> 0x010a }
            r10.submit(r11)     // Catch:{ all -> 0x010a }
        L_0x0102:
            monitor-exit(r9)
            return
        L_0x0104:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010a }
            r10.<init>()     // Catch:{ all -> 0x010a }
            throw r10     // Catch:{ all -> 0x010a }
        L_0x010a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.el.a(com.amap.api.mapcore2d.el$a, boolean):void");
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private el(File file, int i2, int i3, long j2) {
        this.f6042c = file;
        this.g = i2;
        this.f6043d = new File(file, "journal");
        this.f6044e = new File(file, "journal.tmp");
        this.f6045f = new File(file, "journal.bkp");
        this.i = i3;
        this.h = j2;
    }

    public static el a(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            el elVar = new el(file, i2, i3, j2);
            if (elVar.f6043d.exists()) {
                try {
                    elVar.h();
                    elVar.i();
                    elVar.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(elVar.f6043d, true), eo.f6071a));
                    return elVar;
                } catch (Throwable unused) {
                    elVar.f();
                }
            }
            file.mkdirs();
            el elVar2 = new el(file, i2, i3, j2);
            elVar2.j();
            return elVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
