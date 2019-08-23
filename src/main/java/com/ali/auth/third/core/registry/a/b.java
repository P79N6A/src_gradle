package com.ali.auth.third.core.registry.a;

import com.ali.auth.third.core.registry.ServiceRegistration;
import com.ali.auth.third.core.registry.a;
import java.lang.reflect.Proxy;
import java.util.Map;

public class b implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a f4942a;

    public b(a aVar) {
        this.f4942a = aVar;
    }

    public ServiceRegistration a(Class<?>[] clsArr, Object obj, Map<String, String> map) {
        return this.f4942a.a(clsArr, obj, map);
    }

    public Object a(ServiceRegistration serviceRegistration) {
        return this.f4942a.a(serviceRegistration);
    }

    public <T> T a(Class<T> cls, Map<String, String> map) {
        T a2 = this.f4942a.a(cls, map);
        if (a2 != null || map == null || !"true".equals(map.get("$isv_scope$")) || !cls.isInterface()) {
            return a2;
        }
        return cls.cast(Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new c(this, cls, map)));
    }

    public <T> T[] b(Class<T> cls, Map<String, String> map) {
        return this.f4942a.b(cls, map);
    }
}
