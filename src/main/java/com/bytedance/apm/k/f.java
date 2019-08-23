package com.bytedance.apm.k;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import com.bytedance.common.utility.reflect.Reflect;

public final class f {
    public static String a(PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT > 23 || pendingIntent == null) {
            return "";
        }
        return ((Intent) Reflect.on((Object) pendingIntent).call("getIntent").get()).toString();
    }
}
