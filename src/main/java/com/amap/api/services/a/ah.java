package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class ah {

    /* renamed from: a  reason: collision with root package name */
    static Cdo f6451a;

    private static String a(AMapException aMapException) {
        if (aMapException == null) {
            return null;
        }
        if (aMapException.getErrorLevel() == 0) {
            int errorCode = aMapException.getErrorCode();
            if (errorCode == 0) {
                return PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION;
            }
            int pow = (int) Math.pow(10.0d, Math.floor(Math.log10((double) errorCode)));
            int i = (errorCode % pow) + (pow * 4);
            return i;
        }
        return aMapException.getErrorCode();
    }

    public static void a(String str, String str2, AMapException aMapException) {
        if (!(str == null || aMapException == null)) {
            String errorType = aMapException.getErrorType();
            String a2 = a(aMapException);
            if (a2 != null && a2.length() > 0) {
                ca.a(i.a(true), str, errorType, str2, a2);
            }
        }
    }

    private static String a(String str, long j, boolean z) {
        try {
            return "{" + "\"RequestPath\":\"" + str + "\"" + "," + "\"ResponseTime\":" + j + "," + "\"Success\":" + z + "}";
        } catch (Throwable th) {
            j.a(th, "StatisticsUtil", "generateNetWorkResponseStatisticsEntity");
            return null;
        }
    }

    public static void a(Context context, String str, long j, boolean z) {
        try {
            String a2 = a(str, j, z);
            if (a2 != null) {
                if (a2.length() > 0) {
                    if (f6451a == null) {
                        f6451a = new Cdo(context, "sea", "6.1.0", "O002");
                    }
                    f6451a.a(a2);
                    dp.a(f6451a, context);
                }
            }
        } catch (Throwable th) {
            j.a(th, "StatisticsUtil", "recordResponseAction");
        }
    }
}
