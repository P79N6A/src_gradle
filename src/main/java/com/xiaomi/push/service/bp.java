package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;

public class bp extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82553a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bp(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f82553a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean a2 = XMPushService.a(this.f82553a);
        b.a("ExtremePowerMode:" + a2);
        if (a2) {
            this.f82553a.a((XMPushService.i) new XMPushService.f(23, null));
        } else {
            this.f82553a.a(true);
        }
    }
}
