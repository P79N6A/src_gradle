package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ay implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9076a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9077b;

    ay(StartLiveFragmentD startLiveFragmentD) {
        this.f9077b = startLiveFragmentD;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f9076a, false, 2848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9076a, false, 2848, new Class[0], Void.TYPE);
            return;
        }
        this.f9077b.p();
    }
}
