package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12052a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12053b;

    d(AbsInteractionFragment absInteractionFragment) {
        this.f12053b = absInteractionFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12052a, false, 5558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12052a, false, 5558, new Class[0], Void.TYPE);
            return;
        }
        this.f12053b.k();
    }
}
