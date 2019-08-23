package com.ss.android.ugc.aweme.feed.adapter;

import android.support.transition.ChangeBounds;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;

public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44874a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44875b;

    ae(VideoViewHolder videoViewHolder) {
        this.f44875b = videoViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44874a, false, 40851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44874a, false, 40851, new Class[0], Void.TYPE);
            return;
        }
        VideoViewHolder videoViewHolder = this.f44875b;
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeBounds());
            TransitionManager.beginDelayedTransition(videoViewHolder.mWidgetContainer, transitionSet);
            videoViewHolder.j.a("show_poi_info_with_expend", (Object) -1);
        } catch (NullPointerException e2) {
            n.a("log_transition_empty", null, c.a().a("errMsg", e2.getMessage()).b());
        }
    }
}
