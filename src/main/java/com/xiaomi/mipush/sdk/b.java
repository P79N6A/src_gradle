package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.aj;
import com.xiaomi.push.ip;
import com.xiaomi.push.service.ag;
import java.util.ArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static StackTraceElement[] f81771a;

    public static void a() {
        try {
            f81771a = Thread.getAllStackTraces().get(Thread.currentThread());
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        aj.a(context).a((Runnable) new c(context), 20);
    }

    /* access modifiers changed from: private */
    public static String b(int i) {
        if (f81771a != null && f81771a.length > 4) {
            ArrayList arrayList = new ArrayList();
            int i2 = 4;
            while (i2 < f81771a.length && i2 < i + 4) {
                try {
                    arrayList.add(f81771a[i2].toString());
                    i2++;
                } catch (Exception unused) {
                }
            }
            return arrayList.toString();
        }
        return "";
    }

    private static boolean b(Context context) {
        ag a2 = ag.a(context);
        if (!a2.a(ip.AggregationSdkMonitorSwitch.a(), false)) {
            return false;
        }
        return Math.abs(System.currentTimeMillis() - c.a(context, "mipush_extra", 0).getLong("last_upload_call_stack_timestamp", 0)) >= ((long) Math.max(60, a2.a(ip.AggregationSdkMonitorFrequency.a(), 86400)));
    }

    private static void c(Context context) {
        SharedPreferences.Editor edit = c.a(context, "mipush_extra", 0).edit();
        edit.putLong("last_upload_call_stack_timestamp", System.currentTimeMillis());
        edit.commit();
    }
}
