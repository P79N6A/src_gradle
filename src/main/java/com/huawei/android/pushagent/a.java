package com.huawei.android.pushagent;

import com.huawei.android.pushagent.utils.a.e;
import java.lang.Thread;

public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PushService f24939a;

    a(PushService pushService) {
        this.f24939a = pushService;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        e.b(PushService.f24932a, "catch uncaughtException, stop service");
        this.f24939a.stopService();
    }
}
