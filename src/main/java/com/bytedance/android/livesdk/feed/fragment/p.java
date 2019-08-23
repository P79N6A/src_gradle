package com.bytedance.android.livesdk.feed.fragment;

import android.support.v7.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.live.BaseLiveViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14164a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedLiveFragment f14165b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.ViewHolder f14166c;

    p(FeedLiveFragment feedLiveFragment, RecyclerView.ViewHolder viewHolder) {
        this.f14165b = feedLiveFragment;
        this.f14166c = viewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f14164a, false, 8680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14164a, false, 8680, new Class[0], Void.TYPE);
            return;
        }
        FeedLiveFragment feedLiveFragment = this.f14165b;
        RecyclerView.ViewHolder viewHolder = this.f14166c;
        if (feedLiveFragment.getUserVisibleHint() && feedLiveFragment.isResumed()) {
            ((BaseLiveViewHolder) viewHolder).e();
        }
    }
}
