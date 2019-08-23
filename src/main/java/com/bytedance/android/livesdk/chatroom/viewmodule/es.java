package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRankWidget;
import com.bytedance.android.livesdk.message.model.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class es implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13243a;

    /* renamed from: b  reason: collision with root package name */
    private final TopRankWidget.AnonymousClass2 f13244b;

    /* renamed from: c  reason: collision with root package name */
    private final l f13245c;

    es(TopRankWidget.AnonymousClass2 r1, l lVar) {
        this.f13244b = r1;
        this.f13245c = lVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13243a, false, 7525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13243a, false, 7525, new Class[0], Void.TYPE);
            return;
        }
        TopRankWidget.AnonymousClass2 r0 = this.f13244b;
        l lVar = this.f13245c;
        if (TopRankWidget.this.isViewValid()) {
            if (TopRankWidget.this.u <= 2) {
                TopRankWidget.this.a(lVar);
                return;
            }
            d.INSTANCE.onMessageFinish();
        }
    }
}
