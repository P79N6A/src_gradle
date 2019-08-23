package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67135a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67136b;

    bp(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67136b = vEVideoPublishEditActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67135a, false, 76492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67135a, false, 76492, new Class[0], Void.TYPE);
            return;
        }
        this.f67136b.s = true;
    }
}
