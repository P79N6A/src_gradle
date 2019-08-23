package com.bytedance.frameworks.plugin.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class l {
    private static List<Class<?>> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a(cls, (HashSet<Class<?>>) linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public static Object a(Object obj, InvocationHandler invocationHandler) {
        Class[] clsArr;
        List<Class<?>> a2 = a(obj.getClass());
        if (a2 == null || a2.size() <= 0) {
            clsArr = new Class[0];
        } else {
            clsArr = (Class[]) a2.toArray(new Class[a2.size()]);
        }
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), clsArr, invocationHandler);
    }

    private static void a(Class<?> cls, HashSet<Class<?>> hashSet) {
        Class<?> cls2;
        while (cls2 != null) {
            for (Class cls3 : cls2.getInterfaces()) {
                if (hashSet.add(cls3)) {
                    a(cls3, hashSet);
                }
            }
            Class<? super T> superclass = cls2.getSuperclass();
            cls2 = cls;
            cls2 = superclass;
        }
    }
}
