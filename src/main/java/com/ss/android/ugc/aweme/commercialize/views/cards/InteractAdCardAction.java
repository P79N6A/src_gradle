package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class InteractAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void a() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33095, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("interaction_card_close", this.f2957f, this.g);
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33094, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            ((j) this.i).a(true);
        }
    }

    public InteractAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
    }
}
