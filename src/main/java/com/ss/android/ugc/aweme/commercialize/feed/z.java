package com.ss.android.ugc.aweme.commercialize.feed;

import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.a;
import com.ss.android.ugc.aweme.commercialize.views.b;
import com.ss.android.ugc.aweme.commercialize.views.c;
import com.ss.android.ugc.aweme.commercialize.views.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38872a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38873b;

    z(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38873b = commerceVideoDelegate;
    }

    public final void run() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f38872a, false, 30705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38872a, false, 30705, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38873b;
        commerceVideoDelegate.d();
        AdHalfWebPageContainer adHalfWebPageContainer = commerceVideoDelegate.adHalfWebPageContainer;
        boolean a2 = AdHalfWebPageContainer.a(commerceVideoDelegate.f38688e);
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a2 ? (byte) 1 : 0)}, adHalfWebPageContainer, AdHalfWebPageContainer.f39874a, false, 32750, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            AdHalfWebPageContainer adHalfWebPageContainer2 = adHalfWebPageContainer;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a2)}, adHalfWebPageContainer2, AdHalfWebPageContainer.f39874a, false, 32750, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            if (!adHalfWebPageContainer.f39877c) {
                adHalfWebPageContainer.setVisibility(0);
            }
            if (a2) {
                adHalfWebPageContainer.setTranslationY((float) u.a(17.0d));
                adHalfWebPageContainer.animate().alpha(1.0f).translationY(0.0f).withStartAction(new a(adHalfWebPageContainer)).setInterpolator(new LinearInterpolator()).setDuration(280).withEndAction(new b(adHalfWebPageContainer)).start();
            } else {
                adHalfWebPageContainer.a(200, (float) (-(adHalfWebPageContainer.getWidth() + ((ViewGroup.MarginLayoutParams) adHalfWebPageContainer.getLayoutParams()).leftMargin)), 0.0f, 0.0f, 0.0f);
                adHalfWebPageContainer.animate().alpha(1.0f).withStartAction(new c(adHalfWebPageContainer)).setDuration(200).withEndAction(new d(adHalfWebPageContainer)).start();
            }
        }
        Aweme aweme = commerceVideoDelegate.f38688e;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32298, new Class[]{Aweme.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32298, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else {
            if (aweme != null && !aweme.isShowCommerceCard()) {
                if (com.ss.android.ugc.aweme.commercialize.utils.c.p(aweme)) {
                    CardStruct m = com.ss.android.ugc.aweme.commercialize.utils.c.m(aweme);
                    if (m != null) {
                        i = m.getShowDuration();
                    }
                } else {
                    com.ss.android.ugc.aweme.commercialize.utils.c.l(aweme);
                }
            }
            i = -1;
        }
        if (i > 0) {
            commerceVideoDelegate.l = new aa(commerceVideoDelegate);
            commerceVideoDelegate.n = System.currentTimeMillis();
            commerceVideoDelegate.m = (long) (i * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            commerceVideoDelegate.adHalfWebPageContainer.postDelayed(commerceVideoDelegate.l, commerceVideoDelegate.m);
        }
        commerceVideoDelegate.m();
        commerceVideoDelegate.x = true;
        if (com.ss.android.ugc.aweme.commercialize.utils.c.Q(commerceVideoDelegate.f38688e) && !com.ss.android.ugc.aweme.commercialize.utils.c.S(commerceVideoDelegate.f38688e)) {
            Aweme aweme2 = commerceVideoDelegate.f38688e;
            if (PatchProxy.isSupport(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32293, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32293, new Class[]{Aweme.class}, Void.TYPE);
                return;
            }
            AwemeSplashInfo V = com.ss.android.ugc.aweme.commercialize.utils.c.V(aweme2);
            if (V != null) {
                V.adCardShownOnce = true;
            }
        }
    }
}
