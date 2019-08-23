package com.bytedance.ad.symphony.d;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import java.util.Locale;

public final class d {
    public static String a() {
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            if (localeList != null && !localeList.isEmpty()) {
                return localeList.get(0).getCountry();
            }
        }
        return Locale.getDefault().getCountry();
    }

    public static String a(Context context) {
        String str = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso();
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}
