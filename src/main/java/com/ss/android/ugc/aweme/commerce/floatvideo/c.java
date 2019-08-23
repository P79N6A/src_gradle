package com.ss.android.ugc.aweme.commerce.floatvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36912a;

    /* renamed from: b  reason: collision with root package name */
    private final FloatVideoBrowsePresenter f36913b;

    c(FloatVideoBrowsePresenter floatVideoBrowsePresenter) {
        this.f36913b = floatVideoBrowsePresenter;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36912a, false, 28189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36912a, false, 28189, new Class[0], Void.TYPE);
            return;
        }
        this.f36913b.b();
    }
}
