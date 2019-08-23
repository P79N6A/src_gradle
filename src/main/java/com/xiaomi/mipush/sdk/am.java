package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

public class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0870a f81752a;

    am(MiTinyDataClient.a.C0870a aVar) {
        this.f81752a = aVar;
    }

    public void run() {
        if (this.f81752a.f86a.size() != 0) {
            this.f81752a.b();
        } else if (MiTinyDataClient.a.C0870a.a(this.f81752a) != null) {
            MiTinyDataClient.a.C0870a.a(this.f81752a).cancel(false);
            ScheduledFuture unused = this.f81752a.f87a = null;
        }
    }
}
