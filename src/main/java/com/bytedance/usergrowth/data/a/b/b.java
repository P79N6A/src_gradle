package com.bytedance.usergrowth.data.a.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static C0016b f2324a;

    public enum a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private a(int i) {
            this.nativeInt = i;
        }
    }

    /* renamed from: com.bytedance.usergrowth.data.a.b.b$b  reason: collision with other inner class name */
    public interface C0016b {
        a a();
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (f2324a == null || f2324a.a() == a.NONE) {
                        if (1 == activeNetworkInfo.getType()) {
                            return true;
                        }
                        return false;
                    } else if (f2324a.a() == a.WIFI) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
