package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchAdData;

public final /* synthetic */ class l implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41955a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchAdData f41956b;

    l(HotSearchAdData hotSearchAdData) {
        this.f41956b = hotSearchAdData;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f41955a, false, 35627, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f41955a, false, 35627, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HotSearchAdData hotSearchAdData = this.f41956b;
        if (hotSearchAdData != null) {
            d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(Long.valueOf(hotSearchAdData.getCreativeId())).g(hotSearchAdData.getLogExtra()).b((Long) -1L).b();
        }
    }
}
