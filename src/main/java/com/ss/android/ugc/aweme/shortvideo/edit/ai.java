package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ai implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66965a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66966b;

    ai(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66966b = vEVideoPublishEditActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66965a, false, 76459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66965a, false, 76459, new Class[0], Void.TYPE);
            return;
        }
        this.f66966b.ai();
    }
}
