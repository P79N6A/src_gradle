package com.ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

public final class o implements s {

    /* renamed from: b  reason: collision with root package name */
    private static o f28600b;

    /* renamed from: a  reason: collision with root package name */
    private Context f28601a;

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
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f28601a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public final boolean c() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f28601a.getSystemService("connectivity");
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
        TelephonyManager telephonyManager = (TelephonyManager) this.f28601a.getSystemService("phone");
        if (z && telephonyManager.isNetworkRoaming()) {
            z2 = true;
        }
        return z2;
    }

    private o(Context context) {
        this.f28601a = context.getApplicationContext();
    }

    public final void a(Intent intent) {
        try {
            intent.setClass(this.f28601a, DownloadHandlerService.class);
            this.f28601a.startService(intent);
        } catch (Exception unused) {
        }
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (f28600b == null) {
                f28600b = new o(context);
            }
            oVar = f28600b;
        }
        return oVar;
    }
}
