package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import java.lang.ref.WeakReference;

public class cx extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ cv f81921a;

    cx(cv cvVar) {
        this.f81921a = cvVar;
    }

    public int a() {
        return 10054;
    }

    public void run() {
        b.c("exec== DbSizeControlJob");
        dh.a(cv.a(this.f81921a)).a((Runnable) new da(cv.a(this.f81921a), new WeakReference(cv.a(this.f81921a))));
        this.f81921a.b("check_time");
    }
}
