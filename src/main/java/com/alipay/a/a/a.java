package com.alipay.a.a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.a.b;

public final class a implements i, j {
    public final Object a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object b2 : (Object[]) obj) {
            arrayList.add(f.b(b2));
        }
        return arrayList;
    }

    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(b.class)) {
            return null;
        }
        b bVar = (b) obj;
        if (!(type instanceof GenericArrayType)) {
            Class<?> componentType = ((Class) type).getComponentType();
            int a2 = bVar.a();
            Object newInstance = Array.newInstance(componentType, a2);
            for (int i = 0; i < a2; i++) {
                Array.set(newInstance, i, e.a(bVar.a(i), (Type) componentType));
            }
            return newInstance;
        }
        throw new IllegalArgumentException("Does not support generic array!");
    }

    public final boolean a(Class<?> cls) {
        return cls.isArray();
    }
}
