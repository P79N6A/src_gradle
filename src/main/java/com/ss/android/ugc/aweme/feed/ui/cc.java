package com.ss.android.ugc.aweme.feed.ui;

import android.view.animation.ScaleAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46657a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46658b;

    cc(VideoShareView videoShareView) {
        this.f46658b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46657a, false, 43358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46657a, false, 43358, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46658b;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.95f, 1.02f, 0.95f, 1.02f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(600);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        videoShareView.mShareContainerView.startAnimation(scaleAnimation);
    }
}
