package com.ss.android.ugc.aweme.feed.ui;

import android.view.animation.ScaleAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ce implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46661a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46662b;

    ce(VideoShareView videoShareView) {
        this.f46662b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46661a, false, 43360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46661a, false, 43360, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46662b;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.03f, 0.9f, 1.03f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        videoShareView.mShareContainerView.startAnimation(scaleAnimation);
    }
}
