package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;

public final /* synthetic */ class u implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38859a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38860b;

    u(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38860b = commerceVideoDelegate;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f38859a, false, 30700, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f38859a, false, 30700, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38860b;
        if (a.a()) {
            d.a(str, str2, j).h("track_url").a("track_ad").f("cpv_100").b(commerceVideoDelegate.f38688e).c();
        }
    }
}
