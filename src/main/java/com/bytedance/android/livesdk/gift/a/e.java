package com.bytedance.android.livesdk.gift.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.b.a.a.b;
import com.ss.ugc.live.b.a.c;
import com.ss.ugc.live.b.a.d.a;
import com.ss.ugc.live.b.a.d.d;
import com.ss.ugc.live.b.a.d.f;

public final class e implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14713a;

    /* renamed from: b  reason: collision with root package name */
    private static d<String> f14714b;

    /* renamed from: c  reason: collision with root package name */
    private static d<String> f14715c;

    private d<String> a(b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, this, f14713a, false, 9397, new Class[]{b.class}, d.class)) {
            return new com.ss.ugc.live.b.a.d.b(new d(bVar2));
        }
        return (d) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f14713a, false, 9397, new Class[]{b.class}, d.class);
    }

    public final d<String> a(c cVar, com.ss.ugc.live.b.a.e eVar) {
        if (PatchProxy.isSupport(new Object[]{cVar, eVar}, this, f14713a, false, 9396, new Class[]{c.class, com.ss.ugc.live.b.a.e.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{cVar, eVar}, this, f14713a, false, 9396, new Class[]{c.class, com.ss.ugc.live.b.a.e.class}, d.class);
        } else if (!cVar.f78638e) {
            if (f14715c != null) {
                return f14715c;
            }
            d<String> a2 = a(eVar.f78653a);
            f14715c = a2;
            return a2;
        } else if (f14714b != null) {
            return f14714b;
        } else {
            f fVar = new f(a(eVar.f78653a));
            f14714b = fVar;
            return fVar;
        }
    }
}
