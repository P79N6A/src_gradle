package com.ss.android.ugc.aweme.discover.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;

public final /* synthetic */ class i implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41948a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchItem f41949b;

    i(HotSearchItem hotSearchItem) {
        this.f41949b = hotSearchItem;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f41948a, false, 35608, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f41948a, false, 35608, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(this.f41949b.getAdData()).b();
    }
}
