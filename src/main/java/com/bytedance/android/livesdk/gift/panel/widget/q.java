package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class q implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15371a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelGuestInfoWidget f15372b;

    q(GiftPanelGuestInfoWidget giftPanelGuestInfoWidget) {
        this.f15372b = giftPanelGuestInfoWidget;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15371a, false, 10023, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15371a, false, 10023, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelGuestInfoWidget giftPanelGuestInfoWidget = this.f15372b;
        if (((b) obj) != null) {
            z = false;
        }
        giftPanelGuestInfoWidget.a(z);
    }
}
