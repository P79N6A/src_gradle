package com.bytedance.crash.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.bytedance.crash.upload.b;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public final class i {
    public static String a(Context context) {
        return a(c(context));
    }

    public static boolean b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(b.C0154b bVar) {
        String str = "";
        try {
            switch (bVar) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE:
                    str = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private static b.C0154b c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return b.C0154b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return b.C0154b.WIFI;
                    }
                    if (type != 0) {
                        return b.C0154b.MOBILE;
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
                            return b.C0154b.MOBILE_3G;
                        case 13:
                            return b.C0154b.MOBILE_4G;
                        default:
                            return b.C0154b.MOBILE;
                    }
                }
            }
            return b.C0154b.NONE;
        } catch (Throwable unused) {
            return b.C0154b.MOBILE;
        }
    }
}
