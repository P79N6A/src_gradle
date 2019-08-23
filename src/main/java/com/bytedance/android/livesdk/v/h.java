package com.bytedance.android.livesdk.v;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.browser.b.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.e.d;
import com.bytedance.android.livesdk.browser.g.c;
import com.bytedance.android.livesdk.browser.shorturl.ShortUrlService;
import com.bytedance.android.livesdk.chatroom.interact.s;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.h;
import com.bytedance.android.livesdk.effect.d;
import com.bytedance.android.livesdk.f.a;
import com.bytedance.android.livesdk.live.provider.GsonProvider;
import com.bytedance.android.livesdk.live.provider.a;
import com.bytedance.android.livesdk.player.c;
import com.bytedance.android.livesdk.s.i;
import com.bytedance.android.livesdk.s.j;
import com.bytedance.android.livesdk.s.l;
import com.bytedance.android.livesdk.schema.d;
import com.bytedance.android.livesdk.sticker.a.e;
import com.bytedance.android.livesdk.t.b;
import com.bytedance.android.livesdk.v.a;
import com.bytedance.android.livesdk.v.k;
import com.bytedance.android.livesdk.wallet.ab;
import com.bytedance.android.livesdk.wallet.al;
import com.bytedance.android.livesdk.wallet.m;
import com.bytedance.android.livesdk.widget.a.a;
import com.bytedance.android.livesdk.y;
import com.bytedance.android.livesdk.y.a;
import com.bytedance.android.livesdk.y.c;
import com.bytedance.android.livesdk.y.d;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.d.o;
import com.bytedance.retrofit2.Retrofit;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17666a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f17667b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f17668c = new ConcurrentHashMap();

    static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public b<T> f17669a;

        /* renamed from: b  reason: collision with root package name */
        public b.a<T> f17670b;

        /* renamed from: c  reason: collision with root package name */
        public Object f17671c;

        private a(b<T> bVar) {
            this.f17669a = bVar;
        }

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }
    }

    public interface b<T> {

        public static final class a<R> {

            /* renamed from: a  reason: collision with root package name */
            public volatile R f17672a;

            /* renamed from: b  reason: collision with root package name */
            volatile boolean f17673b;

            public final a<R> a() {
                this.f17673b = true;
                return this;
            }

            private a() {
            }

            /* synthetic */ a(byte b2) {
                this();
            }

            public final a<R> a(R r) {
                this.f17672a = r;
                return this;
            }
        }

        @NonNull
        a<T> a(a<T> aVar);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17674a;

        /* renamed from: b  reason: collision with root package name */
        private h f17675b;

        private c(h hVar) {
            this.f17675b = hVar;
        }

        /* synthetic */ c(h hVar, byte b2) {
            this(hVar);
        }

        public final <T> a<T> a(Class<T> cls, b<T> bVar) {
            Class<T> cls2 = cls;
            b<T> bVar2 = bVar;
            if (!PatchProxy.isSupport(new Object[]{cls2, bVar2}, this, f17674a, false, 13229, new Class[]{Class.class, b.class}, a.class)) {
                return this.f17675b.a(cls2, bVar2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, bVar2}, this, f17674a, false, 13229, new Class[]{Class.class, b.class}, a.class);
        }
    }

    static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f17666a, true, 13219, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f17666a, true, 13219, new Class[0], h.class);
        }
        if (f17667b == null) {
            synchronized (h.class) {
                if (f17667b == null) {
                    f17667b = new h();
                }
            }
        }
        return f17667b;
    }

    private h() {
        a(com.bytedance.android.livesdk.player.a.class, (b<T>) new c.a<T>());
        a(Gson.class, (b<T>) new GsonProvider<T>());
        a(Retrofit.class, (b<T>) new com.bytedance.android.livesdk.live.provider.b<T>());
        a(y.class, (b<T>) new y.a<T>());
        a(com.bytedance.android.livesdk.browser.c.b.class, (b<T>) new d.c<T>());
        a(com.bytedance.android.livesdk.f.b.class, (b<T>) new a.C0098a<T>());
        b(n.class, new j.a());
        a(com.bytedance.android.livesdk.browser.shorturl.a.class, (b<T>) new ShortUrlService.a<T>());
        a(com.bytedance.android.livesdk.live.provider.a.class, (b<T>) new a.C0113a<T>());
        a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.c.class, (b<T>) new h.a<T>());
        a(o.class, (b<T>) new c.a<T>());
        a(com.bytedance.android.livesdk.schema.a.a.class, (b<T>) new d.a<T>());
        a(com.bytedance.android.live.f.a.class, (b<T>) new al.a<T>());
        a(g.class, (b<T>) new k.a<T>());
        k kVar = (k) b(g.class);
        c cVar = new c(this, (byte) 0);
        if (PatchProxy.isSupport(new Object[]{cVar}, kVar, k.f17680a, false, 13249, new Class[]{c.class}, Void.TYPE)) {
            k kVar2 = kVar;
            PatchProxy.accessDispatch(new Object[]{cVar}, kVar2, k.f17680a, false, 13249, new Class[]{c.class}, Void.TYPE);
        } else {
            cVar.a(com.bytedance.android.livesdk.browser.b.a.class, new b.a());
            cVar.a(com.bytedance.android.livesdk.browser.g.a.class, new c.a());
            cVar.a(com.bytedance.android.live.core.utils.j.class, new a.C0128a());
            cVar.a(ab.class, new ab.a());
            cVar.a(com.bytedance.android.livesdk.browser.e.d.class, new d.a());
            cVar.a(com.bytedance.android.livesdk.t.a.class, new b.a());
            cVar.a(com.bytedance.android.livesdk.chatroom.interact.a.class, new s.a());
        }
        a(d.class, (b<T>) new a.C0125a<T>());
        a(com.bytedance.android.livesdk.sticker.a.c.class, (b<T>) new e.a<T>());
        a(com.bytedance.android.livesdk.effect.b.class, (b<T>) new d.a<T>());
        a aVar = (a) b(d.class);
        c cVar2 = new c(this, (byte) 0);
        if (PatchProxy.isSupport(new Object[]{cVar2}, aVar, a.f17654a, false, 13188, new Class[]{c.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{cVar2}, aVar2, a.f17654a, false, 13188, new Class[]{c.class}, Void.TYPE);
            return;
        }
        aVar.f17655b = cVar2;
        aVar.a(com.bytedance.android.livesdk.sticker.c.class, new l.a());
        aVar.a(com.bytedance.android.livesdk.n.a.class, new d.a());
        aVar.a(m.class, new i.b());
        aVar.a(com.bytedance.android.livesdk.l.a.a.class, new a.C0129a());
    }

    private <T> T b(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f17666a, false, 13220, new Class[]{Class.class}, Object.class)) {
            return a(cls2, true);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, this, f17666a, false, 13220, new Class[]{Class.class}, Object.class);
    }

    public static <T> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f17666a, true, 13215, new Class[]{Class.class}, Object.class)) {
            return a().b(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, f17666a, true, 13215, new Class[]{Class.class}, Object.class);
    }

    static final /* synthetic */ b.a a(Class cls, b.a aVar) {
        try {
            return aVar.a(cls.newInstance());
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        }
    }

    private <T> a<T> b(Class<T> cls, b<T> bVar) {
        Class<T> cls2 = cls;
        b<T> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{cls2, bVar2}, this, f17666a, false, 13226, new Class[]{Class.class, b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, bVar2}, this, f17666a, false, 13226, new Class[]{Class.class, b.class}, a.class);
        }
        a<T> aVar = new a<>(bVar2, (byte) 0);
        aVar.f17670b = aVar.f17669a.a(new b.a((byte) 0));
        aVar.f17671c = aVar.f17669a.a(aVar.f17670b).f17672a;
        this.f17668c.put(cls2, aVar);
        return aVar;
    }

    public final <T> a<T> a(Class<T> cls, b<T> bVar) {
        Class<T> cls2 = cls;
        b<T> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{cls2, bVar2}, this, f17666a, false, 13225, new Class[]{Class.class, b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, bVar2}, this, f17666a, false, 13225, new Class[]{Class.class, b.class}, a.class);
        }
        a<T> aVar = new a<>(bVar2, (byte) 0);
        this.f17668c.put(cls2, aVar);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public <T> T a(Class<T> cls, boolean z) {
        a<T> aVar;
        if (PatchProxy.isSupport(new Object[]{cls, Byte.valueOf(z ? (byte) 1 : 0)}, this, f17666a, false, 13222, new Class[]{Class.class, Boolean.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls, Byte.valueOf(z)}, this, f17666a, false, 13222, new Class[]{Class.class, Boolean.TYPE}, Object.class);
        }
        if (PatchProxy.isSupport(new Object[]{cls}, this, f17666a, false, 13227, new Class[]{Class.class}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{cls}, this, f17666a, false, 13227, new Class[]{Class.class}, a.class);
        } else {
            aVar = this.f17668c.get(cls);
        }
        if (aVar == null) {
            if (!z) {
                return null;
            }
            aVar = b(cls, new i(cls));
        }
        if (aVar.f17670b == null || !aVar.f17670b.f17673b) {
            aVar.f17670b = aVar.f17669a.a(new b.a((byte) 0));
        }
        if (aVar.f17670b.f17673b) {
            if (aVar.f17671c == null) {
                synchronized (h.class) {
                    if (aVar.f17671c == null) {
                        aVar.f17671c = aVar.f17670b.f17672a;
                    }
                }
            }
            return aVar.f17671c;
        }
        Object obj = aVar.f17670b.f17672a;
        aVar.f17670b = null;
        return obj;
    }
}
