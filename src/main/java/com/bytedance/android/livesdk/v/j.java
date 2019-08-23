package com.bytedance.android.livesdk.v;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.c;
import com.bytedance.android.livesdk.f.b;
import com.bytedance.android.livesdk.player.a;
import com.bytedance.android.livesdk.y;
import com.bytedance.android.livesdkapi.depend.d.n;
import com.bytedance.android.livesdkapi.depend.d.o;
import com.bytedance.retrofit2.Retrofit;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17678a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile j f17679b;

    public static f q() {
        if (PatchProxy.isSupport(new Object[0], null, f17678a, true, 13248, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f17678a, true, 13248, new Class[0], f.class);
        }
        if (f17679b == null) {
            synchronized (j.class) {
                if (f17679b == null) {
                    f17679b = new j();
                }
            }
        }
        return f17679b;
    }

    public final a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13230, new Class[0], a.class)) {
            return (a) h.a(a.class);
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13230, new Class[0], a.class);
    }

    public final Retrofit b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13232, new Class[0], Retrofit.class)) {
            return (Retrofit) h.a(Retrofit.class);
        }
        return (Retrofit) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13232, new Class[0], Retrofit.class);
    }

    public final Gson c() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13233, new Class[0], Gson.class)) {
            return (Gson) h.a(Gson.class);
        }
        return (Gson) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13233, new Class[0], Gson.class);
    }

    public final y d() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13234, new Class[0], y.class)) {
            return (y) h.a(y.class);
        }
        return (y) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13234, new Class[0], y.class);
    }

    public final b e() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13235, new Class[0], b.class)) {
            return (b) h.a(b.class);
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13235, new Class[0], b.class);
    }

    public final com.bytedance.android.livesdk.browser.c.b f() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13236, new Class[0], com.bytedance.android.livesdk.browser.c.b.class)) {
            return (com.bytedance.android.livesdk.browser.c.b) h.a(com.bytedance.android.livesdk.browser.c.b.class);
        }
        return (com.bytedance.android.livesdk.browser.c.b) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13236, new Class[0], com.bytedance.android.livesdk.browser.c.b.class);
    }

    public final n g() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13237, new Class[0], n.class)) {
            return (n) h.a(n.class);
        }
        return (n) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13237, new Class[0], n.class);
    }

    public final g h() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13239, new Class[0], g.class)) {
            return (g) h.a(g.class);
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13239, new Class[0], g.class);
    }

    public final com.bytedance.android.livesdk.live.provider.a i() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13240, new Class[0], com.bytedance.android.livesdk.live.provider.a.class)) {
            return (com.bytedance.android.livesdk.live.provider.a) h.a(com.bytedance.android.livesdk.live.provider.a.class);
        }
        return (com.bytedance.android.livesdk.live.provider.a) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13240, new Class[0], com.bytedance.android.livesdk.live.provider.a.class);
    }

    public final c j() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13241, new Class[0], c.class)) {
            return (c) h.a(c.class);
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13241, new Class[0], c.class);
    }

    public final d k() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13242, new Class[0], d.class)) {
            return (d) h.a(d.class);
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13242, new Class[0], d.class);
    }

    public final o l() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13243, new Class[0], o.class)) {
            return (o) h.a(o.class);
        }
        return (o) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13243, new Class[0], o.class);
    }

    public final com.bytedance.android.livesdk.schema.a.a m() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13244, new Class[0], com.bytedance.android.livesdk.schema.a.a.class)) {
            return (com.bytedance.android.livesdk.schema.a.a) h.a(com.bytedance.android.livesdk.schema.a.a.class);
        }
        return (com.bytedance.android.livesdk.schema.a.a) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13244, new Class[0], com.bytedance.android.livesdk.schema.a.a.class);
    }

    public final com.bytedance.android.live.f.a n() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13245, new Class[0], com.bytedance.android.live.f.a.class)) {
            return (com.bytedance.android.live.f.a) h.a(com.bytedance.android.live.f.a.class);
        }
        return (com.bytedance.android.live.f.a) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13245, new Class[0], com.bytedance.android.live.f.a.class);
    }

    public final com.bytedance.android.livesdk.sticker.a.c o() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13246, new Class[0], com.bytedance.android.livesdk.sticker.a.c.class)) {
            return (com.bytedance.android.livesdk.sticker.a.c) h.a(com.bytedance.android.livesdk.sticker.a.c.class);
        }
        return (com.bytedance.android.livesdk.sticker.a.c) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13246, new Class[0], com.bytedance.android.livesdk.sticker.a.c.class);
    }

    public final com.bytedance.android.livesdk.effect.b p() {
        if (!PatchProxy.isSupport(new Object[0], this, f17678a, false, 13247, new Class[0], com.bytedance.android.livesdk.effect.b.class)) {
            return (com.bytedance.android.livesdk.effect.b) h.a(com.bytedance.android.livesdk.effect.b.class);
        }
        return (com.bytedance.android.livesdk.effect.b) PatchProxy.accessDispatch(new Object[0], this, f17678a, false, 13247, new Class[0], com.bytedance.android.livesdk.effect.b.class);
    }
}
