package com.xiaomi.push.service;

import com.xiaomi.push.aj;
import com.xiaomi.push.ik;
import com.xiaomi.push.jj;
import com.xiaomi.push.ju;
import java.lang.ref.WeakReference;

public class b extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    private jj f82536a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<XMPushService> f961a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f962a;

    public b(jj jjVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f82536a = jjVar;
        this.f961a = weakReference;
        this.f962a = z;
    }

    public int a() {
        return 22;
    }

    public void run() {
        if (!(this.f961a == null || this.f82536a == null)) {
            XMPushService xMPushService = (XMPushService) this.f961a.get();
            if (xMPushService != null) {
                this.f82536a.a(aj.a());
                this.f82536a.a(false);
                com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.f82536a.a());
                try {
                    String c2 = this.f82536a.c();
                    xMPushService.a(c2, ju.a(w.a(c2, this.f82536a.b(), this.f82536a, ik.Notification)), this.f962a);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e2.toString());
                }
            }
        }
    }
}
