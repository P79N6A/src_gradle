package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class i extends b<h, k> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41192a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41192a, false, 35023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41192a, false, 35023, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((k) this.f2979f).a((Aweme) ((h) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f41192a, false, 35022, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f41192a, false, 35022, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((k) this.f2979f).a(exc);
        }
    }
}
