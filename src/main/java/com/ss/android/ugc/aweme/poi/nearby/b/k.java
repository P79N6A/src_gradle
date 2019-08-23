package com.ss.android.ugc.aweme.poi.nearby.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterResponse;
import com.ss.android.ugc.aweme.poi.model.ap;

public final class k extends b<ap, l> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60032a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60032a, false, 65247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60032a, false, 65247, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((l) this.f2979f).a((PoiRankFilterResponse) ((ap) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60032a, false, 65248, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60032a, false, 65248, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((l) this.f2979f).b(exc);
        }
    }
}
