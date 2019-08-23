package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.au;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static int f81804a = -1;

    public static ap a(Context context) {
        try {
            if (context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), SearchJediMixFeedAdapter.f42517f) != null && a()) {
                return ap.HUAWEI;
            }
        } catch (Exception unused) {
        }
        return ap.OTHER;
    }

    private static boolean a() {
        try {
            String str = (String) au.a("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            if (!TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9) {
                return true;
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m77a(Context context) {
        Object a2 = au.a(au.a("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object a3 = au.a("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (a3 == null || !(a3 instanceof Integer)) {
            b.c("google service is not avaliable");
            f81804a = 0;
            return false;
        }
        int intValue = Integer.class.cast(a3).intValue();
        if (a2 != null) {
            if (a2 instanceof Integer) {
                f81804a = Integer.class.cast(a2).intValue() == intValue ? 1 : 0;
            } else {
                f81804a = 0;
                b.c("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder("is google service can be used");
        sb.append(f81804a > 0);
        b.c(sb.toString());
        return f81804a > 0;
    }

    public static boolean b(Context context) {
        boolean z = false;
        Object a2 = au.a("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = Boolean.class.cast(a2).booleanValue();
        }
        b.c("color os push  is avaliable ? :" + z);
        return z;
    }

    public static boolean c(Context context) {
        boolean z = false;
        Object a2 = au.a("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        if (a2 != null && (a2 instanceof Boolean)) {
            z = Boolean.class.cast(a2).booleanValue();
        }
        b.c("fun touch os push  is avaliable ? :" + z);
        return z;
    }
}
