package com.ss.android.ugc.sdk.communication;

import android.text.TextUtils;

public final class d {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 62689447) {
            if (hashCode == 1817585384 && str.equals("HOTSOON")) {
                c2 = 0;
            }
        } else if (str.equals("AWEME")) {
            c2 = 1;
        }
        switch (c2) {
            case 0:
                return "com.ss.android.ugc.live";
            case 1:
                return "com.ss.android.ugc.aweme";
            default:
                return null;
        }
    }
}
