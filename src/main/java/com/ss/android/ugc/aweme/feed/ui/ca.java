package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46653a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46654b;

    ca(VideoShareView videoShareView) {
        this.f46654b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46653a, false, 43356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46653a, false, 43356, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46654b;
        videoShareView.mShareContainerView.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150).withEndAction(new cb(videoShareView)).start();
    }
}
