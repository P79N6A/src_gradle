package com.bytedance.android.livesdk.feed.services;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.network.GsonProvider;
import com.bytedance.android.livesdk.feed.network.c;
import com.bytedance.android.livesdk.feed.network.f;
import com.bytedance.retrofit2.Retrofit;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14382a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f14383b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f14384c = new ConcurrentHashMap();

    static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public C0103b<T> f14385a;

        /* renamed from: b  reason: collision with root package name */
        public Object f14386b;

        private a(C0103b<T> bVar) {
            this.f14385a = bVar;
        }

        /* synthetic */ a(C0103b bVar, byte b2) {
            this(bVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$b  reason: collision with other inner class name */
    public interface C0103b<T> {

        /* renamed from: com.bytedance.android.livesdk.feed.services.b$b$a */
        public static final class a<R> {

            /* renamed from: a  reason: collision with root package name */
            public R f14387a;

            /* renamed from: b  reason: collision with root package name */
            boolean f14388b;

            public final a<R> a() {
                this.f14388b = true;
                return this;
            }

            private a() {
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a<R> a(R r) {
                this.f14387a = r;
                return this;
            }
        }

        @NonNull
        a<T> a(a<T> aVar);
    }

    private b() {
        a(g.class, (C0103b<T>) new a<T>());
        a(com.bytedance.android.livesdk.feed.e.a.class, (C0103b<T>) new e<T>());
        a(Gson.class, (C0103b<T>) new GsonProvider<T>());
        a(Retrofit.class, (C0103b<T>) new f<T>());
        a(c.class, (C0103b<T>) new f<T>());
    }

    private static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f14382a, true, 8882, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f14382a, true, 8882, new Class[0], b.class);
        }
        if (f14383b == null) {
            synchronized (b.class) {
                if (f14383b == null) {
                    f14383b = new b();
                }
            }
        }
        return f14383b;
    }

    private <T> T b(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f14382a, false, 8883, new Class[]{Class.class}, Object.class)) {
            return a(cls2, true);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, this, f14382a, false, 8883, new Class[]{Class.class}, Object.class);
    }

    public static <T> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f14382a, true, 8878, new Class[]{Class.class}, Object.class)) {
            return a().b(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, f14382a, true, 8878, new Class[]{Class.class}, Object.class);
    }

    private <T> a<T> a(Class<T> cls, C0103b<T> bVar) {
        Class<T> cls2 = cls;
        C0103b<T> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{cls2, bVar2}, this, f14382a, false, 8888, new Class[]{Class.class, C0103b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, bVar2}, this, f14382a, false, 8888, new Class[]{Class.class, C0103b.class}, a.class);
        }
        a<T> aVar = new a<>(bVar2, (byte) 0);
        this.f14384c.put(cls2, aVar);
        return aVar;
    }

    static final /* synthetic */ C0103b.a a(Class cls, C0103b.a aVar) {
        try {
            return aVar.a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        }
    }

    private <T> T a(Class<T> cls, boolean z) {
        a<T> aVar;
        if (PatchProxy.isSupport(new Object[]{cls, (byte) 1}, this, f14382a, false, 8885, new Class[]{Class.class, Boolean.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls, (byte) 1}, this, f14382a, false, 8885, new Class[]{Class.class, Boolean.TYPE}, Object.class);
        }
        if (PatchProxy.isSupport(new Object[]{cls}, this, f14382a, false, 8889, new Class[]{Class.class}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{cls}, this, f14382a, false, 8889, new Class[]{Class.class}, a.class);
        } else {
            aVar = this.f14384c.get(cls);
        }
        if (aVar == null) {
            aVar = a(cls, (C0103b<T>) new c<T>(cls));
        }
        C0103b.a a2 = aVar.f14385a.a(new C0103b.a((byte) 0));
        if (!a2.f14388b) {
            return a2.f14387a;
        }
        if (aVar.f14386b == null) {
            synchronized (b.class) {
                if (aVar.f14386b == null) {
                    aVar.f14386b = a2.f14387a;
                }
            }
        }
        return aVar.f14386b;
    }
}
