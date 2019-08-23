package com.ss.android.ugc.aweme.shortvideo.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69098a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraModule f69099b;

    d(CameraModule cameraModule) {
        this.f69099b = cameraModule;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69098a, false, 78367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69098a, false, 78367, new Class[0], Void.TYPE);
            return;
        }
        CameraModule cameraModule = this.f69099b;
        cameraModule.c(0);
        cameraModule.h.j();
        ai.d("handler camera release");
    }
}
