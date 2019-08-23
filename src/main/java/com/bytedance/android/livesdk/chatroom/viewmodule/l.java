package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13279a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentPromotionWidget f13280b;

    l(CommentPromotionWidget commentPromotionWidget) {
        this.f13280b = commentPromotionWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13279a, false, 6612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13279a, false, 6612, new Class[0], Void.TYPE);
            return;
        }
        this.f13280b.dismiss();
    }
}
