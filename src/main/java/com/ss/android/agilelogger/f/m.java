package com.ss.android.agilelogger.f;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;

public final class m {
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int a(String str) {
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        String str2 = "";
        if (lastIndexOf != -1) {
            str2 = str.substring(0, lastIndexOf);
        }
        String[] split = str2.split("_");
        String str3 = PushConstants.PUSH_TYPE_NOTIFY;
        if (split.length > 0) {
            str3 = split[split.length - 1];
        }
        try {
            return Integer.parseInt(str3);
        } catch (Exception unused) {
            return 0;
        }
    }
}
