package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import com.xiaomi.push.fo;
import com.xiaomi.push.fq;
import com.xiaomi.push.fs;
import com.xiaomi.push.ip;
import com.xiaomi.push.iu;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.jv;
import com.xiaomi.push.m;
import com.xiaomi.push.service.ag;
import java.util.HashMap;
import java.util.Map;

public class p {
    public static void a(Context context, Intent intent, Uri uri) {
        if (context != null) {
            ay.a(context).a();
            if (fo.a(context.getApplicationContext()).a() == null) {
                fo.a(context.getApplicationContext()).a(d.a(context.getApplicationContext()).a(), context.getPackageName(), ag.a(context.getApplicationContext()).a(ip.AwakeInfoUploadWaySwitch.a(), 0), (fs) new e());
                ag.a(context).a((ag.a) new r(102, "awake online config", context));
            }
            if ((context instanceof Activity) && intent != null) {
                fo.a(context.getApplicationContext()).a(fq.ACTIVITY, context, intent, (String) null);
            } else if (!(context instanceof Service) || intent == null) {
                if (uri != null && !TextUtils.isEmpty(uri.toString())) {
                    fo.a(context.getApplicationContext()).a(fq.PROVIDER, context, (Intent) null, uri.toString());
                }
            } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                fo.a(context.getApplicationContext()).a(fq.SERVICE_COMPONENT, context, intent, (String) null);
            } else {
                fo.a(context.getApplicationContext()).a(fq.SERVICE_ACTION, context, intent, (String) null);
            }
        }
    }

    private static void a(Context context, jj jjVar) {
        boolean a2 = ag.a(context).a(ip.AwakeAppPingSwitch.a(), false);
        int a3 = ag.a(context).a(ip.AwakeAppPingFrequency.a(), 0);
        if (a3 >= 0 && a3 < 30) {
            b.c("aw_ping: frquency need > 30s.");
            a3 = 30;
        }
        if (a3 < 0) {
            a2 = false;
        }
        if (!m.a()) {
            a(context, (T) jjVar, a2, a3);
        } else if (a2) {
            aj.a(context.getApplicationContext()).a((aj.a) new q(jjVar, context), a3);
        }
    }

    public static final <T extends jv<T, ?>> void a(Context context, T t, boolean z, int i) {
        byte[] a2 = ju.a(t);
        if (a2 == null) {
            b.a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a2);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ay.a(context).a(intent);
    }

    public static void a(Context context, String str) {
        b.a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", "9999");
        hashMap.put("description", "ping message");
        jj jjVar = new jj();
        jjVar.b(d.a(context).a());
        jjVar.d(context.getPackageName());
        jjVar.c(iu.AwakeAppResponse.f570a);
        jjVar.a(com.xiaomi.push.service.aj.a());
        jjVar.f710a = hashMap;
        a(context, jjVar);
    }

    public static void a(Context context, String str, int i, String str2) {
        jj jjVar = new jj();
        jjVar.b(str);
        jjVar.a((Map<String, String>) new HashMap<String,String>());
        jjVar.a().put("extra_aw_app_online_cmd", String.valueOf(i));
        jjVar.a().put("extra_help_aw_info", str2);
        jjVar.a(com.xiaomi.push.service.aj.a());
        byte[] a2 = ju.a(jjVar);
        if (a2 == null) {
            b.a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a2);
        ay.a(context).a(intent);
    }
}
