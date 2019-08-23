package com.bytedance.apm.k;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

public final class o {
    public static boolean a(Context context) {
        return a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return false;
        }
        return true;
    }
}
