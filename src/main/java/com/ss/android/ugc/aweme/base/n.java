package com.ss.android.ugc.aweme.base;

import android.content.Context;
import android.os.Process;
import android.support.annotation.NonNull;
import com.bytedance.apm.c.c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.framwork.core.monitor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.d.d;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.framework.services.IGlobalConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Object> f2756a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final List<Runnable> f2757b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f2758c;

    /* renamed from: d  reason: collision with root package name */
    public static d.a f2759d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExecutorService f2760e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f2761f = new ThreadFactory() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f2762a;

        public final Thread newThread(@NonNull Runnable runnable) {
            final Runnable runnable2 = runnable;
            if (!PatchProxy.isSupport(new Object[]{runnable2}, this, f2762a, false, 24043, new Class[]{Runnable.class}, Thread.class)) {
                return new Thread(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f2763a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f2763a, false, 24044, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f2763a, false, 24044, new Class[0], Void.TYPE);
                            return;
                        }
                        Process.setThreadPriority(10);
                        runnable2.run();
                    }
                }, "AwemeMonitor");
            }
            return (Thread) PatchProxy.accessDispatch(new Object[]{runnable2}, this, f2762a, false, 24043, new Class[]{Runnable.class}, Thread.class);
        }
    };
    private static IGlobalConfigService g;

    public static void a(String str, JSONObject jSONObject) {
        final String str2 = str;
        final JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f2758c, true, 24030, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f2758c, true, 24030, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f2770a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f2770a, false, 24046, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2770a, false, 24046, new Class[0], Void.TYPE);
                    return;
                }
                MonitorUtils.monitorCommonLog(str2, jSONObject2);
            }
        });
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject, jSONObject2}, null, f2758c, true, 24032, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject, jSONObject2}, null, f2758c, true, 24032, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorDuration(str, jSONObject, jSONObject2);
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f2758c, true, 24036, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f2758c, true, 24036, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (g == null) {
                g = (IGlobalConfigService) ServiceManager.get().getService(IGlobalConfigService.class);
            }
            if (g != null && g.isDeviceMonitor()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f), f2761f, new ThreadPoolExecutor.DiscardOldestPolicy());
        f2760e = threadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void b() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.base.n> r0 = com.ss.android.ugc.aweme.base.n.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x004a }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f2758c     // Catch:{ all -> 0x004a }
            r5 = 1
            r6 = 24035(0x5de3, float:3.368E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x004a }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x004a }
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0027
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x004a }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f2758c     // Catch:{ all -> 0x004a }
            r6 = 1
            r7 = 24035(0x5de3, float:3.368E-41)
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ all -> 0x004a }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x004a }
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)
            return
        L_0x0027:
            java.util.List<java.lang.Runnable> r1 = f2757b     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            java.util.List<java.lang.Runnable> r1 = f2757b     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004a }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x004a }
            java.util.concurrent.ExecutorService r3 = f2760e     // Catch:{ all -> 0x004a }
            r3.submit(r2)     // Catch:{ all -> 0x004a }
            goto L_0x0031
        L_0x0043:
            java.util.List<java.lang.Runnable> r1 = f2757b     // Catch:{ all -> 0x004a }
            r1.clear()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r0)
            return
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.n.b():void");
    }

    private static synchronized void a(Runnable runnable) {
        a aVar;
        Runnable runnable2 = runnable;
        synchronized (n.class) {
            if (PatchProxy.isSupport(new Object[]{runnable2}, null, f2758c, true, 24034, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2}, null, f2758c, true, 24034, new Class[]{Runnable.class}, Void.TYPE);
                return;
            }
            if (ApmDelegate.getInstance().isConfigReady()) {
                aVar = a.f2273a;
            } else {
                aVar = null;
            }
            if (aVar == null) {
                f2757b.add(runnable2);
            } else {
                f2760e.submit(runnable2);
            }
        }
    }

    public static void a(Context context, @NonNull c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, aVar}, null, f2758c, true, 24018, new Class[]{Context.class, c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aVar}, null, f2758c, true, 24018, new Class[]{Context.class, c.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.apm.a.a(aVar.a());
        b();
    }

    public static void b(String str, String str2, float f2) {
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2)}, null, f2758c, true, 24027, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2)}, null, f2758c, true, 24027, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        final float f3 = f2;
        a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f2777a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f2777a, false, 24054, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2777a, false, 24054, new Class[0], Void.TYPE);
                    return;
                }
                MonitorUtils.monitorOnTimer(str3, str4, f3);
            }
        });
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24031, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24031, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorStatusRate(str, i, jSONObject);
    }

    public static void b(String str, String str2, JSONObject jSONObject) {
        final String str3 = str;
        final String str4 = str2;
        final JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject2}, null, f2758c, true, 24029, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject2}, null, f2758c, true, 24029, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f2766a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f2766a, false, 24045, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2766a, false, 24045, new Class[0], Void.TYPE);
                    return;
                }
                try {
                    if (jSONObject2 != null) {
                        jSONObject2.put("service", str4);
                    }
                } catch (Exception unused) {
                }
                MonitorUtils.monitorCommonLog(str3, jSONObject2);
            }
        });
    }

    public static void a(String str, String str2, float f2) {
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Float.valueOf(f2)}, null, f2758c, true, 24026, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Float.valueOf(f2)}, null, f2758c, true, 24026, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        final float f3 = f2;
        a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f2773a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f2773a, false, 24053, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2773a, false, 24053, new Class[0], Void.TYPE);
                    return;
                }
                MonitorUtils.monitorDirectOnTimer(str3, str4, f3);
            }
        });
    }

    public static void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject, jSONObject2}, null, f2758c, true, 24033, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject, jSONObject2}, null, f2758c, true, 24033, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }

    public static void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24019, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24019, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorSLA(j, j2, str, str2, str3, i, jSONObject);
    }

    public static void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24020, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, null, f2758c, true, 24020, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        MonitorUtils.monitorApiError(j, j2, str, str2, str3, i, jSONObject);
    }
}
