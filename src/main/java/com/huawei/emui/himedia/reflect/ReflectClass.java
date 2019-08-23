package com.huawei.emui.himedia.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectClass {
    private static final String TAG = "ReflectClass";
    private Class clazz;
    private Constructor ctor;
    private Method[] methods;

    /* access modifiers changed from: package-private */
    public Class getClazz() {
        return this.clazz;
    }

    private Class getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Constructor getConstructor(Class<?>[] clsArr) {
        if (this.clazz == null) {
            return null;
        }
        try {
            return this.clazz.getConstructor(clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private Method findMethod(String str) {
        if (this.methods == null) {
            return null;
        }
        for (Method method : this.methods) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public Object getStaticField(String str) {
        if (this.clazz == null) {
            return null;
        }
        try {
            return this.clazz.getDeclaredField(str).get(null);
        } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public Object invokeCtor(Object... objArr) {
        if (this.clazz == null || this.ctor == null) {
            return null;
        }
        try {
            return this.ctor.newInstance(objArr);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public Method getMethod(String str, Class<?>... clsArr) {
        if (this.clazz == null) {
            return null;
        }
        try {
            return this.clazz.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public Object invokeS(String str, Object... objArr) {
        Method findMethod = findMethod(str);
        if (findMethod != null) {
            try {
                return findMethod.invoke(this.clazz, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    public ReflectClass(String str, Class<?>... clsArr) {
        this.clazz = getClass(str);
        if (this.clazz != null) {
            this.ctor = getConstructor(clsArr);
            this.methods = this.clazz.getMethods();
        }
    }

    public Object invoke(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        Method findMethod = findMethod(str);
        if (findMethod != null) {
            try {
                return findMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }
}
