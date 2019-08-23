package com.ss.android.excitingvideo.utils;

import android.content.Context;
import android.text.TextUtils;

public class ToolUtils {
    private ToolUtils() {
    }

    public static boolean isInstalledApp(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 16777216) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
