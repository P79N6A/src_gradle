package com.mapbox.mapboxsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.mapbox.mapboxsdk.maps.aa;

@UiThread
@SuppressLint({"StaticFieldLeak"})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static e f26481a;

    /* renamed from: b  reason: collision with root package name */
    private static d f26482b;

    /* renamed from: c  reason: collision with root package name */
    private Context f26483c;

    /* renamed from: d  reason: collision with root package name */
    private String f26484d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f26485e;

    /* renamed from: f  reason: collision with root package name */
    private aa f26486f;

    @Nullable
    public static String a() {
        f();
        return f26482b.f26484d;
    }

    @NonNull
    public static Context b() {
        f();
        return f26482b.f26483c;
    }

    @Nullable
    public static aa d() {
        return f26482b.f26486f;
    }

    @NonNull
    public static e e() {
        if (f26481a == null) {
            f26481a = new f();
        }
        return f26481a;
    }

    private static void f() {
        if (f26482b == null) {
            throw new com.mapbox.mapboxsdk.b.d();
        }
    }

    public static synchronized Boolean c() {
        boolean z;
        synchronized (d.class) {
            f();
            if (f26482b.f26485e != null) {
                Boolean bool = f26482b.f26485e;
                return bool;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f26482b.f26483c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            return valueOf;
        }
    }

    private d(@NonNull Context context, @Nullable String str) {
        this.f26483c = context;
        this.f26484d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r6.startsWith("sk.") != false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[SYNTHETIC, Splitter:B:21:0x0062] */
    @android.support.annotation.UiThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.mapbox.mapboxsdk.d a(@android.support.annotation.NonNull android.content.Context r5, @android.support.annotation.Nullable java.lang.String r6) {
        /*
            java.lang.Class<com.mapbox.mapboxsdk.d> r0 = com.mapbox.mapboxsdk.d.class
            monitor-enter(r0)
            java.lang.String r1 = "Mapbox"
            com.mapbox.mapboxsdk.utils.f.a(r1)     // Catch:{ all -> 0x0081 }
            com.mapbox.mapboxsdk.d r1 = f26482b     // Catch:{ all -> 0x0081 }
            if (r1 != 0) goto L_0x007d
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "FileSource"
            com.mapbox.mapboxsdk.utils.f.a(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.locks.Lock r1 = com.mapbox.mapboxsdk.storage.FileSource.f26788b     // Catch:{ all -> 0x0081 }
            r1.lock()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.locks.Lock r1 = com.mapbox.mapboxsdk.storage.FileSource.f26787a     // Catch:{ all -> 0x0081 }
            r1.lock()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = com.mapbox.mapboxsdk.storage.FileSource.f26789c     // Catch:{ all -> 0x0081 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = com.mapbox.mapboxsdk.storage.FileSource.f26790d     // Catch:{ all -> 0x0081 }
            if (r1 != 0) goto L_0x0035
        L_0x0029:
            com.mapbox.mapboxsdk.storage.FileSource$a r1 = new com.mapbox.mapboxsdk.storage.FileSource$a     // Catch:{ all -> 0x0081 }
            r1.<init>(r3)     // Catch:{ all -> 0x0081 }
            android.content.Context[] r4 = new android.content.Context[r2]     // Catch:{ all -> 0x0081 }
            r4[r3] = r5     // Catch:{ all -> 0x0081 }
            r1.execute(r4)     // Catch:{ all -> 0x0081 }
        L_0x0035:
            com.mapbox.mapboxsdk.d r1 = new com.mapbox.mapboxsdk.d     // Catch:{ all -> 0x0081 }
            r1.<init>(r5, r6)     // Catch:{ all -> 0x0081 }
            f26482b = r1     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x0081 }
            java.util.Locale r1 = com.mapbox.mapboxsdk.constants.a.f26480a     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = r6.toLowerCase(r1)     // Catch:{ all -> 0x0081 }
            int r1 = r6.length()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "pk."
            boolean r1 = r6.startsWith(r1)     // Catch:{ all -> 0x0081 }
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = "sk."
            boolean r6 = r6.startsWith(r1)     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x007a
            com.mapbox.mapboxsdk.d r6 = f26482b     // Catch:{ Exception -> 0x006f }
            com.mapbox.mapboxsdk.e r1 = e()     // Catch:{ Exception -> 0x006f }
            com.mapbox.mapboxsdk.maps.aa r1 = r1.b()     // Catch:{ Exception -> 0x006f }
            r6.f26486f = r1     // Catch:{ Exception -> 0x006f }
            goto L_0x007a
        L_0x006f:
            r6 = move-exception
            java.lang.String r1 = "Error occurred while initializing telemetry"
            java.lang.String r2 = "Mbgl-Mapbox"
            com.mapbox.mapboxsdk.log.Logger.e(r2, r1, r6)     // Catch:{ all -> 0x0081 }
            com.mapbox.mapboxsdk.b.a(r1, r6)     // Catch:{ all -> 0x0081 }
        L_0x007a:
            com.mapbox.mapboxsdk.net.ConnectivityReceiver.a(r5)     // Catch:{ all -> 0x0081 }
        L_0x007d:
            com.mapbox.mapboxsdk.d r5 = f26482b     // Catch:{ all -> 0x0081 }
            monitor-exit(r0)
            return r5
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.d.a(android.content.Context, java.lang.String):com.mapbox.mapboxsdk.d");
    }
}
