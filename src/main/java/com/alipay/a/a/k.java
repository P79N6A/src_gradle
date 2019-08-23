package com.alipay.a.a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.a.b;

public final class k implements i {
    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(b.class)) {
            return null;
        }
        b bVar = (b) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < bVar.a(); i++) {
            hashSet.add(e.a(bVar.a(i), type2));
        }
        return hashSet;
    }

    public final boolean a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
