package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class f extends b<e, n> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36410a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36410a, false, 27331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36410a, false, 27331, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((n) this.f2979f).c(((e) this.f2978e).f36405d);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36410a, false, 27330, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36410a, false, 27330, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((n) this.f2979f).f(exc);
        }
    }
}
