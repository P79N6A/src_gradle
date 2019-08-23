package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.l.b;

public class ShopAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;
    int k;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33104, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("close", this.f2957f, this.g, "card");
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33102, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            j jVar = (j) this.i;
            if (this.k == 1) {
                jVar.a(true);
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33103, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == 0) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.g.b(this.f2957f, this.g) && !b.a(this.f2957f, this.g)) {
                com.ss.android.ugc.aweme.commercialize.utils.g.c(this.f2957f, this.g);
            }
            g.a("click", this.f2957f, this.g, "card");
        }
    }

    public ShopAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
        if (c.m(aweme) != null) {
            this.k = c.m(aweme).getCardStyle();
        }
        this.f2955d = 2130839477;
    }
}
