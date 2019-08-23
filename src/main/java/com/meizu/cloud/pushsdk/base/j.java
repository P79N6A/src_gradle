package com.meizu.cloud.pushsdk.base;

public class j<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f27081a;

    /* renamed from: b  reason: collision with root package name */
    protected T f27082b;

    protected j(T t) {
        if (t != null) {
            this.f27082b = t;
            return;
        }
        throw new RuntimeException("proxy must be has a default implementation");
    }

    /* access modifiers changed from: protected */
    public T c() {
        return this.f27081a != null ? this.f27081a : this.f27082b;
    }
}
