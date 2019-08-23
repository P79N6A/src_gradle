package com.bytedance.apm.battery.a;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    IBinder f18902a;

    /* renamed from: b  reason: collision with root package name */
    public IBinder f18903b;

    /* renamed from: c  reason: collision with root package name */
    d f18904c;

    /* renamed from: d  reason: collision with root package name */
    Class<?> f18905d;

    /* renamed from: e  reason: collision with root package name */
    Class<?> f18906e;

    public c(IBinder iBinder, d dVar) {
        this.f18902a = iBinder;
        this.f18904c = dVar;
        try {
            String a2 = dVar.a();
            this.f18905d = Class.forName(a2 + "$Stub");
            this.f18906e = Class.forName(a2);
        } catch (ClassNotFoundException unused) {
        }
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!"queryLocalInterface".equals(method.getName())) {
            return method.invoke(this.f18902a, objArr);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{this.f18906e}, new a(this.f18902a, this.f18905d, this.f18904c, this.f18903b));
    }
}
