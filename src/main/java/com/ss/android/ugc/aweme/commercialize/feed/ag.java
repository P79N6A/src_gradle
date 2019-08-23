package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commerce.service.logs.al;
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final /* synthetic */ class ag implements CommerceGoodHalfCardContainer.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38795a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38796b;

    public ag(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38796b = commerceVideoDelegate;
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f38795a, false, 30712, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f38795a, false, 30712, new Class[]{h.class}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38796b;
        new al().f(commerceVideoDelegate.f38688e.getAuthorUid()).b("transform_card").c(hVar.getPromotionId()).a(Integer.valueOf((int) hVar.getCommodityType())).g(commerceVideoDelegate.j).d(commerceVideoDelegate.f38688e.getAid()).e("video_play").h(null).a(commerceVideoDelegate.j).b();
    }
}
