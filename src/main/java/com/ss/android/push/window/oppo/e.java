package com.ss.android.push.window.oppo;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.bytedance.common.utility.reflect.Reflect;

public final class e {
    public static int a(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Reflect on = Reflect.on((Object) (AppOpsManager) context.getSystemService("appops"));
            int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
            if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
