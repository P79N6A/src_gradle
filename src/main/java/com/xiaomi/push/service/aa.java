package com.xiaomi.push.service;

import android.app.NotificationManager;
import com.xiaomi.push.aj;

public final class aa extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f82484a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ NotificationManager f918a;

    aa(int i, NotificationManager notificationManager) {
        this.f82484a = i;
        this.f918a = notificationManager;
    }

    public final int a() {
        return this.f82484a;
    }

    public final void run() {
        this.f918a.cancel(this.f82484a);
    }
}
