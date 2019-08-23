package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;

public final /* synthetic */ class f implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41942a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchItem f41943b;

    f(HotSearchItem hotSearchItem) {
        this.f41943b = hotSearchItem;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f41942a, false, 35592, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f41942a, false, 35592, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(this.f41943b.getAdData()).b();
    }
}
