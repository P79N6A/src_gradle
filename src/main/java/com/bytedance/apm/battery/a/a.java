package com.bytedance.apm.battery.a;

import android.annotation.TargetApi;
import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class a implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    Object f18898a;

    /* renamed from: b  reason: collision with root package name */
    d f18899b;

    /* renamed from: c  reason: collision with root package name */
    public IBinder f18900c;

    @TargetApi(11)
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (this.f18900c != null && method.getName().equals("asBinder")) {
            return this.f18900c;
        }
        this.f18899b.a(method, objArr);
        return method.invoke(this.f18898a, objArr);
    }

    public a(IBinder iBinder, Class<?> cls, d dVar, IBinder iBinder2) {
        try {
            this.f18898a = cls.getDeclaredMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder});
            this.f18899b = dVar;
            this.f18900c = iBinder2;
        } catch (Exception unused) {
        }
    }
}
