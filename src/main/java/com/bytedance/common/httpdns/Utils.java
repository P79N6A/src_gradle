package com.bytedance.common.httpdns;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.util.regex.Pattern;

public class Utils {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f19331a = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    Utils() {
    }

    static boolean isWifiOrMobile(Context context) {
        int netType = getNetType(context);
        if (netType == 1 || netType == 0) {
            return true;
        }
        return false;
    }

    static int getNetType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Throwable unused) {
            return -2;
        }
    }

    static String getBSSID(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Throwable th) {
            LogUtil.d("failed to get BSSID: " + th);
            return null;
        }
    }

    static boolean isValidHost(String str) {
        if (str == null) {
            return false;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length <= 0 || charArray.length > 255) {
            return false;
        }
        for (char c2 : charArray) {
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '.' && c2 != '-'))) {
                return false;
            }
        }
        return true;
    }

    static boolean isNumericAddress(String str) {
        if (str != null) {
            try {
                if (str.length() < 7 || str.length() > 15 || str.equals("") || !f19331a.matcher(str).matches()) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
                try {
                    int indexOf = str.indexOf(46);
                    if (!(indexOf == -1 || str.charAt(0) == '-')) {
                        if (Integer.parseInt(str.substring(0, indexOf)) <= 255) {
                            int i = indexOf + 1;
                            int indexOf2 = str.indexOf(46, i);
                            if (!(indexOf2 == -1 || str.charAt(i) == '-')) {
                                if (Integer.parseInt(str.substring(i, indexOf2)) <= 255) {
                                    int i2 = indexOf2 + 1;
                                    int indexOf3 = str.indexOf(46, i2);
                                    if (!(indexOf3 == -1 || str.charAt(i2) == '-' || Integer.parseInt(str.substring(i2, indexOf3)) > 255)) {
                                        int i3 = indexOf3 + 1;
                                        if (str.charAt(i3) == '-' || Integer.parseInt(str.substring(i3, str.length())) > 255 || str.charAt(str.length() - 1) == '.') {
                                            return false;
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            }
                            return false;
                        }
                    }
                    return false;
                } catch (Exception unused2) {
                    return false;
                }
            }
        }
        return false;
    }
}
