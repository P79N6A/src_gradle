package com.cmic.sso.sdk.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class i {
    public static PackageManager a(Context context) {
        return context.getPackageManager();
    }

    public static String c(Context context) {
        return b(context).packageName;
    }

    public static PackageInfo b(Context context) {
        try {
            return a(context).getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String d(Context context) {
        String str;
        try {
            PackageManager a2 = a(context);
            String str2 = (String) a2.getApplicationLabel(a2.getApplicationInfo(c(context), 0));
            if (str2 != null) {
                return str2;
            }
            try {
                PackageInfo b2 = b(context);
                if (b2 == null) {
                    return null;
                }
                str = context.getResources().getString(b2.applicationInfo.labelRes);
                return str;
            } catch (Exception unused) {
                str = str2;
            }
        } catch (Exception unused2) {
            str = null;
        }
    }

    public static String e(Context context) {
        try {
            PackageInfo b2 = b(context);
            if (b2 != null) {
                return c(context) + "&" + b2.versionName;
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
