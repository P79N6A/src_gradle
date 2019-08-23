package com.alipay.b.b.a.a;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class t extends FutureTask<ab> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x f5292a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f5293b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(s sVar, Callable callable, x xVar) {
        super(callable);
        this.f5293b = sVar;
        this.f5292a = xVar;
    }

    /* access modifiers changed from: protected */
    public final void done() {
        v vVar = this.f5292a.f5307c;
        if (vVar.g == null) {
            super.done();
            return;
        }
        try {
            get();
            if (isCancelled() || vVar.f5242f) {
                vVar.a();
                if (!isCancelled() || !isDone()) {
                    cancel(false);
                }
            }
        } catch (InterruptedException e2) {
            new StringBuilder().append(e2);
        } catch (ExecutionException e3) {
            if (e3.getCause() == null || !(e3.getCause() instanceof a)) {
                new StringBuilder().append(e3);
                return;
            }
            a aVar = (a) e3.getCause();
            aVar.getCode();
            aVar.getMsg();
        } catch (CancellationException unused) {
            vVar.a();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
