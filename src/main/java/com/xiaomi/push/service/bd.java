package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.bc;

public class bd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bc f82541a;

    bd(bc bcVar) {
        this.f82541a = bcVar;
    }

    public void run() {
        try {
            for (bc.a run : bc.a(this.f82541a).values()) {
                run.run();
            }
        } catch (Exception e2) {
            b.a("Sync job exception :" + e2.getMessage());
        }
        boolean unused = this.f82541a.f972a = false;
    }
}
