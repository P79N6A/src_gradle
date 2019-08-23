package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;

public final class e extends b<d, f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45482a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45482a, false, 42020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45482a, false, 42020, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((f) this.f2979f).a((NearbyCities) ((d) this.f2978e).getData());
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f45482a, false, 42019, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f45482a, false, 42019, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        ((f) this.f2979f).a(exc2);
    }
}
