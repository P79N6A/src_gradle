package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.Subscribe;

public class TopPageAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33107, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            ((j) this.i).a(true);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33109, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a(this.f2957f, this.g, "close", "coupon");
        if (this.i instanceof j) {
            ((j) this.i).a("javascript:window.creative_dismissModal()");
        }
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, j, false, 33108, new Class[]{AbsAdCardAction.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, j, false, 33108, new Class[]{AbsAdCardAction.b.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(false);
        }
        g.a(this.f2957f, this.g, "close", "coupon");
        if (this.i instanceof j) {
            ((j) this.i).a("javascript:window.creative_dismissModal()");
        }
    }

    public TopPageAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
        this.f2955d = 2130839087;
    }
}
