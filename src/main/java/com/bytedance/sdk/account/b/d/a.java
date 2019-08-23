package com.bytedance.sdk.account.b.d;

import android.content.Context;
import android.text.TextUtils;

public final class a {
    public static boolean a(Context context, String str) {
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 1) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }
}
