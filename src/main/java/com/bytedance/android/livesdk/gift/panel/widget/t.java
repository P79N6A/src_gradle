package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15377a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15378b;

    t(GiftPanelListWidget giftPanelListWidget) {
        this.f15378b = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15377a, false, 10054, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15377a, false, 10054, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelListWidget giftPanelListWidget = this.f15378b;
        boolean z = ((b) obj) != null;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10034, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10034, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (com.bytedance.android.livesdk.gift.model.a.b bVar : giftPanelListWidget.l) {
            bVar.f15097c = z;
        }
        giftPanelListWidget.f15314c.a(giftPanelListWidget.l);
    }
}
