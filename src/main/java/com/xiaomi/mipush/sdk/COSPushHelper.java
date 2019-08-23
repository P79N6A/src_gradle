package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.b;

public class COSPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static long f81730a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f72a;

    public static void convertMessage(Intent intent) {
        j.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!getNeedRegister()) {
            return;
        }
        if (f81730a <= 0 || f81730a + 300000 <= elapsedRealtime) {
            f81730a = elapsedRealtime;
            registerCOSAssemblePush(context);
        }
    }

    public static boolean getNeedRegister() {
        return f72a;
    }

    public static boolean hasNetwork(Context context) {
        return j.a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a2 = g.a(context).a(f.ASSEMBLE_PUSH_COS);
        if (a2 != null) {
            b.a("ASSEMBLE_PUSH :  register cos when network change!");
            a2.register();
        }
    }

    public static void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            try {
                f72a = z;
            } catch (Throwable th) {
                Class<COSPushHelper> cls = COSPushHelper.class;
                throw th;
            }
        }
    }

    public static void uploadToken(Context context, String str) {
        j.a(context, f.ASSEMBLE_PUSH_COS, str);
    }
}
