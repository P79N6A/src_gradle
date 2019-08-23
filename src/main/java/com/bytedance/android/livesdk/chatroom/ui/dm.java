package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12094a;

    /* renamed from: b  reason: collision with root package name */
    private final dl f12095b;

    dm(dl dlVar) {
        this.f12095b = dlVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12094a, false, 6231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12094a, false, 6231, new Class[0], Void.TYPE);
            return;
        }
        dl dlVar = this.f12095b;
        dlVar.f12088e.setScaleX(0.64f);
        dlVar.f12088e.setScaleY(0.64f);
    }
}
