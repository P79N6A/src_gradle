package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchMix;

public final class q extends k<p> {
    public static ChangeQuickRedirect h;
    protected d i;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 37266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 37266, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (((p) this.f2978e).mListQueryType == 1 && this.i != null) {
            this.i.a((SearchMix) ((p) this.f2978e).getData());
        }
    }

    public q(d dVar) {
        this.i = dVar;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, h, false, 37267, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, h, false, 37267, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (((p) this.f2978e).mListQueryType == 1 && this.i != null) {
            this.i.a(exc);
        }
    }
}
