package com.ss.android.ugc.broker;

import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class d<T> {
    public final T a(Class cls, Class cls2) {
        if (cls2 != null) {
            try {
                return cls2.newInstance();
            } catch (Exception unused) {
            }
        }
        if (cls == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                PrintStream printStream = System.out;
                printStream.println("method " + method.getName() + " is called");
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                Class<?> returnType = method.getReturnType();
                if (!returnType.isPrimitive()) {
                    return method.getDefaultValue();
                }
                returnType.getClass();
                if (returnType == Boolean.TYPE) {
                    return Boolean.FALSE;
                }
                if (returnType == Character.TYPE) {
                    return 0;
                }
                if (returnType == Byte.TYPE) {
                    return (byte) 0;
                }
                if (returnType == Short.TYPE) {
                    return (short) 0;
                }
                if (returnType == Integer.TYPE) {
                    return 0;
                }
                if (returnType == Long.TYPE) {
                    return 0L;
                }
                if (returnType == Float.TYPE) {
                    return b.f77184b;
                }
                if (returnType == Double.TYPE) {
                    return b.f77183a;
                }
                return null;
            }
        });
    }
}
