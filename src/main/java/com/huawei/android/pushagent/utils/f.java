package com.huawei.android.pushagent.utils;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.Map;

public class f {
    public static synchronized void a(Context context) {
        synchronized (f.class) {
            h hVar = new h(context, "pushConfig");
            int c2 = hVar.c("version_config");
            if (c2 != 2) {
                e.b("PushLogAC2815", "update xml data, old version is " + c2 + ",new version is 2");
                if (c2 < 2) {
                    b(context);
                }
                hVar.a("version_config", (Integer) 2);
            }
        }
    }

    private static void a(Context context, String str) {
        Map b2 = new h(context, str).b();
        if (b2 != null && b2.size() > 0) {
            h hVar = new h(context, "pclient_request_info");
            for (String str2 : b2.keySet()) {
                hVar.a(str2, "true");
                e.a("PushLogAC2815", str2 + " need to register again");
            }
        }
        a.e(context, str);
    }

    private static void b(Context context) {
        new h(context, "device_info").c();
        new h(context, "PushRouteInfo").f("PushID");
        new h(context, "pushConfig").f("selftoken");
        new h(context, "push_client_self_info").f("token_info");
        new h(context, "PushRouteInfo").f("PushID_encrypt");
        new h(context, "pushConfig").f("selftoken_encrypt");
        new h(context, "push_client_self_info").f("token_info_encrypt");
        a.e(context, "pclient_unRegist_info");
        a(context, "pclient_info_encrypt");
        a(context, "pclient_info");
    }
}
