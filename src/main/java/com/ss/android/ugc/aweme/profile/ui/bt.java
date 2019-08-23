package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62547a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverCropActivity f62548b;

    bt(ProfileCoverCropActivity profileCoverCropActivity) {
        this.f62548b = profileCoverCropActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62547a, false, 68616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62547a, false, 68616, new Class[0], Void.TYPE);
            return;
        }
        this.f62548b.mCoverWindow.a();
    }
}
