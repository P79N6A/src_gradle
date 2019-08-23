package com.facebook.imagepipeline.memory;

import android.support.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

public abstract class s<T> implements ac<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<T> f23988a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final g<T> f23989b = new g<>();

    @Nullable
    public T pop() {
        return a(this.f23989b.removeFromEnd());
    }

    private T a(@Nullable T t) {
        if (t != null) {
            synchronized (this) {
                this.f23988a.remove(t);
            }
        }
        return t;
    }

    @Nullable
    public T get(int i) {
        return a(this.f23989b.acquire(i));
    }

    public void put(T t) {
        boolean add;
        synchronized (this) {
            add = this.f23988a.add(t);
        }
        if (add) {
            this.f23989b.release(getSize(t), t);
        }
    }
}
