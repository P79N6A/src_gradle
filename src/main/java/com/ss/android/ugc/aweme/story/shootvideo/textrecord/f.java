package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.story.shootvideo.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74247a;

    /* renamed from: b  reason: collision with root package name */
    private final c f74248b;

    f(c cVar) {
        this.f74248b = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f74247a, false, 86202, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f74247a, false, 86202, new Class[0], Object.class);
        }
        c cVar = this.f74248b;
        return c.a(cVar.f74232b.getBgView(), a.q.getVideoWidth(), a.q.getVideoHeight());
    }
}
