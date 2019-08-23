package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class g<V> extends FutureTask<V> implements b<k>, h, k {

    /* renamed from: b  reason: collision with root package name */
    final Object f83260b;

    public <T extends b<k> & h & k> T a() {
        return (b) this.f83260b;
    }

    public boolean areDependenciesMet() {
        return ((b) ((h) a())).areDependenciesMet();
    }

    public Collection<k> getDependencies() {
        return ((b) ((h) a())).getDependencies();
    }

    public d getPriority() {
        return ((h) a()).getPriority();
    }

    public boolean isFinished() {
        return ((k) ((h) a())).isFinished();
    }

    private static <T extends b<k> & h & k> T a(Object obj) {
        if (i.isProperDelegate(obj)) {
            return (b) obj;
        }
        return new i();
    }

    public /* synthetic */ void addDependency(Object obj) {
        ((b) ((h) a())).addDependency((k) obj);
    }

    public int compareTo(Object obj) {
        return ((h) a()).compareTo(obj);
    }

    public void setError(Throwable th) {
        ((k) ((h) a())).setError(th);
    }

    public void setFinished(boolean z) {
        ((k) ((h) a())).setFinished(z);
    }

    public g(Callable<V> callable) {
        super(callable);
        this.f83260b = a(callable);
    }

    public g(Runnable runnable, V v) {
        super(runnable, v);
        this.f83260b = a(runnable);
    }
}
