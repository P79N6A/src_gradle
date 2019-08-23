package com.bytedance.android.livesdk.feed.live;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14281a;

    /* renamed from: b  reason: collision with root package name */
    private final HorFollowLiveFeedViewHolder f14282b;

    l(HorFollowLiveFeedViewHolder horFollowLiveFeedViewHolder) {
        this.f14282b = horFollowLiveFeedViewHolder;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f14281a, false, 8742, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f14281a, false, 8742, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        HorFollowLiveFeedViewHolder horFollowLiveFeedViewHolder = this.f14282b;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            horFollowLiveFeedViewHolder.f14239d.getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            horFollowLiveFeedViewHolder.f14239d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
