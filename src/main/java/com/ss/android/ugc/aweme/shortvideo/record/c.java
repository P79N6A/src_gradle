package com.ss.android.ugc.aweme.shortvideo.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.ai;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69094a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraModule f69095b;

    /* renamed from: c  reason: collision with root package name */
    private final int f69096c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.medialib.camera.c f69097d;

    c(CameraModule cameraModule, int i, com.ss.android.medialib.camera.c cVar) {
        this.f69095b = cameraModule;
        this.f69096c = i;
        this.f69097d = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f69094a, false, 78365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69094a, false, 78365, new Class[0], Void.TYPE);
            return;
        }
        CameraModule cameraModule = this.f69095b;
        cameraModule.h.b(this.f69096c, new j(this.f69097d));
        ai.d("cameraManager.open");
    }
}
