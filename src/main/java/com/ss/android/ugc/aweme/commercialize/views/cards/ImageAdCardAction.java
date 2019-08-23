package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.l.b;

public class ImageAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33093, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("banner_card_close", this.f2957f, this.g);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33092, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.commercialize.utils.g.b(this.f2957f, this.g) && !b.a(this.f2957f, this.g)) {
            com.ss.android.ugc.aweme.commercialize.utils.g.c(this.f2957f, this.g);
        }
        g.d(this.f2957f, this.g);
        g.a("banner_card_click", this.f2957f, this.g);
    }

    public ImageAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
    }
}
