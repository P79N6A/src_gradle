package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.aj;
import com.xiaomi.push.ik;
import com.xiaomi.push.ix;
import com.xiaomi.push.jj;

public final class q extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81805a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ jj f132a;

    q(jj jjVar, Context context) {
        this.f132a = jjVar;
        this.f81805a = context;
    }

    public final int a() {
        return 22;
    }

    public final void run() {
        if (this.f132a != null) {
            this.f132a.a(com.xiaomi.push.service.aj.a());
            ay.a(this.f81805a.getApplicationContext()).a(this.f132a, ik.Notification, true, (ix) null, true);
        }
    }
}
