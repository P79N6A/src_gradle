package com.bytedance.usergrowth.data.a.b;

public abstract class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f2326a;

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        if (this.f2326a == null) {
            synchronized (this) {
                if (this.f2326a == null) {
                    this.f2326a = a();
                }
            }
        }
        return this.f2326a;
    }
}
