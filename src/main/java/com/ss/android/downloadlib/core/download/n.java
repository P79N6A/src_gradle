package com.ss.android.downloadlib.core.download;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.ss.android.downloadlib.c.h;

public final class n implements q {

    /* renamed from: b  reason: collision with root package name */
    private static n f29038b;

    /* renamed from: a  reason: collision with root package name */
    private Context f29039a;

    public final long a() {
        return System.currentTimeMillis();
    }

    public final Long e() {
        return 1073741824L;
    }

    public final Long d() {
        return 2147483648L;
    }

    public final NetworkInfo b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29039a.getSystemService("connectivity");
        if (connectivityManager == null || !h.b("android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public final boolean c() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29039a.getSystemService("connectivity");
        boolean z2 = false;
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
            z = false;
        } else {
            z = true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f29039a.getSystemService("phone");
        if (z && telephonyManager.isNetworkRoaming()) {
            z2 = true;
        }
        return z2;
    }

    private n(Context context) {
        this.f29039a = context.getApplicationContext();
    }

    public final void a(Intent intent) {
        try {
            intent.setClass(this.f29039a, DownloadHandlerService.class);
            this.f29039a.startService(intent);
        } catch (Exception unused) {
        }
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f29038b == null) {
                f29038b = new n(context);
            }
            nVar = f29038b;
        }
        return nVar;
    }
}
