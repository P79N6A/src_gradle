package com.ss.android.ugc.aweme.shortvideo.gesture.defult;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67913a;

    /* renamed from: b  reason: collision with root package name */
    private final DefaultGesturePresenter f67914b;

    b(DefaultGesturePresenter defaultGesturePresenter) {
        this.f67914b = defaultGesturePresenter;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67913a, false, 77393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67913a, false, 77393, new Class[0], Void.TYPE);
            return;
        }
        this.f67914b.f67909f = true;
    }
}