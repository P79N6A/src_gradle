package com.ss.c.a.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class d {
    public static NetworkInfo a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }
}
