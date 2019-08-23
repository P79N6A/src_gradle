package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15379a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15380b;

    u(GiftPanelListWidget giftPanelListWidget) {
        this.f15380b = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15379a, false, 10055, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15379a, false, 10055, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelListWidget giftPanelListWidget = this.f15380b;
        switch ((ab) obj) {
            case GIFT:
            case FANS_CLUB_GIFT:
                giftPanelListWidget.a(GiftPanelListWidget.a.DATA_TYPE_GIFT);
                return;
            case PROP:
                giftPanelListWidget.a(GiftPanelListWidget.a.DATA_TYPE_PROP);
                break;
        }
    }
}
