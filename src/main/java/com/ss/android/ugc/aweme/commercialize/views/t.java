package com.ss.android.ugc.aweme.commercialize.views;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40137a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchAdView f40138b;

    t(SearchAdView searchAdView) {
        this.f40138b = searchAdView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40137a, false, 32986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40137a, false, 32986, new Class[0], Void.TYPE);
            return;
        }
        SearchAdView searchAdView = this.f40138b;
        if (PatchProxy.isSupport(new Object[0], searchAdView, SearchAdView.f39988a, false, 32975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], searchAdView, SearchAdView.f39988a, false, 32975, new Class[0], Void.TYPE);
            return;
        }
        if (searchAdView.f39990c != null && searchAdView.g < searchAdView.f39993f) {
            searchAdView.g = System.currentTimeMillis();
            if (searchAdView.f39991d == null) {
                searchAdView.f39991d = new Rect();
            }
            if (!searchAdView.getGlobalVisibleRect(searchAdView.f39991d) || searchAdView.f39991d.isEmpty()) {
                searchAdView.f39992e = false;
            } else if (!searchAdView.f39992e) {
                searchAdView.f39992e = true;
                if (PatchProxy.isSupport(new Object[0], searchAdView, SearchAdView.f39988a, false, 32977, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], searchAdView, SearchAdView.f39988a, false, 32977, new Class[0], Void.TYPE);
                } else {
                    if (searchAdView.f39990c != null) {
                        g.a(searchAdView.getContext(), Long.toString(searchAdView.f39990c.id), searchAdView.b() ? "flash" : "superstar_region", searchAdView.f39990c.logExtra);
                        g.a((g.a) new u(searchAdView), searchAdView.f39990c.trackUrlList, true);
                    }
                }
            }
        }
    }
}
