package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.g;
import java.util.Map;

public abstract class at<T> extends g<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Consumer<T> f24092b;

    /* renamed from: c  reason: collision with root package name */
    private final ao f24093c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24094d;

    /* renamed from: e  reason: collision with root package name */
    private final String f24095e;

    /* access modifiers changed from: protected */
    public Map<String, String> a(T t) {
        return null;
    }

    public abstract void disposeResult(T t);

    public void onCancellation() {
        ao aoVar = this.f24093c;
        String str = this.f24095e;
        String str2 = this.f24094d;
        this.f24093c.requiresExtraMap(this.f24095e);
        aoVar.onProducerFinishWithCancellation(str, str2, null);
        this.f24092b.onCancellation();
    }

    public void onFailure(Exception exc) {
        ao aoVar = this.f24093c;
        String str = this.f24095e;
        String str2 = this.f24094d;
        this.f24093c.requiresExtraMap(this.f24095e);
        aoVar.onProducerFinishWithFailure(str, str2, exc, null);
        this.f24092b.onFailure(exc);
    }

    public void onSuccess(T t) {
        Map<String, String> map;
        ao aoVar = this.f24093c;
        String str = this.f24095e;
        String str2 = this.f24094d;
        if (this.f24093c.requiresExtraMap(this.f24095e)) {
            map = a(t);
        } else {
            map = null;
        }
        aoVar.onProducerFinishWithSuccess(str, str2, map);
        this.f24092b.onNewResult(t, 1);
    }

    public at(Consumer<T> consumer, ao aoVar, String str, String str2) {
        this.f24092b = consumer;
        this.f24093c = aoVar;
        this.f24094d = str;
        this.f24095e = str2;
        this.f24093c.onProducerStart(this.f24095e, this.f24094d);
    }
}
