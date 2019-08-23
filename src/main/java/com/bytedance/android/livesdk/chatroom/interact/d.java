package com.bytedance.android.livesdk.chatroom.interact;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10833a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10834b;

    d(LinkDialog linkDialog) {
        this.f10834b = linkDialog;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f10833a, false, 4334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10833a, false, 4334, new Class[0], Void.TYPE);
            return;
        }
        this.f10834b.b(null);
    }
}
