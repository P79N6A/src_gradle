package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;

public final /* synthetic */ class r implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40133a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchAdView f40134b;

    r(SearchAdView searchAdView) {
        this.f40134b = searchAdView;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f40133a, false, 32984, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f40133a, false, 32984, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        SearchAdView searchAdView = this.f40134b;
        d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(searchAdView.f39990c).a(searchAdView.getContext());
    }
}
