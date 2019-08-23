package com.ss.android.ugc.aweme.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bf implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64761a;

    /* renamed from: b  reason: collision with root package name */
    private final MyHorizontalScrollView f64762b;

    public bf(MyHorizontalScrollView myHorizontalScrollView) {
        this.f64762b = myHorizontalScrollView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64761a, false, 73109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64761a, false, 73109, new Class[0], Void.TYPE);
            return;
        }
        this.f64762b.fullScroll(66);
    }
}
