package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;

public final /* synthetic */ class bx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67152a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity.AnonymousClass18 f67153b;

    bx(VEVideoPublishEditActivity.AnonymousClass18 r1) {
        this.f67153b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67152a, false, 76532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67152a, false, 76532, new Class[0], Void.TYPE);
            return;
        }
        this.f67153b.a();
    }
}
