package com.ali.auth.third.core.registry.a;

import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.trace.SDKLogger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Class f4943a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f4944b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f4945c;

    c(b bVar, Class cls, Map map) {
        this.f4945c = bVar;
        this.f4943a = cls;
        this.f4944b = map;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object a2 = this.f4945c.f4942a.a(this.f4943a, this.f4944b);
        if (a2 != null) {
            return method.invoke(a2, objArr);
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.f4943a.getName();
        objArr2[1] = this.f4944b != null ? this.f4944b.toString() : "";
        SDKLogger.e("kernel", Message.create(17, objArr2).toString());
        return null;
    }
}
