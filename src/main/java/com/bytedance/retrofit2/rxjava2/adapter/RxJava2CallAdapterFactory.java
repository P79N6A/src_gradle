package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
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

public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    @Nullable
    private final Scheduler scheduler;

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(Scheduler scheduler2) {
        if (scheduler2 != null) {
            return new RxJava2CallAdapterFactory(scheduler2, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJava2CallAdapterFactory(@Nullable Scheduler scheduler2, boolean z) {
        this.scheduler = scheduler2;
        this.isAsync = z;
    }

    public final CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Type type2;
        String str;
        Class<Observable> rawType = getRawType(type);
        if (rawType == Completable.class) {
            g gVar = new g(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
            return gVar;
        }
        if (rawType == Flowable.class) {
            z = true;
        } else {
            z = false;
        }
        if (rawType == Single.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rawType == Maybe.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rawType != Observable.class && !z && !z2 && !z3) {
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
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        Class<e> rawType2 = getRawType(parameterUpperBound);
        if (rawType2 == SsResponse.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z5 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 != e.class) {
            type2 = parameterUpperBound;
            z5 = false;
            z4 = true;
            g gVar2 = new g(type2, this.scheduler, this.isAsync, z5, z4, z, z2, z3, false);
            return gVar2;
        } else if (parameterUpperBound instanceof ParameterizedType) {
            type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z5 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z4 = false;
        g gVar22 = new g(type2, this.scheduler, this.isAsync, z5, z4, z, z2, z3, false);
        return gVar22;
    }
}
