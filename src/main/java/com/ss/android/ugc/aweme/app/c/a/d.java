package com.ss.android.ugc.aweme.app.c.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final /* synthetic */ class d implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34014a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeRawAd f34015b;

    d(AwemeRawAd awemeRawAd) {
        this.f34015b = awemeRawAd;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f34014a, false, 23381, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f34014a, false, 23381, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.log.d.a(str, str2, j).b("track_url").a("track_ad").f("click").a(this.f34015b).b();
    }
}
