package com.ss.optimizer.live.sdk.dns;

import android.text.TextUtils;

public final class b {
    public static String a(String str, d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            String a2 = dVar.a(str);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return null;
    }
}
