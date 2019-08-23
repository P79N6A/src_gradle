package com.bytedance.frameworks.plugin.c;

import com.bytedance.frameworks.plugin.hook.ServiceManagerHook;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private String f20012a;

    static class a extends i {

        /* renamed from: a  reason: collision with root package name */
        private j f20013a;

        public a(j jVar) {
            this.f20013a = jVar;
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            return super.a(obj, method, objArr);
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            return l.a(this.f20013a.f2178e, (InvocationHandler) this.f20013a);
        }
    }

    public final void a() {
        new ServiceManagerHook(this.f20012a, this).onHook();
    }

    public b(String str, j jVar) {
        this.f20012a = str;
        this.f2177d.put("queryLocalInterface", new a(jVar));
    }
}
