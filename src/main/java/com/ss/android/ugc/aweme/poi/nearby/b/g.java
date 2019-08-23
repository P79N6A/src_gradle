package com.ss.android.ugc.aweme.poi.nearby.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankBannerResponse;
import com.ss.android.ugc.aweme.poi.model.ao;

public final class g extends b<ao, h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60030a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60030a, false, 65243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60030a, false, 65243, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((h) this.f2979f).a((PoiRankBannerResponse) ((ao) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60030a, false, 65244, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60030a, false, 65244, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((h) this.f2979f).a(exc);
        }
    }
}
