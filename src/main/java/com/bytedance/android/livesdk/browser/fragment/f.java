package com.bytedance.android.livesdk.browser.fragment;

import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements FullscreenVideoFrame.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9380a;

    /* renamed from: b  reason: collision with root package name */
    private final TTLiveBrowserFragment f9381b;

    f(TTLiveBrowserFragment tTLiveBrowserFragment) {
        this.f9381b = tTLiveBrowserFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9380a, false, 3540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9380a, false, 3540, new Class[0], Void.TYPE);
            return;
        }
        TTLiveBrowserFragment tTLiveBrowserFragment = this.f9381b;
        if (tTLiveBrowserFragment.C != null) {
            tTLiveBrowserFragment.C.onHideCustomView();
        }
    }
}
