package com.xiaomi.push;

public class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f82147a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f478a;

    ha(gx gxVar, String str) {
        this.f82147a = gxVar;
        this.f478a = str;
    }

    public void run() {
        dt.a().a(this.f478a, true);
    }
}
