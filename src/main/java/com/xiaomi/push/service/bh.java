package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.jg;
import java.util.Map;

public class bh {

    /* renamed from: a  reason: collision with root package name */
    public static Runnable f82545a;

    private static String a(Context context, String str) {
        SharedPreferences a2 = c.a(context, "typed_shield_pref", 4);
        return a2.getString(str + "_title", str);
    }

    public static String a(jg jgVar) {
        Map a2 = jgVar.a().a();
        if (a2 == null) {
            return null;
        }
        return (String) a2.get("__typed_shield_type");
    }

    @TargetApi(19)
    static void a(Context context, jg jgVar, Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            String a2 = a(jgVar);
            if (!TextUtils.isEmpty(a2) && "com.xiaomi.xmsf".equals(z.a(jgVar))) {
                Bundle bundle = notification.extras;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("miui.category", a2);
                bundle.putString("miui.substName", a(context, a2));
                notification.extras = bundle;
            }
        }
    }

    public static boolean a(Context context, jg jgVar) {
        if ("com.xiaomi.xmsf".equals(z.a(jgVar))) {
            String a2 = a(jgVar);
            if (!TextUtils.isEmpty(a2)) {
                SharedPreferences a3 = c.a(context, "typed_shield_pref", 4);
                if (!a3.contains(a2 + "_shield") && f82545a != null) {
                    f82545a.run();
                }
                return a3.getBoolean(a2 + "_shield", true);
            }
        }
        return false;
    }
}
