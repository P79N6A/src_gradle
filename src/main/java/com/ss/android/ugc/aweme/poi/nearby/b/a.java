package com.ss.android.ugc.aweme.poi.nearby.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.poi.model.af;
import com.ss.android.ugc.aweme.poi.model.u;

public final class a extends b<u, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60027a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60027a, false, 65237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60027a, false, 65237, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            y.a(true);
            ((b) this.f2979f).a((af) ((u) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60027a, false, 65238, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60027a, false, 65238, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null && this.f2978e != null) {
            ((b) this.f2979f).b(exc);
        }
    }
}
