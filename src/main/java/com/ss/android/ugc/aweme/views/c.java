package com.ss.android.ugc.aweme.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76457a;

    /* renamed from: b  reason: collision with root package name */
    private final CircleDraweeView f76458b;

    c(CircleDraweeView circleDraweeView) {
        this.f76458b = circleDraweeView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f76457a, false, 89416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76457a, false, 89416, new Class[0], Void.TYPE);
            return;
        }
        this.f76458b.invalidate();
    }
}
