package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;

public class fg implements cb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ff f82010a;

    fg(ff ffVar) {
        this.f82010a = ffVar;
    }

    public void a(String str) {
        String unused = this.f82010a.f326a = ff.b(str);
        synchronized (this.f82010a.f325a) {
            try {
                this.f82010a.f325a.notify();
            } catch (Exception e2) {
                b.a((Throwable) e2);
            }
        }
    }
}
