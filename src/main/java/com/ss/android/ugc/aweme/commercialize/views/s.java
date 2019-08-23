package com.ss.android.ugc.aweme.commercialize.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class s implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40135a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchAdView f40136b;

    s(SearchAdView searchAdView) {
        this.f40136b = searchAdView;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40135a, false, 32985, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40135a, false, 32985, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        SearchAdView searchAdView = this.f40136b;
        d.a().a("result_ad").b(z ? "deeplink_success" : "deeplink_failed").a(Long.valueOf(searchAdView.f39990c.id)).g(searchAdView.f39990c.logExtra).a(searchAdView.getContext());
    }
}
