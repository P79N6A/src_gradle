package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.taobao.android.dexposed.ClassUtils;
import com.umeng.analytics.pro.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class ap {

    /* renamed from: a  reason: collision with root package name */
    public static String f80374a;

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f80375d = new JSONObject();

    /* renamed from: b  reason: collision with root package name */
    Application.ActivityLifecycleCallbacks f80376b = new Application.ActivityLifecycleCallbacks() {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            ap.this.c(activity);
        }

        public void onActivityResumed(Activity activity) {
            ap.this.b(activity);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Long> f80377c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Application f80378e = null;

    public void a() {
        if (this.f80378e != null) {
            this.f80378e.unregisterActivityLifecycleCallbacks(this.f80376b);
        }
    }

    public void a(Context context) {
        c(null);
        a();
    }

    private void a(Activity activity) {
        this.f80378e.registerActivityLifecycleCallbacks(this.f80376b);
        if (f80374a == null) {
            b(activity);
        }
    }

    public ap(Activity activity) {
        if (activity != null) {
            this.f80378e = activity.getApplication();
            a(activity);
        }
    }

    /* access modifiers changed from: private */
    public void b(Activity activity) {
        f80374a = activity.getPackageName() + ClassUtils.PACKAGE_SEPARATOR + activity.getLocalClassName();
        synchronized (this.f80377c) {
            this.f80377c.put(f80374a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void b(Context context) {
        try {
            synchronized (f80375d) {
                if (f80375d.length() > 0) {
                    w.a(context).a(bd.a(), f80375d, w.a.AUTOPAGE);
                    f80375d = new JSONObject();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Long> r6 = r5.f80377c     // Catch:{ Throwable -> 0x004d }
            monitor-enter(r6)     // Catch:{ Throwable -> 0x004d }
            java.util.Map<java.lang.String, java.lang.Long> r2 = r5.f80377c     // Catch:{ all -> 0x004a }
            java.lang.String r3 = f80374a     // Catch:{ all -> 0x004a }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x002a
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.String, java.lang.Long> r2 = r5.f80377c     // Catch:{ all -> 0x004a }
            java.lang.String r3 = f80374a     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x004a }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x004a }
            long r2 = r2.longValue()     // Catch:{ all -> 0x004a }
            r4 = 0
            long r0 = r0 - r2
            java.util.Map<java.lang.String, java.lang.Long> r2 = r5.f80377c     // Catch:{ all -> 0x004a }
            java.lang.String r3 = f80374a     // Catch:{ all -> 0x004a }
            r2.remove(r3)     // Catch:{ all -> 0x004a }
        L_0x002a:
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            org.json.JSONObject r6 = f80375d     // Catch:{ Throwable -> 0x004d }
            monitor-enter(r6)     // Catch:{ Throwable -> 0x004d }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0046 }
            r2.<init>()     // Catch:{ Throwable -> 0x0046 }
            f80375d = r2     // Catch:{ Throwable -> 0x0046 }
            java.lang.String r3 = "page_name"
            java.lang.String r4 = f80374a     // Catch:{ Throwable -> 0x0046 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0046 }
            org.json.JSONObject r2 = f80375d     // Catch:{ Throwable -> 0x0046 }
            java.lang.String r3 = "duration"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x0046 }
            goto L_0x0046
        L_0x0044:
            r0 = move-exception
            goto L_0x0048
        L_0x0046:
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            goto L_0x004d
        L_0x0048:
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ Throwable -> 0x004d }
        L_0x004a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.ap.c(android.app.Activity):void");
    }
}
