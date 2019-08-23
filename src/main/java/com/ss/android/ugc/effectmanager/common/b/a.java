package com.ss.android.ugc.effectmanager.common.b;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f77277a = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream g = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final File f77278b;

    /* renamed from: c  reason: collision with root package name */
    public final int f77279c;

    /* renamed from: d  reason: collision with root package name */
    public Writer f77280d;

    /* renamed from: e  reason: collision with root package name */
    public int f77281e;

    /* renamed from: f  reason: collision with root package name */
    final ThreadPoolExecutor f77282f;
    private final File h;
    private final File i;
    private final File j;
    private final int k;
    private long l;
    private long m;
    private final LinkedHashMap<String, b> n = new LinkedHashMap<>(0, 0.75f, true);
    private long o = 0;
    private final Callable<Void> p;

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$a  reason: collision with other inner class name */
    public final class C0810a {

        /* renamed from: a  reason: collision with root package name */
        public final b f77284a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f77285b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f77286c;

        /* renamed from: e  reason: collision with root package name */
        private boolean f77288e;

        /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$a$a  reason: collision with other inner class name */
        class C0811a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C0810a.this.f77286c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C0810a.this.f77286c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C0810a.this.f77286c = true;
                }
            }

            private C0811a(OutputStream outputStream) {
                super(outputStream);
            }

            /* synthetic */ C0811a(C0810a aVar, OutputStream outputStream, byte b2) {
                this(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0810a.this.f77286c = true;
                }
            }
        }

        public final void b() throws IOException {
            a.this.a(this, false);
        }

        public final void a() throws IOException {
            if (this.f77286c) {
                a.this.a(this, false);
                a.this.a(this.f77284a.f77290a);
            } else {
                a.this.a(this, true);
            }
            this.f77288e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.common.b.a r4 = com.ss.android.ugc.effectmanager.common.b.a.this
                int r4 = r4.f77279c
                r0 = 0
                if (r4 <= 0) goto L_0x0047
                com.ss.android.ugc.effectmanager.common.b.a r4 = com.ss.android.ugc.effectmanager.common.b.a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f77284a     // Catch:{ all -> 0x0044 }
                com.ss.android.ugc.effectmanager.common.b.a$a r1 = r1.f77293d     // Catch:{ all -> 0x0044 }
                if (r1 != r3) goto L_0x003e
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f77284a     // Catch:{ all -> 0x0044 }
                boolean r1 = r1.f77292c     // Catch:{ all -> 0x0044 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f77285b     // Catch:{ all -> 0x0044 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0044 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f77284a     // Catch:{ all -> 0x0044 }
                java.io.File r1 = r1.b((int) r0)     // Catch:{ all -> 0x0044 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.common.b.a r2 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0044 }
                java.io.File r2 = r2.f77278b     // Catch:{ all -> 0x0044 }
                r2.mkdirs()     // Catch:{ all -> 0x0044 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003a }
                r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x003a }
            L_0x0033:
                com.ss.android.ugc.effectmanager.common.b.a$a$a r1 = new com.ss.android.ugc.effectmanager.common.b.a$a$a     // Catch:{ all -> 0x0044 }
                r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x0044 }
                monitor-exit(r4)     // Catch:{ all -> 0x0044 }
                return r1
            L_0x003a:
                java.io.OutputStream r0 = com.ss.android.ugc.effectmanager.common.b.a.g     // Catch:{ all -> 0x0044 }
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
                com.ss.android.ugc.effectmanager.common.b.a r0 = com.ss.android.ugc.effectmanager.common.b.a.this
                int r0 = r0.f77279c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.C0810a.a(int):java.io.OutputStream");
        }

        private C0810a(b bVar) {
            boolean[] zArr;
            this.f77284a = bVar;
            if (bVar.f77292c) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f77279c];
            }
            this.f77285b = zArr;
        }

        /* synthetic */ C0810a(a aVar, b bVar, byte b2) {
            this(bVar);
        }
    }

    final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f77290a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f77291b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f77292c;

        /* renamed from: d  reason: collision with root package name */
        public C0810a f77293d;

        /* renamed from: e  reason: collision with root package name */
        public long f77294e;

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f77291b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private static IOException b(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final File a(int i) {
            if (i == 0) {
                return new File(a.this.f77278b, this.f77290a);
            }
            File file = a.this.f77278b;
            return new File(file, this.f77290a + ClassUtils.PACKAGE_SEPARATOR + i);
        }

        public final void a(String[] strArr) throws IOException {
            if (strArr.length == a.this.f77279c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f77291b[i] = Long.parseLong(strArr[i]);
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
            if (i == 0) {
                File file = a.this.f77278b;
                return new File(file, this.f77290a + ".tmp");
            }
            File file2 = a.this.f77278b;
            return new File(file2, this.f77290a + ClassUtils.PACKAGE_SEPARATOR + i + ".tmp");
        }

        private b(String str) {
            this.f77290a = str;
            this.f77291b = new long[a.this.f77279c];
        }

        /* synthetic */ b(a aVar, String str, byte b2) {
            this(str);
        }
    }

    private synchronized long f() {
        return this.l;
    }

    private void g() {
        if (this.f77280d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean b() {
        if (this.f77281e < 2000 || this.f77281e < this.n.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void close() throws IOException {
        if (this.f77280d != null) {
            Iterator it2 = new ArrayList(this.n.values()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar.f77293d != null) {
                    bVar.f77293d.b();
                }
            }
            c();
            this.f77280d.close();
            this.f77280d = null;
        }
    }

    private void e() throws IOException {
        a(this.i);
        Iterator<b> it2 = this.n.values().iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            int i2 = 0;
            if (next.f77293d == null) {
                while (i2 < this.f77279c) {
                    this.m += next.f77291b[i2];
                    i2++;
                }
            } else {
                next.f77293d = null;
                while (i2 < this.f77279c) {
                    a(next.a(i2));
                    a(next.b(i2));
                    i2++;
                }
                it2.remove();
            }
        }
    }

    public final void c() throws IOException {
        while (this.m > this.l) {
            int size = this.n.size();
            Iterator<Map.Entry<String, b>> it2 = this.n.entrySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next = it2.next();
                String str = (String) next.getKey();
                boolean z = true;
                if (TextUtils.isEmpty(str) || ((!com.ss.android.ugc.effectmanager.common.a.a.f("BR") || !com.ss.android.ugc.effectmanager.common.a.a.f77272b.contains(com.ss.android.ugc.effectmanager.common.a.a.f77271a.a(str))) && ((!com.ss.android.ugc.effectmanager.common.a.a.f("RU") || !com.ss.android.ugc.effectmanager.common.a.a.f77273c.contains(com.ss.android.ugc.effectmanager.common.a.a.f77271a.a(str))) && (com.ss.android.ugc.effectmanager.common.a.a.f77274d == null || !com.ss.android.ugc.effectmanager.common.a.a.f77274d.contains(str))))) {
                    z = false;
                }
                if (z) {
                    i2++;
                } else {
                    if (size - i2 < 10) {
                        a(f() * 2);
                    }
                    a((String) next.getKey());
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:49|50|(1:52)(1:53)|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.f77281e = r2 - r11.n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        if (r0.b() != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0119, code lost:
        r11.f77280d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r11.h, true), com.ss.android.ugc.effectmanager.common.b.d.f77308a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0131, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0106 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0132=Splitter:B:56:0x0132, B:14:0x0055=Splitter:B:14:0x0055} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() throws java.io.IOException {
        /*
            r11 = this;
            com.ss.android.ugc.effectmanager.common.b.c r0 = new com.ss.android.ugc.effectmanager.common.b.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r11.h
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.ss.android.ugc.effectmanager.common.b.d.f77308a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x0163 }
            java.lang.String r4 = r0.a()     // Catch:{ all -> 0x0163 }
            java.lang.String r5 = r0.a()     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0163 }
            if (r6 == 0) goto L_0x0132
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0163 }
            if (r6 == 0) goto L_0x0132
            int r6 = r11.k     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0163 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0163 }
            if (r3 == 0) goto L_0x0132
            int r3 = r11.f77279c     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0163 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0163 }
            if (r3 == 0) goto L_0x0132
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0163 }
            if (r3 == 0) goto L_0x0132
            r1 = 0
            r2 = 0
        L_0x0054:
            r3 = 1
            java.lang.String r4 = r0.a()     // Catch:{ EOFException -> 0x0106 }
            r5 = 32
            int r6 = r4.indexOf(r5)     // Catch:{ EOFException -> 0x0106 }
            r7 = -1
            if (r6 == r7) goto L_0x00f2
            int r8 = r6 + 1
            int r5 = r4.indexOf(r5, r8)     // Catch:{ EOFException -> 0x0106 }
            if (r5 != r7) goto L_0x007f
            java.lang.String r8 = r4.substring(r8)     // Catch:{ EOFException -> 0x0106 }
            r9 = 6
            if (r6 != r9) goto L_0x0083
            java.lang.String r9 = "REMOVE"
            boolean r9 = r4.startsWith(r9)     // Catch:{ EOFException -> 0x0106 }
            if (r9 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r4 = r11.n     // Catch:{ EOFException -> 0x0106 }
            r4.remove(r8)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x007f:
            java.lang.String r8 = r4.substring(r8, r5)     // Catch:{ EOFException -> 0x0106 }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r9 = r11.n     // Catch:{ EOFException -> 0x0106 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x0106 }
            com.ss.android.ugc.effectmanager.common.b.a$b r9 = (com.ss.android.ugc.effectmanager.common.b.a.b) r9     // Catch:{ EOFException -> 0x0106 }
            if (r9 != 0) goto L_0x0097
            com.ss.android.ugc.effectmanager.common.b.a$b r9 = new com.ss.android.ugc.effectmanager.common.b.a$b     // Catch:{ EOFException -> 0x0106 }
            r9.<init>(r11, r8, r1)     // Catch:{ EOFException -> 0x0106 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r10 = r11.n     // Catch:{ EOFException -> 0x0106 }
            r10.put(r8, r9)     // Catch:{ EOFException -> 0x0106 }
        L_0x0097:
            r8 = 5
            if (r5 == r7) goto L_0x00b9
            if (r6 != r8) goto L_0x00b9
            java.lang.String r10 = "CLEAN"
            boolean r10 = r4.startsWith(r10)     // Catch:{ EOFException -> 0x0106 }
            if (r10 == 0) goto L_0x00b9
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = " "
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ EOFException -> 0x0106 }
            r9.f77292c = r3     // Catch:{ EOFException -> 0x0106 }
            r5 = 0
            r9.f77293d = r5     // Catch:{ EOFException -> 0x0106 }
            r9.a((java.lang.String[]) r4)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00b9:
            if (r5 != r7) goto L_0x00cd
            if (r6 != r8) goto L_0x00cd
            java.lang.String r8 = "DIRTY"
            boolean r8 = r4.startsWith(r8)     // Catch:{ EOFException -> 0x0106 }
            if (r8 == 0) goto L_0x00cd
            com.ss.android.ugc.effectmanager.common.b.a$a r4 = new com.ss.android.ugc.effectmanager.common.b.a$a     // Catch:{ EOFException -> 0x0106 }
            r4.<init>(r11, r9, r1)     // Catch:{ EOFException -> 0x0106 }
            r9.f77293d = r4     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00cd:
            if (r5 != r7) goto L_0x00de
            r5 = 4
            if (r6 != r5) goto L_0x00de
            java.lang.String r5 = "READ"
            boolean r5 = r4.startsWith(r5)     // Catch:{ EOFException -> 0x0106 }
            if (r5 == 0) goto L_0x00de
        L_0x00da:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x00de:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r6 = "unexpected journal line: "
            r5.<init>(r6)     // Catch:{ EOFException -> 0x0106 }
            r5.append(r4)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r4 = r5.toString()     // Catch:{ EOFException -> 0x0106 }
            r1.<init>(r4)     // Catch:{ EOFException -> 0x0106 }
            throw r1     // Catch:{ EOFException -> 0x0106 }
        L_0x00f2:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r6 = "unexpected journal line: "
            r5.<init>(r6)     // Catch:{ EOFException -> 0x0106 }
            r5.append(r4)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r4 = r5.toString()     // Catch:{ EOFException -> 0x0106 }
            r1.<init>(r4)     // Catch:{ EOFException -> 0x0106 }
            throw r1     // Catch:{ EOFException -> 0x0106 }
        L_0x0106:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r1 = r11.n     // Catch:{ all -> 0x0163 }
            int r1 = r1.size()     // Catch:{ all -> 0x0163 }
            int r2 = r2 - r1
            r11.f77281e = r2     // Catch:{ all -> 0x0163 }
            boolean r1 = r0.b()     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0119
            r11.a()     // Catch:{ all -> 0x0163 }
            goto L_0x012e
        L_0x0119:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0163 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0163 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0163 }
            java.io.File r5 = r11.h     // Catch:{ all -> 0x0163 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0163 }
            java.nio.charset.Charset r3 = com.ss.android.ugc.effectmanager.common.b.d.f77308a     // Catch:{ all -> 0x0163 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0163 }
            r1.<init>(r2)     // Catch:{ all -> 0x0163 }
            r11.f77280d = r1     // Catch:{ all -> 0x0163 }
        L_0x012e:
            com.ss.android.ugc.effectmanager.common.b.d.a((java.io.Closeable) r0)
            return
        L_0x0132:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0163 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x0163 }
            r6.append(r1)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0163 }
            r6.append(r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0163 }
            r6.append(r4)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0163 }
            r6.append(r5)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0163 }
            r3.<init>(r1)     // Catch:{ all -> 0x0163 }
            throw r3     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r1 = move-exception
            com.ss.android.ugc.effectmanager.common.b.d.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.d():void");
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void a() throws IOException {
        if (this.f77280d != null) {
            this.f77280d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.i), d.f77308a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f77279c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (b next : this.n.values()) {
                if (next.f77293d != null) {
                    bufferedWriter.write("DIRTY " + next.f77290a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f77290a + next.a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.h.exists()) {
                a(this.h, this.j, true);
            }
            a(this.i, this.h, false);
            this.j.delete();
            this.f77280d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h, true), d.f77308a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private synchronized void a(long j2) {
        this.l = j2;
        this.f77282f.submit(this.p);
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void d(String str) {
        if (!f77277a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public final synchronized boolean c(String str) {
        g();
        d(str);
        b bVar = this.n.get(str);
        if (bVar == null) {
            return false;
        }
        if (!bVar.f77292c) {
            return false;
        }
        try {
            this.f77281e++;
            this.f77280d.write("READ " + str + 10);
            this.f77280d.flush();
            if (b()) {
                this.f77282f.submit(this.p);
            }
        } catch (IOException unused) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.g()     // Catch:{ all -> 0x00bc }
            d(r9)     // Catch:{ all -> 0x00bc }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r8.n     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00bc }
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = (com.ss.android.ugc.effectmanager.common.b.a.b) r0     // Catch:{ all -> 0x00bc }
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = new com.ss.android.ugc.effectmanager.common.b.a$b     // Catch:{ all -> 0x00bc }
            r0.<init>(r8, r9, r1)     // Catch:{ all -> 0x00bc }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r2 = r8.n     // Catch:{ all -> 0x00bc }
            r2.put(r9, r0)     // Catch:{ all -> 0x00bc }
            goto L_0x0023
        L_0x001d:
            com.ss.android.ugc.effectmanager.common.b.a$a r9 = r0.f77293d     // Catch:{ all -> 0x00bc }
            if (r9 == 0) goto L_0x0023
            monitor-exit(r8)
            return r1
        L_0x0023:
            java.io.File r9 = r0.a((int) r1)     // Catch:{ all -> 0x00bc }
            boolean r2 = r9.exists()     // Catch:{ all -> 0x00bc }
            r3 = 10
            if (r2 == 0) goto L_0x009b
            long[] r2 = r0.f77291b     // Catch:{ all -> 0x00bc }
            r4 = r2[r1]     // Catch:{ all -> 0x00bc }
            long r6 = r9.length()     // Catch:{ all -> 0x00bc }
            boolean r2 = r9.isDirectory()     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x0041
            long r6 = com.ss.android.ugc.effectmanager.common.b.d.c(r9)     // Catch:{ all -> 0x00bc }
        L_0x0041:
            long[] r9 = r0.f77291b     // Catch:{ all -> 0x00bc }
            r9[r1] = r6     // Catch:{ all -> 0x00bc }
            long r1 = r8.m     // Catch:{ all -> 0x00bc }
            r9 = 0
            long r1 = r1 - r4
            long r1 = r1 + r6
            r8.m = r1     // Catch:{ all -> 0x00bc }
            int r9 = r8.f77281e     // Catch:{ all -> 0x00bc }
            r1 = 1
            int r9 = r9 + r1
            r8.f77281e = r9     // Catch:{ all -> 0x00bc }
            r9 = 0
            r0.f77293d = r9     // Catch:{ all -> 0x00bc }
            r0.f77292c = r1     // Catch:{ all -> 0x00bc }
            java.io.Writer r9 = r8.f77280d     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = "CLEAN "
            r2.<init>(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r0.f77290a     // Catch:{ all -> 0x00bc }
            r2.append(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r0.a()     // Catch:{ all -> 0x00bc }
            r2.append(r4)     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00bc }
            r9.write(r2)     // Catch:{ all -> 0x00bc }
            long r2 = r8.o     // Catch:{ all -> 0x00bc }
            r4 = 1
            long r4 = r4 + r2
            r8.o = r4     // Catch:{ all -> 0x00bc }
            r0.f77294e = r2     // Catch:{ all -> 0x00bc }
            java.io.Writer r9 = r8.f77280d     // Catch:{ all -> 0x00bc }
            r9.flush()     // Catch:{ all -> 0x00bc }
            long r2 = r8.m     // Catch:{ all -> 0x00bc }
            long r4 = r8.l     // Catch:{ all -> 0x00bc }
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0092
            boolean r9 = r8.b()     // Catch:{ all -> 0x00bc }
            if (r9 == 0) goto L_0x0099
        L_0x0092:
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f77282f     // Catch:{ all -> 0x00bc }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.p     // Catch:{ all -> 0x00bc }
            r9.submit(r0)     // Catch:{ all -> 0x00bc }
        L_0x0099:
            monitor-exit(r8)
            return r1
        L_0x009b:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r9 = r8.n     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = r0.f77290a     // Catch:{ all -> 0x00bc }
            r9.remove(r2)     // Catch:{ all -> 0x00bc }
            java.io.Writer r9 = r8.f77280d     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = "REMOVE "
            r2.<init>(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.f77290a     // Catch:{ all -> 0x00bc }
            r2.append(r0)     // Catch:{ all -> 0x00bc }
            r2.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00bc }
            r9.write(r0)     // Catch:{ all -> 0x00bc }
            monitor-exit(r8)
            return r1
        L_0x00bc:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.b(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.g()     // Catch:{ all -> 0x00bd }
            d(r9)     // Catch:{ all -> 0x00bd }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r8.n     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00bd }
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = (com.ss.android.ugc.effectmanager.common.b.a.b) r0     // Catch:{ all -> 0x00bd }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ad
            com.ss.android.ugc.effectmanager.common.b.a$a r3 = r0.f77293d     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0019
            goto L_0x00ad
        L_0x0019:
            int r3 = r8.f77279c     // Catch:{ all -> 0x00bd }
            if (r1 >= r3) goto L_0x007c
            java.io.File r3 = r0.a((int) r1)     // Catch:{ all -> 0x00bd }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0069
            boolean r4 = r3.isFile()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.delete()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0034
            goto L_0x0048
        L_0x0034:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            r0.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bd }
            r9.<init>(r0)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bd }
        L_0x0048:
            boolean r4 = r3.isDirectory()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0069
            boolean r4 = com.ss.android.ugc.effectmanager.common.b.d.b(r3)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0055
            goto L_0x0069
        L_0x0055:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            r0.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bd }
            r9.<init>(r0)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bd }
        L_0x0069:
            long r3 = r8.m     // Catch:{ all -> 0x00bd }
            long[] r5 = r0.f77291b     // Catch:{ all -> 0x00bd }
            r6 = r5[r1]     // Catch:{ all -> 0x00bd }
            r5 = 0
            long r3 = r3 - r6
            r8.m = r3     // Catch:{ all -> 0x00bd }
            long[] r3 = r0.f77291b     // Catch:{ all -> 0x00bd }
            r4 = 0
            r3[r1] = r4     // Catch:{ all -> 0x00bd }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x007c:
            int r0 = r8.f77281e     // Catch:{ all -> 0x00bd }
            int r0 = r0 + r2
            r8.f77281e = r0     // Catch:{ all -> 0x00bd }
            java.io.Writer r0 = r8.f77280d     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "REMOVE "
            r1.<init>(r3)     // Catch:{ all -> 0x00bd }
            r1.append(r9)     // Catch:{ all -> 0x00bd }
            r3 = 10
            r1.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bd }
            r0.append(r1)     // Catch:{ all -> 0x00bd }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r8.n     // Catch:{ all -> 0x00bd }
            r0.remove(r9)     // Catch:{ all -> 0x00bd }
            boolean r9 = r8.b()     // Catch:{ all -> 0x00bd }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f77282f     // Catch:{ all -> 0x00bd }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.p     // Catch:{ all -> 0x00bd }
            r9.submit(r0)     // Catch:{ all -> 0x00bd }
        L_0x00ab:
            monitor-exit(r8)
            return r2
        L_0x00ad:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "remove: can not:"
            r9.<init>(r3)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r9.append(r2)     // Catch:{ all -> 0x00bd }
            monitor-exit(r8)
            return r1
        L_0x00bd:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.a(java.lang.String):boolean");
    }

    public final synchronized C0810a a(String str, long j2) throws IOException {
        g();
        d(str);
        b bVar = this.n.get(str);
        if (bVar == null) {
            bVar = new b(this, str, (byte) 0);
            this.n.put(str, bVar);
        } else if (bVar.f77293d != null) {
            return null;
        }
        C0810a aVar = new C0810a(this, bVar, (byte) 0);
        bVar.f77293d = aVar;
        Writer writer = this.f77280d;
        writer.write("DIRTY " + str + 10);
        this.f77280d.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.effectmanager.common.b.a.C0810a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = r10.f77284a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.common.b.a$a r1 = r0.f77293d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f77292c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f77279c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f77285b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.b((int) r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.b()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.b()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f77279c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.b((int) r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.a((int) r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f77291b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f77291b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.m     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.m = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            a((java.io.File) r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f77281e     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f77281e = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f77293d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f77292c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f77292c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f77280d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f77290a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.o     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.o = r1     // Catch:{ all -> 0x00f1 }
            r0.f77294e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r10 = r9.n     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f77290a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f77280d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f77290a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.f77280d     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.m     // Catch:{ all -> 0x00f1 }
            long r0 = r9.l     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f77282f     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.p     // Catch:{ all -> 0x00f1 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.a(com.ss.android.ugc.effectmanager.common.b.a$a, boolean):void");
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private a(File file, int i2, int i3, long j2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f77282f = threadPoolExecutor;
        this.p = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.common.b.a r0 = com.ss.android.ugc.effectmanager.common.b.a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.f77280d     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0025 }
                    r1.c()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.b()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0025 }
                    r1.a()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.ss.android.ugc.effectmanager.common.b.a.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.f77281e = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.a.AnonymousClass1.call():java.lang.Void");
            }
        };
        this.f77278b = file;
        this.k = i2;
        this.h = new File(file, "journal");
        this.i = new File(file, "journal.tmp");
        this.j = new File(file, "journal.bkp");
        this.f77279c = i3;
        this.l = j2;
    }

    public static a a(File file, int i2, int i3, long j2) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        a aVar = new a(file, 0, 1, 62914560);
        if (aVar.h.exists()) {
            try {
                aVar.d();
                aVar.e();
                return aVar;
            } catch (IOException e2) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.close();
                d.a(aVar.f77278b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, 0, 1, 62914560);
        aVar2.a();
        return aVar2;
    }
}
