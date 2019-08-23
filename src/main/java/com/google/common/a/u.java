package com.google.common.a;

import com.google.a.a.a.a.a.a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class u {
    @NullableDecl
    @GwtIncompatible

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24422a;
    @NullableDecl
    @GwtIncompatible

    /* renamed from: b  reason: collision with root package name */
    public static final Method f24423b;
    @NullableDecl
    @GwtIncompatible

    /* renamed from: c  reason: collision with root package name */
    public static final Method f24424c;

    @NullableDecl
    @GwtIncompatible
    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Method method;
        Object a2 = a();
        f24422a = a2;
        Method method2 = null;
        if (a2 == null) {
            method = null;
        } else {
            method = a("getStackTraceElement", (Class<?>[]) new Class[]{Throwable.class, Integer.TYPE});
        }
        f24423b = method;
        if (f24422a != null) {
            method2 = b();
        }
        f24424c = method2;
    }

    @NullableDecl
    @GwtIncompatible
    private static Method b() {
        try {
            Method a2 = a("getStackTraceDepth", (Class<?>[]) new Class[]{Throwable.class});
            if (a2 == null) {
                return null;
            }
            a2.invoke(a(), new Object[]{new Throwable()});
            return a2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @GwtIncompatible
    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        a.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void a(Throwable th) {
        m.a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @NullableDecl
    @GwtIncompatible
    private static Method a(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> void a(@NullableDecl Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            m.a(th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            a(th);
        }
    }
}
