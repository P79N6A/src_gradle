package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70881a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordPermissionActivity f70882b;

    cm(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f70882b = videoRecordPermissionActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70881a, false, 80731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70881a, false, 80731, new Class[0], Void.TYPE);
            return;
        }
        this.f70882b.d();
    }
}
