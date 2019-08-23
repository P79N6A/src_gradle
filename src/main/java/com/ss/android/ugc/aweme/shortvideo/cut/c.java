package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.themechange.base.b;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66397a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66398b;

    c(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66398b = cutMultiVideoActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f66397a, false, 75442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66397a, false, 75442, new Class[0], Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66398b;
        if (cutMultiVideoActivity.z != 0) {
            cutMultiVideoActivity.w.fillBackgroundColor(b.f74589e.a(true, false, false, false, false));
        }
        cutMultiVideoActivity.w.setLoop(true);
        cutMultiVideoActivity.F.b(Integer.valueOf(cutMultiVideoActivity.w.prepare(cutMultiVideoActivity.f66143e)));
    }
}
