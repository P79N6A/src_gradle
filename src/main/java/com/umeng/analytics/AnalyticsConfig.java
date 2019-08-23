package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.cc;

public class AnalyticsConfig {
    public static boolean ACTIVITY_DURATION_OPEN = true;
    public static boolean CATCH_EXCEPTION = true;
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";

    /* renamed from: a  reason: collision with root package name */
    static double[] f80279a = null;

    /* renamed from: b  reason: collision with root package name */
    private static String f80280b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f80281c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f80282d = null;

    /* renamed from: e  reason: collision with root package name */
    private static int f80283e = 0;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;
    public static boolean sEncrypt;
    public static int sLatentWindow;

    public static String getSDKVersion(Context context) {
        return "6.1.1";
    }

    public static double[] getLocation() {
        return f80279a;
    }

    static void a(String str) {
        f80281c = str;
    }

    static void a(boolean z) {
        sEncrypt = z;
    }

    public static String getChannel(Context context) {
        if (TextUtils.isEmpty(f80281c)) {
            f80281c = bv.s(context);
        }
        return f80281c;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f80282d)) {
            f80282d = cc.a(context).e();
        }
        return f80282d;
    }

    public static int getVerticalType(Context context) {
        if (f80283e == 0) {
            f80283e = cc.a(context).f();
        }
        return f80283e;
    }

    public static String getAppkey(Context context) {
        if (TextUtils.isEmpty(f80280b)) {
            String p = bv.p(context);
            f80280b = p;
            if (TextUtils.isEmpty(p)) {
                f80280b = cc.a(context).c();
            }
        }
        return f80280b;
    }

    static void a(Context context, int i) {
        f80283e = i;
        cc.a(context).a(f80283e);
    }

    static void b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f80282d = str;
            cc.a(context).c(f80282d);
        }
    }

    static void a(Context context, String str) {
        if (context == null) {
            f80280b = str;
            return;
        }
        String p = bv.p(context);
        if (!TextUtils.isEmpty(p)) {
            f80280b = p;
            if (!p.equals(str)) {
                by.d("Appkey和AndroidManifest.xml中配置的不一致 ");
            }
        } else {
            String c2 = cc.a(context).c();
            if (!TextUtils.isEmpty(c2)) {
                if (!c2.equals(str)) {
                    by.d("Appkey和上次配置的不一致 ");
                }
                f80280b = str;
            }
            cc.a(context).a(str);
            f80280b = str;
        }
    }
}
