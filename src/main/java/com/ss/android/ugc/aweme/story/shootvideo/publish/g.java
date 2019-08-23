package com.ss.android.ugc.aweme.story.shootvideo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.a.b;
import com.ss.android.ugc.aweme.shortvideo.a.d;

public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73720a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f73721b;

    g(Runnable runnable) {
        this.f73721b = runnable;
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f73720a, false, 85429, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f73720a, false, 85429, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Runnable runnable = this.f73721b;
        dVar.i();
        if (runnable != null) {
            runnable.run();
        }
    }
}
