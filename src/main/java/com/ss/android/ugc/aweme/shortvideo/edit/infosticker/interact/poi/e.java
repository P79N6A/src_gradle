package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67294a;

    /* renamed from: b  reason: collision with root package name */
    private final c f67295b;

    e(c cVar) {
        this.f67295b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67294a, false, 77002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67294a, false, 77002, new Class[0], Void.TYPE);
            return;
        }
        this.f67295b.a();
    }
}
