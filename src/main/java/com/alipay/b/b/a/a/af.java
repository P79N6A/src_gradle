package com.alipay.b.b.a.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class af implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    protected n f5247a;

    /* renamed from: b  reason: collision with root package name */
    protected Class<?> f5248b;

    /* renamed from: c  reason: collision with root package name */
    protected ag f5249c;

    public af(n nVar, Class<?> cls, ag agVar) {
        this.f5247a = nVar;
        this.f5248b = cls;
        this.f5249c = agVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f5249c.a(method, objArr);
    }
}
