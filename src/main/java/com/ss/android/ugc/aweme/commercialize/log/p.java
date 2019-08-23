package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class p implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39335a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39336b;

    p(Aweme aweme) {
        this.f39336b = aweme;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f39335a, false, 31793, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f39335a, false, 31793, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        d.a(str, str2, j).b("track_url").a("track_ad").f("play").a(this.f39336b).a(GlobalContext.getContext());
    }
}
