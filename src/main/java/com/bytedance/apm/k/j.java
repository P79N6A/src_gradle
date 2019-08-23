package com.bytedance.apm.k;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import com.bytedance.apm.c;
import com.bytedance.apm.d;
import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static NetworkUtils.NetworkType f2056a = NetworkUtils.NetworkType.UNKNOWN;

    public static boolean b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (ContextCompat.checkSelfPermission(c.a(), "android.permission.ACCESS_NETWORK_STATE") == 0) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null) {
                if (networkInfo.isAvailable()) {
                    if (networkInfo.getType() == 0) {
                        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                    }
                    return -10000;
                }
            }
            return -10000;
        } catch (Throwable th) {
            d.a().a(th, "NetUtils: getMobileNetworkType");
        }
    }

    public static NetworkUtils.NetworkType c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return NetworkUtils.NetworkType.WIFI;
                    }
                    if (type != 0) {
                        return NetworkUtils.NetworkType.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return NetworkUtils.NetworkType.MOBILE_3G;
                        case 13:
                            return NetworkUtils.NetworkType.MOBILE_4G;
                        default:
                            return NetworkUtils.NetworkType.MOBILE;
                    }
                }
            }
            return NetworkUtils.NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkUtils.NetworkType.MOBILE;
        }
    }
}
