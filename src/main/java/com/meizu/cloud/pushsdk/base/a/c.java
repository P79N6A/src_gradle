package com.meizu.cloud.pushsdk.base.a;

import com.meizu.cloud.pushsdk.base.h;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Method> f27043b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private String f27044a = "ReflectMethod";

    /* renamed from: c  reason: collision with root package name */
    private a f27045c;

    /* renamed from: d  reason: collision with root package name */
    private String f27046d;

    /* renamed from: e  reason: collision with root package name */
    private Class<?>[] f27047e;

    class a {
    }

    c(a aVar, String str, Class<?>... clsArr) {
        this.f27045c = aVar;
        this.f27046d = str;
        this.f27047e = clsArr;
    }

    private Class<?> a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        boolean isPrimitive = cls.isPrimitive();
        Class<Void> cls2 = cls;
        if (isPrimitive) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            cls2 = cls;
            if (Void.TYPE == cls) {
                cls2 = Void.class;
            }
        }
        return cls2;
    }

    private Method a() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> a2 = this.f27045c.a();
        for (Method method : a2.getMethods()) {
            if (a(method, this.f27046d, this.f27047e)) {
                return method;
            }
        }
        for (Method method2 : a2.getDeclaredMethods()) {
            if (a(method2, this.f27046d, this.f27047e)) {
                return method2;
            }
        }
        throw new NoSuchMethodException("No similar method " + this.f27046d + " with params " + Arrays.toString(this.f27047e) + " could be found on type " + a2);
    }

    private boolean a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && a((Class<?>[]) method.getParameterTypes(), clsArr);
    }

    private boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != a.class && !a(clsArr[i]).isAssignableFrom(a(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    private String b() throws ClassNotFoundException {
        StringBuffer stringBuffer = new StringBuffer(this.f27045c.a().getName());
        stringBuffer.append(this.f27046d);
        for (Class<?> name : this.f27047e) {
            stringBuffer.append(name.getName());
        }
        return stringBuffer.toString();
    }

    public <T> d<T> a(Object obj, Object... objArr) {
        d<T> dVar = new d<>();
        try {
            String b2 = b();
            Method method = f27043b.get(b2);
            if (method == null) {
                if (this.f27047e.length == objArr.length) {
                    method = this.f27045c.a().getMethod(this.f27046d, this.f27047e);
                } else {
                    if (objArr.length > 0) {
                        this.f27047e = new Class[objArr.length];
                        for (int i = 0; i < objArr.length; i++) {
                            this.f27047e[i] = objArr[i].getClass();
                        }
                    }
                    method = a();
                }
                f27043b.put(b2, method);
            }
            method.setAccessible(true);
            dVar.f27049b = method.invoke(obj, objArr);
            dVar.f27048a = true;
        } catch (Exception e2) {
            h.b().a(this.f27044a, "invoke", e2);
        }
        return dVar;
    }

    public <T> d<T> a(Object... objArr) {
        try {
            return a((Object) this.f27045c.a(), objArr);
        } catch (ClassNotFoundException unused) {
            return new d<>();
        }
    }
}
