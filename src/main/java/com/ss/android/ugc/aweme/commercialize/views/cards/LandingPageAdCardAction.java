package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.l.b;

public class LandingPageAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40032a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f40033b = "LandingPageAdCardAction";

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f40032a, false, 33097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40032a, false, 33097, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("landing_page_card_close", this.f2957f, this.g);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40032a, false, 33096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40032a, false, 33096, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.commercialize.utils.g.b(this.f2957f, this.g) && !b.a(this.f2957f, this.g)) {
            com.ss.android.ugc.aweme.commercialize.utils.g.c(this.f2957f, this.g);
        }
        g.a("landing_page_card_click", this.f2957f, this.g);
        if (this.g.getAwemeRawAd() != null && this.g.getAwemeRawAd().getDisableAutoTrackClick()) {
            g.d(this.f2957f, this.g);
        }
    }

    public LandingPageAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
    }
}
