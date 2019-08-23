package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.location.LocationManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private LocationManager f80833b;

    /* renamed from: d  reason: collision with root package name */
    private Context f80834d;

    /* renamed from: e  reason: collision with root package name */
    private d f80835e;

    private b() {
    }

    public synchronized void a() {
        ULog.i("UMSysLocation", "destroy");
        try {
            if (this.f80833b != null) {
                this.f80833b = null;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f80834d, th);
        }
    }

    public b(Context context) {
        if (context == null) {
            MLog.e("Context参数不能为null");
            return;
        }
        this.f80834d = context.getApplicationContext();
        this.f80833b = (LocationManager) context.getApplicationContext().getSystemService("location");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.umeng.commonsdk.proguard.d r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "UMSysLocation"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "getSystemLocation"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x00c5 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x00c3
            android.content.Context r0 = r8.f80834d     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x0016
            goto L_0x00c3
        L_0x0016:
            r8.f80835e = r9     // Catch:{ all -> 0x00c5 }
            android.content.Context r0 = r8.f80834d     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r0, r2)     // Catch:{ all -> 0x00c5 }
            android.content.Context r2 = r8.f80834d     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r2 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r2, r3)     // Catch:{ all -> 0x00c5 }
            r3 = 0
            if (r0 != 0) goto L_0x0038
            if (r2 != 0) goto L_0x0038
            com.umeng.commonsdk.proguard.d r9 = r8.f80835e     // Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x0036
            com.umeng.commonsdk.proguard.d r9 = r8.f80835e     // Catch:{ all -> 0x00c5 }
            r9.a(r3)     // Catch:{ all -> 0x00c5 }
        L_0x0036:
            monitor-exit(r8)
            return
        L_0x0038:
            android.location.LocationManager r5 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            if (r5 == 0) goto L_0x0096
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0098 }
            r6 = 21
            if (r5 < r6) goto L_0x0053
            android.location.LocationManager r5 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r6 = "gps"
            boolean r5 = r5.isProviderEnabled(r6)     // Catch:{ Throwable -> 0x0098 }
            android.location.LocationManager r6 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r7 = "network"
            boolean r6 = r6.isProviderEnabled(r7)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x006b
        L_0x0053:
            if (r2 == 0) goto L_0x005e
            android.location.LocationManager r5 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r6 = "gps"
            boolean r5 = r5.isProviderEnabled(r6)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x006a
            android.location.LocationManager r6 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r7 = "network"
            boolean r6 = r6.isProviderEnabled(r7)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r5 != 0) goto L_0x006f
            if (r6 == 0) goto L_0x0090
        L_0x006f:
            java.lang.String r5 = "UMSysLocation"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r7 = "getLastKnownLocation(LocationManager.PASSIVE_PROVIDER)"
            r6[r4] = r7     // Catch:{ Throwable -> 0x0098 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r5, (java.lang.Object[]) r6)     // Catch:{ Throwable -> 0x0098 }
            if (r2 == 0) goto L_0x0085
            android.location.LocationManager r0 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r2 = "passive"
            android.location.Location r0 = r0.getLastKnownLocation(r2)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x0091
        L_0x0085:
            if (r0 == 0) goto L_0x0090
            android.location.LocationManager r0 = r8.f80833b     // Catch:{ Throwable -> 0x0098 }
            java.lang.String r2 = "network"
            android.location.Location r0 = r0.getLastKnownLocation(r2)     // Catch:{ Throwable -> 0x0098 }
            goto L_0x0091
        L_0x0090:
            r0 = r3
        L_0x0091:
            com.umeng.commonsdk.proguard.d r2 = r8.f80835e     // Catch:{ Throwable -> 0x0098 }
            r2.a(r0)     // Catch:{ Throwable -> 0x0098 }
        L_0x0096:
            monitor-exit(r8)
            return
        L_0x0098:
            r0 = move-exception
            java.lang.String r2 = "UMSysLocation"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = "e is "
            r5.<init>(r6)     // Catch:{ all -> 0x00c5 }
            r5.append(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c5 }
            r1[r4] = r5     // Catch:{ all -> 0x00c5 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r2, (java.lang.Object[]) r1)     // Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x00bc
            r9.a(r3)     // Catch:{ Throwable -> 0x00b6 }
            goto L_0x00bc
        L_0x00b6:
            r9 = move-exception
            android.content.Context r1 = r8.f80834d     // Catch:{ all -> 0x00c5 }
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r9)     // Catch:{ all -> 0x00c5 }
        L_0x00bc:
            android.content.Context r9 = r8.f80834d     // Catch:{ all -> 0x00c5 }
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r9, r0)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r8)
            return
        L_0x00c3:
            monitor-exit(r8)
            return
        L_0x00c5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.proguard.b.a(com.umeng.commonsdk.proguard.d):void");
    }
}
