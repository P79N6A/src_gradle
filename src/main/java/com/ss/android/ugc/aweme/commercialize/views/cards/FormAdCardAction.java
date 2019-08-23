package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.b.e;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class FormAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33090, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f2953b) {
            g.a("form_card_close", this.f2957f, this.g);
        } else {
            g.K(this.f2957f, this.g);
        }
        super.b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33089, new Class[0], Void.TYPE);
            return;
        }
        g.d(this.f2957f, this.g);
        g.a("form_card_click", this.f2957f, this.g);
        bg.a(new e(this.g, 2));
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, j, false, 33091, new Class[]{AbsAdCardAction.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, j, false, 33091, new Class[]{AbsAdCardAction.b.class}, Void.TYPE);
            return;
        }
        super.b();
    }

    public FormAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
    }
}
