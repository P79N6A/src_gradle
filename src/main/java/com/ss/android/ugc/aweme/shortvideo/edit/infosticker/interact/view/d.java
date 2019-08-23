package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67332a;

    /* renamed from: b  reason: collision with root package name */
    private final c f67333b;

    d(c cVar) {
        this.f67333b = cVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67332a, false, 77089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67332a, false, 77089, new Class[0], Void.TYPE);
            return;
        }
        this.f67333b.h();
    }
}
