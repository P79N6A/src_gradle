package com.huawei.android.pushagent.utils;

import android.content.Context;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.b.b.a;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.e;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f25174a;

    b(Context context) {
        this.f25174a = context;
    }

    public final void run() {
        try {
            Thread.sleep(a.a(this.f25174a).O() * 1000);
        } catch (InterruptedException unused) {
        }
        e.a("PushLogAC2815", "start to handle clone event");
        a.x(this.f25174a);
        a.y(this.f25174a);
        a.e(this.f25174a, "pushConfig");
        c.a(this.f25174a).a();
        a.w(this.f25174a);
        if (PushService.a() != null) {
            PushService.a().stopService();
        }
    }
}
