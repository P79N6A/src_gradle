package com.ss.c.a.c;

import com.ss.c.a.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f78349a;

    /* renamed from: b  reason: collision with root package name */
    public final b f78350b;

    /* renamed from: c  reason: collision with root package name */
    public Future f78351c;

    public interface a {
        void a(com.ss.c.a.a.a aVar);

        void a(com.ss.c.a.b.c cVar);
    }

    public final void a() {
        if (this.f78351c != null && !this.f78351c.isDone()) {
            this.f78351c.cancel(true);
            this.f78351c = null;
        }
    }

    public c(ExecutorService executorService, b bVar) {
        this.f78349a = executorService;
        this.f78350b = bVar;
    }
}
