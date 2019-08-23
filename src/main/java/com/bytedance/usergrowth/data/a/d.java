package com.bytedance.usergrowth.data.a;

import com.bytedance.usergrowth.data.a.a.b;
import com.bytedance.usergrowth.data.a.a.c;
import com.bytedance.usergrowth.data.a.a.h;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final ConcurrentHashMap<Class, Object> f2329a = new ConcurrentHashMap<>();

    static {
        b bVar = new b();
        a(b.class, bVar);
        a(c.class, bVar);
        a(h.class, bVar);
    }

    public static <T> T a(Class<T> cls) {
        T t = f2329a.get(cls);
        if (t == null) {
            synchronized (f2329a) {
                t = f2329a.get(cls);
            }
        }
        return t;
    }

    public static <T> void a(Class<T> cls, T t) {
        f2329a.put(cls, t);
    }
}
