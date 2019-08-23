package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58167a;

    /* renamed from: b  reason: collision with root package name */
    private final a f58168b;

    e(a aVar) {
        this.f58168b = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58167a, false, 54507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58167a, false, 54507, new Class[0], Void.TYPE);
            return;
        }
        this.f58168b.f58158b = false;
    }
}
