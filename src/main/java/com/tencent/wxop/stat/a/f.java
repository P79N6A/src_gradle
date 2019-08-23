package com.tencent.wxop.stat.a;

import java.util.concurrent.ExecutorService;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    ExecutorService f79801a = g.a();

    public final void a(Runnable runnable) {
        this.f79801a.execute(runnable);
    }
}
