package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.card.CommerceCardViewPagerAdapter;
import com.ss.android.ugc.aweme.commerce.service.logs.u;
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final /* synthetic */ class af implements CommerceCardViewPagerAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38793a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38794b;

    public af(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38794b = commerceVideoDelegate;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f38793a, false, 30711, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f38793a, false, 30711, new Class[]{h.class}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38794b;
        commerceVideoDelegate.a(270);
        new u().c(commerceVideoDelegate.f38688e.getAuthorUid()).a(Long.valueOf(hVar.getCommodityType())).a(hVar.getPromotionId()).b(commerceVideoDelegate.f38688e.getAid()).d("transform_card").b();
    }
}
