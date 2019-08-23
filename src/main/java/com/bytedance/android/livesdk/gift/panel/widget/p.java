package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15369a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelGuestInfoWidget f15370b;

    p(GiftPanelGuestInfoWidget giftPanelGuestInfoWidget) {
        this.f15370b = giftPanelGuestInfoWidget;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15369a, false, 10022, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15369a, false, 10022, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelGuestInfoWidget giftPanelGuestInfoWidget = this.f15370b;
        a aVar = (a) obj;
        if (aVar != null && aVar.d()) {
            z = false;
        }
        giftPanelGuestInfoWidget.a(z);
    }
}
