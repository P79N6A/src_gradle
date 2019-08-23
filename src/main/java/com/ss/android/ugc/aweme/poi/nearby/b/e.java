package com.ss.android.ugc.aweme.poi.nearby.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.poi.model.ai;
import com.ss.android.ugc.aweme.poi.model.s;

public final class e extends b<ai, f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60029a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60029a, false, 65241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60029a, false, 65241, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((f) this.f2979f).a((s) ((ai) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60029a, false, 65242, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60029a, false, 65242, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((f) this.f2979f).a(exc);
        }
    }
}
