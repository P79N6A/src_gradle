package com.ss.android.ugc.aweme.commercialize.feed;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.utils.c;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.g;

public final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38783a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38784b;

    /* renamed from: c  reason: collision with root package name */
    private final IFeedViewHolder f38785c;

    ab(CommerceVideoDelegate commerceVideoDelegate, IFeedViewHolder iFeedViewHolder) {
        this.f38784b = commerceVideoDelegate;
        this.f38785c = iFeedViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38783a, false, 30707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38783a, false, 30707, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38784b;
        IFeedViewHolder iFeedViewHolder = this.f38785c;
        commerceVideoDelegate.f38689f.setVisibility(4);
        if (!o.v()) {
            o.b().h();
        } else {
            g a2 = commerceVideoDelegate.a(iFeedViewHolder);
            if (a2 != null) {
                a2.T();
            }
        }
        commerceVideoDelegate.feedAdLayout.setVisibility(0);
        c.a(commerceVideoDelegate.feedAdDownloadBtn);
        com.ss.android.ugc.aweme.commercialize.ad.c cVar = new com.ss.android.ugc.aweme.commercialize.ad.c((float) u.a(2.0d), commerceVideoDelegate.k.getResources().getColor(C0906R.color.ry));
        if (com.ss.android.ugc.aweme.commercialize.utils.c.E(commerceVideoDelegate.f38688e) || com.ss.android.ugc.aweme.commercialize.utils.c.z(commerceVideoDelegate.f38688e)) {
            c.a(commerceVideoDelegate.feedAdDownloadBtn, cVar, ContextCompat.getColor(commerceVideoDelegate.k, C0906R.color.a0k), Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(commerceVideoDelegate.f38688e)), 300);
        } else {
            commerceVideoDelegate.feedAdDownloadBtn.setBackground(cVar);
        }
        commerceVideoDelegate.feedAdLayout.animate().alpha(1.0f).setDuration(150).start();
    }
}
