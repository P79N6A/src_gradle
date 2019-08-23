package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15388a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelTabWidget f15389b;

    z(GiftPanelTabWidget giftPanelTabWidget) {
        this.f15389b = giftPanelTabWidget;
    }

    public final void onChanged(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15388a, false, 10078, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15388a, false, 10078, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelTabWidget giftPanelTabWidget = this.f15389b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, giftPanelTabWidget, GiftPanelTabWidget.f15331a, false, 10075, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            GiftPanelTabWidget giftPanelTabWidget2 = giftPanelTabWidget;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, giftPanelTabWidget2, GiftPanelTabWidget.f15331a, false, 10075, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        View view = giftPanelTabWidget.f15333c;
        if (!booleanValue) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
