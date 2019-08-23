package com.ss.android.ugc.awemepushlib.interaction;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77040a;

    /* renamed from: b  reason: collision with root package name */
    static final Runnable f77041b = new p();

    private p() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77040a, false, 90237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77040a, false, 90237, new Class[0], Void.TYPE);
            return;
        }
        PushInitializer.a(2);
    }
}
