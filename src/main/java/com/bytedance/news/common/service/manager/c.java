package com.bytedance.news.common.service.manager;

import java.util.concurrent.ConcurrentHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, Object> f2307a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, a<?>> f2308b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, b> f2309c = new ConcurrentHashMap<>();

    public static <T> T a(Class<T> cls) {
        T t = f2307a.get(cls);
        if (t == null) {
            synchronized (c.class) {
                a aVar = f2308b.get(cls);
                if (aVar != null) {
                    T a2 = aVar.a();
                    f2308b.remove(cls);
                    if (a2 != null) {
                        b(cls, a2);
                        return a2;
                    }
                }
                t = b(cls);
                if (t != null) {
                    b(cls, t);
                    return t;
                }
            }
        }
        return t;
    }

    private static <T> T b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(String.format("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return ((IServiceProxy) newInstance).newInstance();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        return null;
    }

    public static <T> void a(Class<T> cls, a<T> aVar) {
        f2308b.put(cls, aVar);
    }

    public static <T> void a(Class<T> cls, T t) {
        f2307a.put(cls, t);
    }

    private static <T> void b(Class<T> cls, T t) {
        f2307a.put(cls, t);
        if (f2309c.get(cls) != null) {
            f2309c.remove(cls);
        }
    }
}
