package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Map;

public class FTOSPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static long f81731a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f73a;

    private static void a(Context context) {
        AbstractPushManager a2 = g.a(context).a(f.ASSEMBLE_PUSH_FTOS);
        if (a2 != null) {
            b.a("ASSEMBLE_PUSH :  register fun touch os when network change!");
            a2.register();
        }
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!getNeedRegister()) {
            return;
        }
        if (f81731a <= 0 || f81731a + 300000 <= elapsedRealtime) {
            f81731a = elapsedRealtime;
            a(context);
        }
    }

    public static boolean getNeedRegister() {
        return f73a;
    }

    public static boolean hasNetwork(Context context) {
        return j.a(context);
    }

    public static void notifyFTOSNotificationClicked(Context context, Map<String, String> map) {
        if (map != null && map.containsKey("pushMsg")) {
            String str = map.get("pushMsg");
            if (!TextUtils.isEmpty(str)) {
                PushMessageReceiver a2 = j.a(context);
                if (a2 != null) {
                    MiPushMessage a3 = j.a(str);
                    if (!a3.getExtra().containsKey("notify_effect")) {
                        a2.onNotificationMessageClicked(context, a3);
                    }
                }
            }
        }
    }

    public static void setNeedRegister(boolean z) {
        f73a = z;
    }

    public static void uploadToken(Context context, String str) {
        j.a(context, f.ASSEMBLE_PUSH_FTOS, str);
    }
}
