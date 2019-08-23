package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.b.d;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;

public class CouponAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33082, new Class[0], Void.TYPE);
            return;
        }
        g.d(this.f2957f, this.g);
        g.r(this.f2957f, this.g);
        bg.a(new d(this.g, 17));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33083, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("coupon_card_close", this.f2957f, this.g);
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33084, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            ((j) this.i).b().setBackgroundResource(2130837803);
        }
    }

    public CouponAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
        this.f2955d = 2130839477;
    }
}
