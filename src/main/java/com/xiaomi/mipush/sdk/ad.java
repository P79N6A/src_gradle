package com.xiaomi.mipush.sdk;

import android.content.Context;

public final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81746a;

    ad(Context context) {
        this.f81746a = context;
    }

    public final void run() {
        MessageHandleService.c(this.f81746a);
    }
}
