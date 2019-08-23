package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46619a;

    /* renamed from: b  reason: collision with root package name */
    private final bj f46620b;

    bl(bj bjVar) {
        this.f46620b = bjVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f46619a, false, 43186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46619a, false, 43186, new Class[0], Void.TYPE);
            return;
        }
        bj bjVar = this.f46620b;
        if (bjVar.n != null) {
            bjVar.n.invalidate();
        }
    }
}
