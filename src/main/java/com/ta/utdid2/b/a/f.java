package com.ta.utdid2.b.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static ConnectivityManager f78856a;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f78857d = {4, 7, 2, 1};

    public static ConnectivityManager a(Context context) {
        if (context == null) {
            return null;
        }
        if (f78856a == null) {
            f78856a = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return f78856a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m16a(Context context) {
        ConnectivityManager a2 = a(context);
        if (a2 != null) {
            try {
                NetworkInfo activeNetworkInfo = a2.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isConnected();
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        ConnectivityManager a2 = a(context);
        if (a2 != null) {
            try {
                NetworkInfo activeNetworkInfo = a2.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int subtype = activeNetworkInfo.getSubtype();
                    for (int i : f78857d) {
                        if (i == subtype) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
