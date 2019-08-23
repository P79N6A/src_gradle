package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.manager.a;
import com.xiaomi.push.aj;

public class bc extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f81856a;

    public bc(Context context) {
        this.f81856a = context;
    }

    private boolean a() {
        return a.a(this.f81856a).a().isPerfUploadSwitchOpen();
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m112a() {
        return 100887;
    }

    public void run() {
        try {
            if (a()) {
                a.a(this.f81856a).c();
                b.c(this.f81856a.getPackageName() + "perf  begin upload");
            }
        } catch (Exception e2) {
            b.a((Throwable) e2);
        }
    }
}
