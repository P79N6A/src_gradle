package com.xiaomi.mipush.sdk;

import android.text.TextUtils;
import com.xiaomi.push.az;
import com.xiaomi.push.ik;
import com.xiaomi.push.ix;
import com.xiaomi.push.j;
import com.xiaomi.push.jj;
import com.xiaomi.push.m;
import com.xiaomi.push.service.aj;
import java.util.HashMap;
import java.util.Map;

public final class ag implements Runnable {
    ag() {
    }

    public final void run() {
        if (!m.d() && j.f(MiPushClient.sContext) != null) {
            jj jjVar = new jj();
            jjVar.b(d.a(MiPushClient.sContext).a());
            jjVar.c("client_info_update");
            jjVar.a(aj.a());
            jjVar.a((Map<String, String>) new HashMap<String,String>());
            String str = "";
            if (!TextUtils.isEmpty(j.f(MiPushClient.sContext))) {
                str = az.a(r2);
            }
            String h = j.h(MiPushClient.sContext);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h)) {
                str = str + "," + h;
            }
            if (!TextUtils.isEmpty(str)) {
                jjVar.a().put("imei_md5", str);
            }
            int a2 = j.a();
            if (a2 >= 0) {
                jjVar.a().put("space_id", Integer.toString(a2));
            }
            ay.a(MiPushClient.sContext).a(jjVar, ik.Notification, false, (ix) null);
        }
    }
}
