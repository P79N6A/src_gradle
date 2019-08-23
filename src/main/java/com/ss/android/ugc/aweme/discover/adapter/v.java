package com.ss.android.ugc.aweme.discover.adapter;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41979a;

    /* renamed from: b  reason: collision with root package name */
    private final RankingListCoverViewHolder f41980b;

    v(RankingListCoverViewHolder rankingListCoverViewHolder) {
        this.f41980b = rankingListCoverViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f41979a, false, 35719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41979a, false, 35719, new Class[0], Void.TYPE);
            return;
        }
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f41980b;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(rankingListCoverViewHolder.f41703b, "scrollX", new int[]{0});
        ofInt.setDuration(200);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
        rankingListCoverViewHolder.f41703b.postDelayed(new x(rankingListCoverViewHolder), 2000);
    }
}
