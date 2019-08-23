package com.ss.android.ugc.aweme.services;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class TTRetrofit implements IRetrofit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IRetrofit retrofit;

    static class RetrofitDelegateImpl implements IRetrofit {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String baseUrl;
        private List<Interceptor> interceptors;
        private AtomicReference<Retrofit> retrofit = new AtomicReference<>(null);

        public Retrofit getRetrofit() {
            Retrofit retrofit3;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71491, new Class[0], Retrofit.class)) {
                return (Retrofit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71491, new Class[0], Retrofit.class);
            }
            if (this.retrofit.get() == null) {
                synchronized (this) {
                    if (this.retrofit.get() == null) {
                        AtomicReference<Retrofit> atomicReference = this.retrofit;
                        String str = this.baseUrl;
                        List<Interceptor> list = this.interceptors;
                        if (PatchProxy.isSupport(new Object[]{str, list}, null, m.f33864a, true, 23112, new Class[]{String.class, List.class}, Retrofit.class)) {
                            retrofit3 = (Retrofit) PatchProxy.accessDispatch(new Object[]{str, list}, null, m.f33864a, true, 23112, new Class[]{String.class, List.class}, Retrofit.class);
                        } else {
                            retrofit3 = m.a(str, m.c(), m.a(), m.a(list));
                        }
                        atomicReference.set(retrofit3);
                    }
                }
            }
            return this.retrofit.get();
        }

        public <T> T create(Class<T> cls) {
            final Class<T> cls2 = cls;
            if (PatchProxy.isSupport(new Object[]{cls2}, this, changeQuickRedirect, false, 71490, new Class[]{Class.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{cls2}, this, changeQuickRedirect, false, 71490, new Class[]{Class.class}, Object.class);
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls2}, new InvocationHandler() {
                public static ChangeQuickRedirect changeQuickRedirect;
                private volatile T retrofitService;

                private T getRetrofitService() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71493, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71493, new Class[0], Object.class);
                    }
                    if (this.retrofitService == null) {
                        synchronized (this) {
                            if (this.retrofitService == null) {
                                this.retrofitService = RetrofitDelegateImpl.this.getRetrofit().create(cls2);
                            }
                        }
                    }
                    return this.retrofitService;
                }

                private Method getRetrofitMethod(T t, Method method) throws NoSuchMethodException {
                    if (!PatchProxy.isSupport(new Object[]{t, method}, this, changeQuickRedirect, false, 71494, new Class[]{Object.class, Method.class}, Method.class)) {
                        return t.getClass().getMethod(method.getName(), method.getParameterTypes());
                    }
                    return (Method) PatchProxy.accessDispatch(new Object[]{t, method}, this, changeQuickRedirect, false, 71494, new Class[]{Object.class, Method.class}, Method.class);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object invoke(java.lang.Object r22, java.lang.reflect.Method r23, java.lang.Object[] r24) throws java.lang.Throwable {
                    /*
                        r21 = this;
                        r1 = r23
                        r2 = r24
                        r3 = 3
                        java.lang.Object[] r4 = new java.lang.Object[r3]
                        r11 = 0
                        r4[r11] = r22
                        r12 = 1
                        r4[r12] = r1
                        r13 = 2
                        r4[r13] = r2
                        com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
                        java.lang.Class[] r9 = new java.lang.Class[r3]
                        java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                        r9[r11] = r5
                        java.lang.Class<java.lang.reflect.Method> r5 = java.lang.reflect.Method.class
                        r9[r12] = r5
                        java.lang.Class<java.lang.Object[]> r5 = java.lang.Object[].class
                        r9[r13] = r5
                        java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                        r7 = 0
                        r8 = 71492(0x11744, float:1.00182E-40)
                        r5 = r21
                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                        if (r4 == 0) goto L_0x0058
                        java.lang.Object[] r14 = new java.lang.Object[r3]
                        r14[r11] = r22
                        r14[r12] = r1
                        r14[r13] = r2
                        com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
                        r17 = 0
                        r18 = 71492(0x11744, float:1.00182E-40)
                        java.lang.Class[] r0 = new java.lang.Class[r3]
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        r0[r11] = r1
                        java.lang.Class<java.lang.reflect.Method> r1 = java.lang.reflect.Method.class
                        r0[r12] = r1
                        java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                        r0[r13] = r1
                        java.lang.Class<java.lang.Object> r20 = java.lang.Object.class
                        r15 = r21
                        r19 = r0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                        java.lang.Object r0 = (java.lang.Object) r0
                        return r0
                    L_0x0058:
                        java.lang.Object r0 = r21.getRetrofitService()
                        r3 = r21
                        java.lang.reflect.Method r1 = r3.getRetrofitMethod(r0, r1)
                        java.lang.Object r0 = r1.invoke(r0, r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.TTRetrofit.RetrofitDelegateImpl.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                }
            });
        }

        RetrofitDelegateImpl(String str, List<Interceptor> list) {
            this.baseUrl = str;
            this.interceptors = list;
        }
    }

    public TTRetrofit(String str) {
        this.retrofit = new RetrofitDelegateImpl(str, null);
    }

    public final <T> T create(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, changeQuickRedirect, false, 71489, new Class[]{Class.class}, Object.class)) {
            return this.retrofit.create(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, this, changeQuickRedirect, false, 71489, new Class[]{Class.class}, Object.class);
    }

    public TTRetrofit(String str, List<Interceptor> list) {
        this.retrofit = new RetrofitDelegateImpl(str, list);
    }
}
