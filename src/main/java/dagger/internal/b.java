package dagger.internal;

import javax.inject.a;

public final class b<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f82746a = (!b.class.desiredAssertionStatus());

    /* renamed from: b  reason: collision with root package name */
    private static final Object f82747b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile a<T> f82748c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f82749d = f82747b;

    public final T get() {
        boolean z;
        T t = this.f82749d;
        if (t == f82747b) {
            synchronized (this) {
                t = this.f82749d;
                if (t == f82747b) {
                    t = this.f82748c.get();
                    T t2 = this.f82749d;
                    if (t2 == f82747b || (t2 instanceof d)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (t2 != t) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t2 + " & " + t + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f82749d = t;
                    this.f82748c = null;
                }
            }
        }
        return t;
    }

    public static <P extends a<T>, T> a<T> a(P p) {
        e.a(p);
        if (p instanceof b) {
            return p;
        }
        return new b(p);
    }

    private b(a<T> aVar) {
        if (f82746a || aVar != null) {
            this.f82748c = aVar;
            return;
        }
        throw new AssertionError();
    }
}
