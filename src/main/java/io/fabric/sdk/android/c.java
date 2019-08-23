package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.j;
import io.fabric.sdk.android.services.concurrency.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {

    /* renamed from: a  reason: collision with root package name */
    static volatile c f83130a;

    /* renamed from: b  reason: collision with root package name */
    static final l f83131b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f83132c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f83133d;

    /* renamed from: e  reason: collision with root package name */
    public final f<c> f83134e;

    /* renamed from: f  reason: collision with root package name */
    public a f83135f;
    public WeakReference<Activity> g;
    public AtomicBoolean h = new AtomicBoolean(false);
    final l i;
    final boolean j;
    private final Context k;
    private final Map<Class<? extends i>, i> l;
    private final f<?> m;
    private final s n;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Context f83140a;

        /* renamed from: b  reason: collision with root package name */
        i[] f83141b;

        /* renamed from: c  reason: collision with root package name */
        j f83142c;

        /* renamed from: d  reason: collision with root package name */
        Handler f83143d;

        /* renamed from: e  reason: collision with root package name */
        l f83144e;

        /* renamed from: f  reason: collision with root package name */
        boolean f83145f;
        String g;
        String h;
        f<c> i;

        public a(Context context) {
            if (context != null) {
                this.f83140a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private static String e() {
        return "1.4.8.32";
    }

    private static String f() {
        return "io.fabric.sdk.android:fabric";
    }

    private Collection<i> g() {
        return this.l.values();
    }

    private static c d() {
        if (f83130a != null) {
            return f83130a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public static l a() {
        if (f83130a == null) {
            return f83131b;
        }
        return f83130a.i;
    }

    public static boolean b() {
        if (f83130a == null) {
            return false;
        }
        return f83130a.j;
    }

    public static boolean c() {
        if (f83130a == null || !f83130a.h.get()) {
            return false;
        }
        return true;
    }

    public final c a(Activity activity) {
        this.g = new WeakReference<>(activity);
        return this;
    }

    public static <T extends i> T a(Class<T> cls) {
        return (i) d().l.get(cls);
    }

    private Future<Map<String, k>> b(Context context) {
        return this.f83132c.submit(new e(context.getPackageCodePath()));
    }

    private void a(Context context) {
        StringBuilder sb;
        Future<Map<String, k>> b2 = b(context);
        Collection<i> g2 = g();
        m mVar = new m(b2, g2);
        ArrayList<i> arrayList = new ArrayList<>(g2);
        Collections.sort(arrayList);
        mVar.injectParameters(context, this, f.f83147d, this.n);
        for (i injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.m, this.n);
        }
        mVar.initialize();
        if (a().a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(f());
            sb.append(" [Version: ");
            sb.append(e());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (i iVar : arrayList) {
            iVar.initializationTask.a(mVar.initializationTask);
            a(this.l, iVar);
            iVar.initialize();
            if (sb != null) {
                sb.append(iVar.getIdentifier());
                sb.append(" [Version: ");
                sb.append(iVar.getVersion());
                sb.append("]\n");
            }
        }
    }

    private static void a(Map<Class<? extends i>, i> map, Collection<? extends i> collection) {
        for (i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof j) {
                a(map, ((j) iVar).getKits());
            }
        }
    }

    private static void a(Map<Class<? extends i>, i> map, i iVar) {
        DependsOn dependsOn = iVar.dependsOnAnnotation;
        if (dependsOn != null) {
            for (Class cls : dependsOn.a()) {
                if (cls.isInterface()) {
                    for (i next : map.values()) {
                        if (cls.isAssignableFrom(next.getClass())) {
                            iVar.initializationTask.a(next.initializationTask);
                        }
                    }
                } else if (map.get(cls) != null) {
                    iVar.initializationTask.a(map.get(cls).initializationTask);
                } else {
                    throw new l("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r13v29, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static io.fabric.sdk.android.c a(android.content.Context r13, io.fabric.sdk.android.i... r14) {
        /*
            io.fabric.sdk.android.c r0 = f83130a
            if (r0 != 0) goto L_0x0139
            java.lang.Class<io.fabric.sdk.android.c> r0 = io.fabric.sdk.android.c.class
            monitor-enter(r0)
            io.fabric.sdk.android.c r1 = f83130a     // Catch:{ all -> 0x0136 }
            if (r1 != 0) goto L_0x0134
            io.fabric.sdk.android.c$a r1 = new io.fabric.sdk.android.c$a     // Catch:{ all -> 0x0136 }
            r1.<init>(r13)     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.i[] r13 = r1.f83141b     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x012c
            android.content.Context r13 = r1.f83140a     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.b.l r13 = io.fabric.sdk.android.services.b.l.a(r13)     // Catch:{ all -> 0x0136 }
            boolean r13 = r13.a()     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x0068
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0136 }
            r13.<init>()     // Catch:{ all -> 0x0136 }
            int r2 = r14.length     // Catch:{ all -> 0x0136 }
            r3 = 0
            r4 = 0
        L_0x0028:
            if (r4 >= r2) goto L_0x005f
            r5 = r14[r4]     // Catch:{ all -> 0x0136 }
            java.lang.String r6 = r5.getIdentifier()     // Catch:{ all -> 0x0136 }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ all -> 0x0136 }
            r9 = 607220212(0x243171f4, float:3.847728E-17)
            if (r8 == r9) goto L_0x004a
            r9 = 1830452504(0x6d1a7d18, float:2.988245E27)
            if (r8 == r9) goto L_0x0040
            goto L_0x0054
        L_0x0040:
            java.lang.String r8 = "com.crashlytics.sdk.android:crashlytics"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0136 }
            if (r6 == 0) goto L_0x0054
            r6 = 0
            goto L_0x0055
        L_0x004a:
            java.lang.String r8 = "com.crashlytics.sdk.android:answers"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0136 }
            if (r6 == 0) goto L_0x0054
            r6 = 1
            goto L_0x0055
        L_0x0054:
            r6 = -1
        L_0x0055:
            switch(r6) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0059;
                default: goto L_0x0058;
            }     // Catch:{ all -> 0x0136 }
        L_0x0058:
            goto L_0x005c
        L_0x0059:
            r13.add(r5)     // Catch:{ all -> 0x0136 }
        L_0x005c:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x005f:
            io.fabric.sdk.android.i[] r14 = new io.fabric.sdk.android.i[r3]     // Catch:{ all -> 0x0136 }
            java.lang.Object[] r13 = r13.toArray(r14)     // Catch:{ all -> 0x0136 }
            r14 = r13
            io.fabric.sdk.android.i[] r14 = (io.fabric.sdk.android.i[]) r14     // Catch:{ all -> 0x0136 }
        L_0x0068:
            r1.f83141b = r14     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.concurrency.j r13 = r1.f83142c     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x008a
            int r3 = io.fabric.sdk.android.services.concurrency.j.f83261a     // Catch:{ all -> 0x0136 }
            int r4 = io.fabric.sdk.android.services.concurrency.j.f83262b     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.concurrency.j r13 = new io.fabric.sdk.android.services.concurrency.j     // Catch:{ all -> 0x0136 }
            r5 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.concurrency.c r8 = new io.fabric.sdk.android.services.concurrency.c     // Catch:{ all -> 0x0136 }
            r8.<init>()     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.concurrency.j$a r9 = new io.fabric.sdk.android.services.concurrency.j$a     // Catch:{ all -> 0x0136 }
            r14 = 10
            r9.<init>(r14)     // Catch:{ all -> 0x0136 }
            r2 = r13
            r2.<init>(r3, r4, r5, r7, r8, r9)     // Catch:{ all -> 0x0136 }
            r1.f83142c = r13     // Catch:{ all -> 0x0136 }
        L_0x008a:
            android.os.Handler r13 = r1.f83143d     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x0099
            android.os.Handler r13 = new android.os.Handler     // Catch:{ all -> 0x0136 }
            android.os.Looper r14 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0136 }
            r13.<init>(r14)     // Catch:{ all -> 0x0136 }
            r1.f83143d = r13     // Catch:{ all -> 0x0136 }
        L_0x0099:
            io.fabric.sdk.android.l r13 = r1.f83144e     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r1.f83145f     // Catch:{ all -> 0x0136 }
            if (r13 == 0) goto L_0x00aa
            io.fabric.sdk.android.b r13 = new io.fabric.sdk.android.b     // Catch:{ all -> 0x0136 }
            r14 = 3
            r13.<init>(r14)     // Catch:{ all -> 0x0136 }
            r1.f83144e = r13     // Catch:{ all -> 0x0136 }
            goto L_0x00b1
        L_0x00aa:
            io.fabric.sdk.android.b r13 = new io.fabric.sdk.android.b     // Catch:{ all -> 0x0136 }
            r13.<init>()     // Catch:{ all -> 0x0136 }
            r1.f83144e = r13     // Catch:{ all -> 0x0136 }
        L_0x00b1:
            java.lang.String r13 = r1.h     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x00bd
            android.content.Context r13 = r1.f83140a     // Catch:{ all -> 0x0136 }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ all -> 0x0136 }
            r1.h = r13     // Catch:{ all -> 0x0136 }
        L_0x00bd:
            io.fabric.sdk.android.f<io.fabric.sdk.android.c> r13 = r1.i     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x00c5
            io.fabric.sdk.android.f r13 = io.fabric.sdk.android.f.f83147d     // Catch:{ all -> 0x0136 }
            r1.i = r13     // Catch:{ all -> 0x0136 }
        L_0x00c5:
            io.fabric.sdk.android.i[] r13 = r1.f83141b     // Catch:{ all -> 0x0136 }
            if (r13 != 0) goto L_0x00d0
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x0136 }
            r13.<init>()     // Catch:{ all -> 0x0136 }
            r5 = r13
            goto L_0x00e3
        L_0x00d0:
            io.fabric.sdk.android.i[] r13 = r1.f83141b     // Catch:{ all -> 0x0136 }
            java.util.List r13 = java.util.Arrays.asList(r13)     // Catch:{ all -> 0x0136 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x0136 }
            int r2 = r13.size()     // Catch:{ all -> 0x0136 }
            r14.<init>(r2)     // Catch:{ all -> 0x0136 }
            a((java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.i>, io.fabric.sdk.android.i>) r14, (java.util.Collection<? extends io.fabric.sdk.android.i>) r13)     // Catch:{ all -> 0x0136 }
            r5 = r14
        L_0x00e3:
            android.content.Context r13 = r1.f83140a     // Catch:{ all -> 0x0136 }
            android.content.Context r4 = r13.getApplicationContext()     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.b.s r11 = new io.fabric.sdk.android.services.b.s     // Catch:{ all -> 0x0136 }
            java.lang.String r13 = r1.h     // Catch:{ all -> 0x0136 }
            java.lang.String r14 = r1.g     // Catch:{ all -> 0x0136 }
            java.util.Collection r2 = r5.values()     // Catch:{ all -> 0x0136 }
            r11.<init>(r4, r13, r14, r2)     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.c r13 = new io.fabric.sdk.android.c     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.services.concurrency.j r6 = r1.f83142c     // Catch:{ all -> 0x0136 }
            android.os.Handler r7 = r1.f83143d     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.l r8 = r1.f83144e     // Catch:{ all -> 0x0136 }
            boolean r9 = r1.f83145f     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.f<io.fabric.sdk.android.c> r10 = r1.i     // Catch:{ all -> 0x0136 }
            android.content.Context r14 = r1.f83140a     // Catch:{ all -> 0x0136 }
            boolean r1 = r14 instanceof android.app.Activity     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x010b
            android.app.Activity r14 = (android.app.Activity) r14     // Catch:{ all -> 0x0136 }
            goto L_0x010c
        L_0x010b:
            r14 = 0
        L_0x010c:
            r12 = r14
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0136 }
            f83130a = r13     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.a r14 = new io.fabric.sdk.android.a     // Catch:{ all -> 0x0136 }
            android.content.Context r1 = r13.k     // Catch:{ all -> 0x0136 }
            r14.<init>(r1)     // Catch:{ all -> 0x0136 }
            r13.f83135f = r14     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.a r14 = r13.f83135f     // Catch:{ all -> 0x0136 }
            io.fabric.sdk.android.c$1 r1 = new io.fabric.sdk.android.c$1     // Catch:{ all -> 0x0136 }
            r1.<init>()     // Catch:{ all -> 0x0136 }
            r14.a(r1)     // Catch:{ all -> 0x0136 }
            android.content.Context r14 = r13.k     // Catch:{ all -> 0x0136 }
            r13.a((android.content.Context) r14)     // Catch:{ all -> 0x0136 }
            goto L_0x0134
        L_0x012c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0136 }
            java.lang.String r14 = "Kits already set."
            r13.<init>(r14)     // Catch:{ all -> 0x0136 }
            throw r13     // Catch:{ all -> 0x0136 }
        L_0x0134:
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0139
        L_0x0136:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0136 }
            throw r13
        L_0x0139:
            io.fabric.sdk.android.c r13 = f83130a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.c.a(android.content.Context, io.fabric.sdk.android.i[]):io.fabric.sdk.android.c");
    }

    c(Context context, Map<Class<? extends i>, i> map, j jVar, Handler handler, l lVar, boolean z, f fVar, s sVar, Activity activity) {
        this.k = context;
        this.l = map;
        this.f83132c = jVar;
        this.f83133d = handler;
        this.i = lVar;
        this.j = z;
        this.f83134e = fVar;
        final int size = map.size();
        this.m = new f() {

            /* renamed from: a  reason: collision with root package name */
            final CountDownLatch f83137a = new CountDownLatch(size);

            public final void a() {
                this.f83137a.countDown();
                if (this.f83137a.getCount() == 0) {
                    c.this.h.set(true);
                    c.this.f83134e.a();
                }
            }
        };
        this.n = sVar;
        a(activity);
    }
}
