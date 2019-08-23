package com.ss.android.ugc.awemepushlib.interaction;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77032a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f77033b = new n();

    private n() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77032a, false, 90235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77032a, false, 90235, new Class[0], Void.TYPE);
            return;
        }
        PushInitializer.a();
    }
}
