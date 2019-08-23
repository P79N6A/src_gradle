package com.bytedance.android.livesdk.bgbroadcast;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9181a;

    /* renamed from: b  reason: collision with root package name */
    private final BgBroadcastFragment f9182b;

    d(BgBroadcastFragment bgBroadcastFragment) {
        this.f9182b = bgBroadcastFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9181a, false, 3253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9181a, false, 3253, new Class[0], Void.TYPE);
            return;
        }
        this.f9182b.o();
    }
}
