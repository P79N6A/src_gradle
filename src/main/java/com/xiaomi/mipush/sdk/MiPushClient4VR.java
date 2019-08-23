package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.aj;

public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        jj jjVar = new jj();
        jjVar.c(iu.VRUpload.f570a);
        jjVar.b(d.a(context).a());
        jjVar.d(context.getPackageName());
        jjVar.a("data", str);
        jjVar.a(aj.a());
        ay.a(context).a(jjVar, ik.Notification, (ix) null);
    }
}
