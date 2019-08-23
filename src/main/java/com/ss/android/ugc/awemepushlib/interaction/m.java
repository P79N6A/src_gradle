package com.ss.android.ugc.awemepushlib.interaction;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77030a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f77031b;

    m(Runnable runnable) {
        this.f77031b = runnable;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77030a, false, 90234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77030a, false, 90234, new Class[0], Void.TYPE);
            return;
        }
        Runnable runnable = this.f77031b;
        if (PushInitializer.f76990b) {
            runnable.run();
        } else {
            PushInitializer.f76992d.add(runnable);
        }
    }
}
