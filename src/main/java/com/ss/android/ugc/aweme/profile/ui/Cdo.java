package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.dm;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62676a;

    /* renamed from: b  reason: collision with root package name */
    private final dm.AnonymousClass3 f62677b;

    Cdo(dm.AnonymousClass3 r1) {
        this.f62677b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62676a, false, 68999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62676a, false, 68999, new Class[0], Void.TYPE);
            return;
        }
        dm.this.dismiss();
    }
}
