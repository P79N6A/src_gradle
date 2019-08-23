package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77020a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77021b;

    h(Context context) {
        this.f77021b = context;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77020a, false, 90210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77020a, false, 90210, new Class[0], Void.TYPE);
            return;
        }
        b.c(this.f77021b);
    }
}
