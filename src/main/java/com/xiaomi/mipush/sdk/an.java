package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.aj;
import com.xiaomi.push.ik;
import com.xiaomi.push.iq;
import com.xiaomi.push.iu;
import com.xiaomi.push.ix;
import com.xiaomi.push.jc;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import com.xiaomi.push.service.ag;
import com.xiaomi.push.service.ah;

public class an extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f81753a;

    public an(Context context) {
        this.f81753a = context;
    }

    public int a() {
        return 2;
    }

    public void run() {
        ag a2 = ag.a(this.f81753a);
        jc jcVar = new jc();
        jcVar.a(ah.a(a2, iq.MISC_CONFIG));
        jcVar.b(ah.a(a2, iq.PLUGIN_CONFIG));
        jj jjVar = new jj("-1", false);
        jjVar.c(iu.DailyCheckClientConfig.f570a);
        jjVar.a(ju.a(jcVar));
        ay.a(this.f81753a).a(jjVar, ik.Notification, (ix) null);
    }
}
