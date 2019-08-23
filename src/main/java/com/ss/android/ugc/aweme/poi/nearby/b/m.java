package com.ss.android.ugc.aweme.poi.nearby.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.poi.a.k;
import com.ss.android.ugc.aweme.poi.model.as;

public final class m extends b<as, n> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60033a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60033a, false, 65249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60033a, false, 65249, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((n) this.f2979f).a((k) ((as) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60033a, false, 65250, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60033a, false, 65250, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((n) this.f2979f).a(exc);
        }
    }
}
