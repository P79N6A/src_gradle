package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11985a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f11986b;

    c(AbsInteractionFragment absInteractionFragment) {
        this.f11986b = absInteractionFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f11985a, false, 5557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11985a, false, 5557, new Class[0], Void.TYPE);
            return;
        }
        this.f11986b.l();
    }
}
