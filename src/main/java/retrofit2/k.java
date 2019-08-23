package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final k f84308a = c();

    static class a extends k {

        /* renamed from: retrofit2.k$a$a  reason: collision with other inner class name */
        static class C0905a implements Executor {

            /* renamed from: a  reason: collision with root package name */
            private final Handler f84309a = new Handler(Looper.getMainLooper());

            C0905a() {
            }

            public final void execute(Runnable runnable) {
                this.f84309a.post(runnable);
            }
        }

        a() {
        }

        public final Executor b() {
            return new C0905a();
        }

        /* access modifiers changed from: package-private */
        public final c.a a(@Nullable Executor executor) {
            if (executor != null) {
                return new g(executor);
            }
            throw new AssertionError();
        }
    }

    @IgnoreJRERequirement
    static class b extends k {
        b() {
        }

        /* access modifiers changed from: package-private */
        public final boolean a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: package-private */
        public final Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(Method method) {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Executor b() {
        return null;
    }

    k() {
    }

    static k a() {
        return f84308a;
    }

    private static k c() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new k();
        }
    }

    /* access modifiers changed from: package-private */
    public c.a a(@Nullable Executor executor) {
        if (executor != null) {
            return new g(executor);
        }
        return f.f84254a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
