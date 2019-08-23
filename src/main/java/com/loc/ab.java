package com.loc;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    private static final ab f25404a = new ab();

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadFactory f25405d = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, u> f25406b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, a> f25407c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private ExecutorService f25408e = null;

    class a {

        /* renamed from: a  reason: collision with root package name */
        volatile boolean f25409a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f25410b;

        a() {
        }
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f25412a = new AtomicInteger(1);

        b() {
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "amapD#" + this.f25412a.getAndIncrement());
        }
    }

    private ab() {
    }

    public static ab b() {
        return f25404a;
    }

    private static boolean b(dh dhVar) {
        return dhVar != null && !TextUtils.isEmpty(dhVar.f25797a) && !TextUtils.isEmpty(dhVar.a());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|(5:10|11|12|13|14)|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.loc.ab.a a(com.loc.dh r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, com.loc.ab$a> r0 = r3.f25407c
            monitor-enter(r0)
            boolean r1 = b(r4)     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x000c
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r4
        L_0x000c:
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x0027 }
            java.util.Map<java.lang.String, com.loc.ab$a> r1 = r3.f25407c     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0027 }
            com.loc.ab$a r1 = (com.loc.ab.a) r1     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0025
            com.loc.ab$a r2 = new com.loc.ab$a     // Catch:{ Throwable -> 0x0025 }
            r2.<init>()     // Catch:{ Throwable -> 0x0025 }
            java.util.Map<java.lang.String, com.loc.ab$a> r1 = r3.f25407c     // Catch:{ Throwable -> 0x0024 }
            r1.put(r4, r2)     // Catch:{ Throwable -> 0x0024 }
        L_0x0024:
            r1 = r2
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r1
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ab.a(com.loc.dh):com.loc.ab$a");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:8|9|10|11|12)|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.loc.u a(android.content.Context r6, com.loc.dh r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = b(r7)
            if (r0 == 0) goto L_0x0031
            if (r6 != 0) goto L_0x0009
            goto L_0x0031
        L_0x0009:
            java.lang.String r0 = r7.a()
            java.util.Map<java.lang.String, com.loc.u> r1 = r5.f25406b
            monitor-enter(r1)
            java.util.Map<java.lang.String, com.loc.u> r2 = r5.f25406b     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x002e }
            com.loc.u r2 = (com.loc.u) r2     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            com.loc.z r3 = new com.loc.z     // Catch:{ Throwable -> 0x002c }
            android.content.Context r4 = r6.getApplicationContext()     // Catch:{ Throwable -> 0x002c }
            r3.<init>(r4, r7)     // Catch:{ Throwable -> 0x002c }
            java.util.Map<java.lang.String, com.loc.u> r2 = r5.f25406b     // Catch:{ Throwable -> 0x002b }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x002b }
            com.loc.x.a(r6, r7)     // Catch:{ Throwable -> 0x002b }
        L_0x002b:
            r2 = r3
        L_0x002c:
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            return r2
        L_0x002e:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x0031:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ab.a(android.content.Context, com.loc.dh):com.loc.u");
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService a() {
        try {
            if (this.f25408e == null || this.f25408e.isShutdown()) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f), f25405d);
                this.f25408e = threadPoolExecutor;
            }
        } catch (Throwable unused) {
        }
        return this.f25408e;
    }
}
