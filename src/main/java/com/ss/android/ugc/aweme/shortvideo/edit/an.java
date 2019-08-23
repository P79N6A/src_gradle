package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66975a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66976b;

    an(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66976b = vEVideoPublishEditActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66975a, false, 76464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66975a, false, 76464, new Class[0], Void.TYPE);
            return;
        }
        this.f66976b.ah();
    }
}
