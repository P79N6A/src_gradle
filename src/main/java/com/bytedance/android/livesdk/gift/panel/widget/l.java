package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import android.view.View;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdkapi.host.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15361a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15362b;

    l(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15362b = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15361a, false, 10012, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15361a, false, 10012, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15362b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, giftPanelDoodleWidget, GiftPanelDoodleWidget.f15298a, false, 10007, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            GiftPanelDoodleWidget giftPanelDoodleWidget2 = giftPanelDoodleWidget;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, giftPanelDoodleWidget2, GiftPanelDoodleWidget.f15298a, false, 10007, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a aVar = (a) giftPanelDoodleWidget.h.s.getValue();
        int i = 8;
        if (aVar != null) {
            boolean a2 = ((e) b.a(e.class)).a(aVar.n());
            if (aVar.d() && a2) {
                View view = giftPanelDoodleWidget.f15299b;
                if (!booleanValue) {
                    i = 0;
                }
                view.setVisibility(i);
                return;
            }
        }
        giftPanelDoodleWidget.f15299b.setVisibility(8);
    }
}
