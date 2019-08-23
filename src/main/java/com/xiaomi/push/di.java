package com.xiaomi.push;

import com.xiaomi.push.aj;
import com.xiaomi.push.dh;

public class di extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ dh f81939a;

    di(dh dhVar) {
        this.f81939a = dhVar;
    }

    public int a() {
        return 100957;
    }

    public void run() {
        synchronized (this.f81939a.f255a) {
            if (this.f81939a.f255a.size() > 0) {
                if (this.f81939a.f255a.size() > 1) {
                    this.f81939a.a(this.f81939a.f255a);
                } else {
                    this.f81939a.b((dh.a) this.f81939a.f255a.get(0));
                }
                this.f81939a.f255a.clear();
                System.gc();
            }
        }
    }
}
