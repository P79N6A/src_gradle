package io.fabric.sdk.android.services.b;

import android.content.Context;
import android.content.SharedPreferences;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    private static l f83177d;

    /* renamed from: e  reason: collision with root package name */
    private static Object f83178e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f83179a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f83180b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f83181c;

    /* renamed from: f  reason: collision with root package name */
    private final p f83182f;
    private boolean g;

    public final boolean a() {
        if (this.g && this.f83180b) {
            return this.f83181c;
        }
        if (this.f83182f != null) {
            return this.f83182f.a();
        }
        return true;
    }

    public static l a(Context context) {
        l lVar;
        synchronized (f83178e) {
            if (f83177d == null) {
                f83177d = new l(context);
            }
            lVar = f83177d;
        }
        return lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            if (r6 == 0) goto L_0x0062
            java.lang.String r0 = "com.google.firebase.crashlytics.prefs"
            r1 = 0
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r6, r0, r1)
            r5.f83179a = r0
            io.fabric.sdk.android.services.b.p r0 = io.fabric.sdk.android.services.b.q.a(r6)
            r5.f83182f = r0
            android.content.SharedPreferences r0 = r5.f83179a
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 == 0) goto L_0x0029
            android.content.SharedPreferences r0 = r5.f83179a
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.getBoolean(r3, r2)
        L_0x0027:
            r3 = 1
            goto L_0x0054
        L_0x0029:
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r3 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x0052 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r0 == 0) goto L_0x0052
            android.os.Bundle r3 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            android.os.Bundle r3 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0052 }
            java.lang.String r4 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r3.containsKey(r4)     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0052 }
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.getBoolean(r3)     // Catch:{ NameNotFoundException -> 0x0052 }
            goto L_0x0027
        L_0x0052:
            r0 = 1
            r3 = 0
        L_0x0054:
            r5.f83181c = r0
            r5.f83180b = r3
            java.lang.String r6 = io.fabric.sdk.android.services.b.i.i(r6)
            if (r6 == 0) goto L_0x005f
            r1 = 1
        L_0x005f:
            r5.g = r1
            return
        L_0x0062:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.b.l.<init>(android.content.Context):void");
    }
}
