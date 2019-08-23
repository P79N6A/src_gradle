package com.bytedance.android.livesdk.bgbroadcast.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9169a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9170b;

    c(b bVar) {
        this.f9170b = bVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9169a, false, 3352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9169a, false, 3352, new Class[0], Void.TYPE);
            return;
        }
        this.f9170b.o();
    }
}
