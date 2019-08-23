package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class er implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13241a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankWidget.AnonymousClass1.AnonymousClass1 f13242b;

    er(TopRankWidget.AnonymousClass1.AnonymousClass1 r1) {
        this.f13242b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13241a, false, 7523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13241a, false, 7523, new Class[0], Void.TYPE);
            return;
        }
        TopRankWidget.AnonymousClass1.AnonymousClass1 r0 = this.f13242b;
        if (TopRankWidget.this.isViewValid()) {
            TopRankWidget.this.m.start();
        }
    }
}
