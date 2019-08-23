package com.ss.android.ugc.aweme.commercialize.feed;

import android.support.v4.app.FragmentManager;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.card.CommerceCardViewPagerAdapter;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commerce.service.logs.aa;
import com.ss.android.ugc.aweme.commerce.service.logs.aj;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.feed.f.an;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.a;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class ae implements CommerceCardViewPagerAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38790a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38791b;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentManager f38792c;

    public ae(CommerceVideoDelegate commerceVideoDelegate, FragmentManager fragmentManager) {
        this.f38791b = commerceVideoDelegate;
        this.f38792c = fragmentManager;
    }

    public final void a(h hVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f38790a, false, 30710, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f38790a, false, 30710, new Class[]{h.class}, Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38791b;
        FragmentManager fragmentManager = this.f38792c;
        aa aaVar = new aa();
        aaVar.g = commerceVideoDelegate.f38688e.getAuthorUid();
        aaVar.i = Long.valueOf(hVar.getCommodityType());
        aaVar.m = hVar.isSelf() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY;
        aaVar.h = hVar.getPromotionId();
        aaVar.j = "pop_up_card";
        aaVar.l = commerceVideoDelegate.j;
        aaVar.f38056f = commerceVideoDelegate.f38688e.getAid();
        aaVar.n = hVar.hasCoupon() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY;
        switch (hVar.getElasticType()) {
            case 1:
                str = "normal";
                break;
            case 2:
                str = "new";
                break;
            case 3:
                str = "recommend";
                break;
            default:
                str = "normal";
                break;
        }
        aaVar.k = str;
        aaVar.b();
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = commerceVideoDelegate.commerceGoodHalfCardContainer;
        if (PatchProxy.isSupport(new Object[]{hVar}, commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28032, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, commerceGoodHalfCardContainer, CommerceGoodHalfCardContainer.f36809a, false, 28032, new Class[]{h.class}, Void.TYPE);
        } else {
            commerceGoodHalfCardContainer.f36811c.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).start();
            if (commerceGoodHalfCardContainer.f36812d.getVisibility() == 0) {
                commerceGoodHalfCardContainer.f36812d.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(200).start();
            }
        }
        if (fragmentManager != null && !hVar.isThirdParty()) {
            ICommerceService iCommerceService = (ICommerceService) ServiceManager.get().getService(ICommerceService.class);
            if (iCommerceService != null) {
                new aj().d(commerceVideoDelegate.f38688e.getAid()).f(commerceVideoDelegate.f38688e.getAuthorUid()).a("pop_up_card").b(hVar.isSelf()).b("transform_card").c(hVar.getPromotionId()).a(Long.valueOf(hVar.getCommodityType())).e(commerceVideoDelegate.j).b();
                iCommerceService.showSkuPanelGoodsDialogFromFeedCard(hVar.getPromotionId(), commerceVideoDelegate.j, fragmentManager, new y(commerceVideoDelegate));
                a.a().a(true);
                bg.a(new an(true));
            }
        }
    }
}
