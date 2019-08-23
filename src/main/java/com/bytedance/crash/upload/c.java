package com.bytedance.crash.upload;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.crash.e.b;
import com.bytedance.crash.i;
import com.bytedance.crash.j;
import com.bytedance.frameworks.core.b.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<b> f19563a = new ConcurrentLinkedQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, ConcurrentLinkedQueue<b>> f19564d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f19565e;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f19566b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f19567c = new Runnable() {
        public final void run() {
            c.this.c();
            c.this.f19566b.postDelayed(c.this.f19567c, 30000);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f19568f;

    private c() {
        HandlerThread handlerThread = new HandlerThread("EventUploadThread");
        handlerThread.start();
        this.f19566b = new Handler(handlerThread.getLooper());
    }

    public static c a() {
        if (f19565e == null) {
            synchronized (c.class) {
                if (f19565e == null) {
                    f19565e = new c();
                }
            }
        }
        return f19565e;
    }

    private static void e() {
        if (i.a()) {
            a.a();
            a.a(new com.bytedance.frameworks.core.b.c() {
                public final void run() {
                    c.a().c();
                }
            });
        }
    }

    private static void d() {
        if (com.bytedance.crash.runtime.b.b() == null) {
            if (System.currentTimeMillis() - j.f() > 180000) {
                a.a();
                a.a(new com.bytedance.frameworks.core.b.c() {
                    public final void run() {
                        c.b();
                    }
                });
            }
        } else if (!f19564d.isEmpty()) {
            a.a();
            a.a(new com.bytedance.frameworks.core.b.c() {
                public final void run() {
                    c.b();
                }
            });
        }
    }

    public static void b() {
        HashMap hashMap;
        synchronized (f19564d) {
            hashMap = new HashMap(f19564d);
            f19564d.clear();
        }
        if (com.bytedance.crash.runtime.b.b() != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry.getValue();
                if (concurrentLinkedQueue != null && (com.bytedance.crash.runtime.b.b() == null || com.bytedance.crash.runtime.b.b().getLogTypeSwitch(str))) {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            b bVar = (b) concurrentLinkedQueue.poll();
                            if (bVar == null) {
                                break;
                            }
                            b(bVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:24|(2:26|(3:30|31|(1:33)))|34|35|46|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r10 = this;
            android.os.Handler r0 = r10.f19566b
            monitor-enter(r0)
            boolean r1 = r10.f19568f     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            return
        L_0x0009:
            r1 = 1
            r10.f19568f = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L_0x0012:
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.e.b> r2 = f19563a
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 != 0) goto L_0x0094
            r2 = 0
        L_0x001c:
            r4 = 10
            if (r2 >= r4) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.e.b> r4 = f19563a     // Catch:{ Throwable -> 0x0034 }
            boolean r4 = r4.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r4 != 0) goto L_0x0036
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.e.b> r4 = f19563a     // Catch:{ Throwable -> 0x0034 }
            java.lang.Object r4 = r4.poll()     // Catch:{ Throwable -> 0x0034 }
            r0.add(r4)     // Catch:{ Throwable -> 0x0034 }
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0034:
            goto L_0x0012
        L_0x0036:
            boolean r2 = r0.isEmpty()     // Catch:{ Throwable -> 0x0034 }
            if (r2 == 0) goto L_0x003d
            goto L_0x0094
        L_0x003d:
            com.bytedance.crash.runtime.assembly.e r2 = com.bytedance.crash.runtime.assembly.e.a()     // Catch:{ Throwable -> 0x0034 }
            com.bytedance.crash.e.a r2 = r2.a((java.util.List<com.bytedance.crash.e.a>) r0)     // Catch:{ Throwable -> 0x0034 }
            if (r2 == 0) goto L_0x008f
            com.bytedance.crash.upload.a r4 = com.bytedance.crash.upload.a.a()     // Catch:{ Throwable -> 0x0034 }
            org.json.JSONObject r2 = r2.f19417a     // Catch:{ Throwable -> 0x0034 }
            if (r2 == 0) goto L_0x008f
            int r5 = r2.length()     // Catch:{ Throwable -> 0x0034 }
            if (r5 > 0) goto L_0x0056
            goto L_0x008f
        L_0x0056:
            com.bytedance.crash.runtime.a r5 = com.bytedance.crash.j.a()     // Catch:{ Throwable -> 0x008f }
            java.util.Map r5 = r5.a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r5 = com.bytedance.crash.upload.b.b((java.util.Map) r5)     // Catch:{ Throwable -> 0x008f }
            android.content.Context r4 = r4.f19560a     // Catch:{ Throwable -> 0x008f }
            java.io.File r4 = com.bytedance.crash.i.h.a(r4)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r6 = "ensure_%s.npth"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x008f }
            long r8 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Throwable -> 0x008f }
            r7[r3] = r8     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = java.lang.String.format(r6, r7)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r3 = com.bytedance.crash.i.d.a(r4, r3, r5, r2, r1)     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x008f }
            com.bytedance.crash.upload.h r2 = com.bytedance.crash.upload.b.a((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r2.a()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            com.bytedance.crash.i.d.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x008f }
        L_0x008f:
            r0.clear()     // Catch:{ Throwable -> 0x0034 }
            goto L_0x0012
        L_0x0094:
            r10.f19568f = r3
            return
        L_0x0097:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.c.c():void");
    }

    private static void b(b bVar) {
        boolean z;
        f19563a.add(bVar);
        int size = f19563a.size();
        if (size >= 10) {
            z = true;
        } else {
            z = false;
        }
        new StringBuilder("[enqueue] size=").append(size);
        if (z) {
            e();
        }
    }

    private static void c(b bVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = bVar.f19417a.getString("log_type");
            synchronized (f19564d) {
                concurrentLinkedQueue = f19564d.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    f19564d.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(bVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException unused) {
        }
    }

    public static void a(@NonNull b bVar) {
        d();
        if (com.bytedance.crash.runtime.b.b() != null || System.currentTimeMillis() - j.f() >= 180000) {
            String str = null;
            try {
                str = bVar.f19417a.getString("log_type");
            } catch (JSONException unused) {
            }
            if (TextUtils.isEmpty(str) || com.bytedance.crash.runtime.b.b() == null || com.bytedance.crash.runtime.b.b().getLogTypeSwitch(str)) {
                b(bVar);
            }
            return;
        }
        c(bVar);
    }
}
