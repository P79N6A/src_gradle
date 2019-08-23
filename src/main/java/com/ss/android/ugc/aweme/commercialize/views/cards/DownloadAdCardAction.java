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

public class DownloadAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33086, new Class[0], Void.TYPE);
            return;
        }
        super.b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33087, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("close", this.f2957f, this.g, "card");
    }

    /* access modifiers changed from: package-private */
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33085, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33085, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            ((j) this.i).a(true);
        }
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, j, false, 33088, new Class[]{AbsAdCardAction.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, j, false, 33088, new Class[]{AbsAdCardAction.b.class}, Void.TYPE);
            return;
        }
        if (this.g.getAwemeRawAd() != null && !this.g.getAwemeRawAd().isCardOnceClick()) {
            a();
            this.g.getAwemeRawAd().setCardOnceClick(true);
        }
    }

    public DownloadAdCardAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
        this.f2955d = 2130839477;
    }
}
