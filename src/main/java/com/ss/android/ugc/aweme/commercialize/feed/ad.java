package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.card.CommerceCardViewPagerAdapter;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commercialize.views.cards.CommerceCardAction;

public final /* synthetic */ class ad implements CommerceCardViewPagerAdapter.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38788a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38789b;

    public ad(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38789b = commerceVideoDelegate;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f38788a, false, 30709, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f38788a, false, 30709, new Class[]{h.class}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38789b;
        CommerceCardAction commerceCardAction = new CommerceCardAction(commerceVideoDelegate.k, commerceVideoDelegate.f38688e, null, null, commerceVideoDelegate.j, hVar);
        commerceCardAction.a();
    }
}
