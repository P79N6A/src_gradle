package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46655a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoShareView f46656b;

    cb(VideoShareView videoShareView) {
        this.f46656b = videoShareView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46655a, false, 43357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46655a, false, 43357, new Class[0], Void.TYPE);
            return;
        }
        VideoShareView videoShareView = this.f46656b;
        videoShareView.mShareContainerView.animate().scaleX(0.95f).scaleY(0.95f).setDuration(150).withEndAction(new cc(videoShareView)).start();
    }
}
