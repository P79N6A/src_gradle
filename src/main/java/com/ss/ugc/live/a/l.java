package com.ss.ugc.live.a;

import android.text.TextUtils;
import java.io.File;

public final class l {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
