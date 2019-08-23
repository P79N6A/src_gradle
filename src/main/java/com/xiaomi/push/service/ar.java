package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fj;
import com.xiaomi.push.fo;
import com.xiaomi.push.fs;
import com.xiaomi.push.ii;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import java.util.HashMap;

public class ar implements fs {
    public void a(Context context, HashMap<String, String> hashMap) {
        jj jjVar = new jj();
        jjVar.b(fo.a(context).a());
        jjVar.d(fo.a(context).b());
        jjVar.c(iu.AwakeAppResponse.f570a);
        jjVar.a(aj.a());
        jjVar.f710a = hashMap;
        byte[] a2 = ju.a(w.a(jjVar.c(), jjVar.b(), jjVar, ik.Notification));
        if (context instanceof XMPushService) {
            b.a("MoleInfo : send data directly in pushLayer " + jjVar.a());
            ((XMPushService) context).a(context.getPackageName(), a2, true);
            return;
        }
        b.a("MoleInfo : context is not correct in pushLayer " + jjVar.a());
    }

    public void b(Context context, HashMap<String, String> hashMap) {
        ii a2 = ii.a(context);
        if (a2 != null) {
            a2.a("category_awake_app", "wake_up_app", 1, fj.a(hashMap));
        }
    }

    public void c(Context context, HashMap<String, String> hashMap) {
        b.a("MoleInfo：　" + fj.b(hashMap));
    }
}
