package com.ss.android.ugc.aweme.follow.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class f extends b<g, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47791a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47791a, false, 44685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47791a, false, 44685, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((g) this.f2978e).getData();
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f47791a, false, 44687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47791a, false, 44687, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        j();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f47791a, false, 44686, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f47791a, false, 44686, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
    }
}
