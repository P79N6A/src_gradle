package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46659a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46660b;

    cd(VideoShareView videoShareView) {
        this.f46660b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46659a, false, 43359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46659a, false, 43359, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46660b;
        videoShareView.mShareContainerView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(350).withEndAction(new ce(videoShareView)).start();
    }
}
