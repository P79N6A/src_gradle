package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.panel.a.b;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15363a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15364b;

    m(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15364b = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15363a, false, 10013, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15363a, false, 10013, new Class[]{View.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15364b;
        if (giftPanelDoodleWidget.g.b()) {
            DoodleCanvasView doodleCanvasView = giftPanelDoodleWidget.g;
            if (PatchProxy.isSupport(new Object[0], doodleCanvasView, DoodleCanvasView.f14674a, false, 9218, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], doodleCanvasView, DoodleCanvasView.f14674a, false, 9218, new Class[0], Void.TYPE);
            } else if (doodleCanvasView.b()) {
                int min = Math.min(doodleCanvasView.h.pop().intValue(), doodleCanvasView.f14675b.size());
                int i = 0;
                for (int i2 = 0; i2 < min; i2++) {
                    int size = doodleCanvasView.f14675b.size() - 1;
                    i += doodleCanvasView.f14675b.get(size).f15146d;
                    doodleCanvasView.f14675b.remove(size);
                    if (doodleCanvasView.g != null) {
                        DoodleGiftView doodleGiftView = doodleCanvasView.g;
                        if (PatchProxy.isSupport(new Object[0], doodleGiftView, DoodleGiftView.f14797a, false, 9423, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], doodleGiftView, DoodleGiftView.f14797a, false, 9423, new Class[0], Void.TYPE);
                        } else if (doodleGiftView.f14799c == DoodleGiftView.a.draw && !doodleGiftView.f14798b.isEmpty()) {
                            doodleGiftView.f14798b.remove(doodleGiftView.getDrawPointNum() - 1);
                            doodleGiftView.invalidate();
                        }
                    }
                }
                doodleCanvasView.i = doodleCanvasView.f14675b.size();
                doodleCanvasView.f14679f -= i;
                if (doodleCanvasView.k != null) {
                    doodleCanvasView.k.a(doodleCanvasView.f14675b, doodleCanvasView.getWidth(), doodleCanvasView.getHeight(), doodleCanvasView.f14679f);
                }
                a.a().a((Object) new com.bytedance.android.livesdk.gift.b.a(doodleCanvasView.f14675b.size(), doodleCanvasView.f14679f));
            }
            if (Lists.isEmpty(giftPanelDoodleWidget.g.getMoveActions())) {
                giftPanelDoodleWidget.h.t.postValue(null);
            } else {
                giftPanelDoodleWidget.h.t.postValue(new b(giftPanelDoodleWidget.g.getMoveActions(), giftPanelDoodleWidget.g.getWidth(), giftPanelDoodleWidget.g.getHeight(), giftPanelDoodleWidget.g.getTotalCostDiamondCount()));
            }
        }
    }
}
