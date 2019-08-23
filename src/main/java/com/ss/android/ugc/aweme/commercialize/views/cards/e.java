package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.g;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40056a;

    /* renamed from: b  reason: collision with root package name */
    private final a f40057b;

    /* renamed from: c  reason: collision with root package name */
    private final BlackMaskLayer f40058c;

    /* renamed from: d  reason: collision with root package name */
    private final IFeedViewHolder f40059d;

    public e(a aVar, BlackMaskLayer blackMaskLayer, IFeedViewHolder iFeedViewHolder) {
        this.f40057b = aVar;
        this.f40058c = blackMaskLayer;
        this.f40059d = iFeedViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40056a, false, 33046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40056a, false, 33046, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f40057b;
        BlackMaskLayer blackMaskLayer = this.f40058c;
        IFeedViewHolder iFeedViewHolder = this.f40059d;
        if (blackMaskLayer.getVisibility() == 0) {
            if (!o.v()) {
                o.b().h();
                return;
            }
            g a2 = aVar.a(iFeedViewHolder);
            if (a2 != null) {
                a2.T();
            }
        }
    }
}
