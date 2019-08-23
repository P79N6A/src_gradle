package com.ss.android.ugc.aweme.feed.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate;
import com.ss.android.ugc.aweme.commercialize.feed.ah;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45142a;

    /* renamed from: b  reason: collision with root package name */
    private final IFeedViewHolder f45143b;

    o(IFeedViewHolder iFeedViewHolder) {
        this.f45143b = iFeedViewHolder;
    }

    public final void run() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f45142a, false, 41063, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45142a, false, 41063, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate r = this.f45143b.r();
        if (PatchProxy.isSupport(new Object[]{0L}, r, CommerceVideoDelegate.f38685b, false, 30648, new Class[]{Long.TYPE}, Void.TYPE)) {
            CommerceVideoDelegate commerceVideoDelegate = r;
            PatchProxy.accessDispatch(new Object[]{0L}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30648, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (!r.y) {
            CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = r.commerceGoodHalfCardContainer;
            if (PatchProxy.isSupport(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28029, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28029, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (commerceGoodHalfCardContainer.g) {
                    n.a("aweme_commerce_card_display_error_rate", 0, commerceGoodHalfCardContainer.i);
                } else {
                    n.a("aweme_commerce_card_display_error_rate", 1, commerceGoodHalfCardContainer.i);
                }
                z = commerceGoodHalfCardContainer.g;
            }
            if (z) {
                r.commerceGoodHalfCardContainer.postDelayed(new ah(r), 0);
            }
        }
    }
}
