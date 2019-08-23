package retrofit2.a.b;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.c;
import retrofit2.m;
import retrofit2.n;

public final class h extends c.a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Scheduler f84242a = null;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f84243b = false;

    public static h a() {
        return new h(null, false);
    }

    private h(@Nullable Scheduler scheduler, boolean z) {
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<?> a2 = a(type);
        if (a2 == Completable.class) {
            g gVar = new g(Void.class, this.f84242a, this.f84243b, false, true, false, false, false, true);
            return gVar;
        }
        if (a2 == Flowable.class) {
            z = true;
        } else {
            z = false;
        }
        if (a2 == Single.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a2 == Maybe.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a2 != Observable.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z) {
                str = "Flowable";
            } else if (z2) {
                str = "Single";
            } else if (z3) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type a3 = a(0, (ParameterizedType) type);
        Class<?> a4 = a(a3);
        if (a4 == m.class) {
            if (a3 instanceof ParameterizedType) {
                type2 = a(0, (ParameterizedType) a3);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (a4 != e.class) {
            type2 = a3;
            z5 = false;
            z4 = true;
            g gVar2 = new g(type2, this.f84242a, this.f84243b, z5, z4, z, z2, z3, false);
            return gVar2;
        } else if (a3 instanceof ParameterizedType) {
            type2 = a(0, (ParameterizedType) a3);
            z5 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z4 = false;
        g gVar22 = new g(type2, this.f84242a, this.f84243b, z5, z4, z, z2, z3, false);
        return gVar22;
    }
}
