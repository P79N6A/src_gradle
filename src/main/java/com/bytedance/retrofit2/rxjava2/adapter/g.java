package com.bytedance.retrofit2.rxjava2.adapter;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public final class g implements CallAdapter<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Type f21957a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Scheduler f21958b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21959c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21960d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f21961e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f21962f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public final Type a() {
        return this.f21957a;
    }

    public final <R> Object a(Call<R> call) {
        Observable observable;
        Observable observable2;
        if (this.f21959c) {
            observable = new b(call);
        } else {
            observable = new c(call);
        }
        if (this.f21960d) {
            observable2 = new f(observable);
        } else if (this.f21961e) {
            observable2 = new a(observable);
        } else {
            observable2 = observable;
        }
        if (this.f21958b != null) {
            observable2 = observable2.subscribeOn(this.f21958b);
        }
        if (this.f21962f) {
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
        this.f21957a = type;
        this.f21958b = scheduler;
        this.f21959c = z;
        this.f21960d = z2;
        this.f21961e = z3;
        this.f21962f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }
}
