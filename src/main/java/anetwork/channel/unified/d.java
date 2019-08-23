package anetwork.channel.unified;

import anetwork.channel.Response;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class d implements Future<Response> {

    /* renamed from: a  reason: collision with root package name */
    private k f1564a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1565b;

    public boolean isCancelled() {
        return this.f1565b;
    }

    /* renamed from: a */
    public Response get() throws InterruptedException, ExecutionException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public Response b() throws InterruptedException, ExecutionException, TimeoutException {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public boolean isDone() {
        throw new RuntimeException("NOT SUPPORT!");
    }

    public d(k kVar) {
        this.f1564a = kVar;
    }

    public boolean cancel(boolean z) {
        if (!this.f1565b) {
            this.f1564a.b();
            this.f1565b = true;
        }
        return true;
    }

    public /* synthetic */ Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return b();
    }
}
