package retrofit2.a.b;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.b;
import retrofit2.c;

public final class g<R> implements c<R, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Type f84236a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Scheduler f84237b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f84238c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84239d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f84240e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f84241f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public final Type a() {
        return this.f84236a;
    }

    public final Object a(b<R> bVar) {
        Observable observable;
        Observable observable2;
        if (this.f84238c) {
            observable = new b(bVar);
        } else {
            observable = new c(bVar);
        }
        if (this.f84239d) {
            observable2 = new f(observable);
        } else if (this.f84240e) {
            observable2 = new a(observable);
        } else {
            observable2 = observable;
        }
        if (this.f84237b != null) {
            observable2 = observable2.subscribeOn(this.f84237b);
        }
        if (this.f84241f) {
            return observable2.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.g) {
            return observable2.singleOrError();
        }
        if (this.h) {
            return observable2.singleElement();
        }
        if (this.i) {
            return observable2.ignoreElements();
        }
        return observable2;
    }

    g(Type type, @Nullable Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f84236a = type;
        this.f84237b = scheduler;
        this.f84238c = z;
        this.f84239d = z2;
        this.f84240e = z3;
        this.f84241f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }
}
