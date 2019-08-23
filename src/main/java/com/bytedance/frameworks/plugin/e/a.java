package com.bytedance.frameworks.plugin.e;

import android.text.TextUtils;
import com.bytedance.frameworks.plugin.f.j;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Field> f2248a = new HashMap();

    private static Object a(Field field) throws IllegalAccessException {
        return b((Field) j.a(field, "The field must not be null"), (Object) null);
    }

    public static Object b(Class<?> cls, String str) throws IllegalAccessException {
        Field a2 = a(cls, str);
        if (a2 != null) {
            return a(a2);
        }
        return null;
    }

    public static Object a(Object obj, String str) throws IllegalAccessException {
        Object a2 = j.a(obj, "target object must not be null");
        Field a3 = a(a2.getClass(), str);
        if (a3 != null) {
            return b(a3, a2);
        }
        return null;
    }

    private static Object b(Field field, Object obj) throws IllegalAccessException {
        boolean z;
        if (field != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public static Field a(Class<?> cls, String str) {
        Field field;
        Class<? super T> cls2 = (Class) j.a(cls, "The class must not be null");
        j.a(!TextUtils.isEmpty(str), "The field name must not be blank");
        String str2 = cls2.toString() + "#" + str;
        synchronized (f2248a) {
            field = f2248a.get(str2);
        }
        if (field != null) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field;
        }
        while (cls2 != null) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                synchronized (f2248a) {
                    f2248a.put(str2, declaredField);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        return null;
    }

    public static void a(Field field, Object obj) throws IllegalAccessException {
        a((Field) j.a(field, "The field must not be null"), (Object) null, obj);
    }

    public static void a(Class<?> cls, String str, Object obj) throws IllegalAccessException {
        Field a2 = a(cls, str);
        if (a2 != null) {
            a(a2, (Object) null);
        }
    }

    public static void a(Object obj, String str, Object obj2) throws IllegalAccessException {
        Object a2 = j.a(obj, "target object must not be null");
        Field a3 = a(a2.getClass(), str);
        if (a3 != null) {
            a(a3, a2, obj2);
        }
    }

    public static void a(Field field, Object obj, Object obj2) throws IllegalAccessException {
        Field field2 = (Field) j.a(field, "The field must not be null");
        if (!field2.isAccessible()) {
            field2.setAccessible(true);
        }
        field2.set(obj, obj2);
    }
}
