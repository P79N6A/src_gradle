package com.meizu.cloud.pushsdk.b.a;

import com.meizu.cloud.pushsdk.b.b.a;
import com.meizu.cloud.pushsdk.b.c.k;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f26889a;

    /* renamed from: b  reason: collision with root package name */
    private final a f26890b;

    /* renamed from: c  reason: collision with root package name */
    private k f26891c;

    public c(a aVar) {
        this.f26890b = aVar;
    }

    public c(T t) {
        this.f26889a = t;
    }

    public static <T> c<T> a(a aVar) {
        return new c<>(aVar);
    }

    public static <T> c<T> a(T t) {
        return new c<>(t);
    }

    public T a() {
        return this.f26889a;
    }

    public void a(k kVar) {
        this.f26891c = kVar;
    }

    public boolean b() {
        return this.f26890b == null;
    }

    public a c() {
        return this.f26890b;
    }
}
