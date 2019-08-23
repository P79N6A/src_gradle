package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15348a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelBottomWidget f15349b;

    e(GiftPanelBottomWidget giftPanelBottomWidget) {
        this.f15349b = giftPanelBottomWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15348a, false, 9982, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15348a, false, 9982, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelBottomWidget giftPanelBottomWidget = this.f15349b;
        giftPanelBottomWidget.a(giftPanelBottomWidget.i, true);
    }
}
