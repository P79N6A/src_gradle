package io.fabric.sdk.android.services.concurrency;

import io.fabric.sdk.android.services.concurrency.a;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public abstract class e<Params, Progress, Result> extends a<Params, Progress, Result> implements b<k>, h, k {

    /* renamed from: a  reason: collision with root package name */
    private final i f83256a = new i();

    static class a<Result> implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public final e f83257a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f83258b;

        public final void execute(Runnable runnable) {
            this.f83258b.execute(new g<Result>(runnable, null) {
                public final <T extends b<k> & h & k> T a() {
                    return a.this.f83257a;
                }
            });
        }

        public a(Executor executor, e eVar) {
            this.f83258b = executor;
            this.f83257a = eVar;
        }
    }

    private <T extends b<k> & h & k> T c() {
        return this.f83256a;
    }

    public boolean areDependenciesMet() {
        return ((b) ((h) c())).areDependenciesMet();
    }

    public Collection<k> getDependencies() {
        return ((b) ((h) c())).getDependencies();
    }

    public d getPriority() {
        return ((h) c()).getPriority();
    }

    public boolean isFinished() {
        return ((k) ((h) c())).isFinished();
    }

    public int compareTo(Object obj) {
        return d.compareTo(this, obj);
    }

    public void setError(Throwable th) {
        ((k) ((h) c())).setError(th);
    }

    public void setFinished(boolean z) {
        ((k) ((h) c())).setFinished(z);
    }

    /* renamed from: a */
    public final void addDependency(k kVar) {
        if (this.f83237d == a.d.PENDING) {
            ((b) ((h) c())).addDependency(kVar);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new a(executorService, this), paramsArr);
    }
}
