package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

public final class au implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81762a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f97a;

    au(Context context, Intent intent) {
        this.f81762a = context;
        this.f97a = intent;
    }

    public final void run() {
        PushMessageHandler.b(this.f81762a, this.f97a);
    }
}
