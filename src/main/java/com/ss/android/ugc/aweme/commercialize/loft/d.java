package com.ss.android.ugc.aweme.commercialize.loft;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39197a;

    /* renamed from: b  reason: collision with root package name */
    private final LoftActivity f39198b;

    d(LoftActivity loftActivity) {
        this.f39198b = loftActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f39197a, false, 31007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39197a, false, 31007, new Class[0], Void.TYPE);
            return;
        }
        this.f39198b.finish();
    }
}
