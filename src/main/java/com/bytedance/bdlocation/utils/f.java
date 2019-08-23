package com.bytedance.bdlocation.utils;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.lang.reflect.Field;

public final class f implements ExclusionStrategy {
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    public final boolean shouldSkipField(FieldAttributes fieldAttributes) {
        String name = fieldAttributes.getName();
        for (Class<? super T> superclass = fieldAttributes.getDeclaringClass().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (a(superclass, name) != null) {
                return true;
            }
        }
        return false;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
