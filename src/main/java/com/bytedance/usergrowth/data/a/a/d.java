package com.bytedance.usergrowth.data.a.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public interface d extends Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2321a = new d() {

        /* renamed from: b  reason: collision with root package name */
        Executor f2322b;

        public final void execute(Runnable runnable) {
            if (this.f2322b == null) {
                synchronized (this) {
                    if (this.f2322b == null) {
                        this.f2322b = Executors.newCachedThreadPool();
                    }
                }
            }
            this.f2322b.execute(runnable);
        }
    };
}
