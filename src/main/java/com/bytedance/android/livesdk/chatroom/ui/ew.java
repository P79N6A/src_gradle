package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ew implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12238a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleInputDialogFragment f12239b;

    ew(SimpleInputDialogFragment simpleInputDialogFragment) {
        this.f12239b = simpleInputDialogFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12238a, false, 6437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12238a, false, 6437, new Class[0], Void.TYPE);
            return;
        }
        this.f12239b.c();
    }
}
