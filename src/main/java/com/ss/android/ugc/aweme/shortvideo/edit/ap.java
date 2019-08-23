package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66979a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66980b;

    ap(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66980b = vEVideoPublishEditActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66979a, false, 76466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66979a, false, 76466, new Class[0], Void.TYPE);
            return;
        }
        this.f66980b.af();
    }
}
