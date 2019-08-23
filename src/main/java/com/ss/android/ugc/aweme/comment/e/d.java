package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class d extends b<c, m> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36403a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36403a, false, 27327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36403a, false, 27327, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((m) this.f2979f).b(((c) this.f2978e).f36398d);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36403a, false, 27326, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36403a, false, 27326, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((m) this.f2979f).e(exc);
        }
    }
}
