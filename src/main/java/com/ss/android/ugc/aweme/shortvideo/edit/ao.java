package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ao implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66977a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66978b;

    ao(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66978b = vEVideoPublishEditActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66977a, false, 76465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66977a, false, 76465, new Class[0], Void.TYPE);
            return;
        }
        this.f66978b.ag();
    }
}
