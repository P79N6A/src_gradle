package com.alipay.b.b.a.a;

import android.content.Context;
import java.lang.reflect.Proxy;

public final class o extends ad {

    /* renamed from: a  reason: collision with root package name */
    Context f5278a;

    public o(Context context) {
        this.f5278a = context;
    }

    public final <T> T a(Class<T> cls, e eVar) {
        ae aeVar = new ae(new p(this, eVar));
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new af(aeVar.f5245a, cls, aeVar.f5246b));
    }
}
