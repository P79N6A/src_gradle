package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.shortvideo.util.aq;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38786a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38787b;

    ac(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38787b = commerceVideoDelegate;
    }

    public final void run() {
        b.a aVar;
        b.a aVar2;
        b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f38786a, false, 30708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38786a, false, 30708, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38787b;
        String str = "";
        if (commerceVideoDelegate.w != null) {
            a aVar3 = commerceVideoDelegate.w;
            if (!((aVar3.j instanceof AbsAdCardAction) && ((AbsAdCardAction) aVar3.j).f2953b)) {
                if (!commerceVideoDelegate.w.d()) {
                    str = commerceVideoDelegate.w.l;
                } else if (commerceVideoDelegate.q()) {
                    str = "comment_block";
                } else if (commerceVideoDelegate.l()) {
                    str = "share_block";
                }
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    if (PatchProxy.isSupport(new Object[]{str2}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30668, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30668, new Class[]{String.class}, Void.TYPE);
                    } else {
                        if (commerceVideoDelegate.f38688e != null) {
                            if (!commerceVideoDelegate.f38688e.isShowCommerceCard()) {
                                Context context = commerceVideoDelegate.k;
                                Aweme aweme = commerceVideoDelegate.f38688e;
                                if (PatchProxy.isSupport(new Object[]{context, aweme, str2}, null, g.f39316a, true, 31512, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{context, aweme, str2}, null, g.f39316a, true, 31512, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
                                } else {
                                    b.a aVar4 = new b.a();
                                    if (c.p(aweme)) {
                                        switch (c.m(aweme).getCardType()) {
                                            case 1:
                                                aVar4.a("form_card_showfail");
                                                break;
                                            case 2:
                                            case 3:
                                            case 10:
                                                b.a a2 = aVar4.a("show_fail");
                                                if (!PatchProxy.isSupport(new Object[]{"card"}, a2, b.a.f39751a, false, 32216, new Class[]{String.class}, b.a.class)) {
                                                    Intrinsics.checkParameterIsNotNull("card", "refer");
                                                    a2.f39754d = "card";
                                                    break;
                                                } else {
                                                    b.a aVar5 = (b.a) PatchProxy.accessDispatch(new Object[]{"card"}, a2, b.a.f39751a, false, 32216, new Class[]{String.class}, b.a.class);
                                                    break;
                                                }
                                            case 4:
                                                aVar4.a("banner_card_showfail");
                                                break;
                                            case 5:
                                                aVar4.a("interaction_card_show_fail");
                                                break;
                                            case 6:
                                                aVar4.a("poll_card_show_fail");
                                                break;
                                            case e.l /*?: ONE_ARG  (7 int)*/:
                                                aVar4.a("survey_card_show_fail");
                                                break;
                                            case 8:
                                            case 9:
                                                aVar4.a("coupon_card_showfail");
                                                break;
                                        }
                                    } else {
                                        aVar4.a("landing_page_card_showfail");
                                    }
                                    if (PatchProxy.isSupport(new Object[]{aweme}, aVar4, b.a.f39751a, false, 32214, new Class[]{Aweme.class}, b.a.class)) {
                                        aVar = (b.a) PatchProxy.accessDispatch(new Object[]{aweme}, aVar4, b.a.f39751a, false, 32214, new Class[]{Aweme.class}, b.a.class);
                                    } else {
                                        Intrinsics.checkParameterIsNotNull(aweme, "aweme");
                                        b.a aVar6 = aVar4;
                                        aVar6.f39752b = aweme;
                                        aVar = aVar6;
                                    }
                                    if (PatchProxy.isSupport(new Object[]{str2}, aVar, b.a.f39751a, false, 32217, new Class[]{String.class}, b.a.class)) {
                                        aVar2 = (b.a) PatchProxy.accessDispatch(new Object[]{str2}, aVar, b.a.f39751a, false, 32217, new Class[]{String.class}, b.a.class);
                                    } else {
                                        Intrinsics.checkParameterIsNotNull(str2, "showFailReason");
                                        aVar2 = aVar;
                                        aVar2.f39755e = str2;
                                    }
                                    if (PatchProxy.isSupport(new Object[0], aVar2, b.a.f39751a, false, 32218, new Class[0], b.class)) {
                                        bVar = (b) PatchProxy.accessDispatch(new Object[0], aVar2, b.a.f39751a, false, 32218, new Class[0], b.class);
                                    } else {
                                        b bVar2 = new b(aVar2.f39752b, aVar2.f39753c, aVar2.f39754d, aVar2.f39755e, (byte) 0);
                                        bVar = bVar2;
                                    }
                                    if (PatchProxy.isSupport(new Object[]{context, bVar}, null, g.f39316a, true, 31513, new Class[]{Context.class, b.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{context, bVar}, null, g.f39316a, true, 31513, new Class[]{Context.class, b.class}, Void.TYPE);
                                    } else if (!(context == null || bVar == null)) {
                                        String str3 = bVar.f39748c;
                                        Aweme aweme2 = bVar.f39747b;
                                        JSONObject b2 = g.b(context, aweme2, str3, bVar.f39749d);
                                        g.a(b2, "fail_reason", bVar.f39750e);
                                        g.b(context, str3, aweme2, b2);
                                    }
                                }
                            }
                            if (PatchProxy.isSupport(new Object[]{str2}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30673, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str2}, commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30673, new Class[]{String.class}, Void.TYPE);
                            } else if (commerceVideoDelegate.f38688e != null) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("card_type", commerceVideoDelegate.a(commerceVideoDelegate.f38688e));
                                    jSONObject.put("error_msg", str2);
                                    if (commerceVideoDelegate.f38688e.isAd()) {
                                        jSONObject.put("creative_id", commerceVideoDelegate.b(commerceVideoDelegate.f38688e));
                                    }
                                } catch (Exception unused) {
                                }
                                n.a("aweme_ad_card_show_error_rate", 1, jSONObject);
                                n.a("aweme_ad_card_show_error", 1, jSONObject);
                            }
                        }
                    }
                } else {
                    long j = 200;
                    if (PatchProxy.isSupport(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30676, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], commerceVideoDelegate, CommerceVideoDelegate.f38685b, false, 30676, new Class[0], Void.TYPE);
                    } else if (AdHalfWebPageContainer.a(commerceVideoDelegate.f38688e)) {
                        an.a(commerceVideoDelegate.introContainer, commerceVideoDelegate.introContainer.getAlpha(), 0.0f, 200);
                    } else {
                        an.a(commerceVideoDelegate.introContainer, commerceVideoDelegate.introContainer.getAlpha(), 0.0f, 200);
                        aq.a(commerceVideoDelegate.introContainer, commerceVideoDelegate.introContainer.getTranslationX(), (float) aq.a(commerceVideoDelegate.k, commerceVideoDelegate.introContainer), 200);
                    }
                    commerceVideoDelegate.oldAdBottomLabelView.s();
                    if (AdHalfWebPageContainer.a(commerceVideoDelegate.f38688e)) {
                        j = 240;
                    }
                    commerceVideoDelegate.adHalfWebPageContainer.postDelayed(new z(commerceVideoDelegate), j);
                }
            }
        }
    }
}
