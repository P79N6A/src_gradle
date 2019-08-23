package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ea implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13200a;

    /* renamed from: b  reason: collision with root package name */
    private final PromotionStatusWidget f13201b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13202c;

    ea(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f13201b = promotionStatusWidget;
        this.f13202c = j;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13200a, false, 7410, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13200a, false, 7410, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PromotionStatusWidget promotionStatusWidget = this.f13201b;
        long j = this.f13202c;
        promotionStatusWidget.a(true);
        promotionStatusWidget.a(view, j);
    }
}
