package com.ss.android.agilelogger;

import android.content.Context;
import android.support.annotation.NonNull;
import com.ss.android.agilelogger.d.c;
import com.ss.android.agilelogger.e.a;
import com.ss.android.agilelogger.f.b;
import com.ss.android.agilelogger.f.j;
import com.ss.android.agilelogger.f.m;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public volatile a f27874a;

    /* renamed from: b  reason: collision with root package name */
    public volatile a f27875b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentLinkedQueue<e> f27876c;

    /* renamed from: d  reason: collision with root package name */
    volatile Set<String> f27877d = null;

    /* renamed from: e  reason: collision with root package name */
    private final Object f27878e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f27879f = true;
    private boolean g;

    /* renamed from: com.ss.android.agilelogger.b$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27882a = new int[b.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.agilelogger.f.b$a[] r0 = com.ss.android.agilelogger.f.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27882a = r0
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.MSG     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.STACKTRACE_STR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.BORDER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.JSON     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.BUNDLE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.INTENT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.THROWABLE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.THREAD     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f27882a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.agilelogger.f.b$a r1 = com.ss.android.agilelogger.f.b.a.STACKTRACE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.b.AnonymousClass2.<clinit>():void");
        }
    }

    public final void a() {
        if (!this.g) {
            synchronized (this.f27878e) {
                this.f27878e.notify();
            }
        }
    }

    private void c() {
        j.a();
        List<c> list = this.f27875b.f27912a;
        if (list != null) {
            for (c next : list) {
                if (next instanceof com.ss.android.agilelogger.d.a) {
                    ((com.ss.android.agilelogger.d.a) next).a(new File(this.f27874a.f27862d, com.ss.android.agilelogger.f.a.a(ALog.getContext())).getAbsolutePath());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r4 == null) goto L_0x0087;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC, Splitter:B:32:0x007f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r6 = this;
            com.ss.android.agilelogger.a r0 = r6.f27874a
            java.lang.String r0 = r0.f27861c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            com.ss.android.agilelogger.ALog.release()
            return
        L_0x000e:
            android.content.Context r0 = com.ss.android.agilelogger.ALog.getContext()
            java.io.File r1 = new java.io.File
            com.ss.android.agilelogger.a r2 = r6.f27874a
            java.lang.String r2 = r2.f27862d
            r1.<init>(r2)
            r6.a(r0, r1)
            java.io.File r1 = new java.io.File
            com.ss.android.agilelogger.a r2 = r6.f27874a
            java.lang.String r2 = r2.f27862d
            java.lang.String r3 = com.ss.android.agilelogger.f.a.a(r0)
            r1.<init>(r2, r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = com.ss.android.agilelogger.g.a()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x003d
            com.ss.android.agilelogger.g.a(r1)
            goto L_0x0087
        L_0x003d:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x004c
            com.ss.android.agilelogger.g.a(r1)
            goto L_0x0087
        L_0x004c:
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0083, all -> 0x007b }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0083, all -> 0x007b }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0083, all -> 0x007b }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0083, all -> 0x007b }
            int r3 = r4.available()     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            com.ss.android.agilelogger.a r5 = r6.f27874a     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            boolean r5 = r5.f27863e     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if (r5 == 0) goto L_0x0064
            int r5 = com.ss.android.agilelogger.a.a.f27872b     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            goto L_0x0068
        L_0x0064:
            com.ss.android.agilelogger.a r5 = r6.f27874a     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            int r5 = r5.f27860b     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
        L_0x0068:
            if (r3 >= r5) goto L_0x0071
            com.ss.android.agilelogger.f.j.a(r3)     // Catch:{ IOException -> 0x006f, all -> 0x0077 }
            r1 = r2
            goto L_0x0071
        L_0x006f:
            r1 = r2
            goto L_0x0084
        L_0x0071:
            r4.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0087
        L_0x0075:
            goto L_0x0087
        L_0x0077:
            r0 = move-exception
            goto L_0x007d
        L_0x0079:
            goto L_0x0084
        L_0x007b:
            r0 = move-exception
            r4 = r3
        L_0x007d:
            if (r4 == 0) goto L_0x0082
            r4.close()     // Catch:{ IOException -> 0x0082 }
        L_0x0082:
            throw r0
        L_0x0083:
            r4 = r3
        L_0x0084:
            if (r4 == 0) goto L_0x0087
            goto L_0x0071
        L_0x0087:
            com.ss.android.agilelogger.d.a$a r2 = new com.ss.android.agilelogger.d.a$a
            r2.<init>(r0)
            r2.f27898c = r1
            com.ss.android.agilelogger.a r1 = r6.f27874a
            int r1 = r1.g
            r2.f27900e = r1
            java.io.File r1 = new java.io.File
            com.ss.android.agilelogger.a r3 = r6.f27874a
            java.lang.String r3 = r3.f27861c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ".logCache_"
            r4.<init>(r5)
            java.lang.String r0 = com.ss.android.agilelogger.f.h.a((android.content.Context) r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.<init>(r3, r0)
            java.lang.String r0 = r1.getAbsolutePath()
            r2.f27897b = r0
            com.ss.android.agilelogger.a r0 = r6.f27874a
            boolean r0 = r0.f27863e
            r2.g = r0
            com.ss.android.agilelogger.a r0 = r6.f27874a
            boolean r0 = r0.f27864f
            r2.h = r0
            com.ss.android.agilelogger.a r0 = r6.f27874a
            int r0 = r0.h
            r2.f27899d = r0
            java.lang.String r0 = r2.f27898c
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r2.f27897b
            if (r0 != 0) goto L_0x0110
            android.content.Context r0 = r2.f27896a
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r3 = "mounted"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = "alog"
            java.io.File r1 = r0.getExternalFilesDir(r1)
            if (r1 == 0) goto L_0x00ec
            java.lang.String r1 = "alog"
            java.io.File r0 = r0.getExternalFilesDir(r1)
            goto L_0x00f8
        L_0x00ec:
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r3 = "alog"
            r1.<init>(r0, r3)
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x0103
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0103
            r0.mkdirs()
        L_0x0103:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = ".alog"
            r1.<init>(r0, r3)
            java.lang.String r0 = r1.getAbsolutePath()
            r2.f27897b = r0
        L_0x0110:
            com.ss.android.agilelogger.d.a r0 = new com.ss.android.agilelogger.d.a
            r0.<init>(r2)
            com.ss.android.agilelogger.e.a$a r1 = new com.ss.android.agilelogger.e.a$a
            r1.<init>()
            com.ss.android.agilelogger.e.a r2 = r1.f27914a
            java.util.List<com.ss.android.agilelogger.d.c> r3 = r2.f27912a
            if (r3 == 0) goto L_0x0125
            java.util.List<com.ss.android.agilelogger.d.c> r2 = r2.f27912a
            r2.add(r0)
        L_0x0125:
            com.ss.android.agilelogger.e.a r0 = r1.f27914a
            r6.f27875b = r0
            java.util.Set<java.lang.String> r0 = r6.f27877d
            if (r0 == 0) goto L_0x0134
            com.ss.android.agilelogger.e.a r0 = r6.f27875b
            java.util.Set<java.lang.String> r1 = r6.f27877d
            r0.a((java.util.Set<java.lang.String>) r1)
        L_0x0134:
            return
        L_0x0135:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "log path cannot be null!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.b.b():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.g = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00df */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            super.run()
        L_0x0003:
            boolean r0 = r6.f27879f
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r0 = r6.f27878e
            monitor-enter(r0)
            r1 = 1
            r6.g = r1     // Catch:{ all -> 0x00e4 }
            r2 = 0
            java.util.concurrent.ConcurrentLinkedQueue<com.ss.android.agilelogger.e> r3 = r6.f27876c     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r3 = r3.poll()     // Catch:{ InterruptedException -> 0x00df }
            com.ss.android.agilelogger.e r3 = (com.ss.android.agilelogger.e) r3     // Catch:{ InterruptedException -> 0x00df }
            if (r3 != 0) goto L_0x0023
            r6.g = r2     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r3 = r6.f27878e     // Catch:{ InterruptedException -> 0x00df }
            r3.wait()     // Catch:{ InterruptedException -> 0x00df }
            r6.g = r1     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x0023:
            int r1 = r3.f27906a     // Catch:{ InterruptedException -> 0x00df }
            switch(r1) {
                case 0: goto L_0x00db;
                case 1: goto L_0x003f;
                case 2: goto L_0x0034;
                case 3: goto L_0x002f;
                case 4: goto L_0x002a;
                default: goto L_0x0028;
            }     // Catch:{ InterruptedException -> 0x00df }
        L_0x0028:
            goto L_0x00e1
        L_0x002a:
            r6.c()     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x002f:
            r6.a(r3)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x0034:
            com.ss.android.agilelogger.e.a r1 = r6.f27875b     // Catch:{ InterruptedException -> 0x00df }
            if (r1 == 0) goto L_0x00e1
            com.ss.android.agilelogger.e.a r1 = r6.f27875b     // Catch:{ InterruptedException -> 0x00df }
            r1.a()     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x003f:
            boolean r1 = r3 instanceof com.ss.android.agilelogger.e     // Catch:{ InterruptedException -> 0x00df }
            if (r1 == 0) goto L_0x00e1
            com.ss.android.agilelogger.e.a r1 = r6.f27875b     // Catch:{ InterruptedException -> 0x00df }
            if (r1 == 0) goto L_0x00e1
            java.lang.String r1 = ""
            int[] r4 = com.ss.android.agilelogger.b.AnonymousClass2.f27882a     // Catch:{ InterruptedException -> 0x00df }
            com.ss.android.agilelogger.f.b$a r5 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            int r5 = r5.ordinal()     // Catch:{ InterruptedException -> 0x00df }
            r4 = r4[r5]     // Catch:{ InterruptedException -> 0x00df }
            switch(r4) {
                case 1: goto L_0x00cf;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009d;
                case 4: goto L_0x0092;
                case 5: goto L_0x0087;
                case 6: goto L_0x007c;
                case 7: goto L_0x0071;
                case 8: goto L_0x0066;
                case 9: goto L_0x0058;
                default: goto L_0x0056;
            }     // Catch:{ InterruptedException -> 0x00df }
        L_0x0056:
            goto L_0x00d3
        L_0x0058:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (java.lang.StackTraceElement[]) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x0066:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Thread r4 = (java.lang.Thread) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (java.lang.Thread) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x0071:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (java.lang.Throwable) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x007c:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            android.content.Intent r4 = (android.content.Intent) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (android.content.Intent) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x0087:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (android.os.Bundle) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x0092:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (java.lang.String) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x009d:
            com.ss.android.agilelogger.f.b$a r1 = r3.g     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.b.a((com.ss.android.agilelogger.f.b.a) r1, (java.lang.String) r4)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x00a8:
            java.lang.Object r1 = r3.i     // Catch:{ InterruptedException -> 0x00df }
            if (r1 != 0) goto L_0x00b5
            java.lang.Object r1 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = com.ss.android.agilelogger.f.k.a(r1)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00df }
            r1.<init>()     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.i     // Catch:{ InterruptedException -> 0x00df }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Object r4 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r4 = com.ss.android.agilelogger.f.k.a(r4)     // Catch:{ InterruptedException -> 0x00df }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00d3
        L_0x00cf:
            java.lang.Object r1 = r3.h     // Catch:{ InterruptedException -> 0x00df }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InterruptedException -> 0x00df }
        L_0x00d3:
            r3.f27909d = r1     // Catch:{ InterruptedException -> 0x00df }
            com.ss.android.agilelogger.e.a r1 = r6.f27875b     // Catch:{ InterruptedException -> 0x00df }
            r1.a((com.ss.android.agilelogger.e) r3)     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x00db:
            r6.b()     // Catch:{ InterruptedException -> 0x00df }
            goto L_0x00e1
        L_0x00df:
            r6.g = r2     // Catch:{ all -> 0x00e4 }
        L_0x00e1:
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x0003
        L_0x00e4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e4 }
            throw r1
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.b.run():void");
    }

    private void a(e eVar) {
        if (this.f27874a != null) {
            this.f27874a.g = ((Integer) eVar.h).intValue();
        }
        if (this.f27875b != null) {
            List<c> list = this.f27875b.f27912a;
            if (list != null) {
                for (c next : list) {
                    if (next instanceof com.ss.android.agilelogger.d.b) {
                        ((com.ss.android.agilelogger.d.b) next).a(((Integer) eVar.h).intValue());
                    }
                }
            }
        }
    }

    public b(String str, @NonNull a aVar) {
        super(str);
        this.f27874a = aVar;
        this.f27876c = new ConcurrentLinkedQueue<>();
        e eVar = new e();
        eVar.f27906a = 0;
        this.f27876c.add(eVar);
    }

    private void a(Context context, File file) {
        final int a2 = m.a(context);
        if (file.exists()) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    boolean z;
                    if (str.endsWith(".hot") || str.endsWith(".hoting")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int a2 = m.a(str);
                    if (!z || a2 <= a2) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        file2.delete();
                    }
                }
            }
        }
    }
}
