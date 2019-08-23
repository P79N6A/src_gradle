package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class i implements b<k>, h, k {
    private final List<k> dependencies = new ArrayList();
    private final AtomicBoolean hasRun = new AtomicBoolean(false);
    private final AtomicReference<Throwable> throwable = new AtomicReference<>(null);

    public d getPriority() {
        return d.NORMAL;
    }

    public boolean isFinished() {
        return this.hasRun.get();
    }

    public synchronized Collection<k> getDependencies() {
        return Collections.unmodifiableCollection(this.dependencies);
    }

    public Throwable getError() {
        return this.throwable.get();
    }

    public boolean areDependenciesMet() {
        for (k isFinished : getDependencies()) {
            if (!isFinished.isFinished()) {
                return false;
            }
        }
        return true;
    }

    public int compareTo(Object obj) {
        return d.compareTo(this, obj);
    }

    public void setError(Throwable th) {
        this.throwable.set(th);
    }

    public synchronized void addDependency(k kVar) {
        this.dependencies.add(kVar);
    }

    public synchronized void setFinished(boolean z) {
        this.hasRun.set(z);
    }

    public static boolean isProperDelegate(Object obj) {
        try {
            b bVar = (b) obj;
            k kVar = (k) obj;
            h hVar = (h) obj;
            if (bVar == null || kVar == null || hVar == null) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
