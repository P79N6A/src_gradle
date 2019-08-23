package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43103a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchWordsFlipperView f43104b;

    ad(HotSearchWordsFlipperView hotSearchWordsFlipperView) {
        this.f43104b = hotSearchWordsFlipperView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43103a, false, 37684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43103a, false, 37684, new Class[0], Void.TYPE);
            return;
        }
        this.f43104b.showNext();
    }
}
