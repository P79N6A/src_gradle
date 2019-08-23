package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ec implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12132a;

    /* renamed from: b  reason: collision with root package name */
    private final View f12133b;

    ec(View view) {
        this.f12133b = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12132a, false, 6264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12132a, false, 6264, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f12133b;
        view.setScaleX(0.64f);
        view.setScaleY(0.64f);
    }
}
