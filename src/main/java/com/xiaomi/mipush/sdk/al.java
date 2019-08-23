package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.io;

public class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0870a f81751a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ io f93a;

    al(MiTinyDataClient.a.C0870a aVar, io ioVar) {
        this.f81751a = aVar;
        this.f93a = ioVar;
    }

    public void run() {
        this.f81751a.f86a.add(this.f93a);
        MiTinyDataClient.a.C0870a.a(this.f81751a);
    }
}
