package com.bytedance.frameworks.plugin.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2230a = "d";

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f2231e;

    /* renamed from: b  reason: collision with root package name */
    public final PriorityBlockingQueue<a> f2232b = new PriorityBlockingQueue<>(10, new Comparator<a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((a) obj).f2217d - ((a) obj2).f2217d;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public Handler f2233c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public a f2234d;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f2235f = h.a(m.a(p.FIXED).a(4).a());

    public interface a {
    }

    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private c f2241b = new c();

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ Throwable -> 0x01c7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0107 A[Catch:{ Throwable -> 0x01c7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0109 A[Catch:{ Throwable -> 0x01c7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01a1 A[Catch:{ Throwable -> 0x01c7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
            L_0x0000:
                com.bytedance.frameworks.plugin.d.d r0 = com.bytedance.frameworks.plugin.d.d.this     // Catch:{ Throwable -> 0x01c7 }
                java.util.concurrent.PriorityBlockingQueue<com.bytedance.frameworks.plugin.d.a> r0 = r0.f2232b     // Catch:{ Throwable -> 0x01c7 }
                java.lang.Object r0 = r0.take()     // Catch:{ Throwable -> 0x01c7 }
                com.bytedance.frameworks.plugin.d.a r0 = (com.bytedance.frameworks.plugin.d.a) r0     // Catch:{ Throwable -> 0x01c7 }
                com.bytedance.frameworks.plugin.d.b r1 = com.bytedance.frameworks.plugin.d.b.a()     // Catch:{ Throwable -> 0x01c7 }
                java.lang.String r2 = r0.f2214a     // Catch:{ Throwable -> 0x01c7 }
                com.bytedance.frameworks.plugin.a.b r1 = r1.a(r2)     // Catch:{ Throwable -> 0x01c7 }
                monitor-enter(r1)     // Catch:{ Throwable -> 0x01c7 }
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r0 != 0) goto L_0x001e
            L_0x001b:
                r6 = 0
                goto L_0x00da
            L_0x001e:
                com.bytedance.frameworks.plugin.d.b r6 = com.bytedance.frameworks.plugin.d.b.a()     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.a.b r6 = r6.a(r7)     // Catch:{ all -> 0x01c4 }
                if (r6 != 0) goto L_0x003c
                java.lang.String r6 = com.bytedance.frameworks.plugin.d.d.f2230a     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = "pluginApk mApkPath[%s] is not configured in host."
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x01c4 }
                java.io.File r9 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                r8[r5] = r9     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x01c4 }
                goto L_0x001b
            L_0x003c:
                int r7 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                int r8 = r6.k     // Catch:{ all -> 0x01c4 }
                if (r7 < r8) goto L_0x00b3
                int r7 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                int r8 = r6.l     // Catch:{ all -> 0x01c4 }
                if (r7 <= r8) goto L_0x0049
                goto L_0x00b3
            L_0x0049:
                int r7 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                int r8 = r6.f2146b     // Catch:{ all -> 0x01c4 }
                if (r7 >= r8) goto L_0x007f
                com.bytedance.frameworks.plugin.a.b$a r7 = r6.o     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.a.b$a r8 = com.bytedance.frameworks.plugin.a.b.a.INSTALLED     // Catch:{ all -> 0x01c4 }
                if (r7 == r8) goto L_0x0061
                com.bytedance.frameworks.plugin.a.b$a r7 = r6.o     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.a.b$a r8 = com.bytedance.frameworks.plugin.a.b.a.RESOLVED     // Catch:{ all -> 0x01c4 }
                if (r7 == r8) goto L_0x0061
                com.bytedance.frameworks.plugin.a.b$a r7 = r6.o     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.a.b$a r8 = com.bytedance.frameworks.plugin.a.b.a.ACTIVED     // Catch:{ all -> 0x01c4 }
                if (r7 != r8) goto L_0x007f
            L_0x0061:
                java.lang.String r7 = com.bytedance.frameworks.plugin.d.d.f2230a     // Catch:{ all -> 0x01c4 }
                java.lang.String r8 = "pluginApk mVersionCode[%s] is lower than the already installed[%s]."
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01c4 }
                int r6 = r6.k     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01c4 }
                r9[r5] = r6     // Catch:{ all -> 0x01c4 }
                int r6 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01c4 }
                r9[r4] = r6     // Catch:{ all -> 0x01c4 }
                java.lang.String r6 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r7, (java.lang.String) r6)     // Catch:{ all -> 0x01c4 }
                goto L_0x001b
            L_0x007f:
                java.io.File r7 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                if (r7 == 0) goto L_0x001b
                java.io.File r7 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                boolean r7 = r7.exists()     // Catch:{ all -> 0x01c4 }
                if (r7 != 0) goto L_0x008c
                goto L_0x001b
            L_0x008c:
                int r7 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                int r6 = r6.f2146b     // Catch:{ all -> 0x01c4 }
                if (r7 != r6) goto L_0x00b1
                com.bytedance.frameworks.plugin.core.d r6 = com.bytedance.frameworks.plugin.core.d.a()     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                java.lang.String r6 = r6.a(r7)     // Catch:{ all -> 0x01c4 }
                java.io.File r7 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = com.bytedance.frameworks.plugin.f.b.a((java.io.File) r7)     // Catch:{ all -> 0x01c4 }
                boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x01c4 }
                if (r6 == 0) goto L_0x00b1
                java.lang.String r6 = com.bytedance.frameworks.plugin.d.d.f2230a     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = "pluginApk with the same md5 has already installed."
                com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x01c4 }
                goto L_0x001b
            L_0x00b1:
                r6 = 1
                goto L_0x00da
            L_0x00b3:
                java.lang.String r7 = com.bytedance.frameworks.plugin.d.d.f2230a     // Catch:{ all -> 0x01c4 }
                java.lang.String r8 = "pluginApk mVersionCode[%s] does not match with the host version range [%s, %s]."
                java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c4 }
                int r10 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c4 }
                r9[r5] = r10     // Catch:{ all -> 0x01c4 }
                int r10 = r6.k     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01c4 }
                r9[r4] = r10     // Catch:{ all -> 0x01c4 }
                int r6 = r6.l     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01c4 }
                r9[r3] = r6     // Catch:{ all -> 0x01c4 }
                java.lang.String r6 = java.lang.String.format(r8, r9)     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r7, (java.lang.String) r6)     // Catch:{ all -> 0x01c4 }
                goto L_0x001b
            L_0x00da:
                if (r6 == 0) goto L_0x01a1
                com.bytedance.frameworks.plugin.d.c r6 = r11.f2241b     // Catch:{ all -> 0x01c4 }
                boolean r6 = r6.a((com.bytedance.frameworks.plugin.d.a) r0)     // Catch:{ all -> 0x01c4 }
                if (r6 == 0) goto L_0x015c
                java.lang.String r7 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                int r8 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                java.lang.String r7 = com.bytedance.frameworks.plugin.b.e.a(r7, r8)     // Catch:{ all -> 0x01c4 }
                if (r7 == 0) goto L_0x0104
                int r8 = r7.length()     // Catch:{ all -> 0x01c4 }
                r9 = 0
            L_0x00f3:
                if (r9 >= r8) goto L_0x0104
                char r10 = r7.charAt(r9)     // Catch:{ all -> 0x01c4 }
                boolean r10 = java.lang.Character.isWhitespace(r10)     // Catch:{ all -> 0x01c4 }
                if (r10 != 0) goto L_0x0101
                r8 = 0
                goto L_0x0105
            L_0x0101:
                int r9 = r9 + 1
                goto L_0x00f3
            L_0x0104:
                r8 = 1
            L_0x0105:
                if (r8 == 0) goto L_0x0109
                r7 = 0
                goto L_0x010f
            L_0x0109:
                java.io.File r8 = new java.io.File     // Catch:{ all -> 0x01c4 }
                r8.<init>(r7)     // Catch:{ all -> 0x01c4 }
                r7 = r8
            L_0x010f:
                java.lang.String r7 = com.bytedance.frameworks.plugin.f.b.a((java.io.File) r7)     // Catch:{ all -> 0x01c4 }
                java.lang.String r8 = "markAsInstalled %s %s md5=%s"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01c4 }
                java.lang.String r9 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                r2[r5] = r9     // Catch:{ all -> 0x01c4 }
                int r5 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01c4 }
                r2[r4] = r5     // Catch:{ all -> 0x01c4 }
                r2[r3] = r7     // Catch:{ all -> 0x01c4 }
                java.lang.String r2 = java.lang.String.format(r8, r2)     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.g.b(r2)     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.core.d r2 = com.bytedance.frameworks.plugin.core.d.a()     // Catch:{ all -> 0x01c4 }
                java.lang.String r3 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                android.content.SharedPreferences r2 = r2.f2195a     // Catch:{ all -> 0x01c4 }
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x01c4 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
                java.lang.String r8 = "MD5_"
                r5.<init>(r8)     // Catch:{ all -> 0x01c4 }
                r5.append(r3)     // Catch:{ all -> 0x01c4 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01c4 }
                r2.putString(r3, r7)     // Catch:{ all -> 0x01c4 }
                r2.apply()     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.core.d r2 = com.bytedance.frameworks.plugin.core.d.a()     // Catch:{ all -> 0x01c4 }
                java.lang.String r3 = r0.f2214a     // Catch:{ all -> 0x01c4 }
                int r5 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                r2.a(r3, r5, r4)     // Catch:{ all -> 0x01c4 }
                java.io.File r2 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.d.a((java.io.File) r2)     // Catch:{ all -> 0x01c4 }
            L_0x015c:
                com.bytedance.frameworks.plugin.a.b$a r2 = r1.o     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.a.b$a r3 = com.bytedance.frameworks.plugin.a.b.a.ACTIVED     // Catch:{ all -> 0x01c4 }
                if (r2 == r3) goto L_0x01b9
                if (r6 == 0) goto L_0x0179
                com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.INSTALLED     // Catch:{ all -> 0x01c4 }
                r1.o = r2     // Catch:{ all -> 0x01c4 }
                int r0 = r0.f2215b     // Catch:{ all -> 0x01c4 }
                r1.f2146b = r0     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.d.d r0 = com.bytedance.frameworks.plugin.d.d.this     // Catch:{ all -> 0x01c4 }
                android.os.Handler r0 = r0.f2233c     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.d.d$b$1 r2 = new com.bytedance.frameworks.plugin.d.d$b$1     // Catch:{ all -> 0x01c4 }
                r2.<init>(r1)     // Catch:{ all -> 0x01c4 }
                r0.post(r2)     // Catch:{ all -> 0x01c4 }
                goto L_0x01b9
            L_0x0179:
                com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.INSTALL_FAILED     // Catch:{ all -> 0x01c4 }
                r1.o = r2     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.d.d r2 = com.bytedance.frameworks.plugin.d.d.this     // Catch:{ all -> 0x01c4 }
                android.os.Handler r2 = r2.f2233c     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.d.d$b$2 r3 = new com.bytedance.frameworks.plugin.d.d$b$2     // Catch:{ all -> 0x01c4 }
                r3.<init>(r1)     // Catch:{ all -> 0x01c4 }
                r2.post(r3)     // Catch:{ all -> 0x01c4 }
                java.util.concurrent.atomic.AtomicInteger r2 = r1.t     // Catch:{ all -> 0x01c4 }
                int r2 = r2.getAndIncrement()     // Catch:{ all -> 0x01c4 }
                if (r2 != 0) goto L_0x0199
                com.bytedance.frameworks.plugin.d.d r2 = com.bytedance.frameworks.plugin.d.d.this     // Catch:{ all -> 0x01c4 }
                java.io.File r0 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                r2.a((java.io.File) r0)     // Catch:{ all -> 0x01c4 }
                goto L_0x01b9
            L_0x0199:
                if (r2 <= 0) goto L_0x01b9
                java.io.File r0 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.d.a((java.io.File) r0)     // Catch:{ all -> 0x01c4 }
                goto L_0x01b9
            L_0x01a1:
                java.io.File r2 = r0.f2216c     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.d.a((java.io.File) r2)     // Catch:{ all -> 0x01c4 }
                java.lang.String r2 = com.bytedance.frameworks.plugin.d.d.f2230a     // Catch:{ all -> 0x01c4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
                java.lang.String r4 = "deleting invalid pluginApk="
                r3.<init>(r4)     // Catch:{ all -> 0x01c4 }
                r3.append(r0)     // Catch:{ all -> 0x01c4 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c4 }
                com.bytedance.frameworks.plugin.f.g.b((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x01c4 }
            L_0x01b9:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.s     // Catch:{ all -> 0x01c4 }
                r0.decrementAndGet()     // Catch:{ all -> 0x01c4 }
                r1.notifyAll()     // Catch:{ all -> 0x01c4 }
                monitor-exit(r1)     // Catch:{ all -> 0x01c4 }
                goto L_0x0000
            L_0x01c4:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01c4 }
                throw r0     // Catch:{ Throwable -> 0x01c7 }
            L_0x01c7:
                r0 = move-exception
                java.lang.String r1 = com.bytedance.frameworks.plugin.d.d.f2230a
                java.lang.String r2 = "THIS IS IMPOSSIBLE!!!"
                com.bytedance.frameworks.plugin.f.g.b(r1, r2, r0)
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.d.b.run():void");
        }

        public b() {
            this.f2241b.f2229a = d.this.f2234d;
        }
    }

    public static d a() {
        if (f2231e == null) {
            synchronized (d.class) {
                if (f2231e == null) {
                    f2231e = new d();
                }
            }
        }
        return f2231e;
    }

    public final void b() {
        com.bytedance.frameworks.plugin.f.m a2 = com.bytedance.frameworks.plugin.f.m.a("PluginManager");
        b.a().b();
        a2.b("init PluginAttributeManager");
        if (f.b(e.a())) {
            b(new File(com.bytedance.frameworks.plugin.b.e.b()));
            b(new File(com.bytedance.frameworks.plugin.b.e.a()));
            a2.b("installPluginApks");
            for (int i = 0; i < 4; i++) {
                this.f2235f.execute(new b());
            }
        }
    }

    private void b(File file) {
        file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                if (file == null || (!file.getName().endsWith(".apk") && !file.getName().endsWith(".so") && !file.getName().endsWith(".jar"))) {
                    com.bytedance.frameworks.plugin.f.d.a(file);
                } else {
                    d.this.a(file);
                }
                return false;
            }
        });
    }

    private static boolean c(String str) {
        com.bytedance.frameworks.plugin.a.b a2 = b.a().a(str);
        if (a2 == null || a2.o != b.a.ACTIVED) {
            return false;
        }
        return true;
    }

    public final void a(File file) {
        a a2 = a.a(file);
        if (a2 == null) {
            String str = f2230a;
            g.b(str, "plugin apk is null. filePath=" + file);
            return;
        }
        g.b("add pluginApk into installQueue: " + file);
        b.a().a(a2.f2214a).s.incrementAndGet();
        this.f2232b.add(a2);
    }

    public final void a(String str) {
        for (com.bytedance.frameworks.plugin.a.b bVar : b.a().c()) {
            if (!(bVar == null || bVar.h || bVar.o == b.a.ACTIVED)) {
                String str2 = bVar.f2145a;
                if (str.startsWith(str2 + ClassUtils.PACKAGE_SEPARATOR)) {
                    b(str2);
                } else {
                    Iterator<String> it2 = bVar.j.iterator();
                    while (it2.hasNext()) {
                        if (str.startsWith(it2.next() + ClassUtils.PACKAGE_SEPARATOR)) {
                            b(str2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A[LOOP:0: B:15:0x0053->B:45:0x0053, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r9) {
        /*
            r8 = this;
            com.bytedance.frameworks.plugin.d.b r0 = com.bytedance.frameworks.plugin.d.b.a()
            com.bytedance.frameworks.plugin.a.b r0 = r0.a(r9)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.bytedance.frameworks.plugin.a.b$a r1 = r0.o
            int r1 = r1.getIndex()
            com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.INSTALLED
            int r2 = r2.getIndex()
            if (r1 >= r2) goto L_0x0039
            android.content.Context r1 = com.bytedance.frameworks.plugin.e.a()
            boolean r1 = com.bytedance.frameworks.plugin.b.f.b(r1)
            if (r1 != 0) goto L_0x0039
            com.bytedance.frameworks.plugin.a.b r1 = com.bytedance.frameworks.plugin.pm.c.l(r9)
            com.bytedance.frameworks.plugin.a.b$a r1 = r1.o
            int r1 = r1.getIndex()
            com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.RESOLVED
            int r2 = r2.getIndex()
            if (r1 < r2) goto L_0x0039
            com.bytedance.frameworks.plugin.a.b$a r1 = com.bytedance.frameworks.plugin.a.b.a.RESOLVED
            r0.o = r1
        L_0x0039:
            com.bytedance.frameworks.plugin.a.b$a r1 = r0.o
            com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.ACTIVED
            if (r1 != r2) goto L_0x0040
            return
        L_0x0040:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "preload-"
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.bytedance.frameworks.plugin.f.m r1 = com.bytedance.frameworks.plugin.f.m.a(r1)
            monitor-enter(r0)
        L_0x0053:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.s     // Catch:{ all -> 0x00fa }
            int r2 = r2.get()     // Catch:{ all -> 0x00fa }
            if (r2 <= 0) goto L_0x005f
            r0.wait()     // Catch:{ InterruptedException -> 0x0053 }
            goto L_0x0053
        L_0x005f:
            java.lang.String r2 = "wait install finish"
            long r2 = r1.b(r2)     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r4 = r0.o     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r5 = com.bytedance.frameworks.plugin.a.b.a.INSTALLED     // Catch:{ all -> 0x00fa }
            if (r4 == r5) goto L_0x0071
            com.bytedance.frameworks.plugin.a.b$a r4 = r0.o     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r5 = com.bytedance.frameworks.plugin.a.b.a.RESOLVE_FAILED     // Catch:{ all -> 0x00fa }
            if (r4 != r5) goto L_0x009f
        L_0x0071:
            com.bytedance.frameworks.plugin.a.b$a r4 = com.bytedance.frameworks.plugin.a.b.a.RESOLVING     // Catch:{ all -> 0x00fa }
            r0.o = r4     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r5 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r6 = 20000(0x4e20, float:2.8026E-41)
            com.bytedance.frameworks.plugin.f.a(r4, r5, r6)     // Catch:{ all -> 0x00fa }
            boolean r4 = com.bytedance.frameworks.plugin.pm.c.a((com.bytedance.frameworks.plugin.a.b) r0)     // Catch:{ all -> 0x00fa }
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r5 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r6 = 21000(0x5208, float:2.9427E-41)
            com.bytedance.frameworks.plugin.f.a(r4, r5, r6)     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r4 = com.bytedance.frameworks.plugin.a.b.a.RESOLVED     // Catch:{ all -> 0x00fa }
            r0.o = r4     // Catch:{ all -> 0x00fa }
            goto L_0x009f
        L_0x0092:
            java.lang.String r4 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r5 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r6 = 22000(0x55f0, float:3.0829E-41)
            com.bytedance.frameworks.plugin.f.a(r4, r5, r6)     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r4 = com.bytedance.frameworks.plugin.a.b.a.RESOLVE_FAILED     // Catch:{ all -> 0x00fa }
            r0.o = r4     // Catch:{ all -> 0x00fa }
        L_0x009f:
            java.lang.String r4 = "resolve"
            long r4 = r1.b(r4)     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r1 = r0.o     // Catch:{ all -> 0x00fa }
            com.bytedance.frameworks.plugin.a.b$a r6 = com.bytedance.frameworks.plugin.a.b.a.RESOLVED     // Catch:{ all -> 0x00fa }
            if (r1 != r6) goto L_0x00e8
            java.lang.String r1 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r6 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r7 = 30000(0x7530, float:4.2039E-41)
            com.bytedance.frameworks.plugin.f.a(r1, r6, r7)     // Catch:{ all -> 0x00fa }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x00fa }
            r1.<init>()     // Catch:{ all -> 0x00fa }
            java.lang.String r6 = "WAIT_INSTALL_DURATION"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00fa }
            r1.put(r6, r2)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "RESOLVE_DURATION"
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00fa }
            r1.put(r2, r3)     // Catch:{ all -> 0x00fa }
            boolean r2 = com.bytedance.frameworks.plugin.b.a.b(r9)     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00df
            com.bytedance.frameworks.plugin.a.b$a r2 = com.bytedance.frameworks.plugin.a.b.a.ACTIVED     // Catch:{ all -> 0x00fa }
            r0.o = r2     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r3 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r4 = 31000(0x7918, float:4.344E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4, r1)     // Catch:{ all -> 0x00fa }
            goto L_0x00e8
        L_0x00df:
            java.lang.String r2 = r0.f2145a     // Catch:{ all -> 0x00fa }
            int r3 = r0.f2146b     // Catch:{ all -> 0x00fa }
            r4 = 32000(0x7d00, float:4.4842E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4, r1)     // Catch:{ all -> 0x00fa }
        L_0x00e8:
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            boolean r9 = c(r9)
            if (r9 == 0) goto L_0x00f9
            android.os.Handler r9 = r8.f2233c
            com.bytedance.frameworks.plugin.d.d$2 r1 = new com.bytedance.frameworks.plugin.d.d$2
            r1.<init>(r0)
            r9.post(r1)
        L_0x00f9:
            return
        L_0x00fa:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.d.b(java.lang.String):void");
    }
}
