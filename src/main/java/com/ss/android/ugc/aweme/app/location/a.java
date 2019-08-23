package com.ss.android.ugc.aweme.app.location;

import android.content.Context;
import android.location.Address;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.d.f;
import com.ss.android.common.d.g;
import com.ss.android.common.d.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.poi.e.e;

public final class a implements g, h, af.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34193a;

    /* renamed from: b  reason: collision with root package name */
    private final b f34194b;

    /* renamed from: c  reason: collision with root package name */
    private af f34195c;

    /* renamed from: com.ss.android.ugc.aweme.app.location.a$a  reason: collision with other inner class name */
    static class C0440a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34196a;

        /* renamed from: b  reason: collision with root package name */
        Context f34197b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f34196a, false, 23542, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34196a, false, 23542, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.common.d.c.a(this.f34197b).a(e.g());
        }

        public final Address b() {
            if (!PatchProxy.isSupport(new Object[0], this, f34196a, false, 23543, new Class[0], Address.class)) {
                return com.ss.android.common.d.c.a(this.f34197b).a();
            }
            return (Address) PatchProxy.accessDispatch(new Object[0], this, f34196a, false, 23543, new Class[0], Address.class);
        }

        public final com.ss.android.ugc.aweme.poi.a c() {
            if (!PatchProxy.isSupport(new Object[0], this, f34196a, false, 23544, new Class[0], com.ss.android.ugc.aweme.poi.a.class)) {
                return a.a(com.ss.android.common.d.c.a(this.f34197b).b());
            }
            return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[0], this, f34196a, false, 23544, new Class[0], com.ss.android.ugc.aweme.poi.a.class);
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f34196a, false, 23545, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34196a, false, 23545, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.common.d.c.a(this.f34197b).b(true);
        }

        C0440a(Context context) {
            this.f34197b = context;
        }

        public final void a(g gVar) {
            g gVar2 = gVar;
            if (PatchProxy.isSupport(new Object[]{gVar2}, this, f34196a, false, 23547, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar2}, this, f34196a, false, 23547, new Class[]{g.class}, Void.TYPE);
                return;
            }
            com.ss.android.common.d.c.a(this.f34197b).h = gVar2;
        }

        public final void a(h hVar) {
            h hVar2 = hVar;
            if (PatchProxy.isSupport(new Object[]{hVar2}, this, f34196a, false, 23546, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2}, this, f34196a, false, 23546, new Class[]{h.class}, Void.TYPE);
                return;
            }
            com.ss.android.common.d.c.a(this.f34197b).a(hVar2);
        }
    }

    interface b {
        void a();

        void a(g gVar);

        void a(h hVar);

        Address b();

        com.ss.android.ugc.aweme.poi.a c();

        void d();
    }

    static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34198a;

        /* renamed from: b  reason: collision with root package name */
        Context f34199b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f34198a, false, 23548, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34198a, false, 23548, new Class[0], Void.TYPE);
            } else if (!af.b(this.f34199b)) {
                com.ss.android.common.d.c.a(this.f34199b).a(e.g());
            }
        }

        public final Address b() {
            if (PatchProxy.isSupport(new Object[0], this, f34198a, false, 23549, new Class[0], Address.class)) {
                return (Address) PatchProxy.accessDispatch(new Object[0], this, f34198a, false, 23549, new Class[0], Address.class);
            } else if (af.b(this.f34199b)) {
                return null;
            } else {
                return com.ss.android.common.d.c.a(this.f34199b).a();
            }
        }

        public final com.ss.android.ugc.aweme.poi.a c() {
            if (PatchProxy.isSupport(new Object[0], this, f34198a, false, 23550, new Class[0], com.ss.android.ugc.aweme.poi.a.class)) {
                return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[0], this, f34198a, false, 23550, new Class[0], com.ss.android.ugc.aweme.poi.a.class);
            } else if (af.b(this.f34199b)) {
                return null;
            } else {
                return a.a(com.ss.android.common.d.c.a(this.f34199b).b());
            }
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f34198a, false, 23551, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34198a, false, 23551, new Class[0], Void.TYPE);
            } else if (!af.b(this.f34199b)) {
                com.ss.android.common.d.c.a(this.f34199b).b(true);
            }
        }

        c(Context context) {
            this.f34199b = context;
        }

        public final void a(g gVar) {
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f34198a, false, 23553, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f34198a, false, 23553, new Class[]{g.class}, Void.TYPE);
            } else if (!af.b(this.f34199b)) {
                com.ss.android.common.d.c.a(this.f34199b).h = gVar;
            }
        }

        public final void a(h hVar) {
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f34198a, false, 23552, new Class[]{h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f34198a, false, 23552, new Class[]{h.class}, Void.TYPE);
            } else if (!af.b(this.f34199b)) {
                com.ss.android.common.d.c.a(this.f34199b).a(hVar);
            }
        }
    }

    @Deprecated
    public final Address f() {
        return this.f34194b.b();
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23532, new Class[0], Void.TYPE);
            return;
        }
        this.f34195c.c();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23538, new Class[0], Void.TYPE);
            return;
        }
        n.a("poi_log", "location_cache", null);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23536, new Class[0], Void.TYPE);
            return;
        }
        k();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23537, new Class[0], Void.TYPE);
            return;
        }
        k();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23540, new Class[0], Void.TYPE);
            return;
        }
        n.a("poi_log", "location_start", com.ss.android.ugc.aweme.app.d.c.a().b());
    }

    public final com.ss.android.ugc.aweme.poi.a g() {
        if (!PatchProxy.isSupport(new Object[0], this, f34193a, false, 23535, new Class[0], com.ss.android.ugc.aweme.poi.a.class)) {
            return this.f34194b.c();
        }
        return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23535, new Class[0], com.ss.android.ugc.aweme.poi.a.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23530, new Class[0], Void.TYPE);
            return;
        }
        e();
        if (f() != null) {
            h();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23534, new Class[0], Void.TYPE);
            return;
        }
        this.f34194b.a((h) this);
        this.f34194b.d();
    }

    public final void e() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23533, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.i18n.c.a()) {
            try {
                i = com.ss.android.ugc.aweme.global.config.settings.g.b().aq().getLocationUpdateInterval().intValue();
            } catch (com.bytedance.ies.a unused) {
            }
            if (i <= 0) {
                i = 7200;
            }
            com.ss.android.common.d.c.a((Context) k.a());
            com.ss.android.common.d.c.a(i);
        }
        this.f34194b.a((h) this);
        this.f34194b.a();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f34193a, false, 23529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34193a, false, 23529, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.common.d.e a2 = com.ss.android.common.d.e.a((Context) k.a());
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.common.d.e.f28272a, false, 15887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.common.d.e.f28272a, false, 15887, new Class[0], Void.TYPE);
            return;
        }
        Logger.debug();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= a2.o + ((long) (a2.p * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
            a2.a();
            a2.q = false;
            return;
        }
        if (a2.q && currentTimeMillis >= a2.o + (((long) a2.r) * 60000)) {
            a2.a();
        }
    }

    public static com.ss.android.ugc.aweme.poi.a a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f34193a, true, 23541, new Class[]{f.class}, com.ss.android.ugc.aweme.poi.a.class)) {
            return (com.ss.android.ugc.aweme.poi.a) PatchProxy.accessDispatch(new Object[]{fVar2}, null, f34193a, true, 23541, new Class[]{f.class}, com.ss.android.ugc.aweme.poi.a.class);
        } else if (fVar2 == null) {
            return null;
        } else {
            com.ss.android.ugc.aweme.poi.a aVar = new com.ss.android.ugc.aweme.poi.a();
            aVar.isGaode = fVar2.isGaode;
            aVar.latitude = fVar2.latitude;
            aVar.longitude = fVar2.longitude;
            aVar.country = fVar2.country;
            aVar.province = fVar2.province;
            aVar.city = fVar2.city;
            aVar.district = fVar2.district;
            aVar.address = fVar2.address;
            aVar.time = fVar2.time;
            return aVar;
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f34193a, false, 23539, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f34193a, false, 23539, new Class[]{String.class}, Void.TYPE);
            return;
        }
        n.a("poi_log", "location_failed", com.ss.android.ugc.aweme.app.d.c.a().a("errorDesc", str2).b());
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34193a, false, 23531, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34193a, false, 23531, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (((Boolean) SharePrefCache.inst().getIsGrantedLocationPermission().c()).booleanValue()) {
            e();
        }
        if (z) {
            com.ss.android.common.d.e.a((Context) k.a()).a();
        } else {
            h();
        }
    }

    public a(Context context, af afVar) {
        this.f34195c = afVar;
        if (com.ss.android.ugc.aweme.utils.permission.f.a()) {
            this.f34194b = new c(context);
        } else {
            this.f34194b = new C0440a(context);
        }
        this.f34194b.a((g) this);
    }
}
