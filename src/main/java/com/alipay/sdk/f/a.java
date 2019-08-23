package com.alipay.sdk.f;

import android.text.TextUtils;

public final class a {
    private static String b(String str) {
        String[] split = str.split("=");
        if (split.length <= 1) {
            return null;
        }
        String str2 = split[1];
        if (str2.contains("\"")) {
            return str2.replaceAll("\"", "");
        }
        return str2;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        if (split.length == 0) {
            return "";
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (String str6 : split) {
            if (TextUtils.isEmpty(str2)) {
                if (!str6.contains("biz_type")) {
                    str2 = null;
                } else {
                    str2 = b(str6);
                }
            }
            if (TextUtils.isEmpty(str3)) {
                if (!str6.contains("biz_no")) {
                    str3 = null;
                } else {
                    str3 = b(str6);
                }
            }
            if (TextUtils.isEmpty(str4)) {
                if (!str6.contains("trade_no") || str6.startsWith("out_trade_no")) {
                    str4 = null;
                } else {
                    str4 = b(str6);
                }
            }
            if (TextUtils.isEmpty(str5)) {
                if (!str6.contains("app_userid")) {
                    str5 = null;
                } else {
                    str5 = b(str6);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str2)) {
            sb.append("biz_type=" + str2 + ";");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("biz_no=" + str3 + ";");
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append("trade_no=" + str4 + ";");
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append("app_userid=" + str5 + ";");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(";")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }
}
