package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fj;
import com.xiaomi.push.fo;
import com.xiaomi.push.fs;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.aj;
import java.util.HashMap;

public class e implements fs {
    public void a(Context context, HashMap<String, String> hashMap) {
        jj jjVar = new jj();
        jjVar.b(fo.a(context).a());
        jjVar.d(fo.a(context).b());
        jjVar.c(iu.AwakeAppResponse.f570a);
        jjVar.a(aj.a());
        jjVar.f710a = hashMap;
        ay.a(context).a(jjVar, ik.Notification, true, (ix) null, true);
        b.a("MoleInfo：　send data in app layer");
    }

    public void b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1, fj.a(hashMap));
        b.a("MoleInfo：　send data in app layer");
    }

    public void c(Context context, HashMap<String, String> hashMap) {
        b.a("MoleInfo：　" + fj.b(hashMap));
        String str = hashMap.get("awake_info");
        if ("1007".equals(hashMap.get("event_type"))) {
            p.a(context, str);
        }
    }
}
