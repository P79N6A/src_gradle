package com.tencent.mm.opensdk.utils;

import android.os.Bundle;

public final class a {
    public static int a(Bundle bundle, String str) {
        int i;
        if (bundle == null) {
            return -1;
        }
        try {
            i = bundle.getInt(str, -1);
        } catch (Exception e2) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e2.getMessage());
            i = -1;
        }
        return i;
    }

    public static String b(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            return null;
        }
        try {
            str2 = bundle.getString(str);
        } catch (Exception e2) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e2.getMessage());
            str2 = null;
        }
        return str2;
    }
}
