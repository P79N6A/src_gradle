package com.ss.android.ugc.aweme.story.shootvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.view.c;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73485a;

    /* renamed from: b  reason: collision with root package name */
    private final c f73486b;

    h(c cVar) {
        this.f73486b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f73485a, false, 85247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73485a, false, 85247, new Class[0], Void.TYPE);
            return;
        }
        this.f73486b.dismiss();
    }
}
