package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46649a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46650b;

    bz(VideoShareView videoShareView) {
        this.f46650b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46649a, false, 43355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46649a, false, 43355, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46650b;
        videoShareView.mShareContainerView.animate().scaleX(1.03f).scaleY(1.03f).setDuration(130).withEndAction(new cd(videoShareView)).start();
    }
}
