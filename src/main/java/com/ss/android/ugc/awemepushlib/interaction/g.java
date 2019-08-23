package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77018a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77019b;

    g(Context context) {
        this.f77019b = context;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77018a, false, 90209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77018a, false, 90209, new Class[0], Void.TYPE);
            return;
        }
        b.d(this.f77019b);
    }
}
