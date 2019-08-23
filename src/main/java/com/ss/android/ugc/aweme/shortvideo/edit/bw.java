package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;

public final /* synthetic */ class bw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67150a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity.AnonymousClass18 f67151b;

    bw(VEVideoPublishEditActivity.AnonymousClass18 r1) {
        this.f67151b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67150a, false, 76531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67150a, false, 76531, new Class[0], Void.TYPE);
            return;
        }
        VEVideoPublishEditActivity.AnonymousClass18 r0 = this.f67151b;
        if (Build.VERSION.SDK_INT < 19) {
            new SafeHandler(VEVideoPublishEditActivity.this).postDelayed(new bx(r0), 5000);
        }
    }
}
