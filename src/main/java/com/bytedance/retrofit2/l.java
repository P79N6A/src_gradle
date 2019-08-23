package com.bytedance.retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.retrofit2.CallAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import retrofit2.n;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final l f21900a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f21901b = e();

    static class a extends l {

        /* renamed from: com.bytedance.retrofit2.l$a$a  reason: collision with other inner class name */
        static class C0225a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private final Handler f21902a = new Handler(Looper.getMainLooper());

            C0225a() {
            }

            public final void execute(Runnable runnable) {
                this.f21902a.post(runnable);
            }
        }

        a() {
        }

        public final Executor c() {
            return new C0225a();
        }

        /* access modifiers changed from: package-private */
        public final CallAdapter.Factory a(Executor executor) {
            return new g(executor);
        }
    }

    static class b extends l {

        static class a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private static Object f21903a;

            /* renamed from: b  reason: collision with root package name */
            private static Method f21904b;

            a() {
            }

            static {
                try {
                    Class<?> cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f21903a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f21904b = cls.getDeclaredMethod("addOperation", new Class[]{Runnable.class});
                } catch (Exception e2) {
                    throw new AssertionError(e2);
                }
            }

            public final void execute(Runnable runnable) {
                try {
                    f21904b.invoke(f21903a, new Object[]{runnable});
                } catch (IllegalAccessException | IllegalArgumentException e2) {
                    throw new AssertionError(e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        b() {
        }

        public final Executor c() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        public final CallAdapter.Factory a(Executor executor) {
            return new g(executor);
        }
    }

    /* access modifiers changed from: package-private */
    public Executor c() {
        return null;
    }

    l() {
    }

    static l a() {
        return f21900a;
    }

    static boolean b() {
        return f21901b;
    }

    private static boolean e() {
        try {
            new n.a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static l d() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("org.robovm.apple.foundation.NSObject");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new l();
        }
    }

    /* access modifiers changed from: package-private */
    public CallAdapter.Factory a(Executor executor) {
        if (executor != null) {
            return new g(executor);
        }
        return d.f21852a;
    }
}
