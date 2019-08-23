package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.manager.a;
import com.xiaomi.push.aj;

public class bb extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f81855a;

    public bb(Context context) {
        this.f81855a = context;
    }

    private boolean a() {
        return a.a(this.f81855a).a().isEventUploadSwitchOpen();
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m111a() {
        return 100886;
    }

    public void run() {
        try {
            if (a()) {
                b.c(this.f81855a.getPackageName() + " begin upload event");
                a.a(this.f81855a).b();
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }
}
