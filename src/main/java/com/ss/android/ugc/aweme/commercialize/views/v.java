package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.views.SearchAdView;

public final /* synthetic */ class v implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40141a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchAdView.a f40142b;

    v(SearchAdView.a aVar) {
        this.f40142b = aVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40141a, false, 32991, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40141a, false, 32991, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SearchAdView.a aVar = this.f40142b;
        d.a().a("result_ad").b(z ? "deeplink_success" : "deeplink_failed").a(Long.valueOf(aVar.f40001c.id)).g(aVar.f40001c.logExtra).a(aVar.f40000b);
    }
}
