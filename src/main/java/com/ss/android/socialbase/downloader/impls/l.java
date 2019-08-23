package com.ss.android.socialbase.downloader.impls;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.downloader.l f31029a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.downloader.l f31030b;

    static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private volatile com.ss.android.socialbase.downloader.downloader.l f31031a;

        public a(boolean z) {
            if (!z) {
                this.f31031a = new p();
            } else {
                this.f31031a = new o();
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if (this.f31031a != null) {
                    return method.invoke(this.f31031a, objArr);
                }
                return null;
            } catch (InvocationTargetException e2) {
                e2.getCause();
                throw e2.getCause();
            }
        }
    }

    public static com.ss.android.socialbase.downloader.downloader.l a(boolean z) {
        if (z) {
            if (f31030b == null) {
                synchronized (l.class) {
                    if (f31030b == null) {
                        f31030b = (com.ss.android.socialbase.downloader.downloader.l) Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{com.ss.android.socialbase.downloader.downloader.l.class}, new a(true));
                    }
                }
            }
            return f31030b;
        }
        if (f31029a == null) {
            synchronized (l.class) {
                if (f31029a == null) {
                    f31029a = (com.ss.android.socialbase.downloader.downloader.l) Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{com.ss.android.socialbase.downloader.downloader.l.class}, new a(false));
                }
            }
        }
        return f31029a;
    }
}
