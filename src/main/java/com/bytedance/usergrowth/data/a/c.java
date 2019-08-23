package com.bytedance.usergrowth.data.a;

import com.bytedance.usergrowth.data.a.a.d;
import com.bytedance.usergrowth.data.a.a.f;
import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, HashMap<Object, ?>> f2328a = new HashMap<>();

    static {
        a(f.class, f.f2323a);
        a(d.class, d.f2321a);
    }

    public static <T> T a(Class<T> cls) {
        return b(cls, "DEFAULT_KEY");
    }

    public static <T, K extends T> void a(Class<T> cls, K k) {
        if (k != null && cls != null) {
            synchronized (f2328a) {
                if (f2328a == null) {
                    f2328a = new HashMap<>();
                }
                String name = cls.getName();
                HashMap hashMap = f2328a.get(name);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    f2328a.put(name, hashMap);
                }
                hashMap.put("DEFAULT_KEY", k);
            }
        }
    }

    private static <T> T b(Class<T> cls, Object obj) {
        synchronized (f2328a) {
            if (f2328a == null) {
                return null;
            }
            HashMap hashMap = f2328a.get(cls.getName());
            if (hashMap == null) {
                return null;
            }
            T t = hashMap.get(obj);
            return t;
        }
    }
}
