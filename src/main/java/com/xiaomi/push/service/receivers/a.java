package com.xiaomi.push.service.receivers;

import android.content.Context;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f82596a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ NetworkStatusReceiver f1008a;

    a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f1008a = networkStatusReceiver;
        this.f82596a = context;
    }

    public void run() {
        this.f1008a.a(this.f82596a);
    }
}
