package com.ss.android.ugc.aweme.message.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.f.a;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.rocket.g;
import com.ss.android.websocket.b.c.b;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55380a;

    /* renamed from: b  reason: collision with root package name */
    private final b f55381b = new c();

    /* renamed from: c  reason: collision with root package name */
    private final b f55382c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final b f55383d;

    /* renamed from: e  reason: collision with root package name */
    private final b f55384e = new b();

    /* renamed from: f  reason: collision with root package name */
    private final b f55385f;

    public e() {
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a(false);
        if (a2 != null) {
            this.f55383d = a2.getImParser();
        } else {
            this.f55383d = new com.ss.android.websocket.b.c.a();
        }
        this.f55385f = new g();
    }

    public final Object a(com.ss.android.websocket.internal.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f55380a, false, 58776, new Class[]{com.ss.android.websocket.internal.a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar}, this, f55380a, false, 58776, new Class[]{com.ss.android.websocket.internal.a.class}, Object.class);
        } else if (aVar.getMethod() == 1 && aVar.getService() == 1) {
            return this.f55381b.a(aVar);
        } else {
            if (aVar.getMethod() == 1 && aVar.getService() == 5) {
                return this.f55383d.a(aVar);
            }
            if (aVar.getMethod() == 1 && aVar.getService() == 6) {
                return this.f55382c.a(aVar);
            }
            if (aVar.getMethod() == 1 && aVar.getService() == 7) {
                return this.f55384e.a(aVar);
            }
            if (aVar.getMethod() == 1 && aVar.getService() == 1010) {
                return this.f55385f.a(aVar);
            }
            return null;
        }
    }
}
