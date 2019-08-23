package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74251a;

    /* renamed from: b  reason: collision with root package name */
    private final c f74252b;

    h(c cVar) {
        this.f74252b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f74251a, false, 86204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74251a, false, 86204, new Class[0], Void.TYPE);
            return;
        }
        this.f74252b.f74234d.setBackgroundColor(0);
    }
}
