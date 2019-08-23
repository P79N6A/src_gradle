package com.ss.android.e;

public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile T f29062a;

    /* access modifiers changed from: protected */
    public abstract T a();

    public final T b() {
        if (this.f29062a == null) {
            synchronized (this) {
                if (this.f29062a == null) {
                    this.f29062a = a();
                }
            }
        }
        return this.f29062a;
    }
}
