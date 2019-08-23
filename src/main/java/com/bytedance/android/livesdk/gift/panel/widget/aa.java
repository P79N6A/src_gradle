package com.bytedance.android.livesdk.gift.panel.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15340a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelTabWidget f15341b;

    aa(GiftPanelTabWidget giftPanelTabWidget) {
        this.f15341b = giftPanelTabWidget;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f15340a, false, 10079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15340a, false, 10079, new Class[0], Void.TYPE);
            return;
        }
        GiftPanelTabWidget giftPanelTabWidget = this.f15341b;
        giftPanelTabWidget.a(giftPanelTabWidget.f15334d.h);
    }
}
