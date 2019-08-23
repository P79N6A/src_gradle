package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ep implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13235a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankWidget.AnonymousClass1 f13236b;

    ep(TopRankWidget.AnonymousClass1 r1) {
        this.f13236b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13235a, false, 7520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13235a, false, 7520, new Class[0], Void.TYPE);
            return;
        }
        TopRankWidget.AnonymousClass1 r0 = this.f13236b;
        if (TopRankWidget.this.isViewValid()) {
            TopRankWidget.this.m.start();
        }
    }
}
