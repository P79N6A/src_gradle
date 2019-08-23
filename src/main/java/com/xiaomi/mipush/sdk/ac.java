package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.b;

public final class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81745a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f91a;

    ac(Context context, Intent intent) {
        this.f81745a = context;
        this.f91a = intent;
    }

    public final void run() {
        try {
            this.f81745a.startService(this.f91a);
        } catch (Exception e2) {
            b.a(e2.getMessage());
        }
    }
}
