package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.b.s;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.k;
import java.io.File;
import java.util.Collection;

public abstract class i<Result> implements Comparable<i> {
    public Context context;
    final DependsOn dependsOnAnnotation = ((DependsOn) getClass().getAnnotation(DependsOn.class));
    public c fabric;
    public s idManager;
    f<Result> initializationCallback;
    h<Result> initializationTask = new h<>(this);

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Collection<k> getDependencies() {
        return this.initializationTask.getDependencies();
    }

    /* access modifiers changed from: package-private */
    public boolean hasAnnotatedDependency() {
        if (this.dependsOnAnnotation != null) {
            return true;
        }
        return false;
    }

    public String getPath() {
        return ".Fabric" + File.separator + getIdentifier();
    }

    /* access modifiers changed from: package-private */
    public final void initialize() {
        this.initializationTask.a(this.fabric.f83132c, null);
    }

    public int compareTo(i iVar) {
        if (containsAnnotatedDependency(iVar)) {
            return 1;
        }
        if (iVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !iVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !iVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean containsAnnotatedDependency(i iVar) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.a()) {
                if (isAssignableFrom.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void injectParameters(Context context2, c cVar, f<Result> fVar, s sVar) {
        this.fabric = cVar;
        this.context = new d(context2, getIdentifier(), getPath());
        this.initializationCallback = fVar;
        this.idManager = sVar;
    }
}
