package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.model.a.f;
import com.bytedance.android.livesdk.gift.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15357a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15358b;

    j(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15358b = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15357a, false, 10010, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15357a, false, 10010, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15358b;
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, giftPanelDoodleWidget, GiftPanelDoodleWidget.f15298a, false, 10005, new Class[]{a.class}, Void.TYPE)) {
            GiftPanelDoodleWidget giftPanelDoodleWidget2 = giftPanelDoodleWidget;
            PatchProxy.accessDispatch(new Object[]{aVar}, giftPanelDoodleWidget2, GiftPanelDoodleWidget.f15298a, false, 10005, new Class[]{a.class}, Void.TYPE);
        } else if (!(aVar instanceof f) || !aVar.d()) {
            giftPanelDoodleWidget.g.a();
            giftPanelDoodleWidget.h.t.postValue(null);
            giftPanelDoodleWidget.f15299b.setVisibility(8);
        } else {
            giftPanelDoodleWidget.f15299b.setVisibility(0);
            b q = ((f) aVar).q();
            DoodleCanvasView doodleCanvasView = giftPanelDoodleWidget.g;
            long j = q.f15105d;
            int i = q.f15107f;
            ImageModel imageModel = q.f15103b;
            doodleCanvasView.f14676c = j;
            doodleCanvasView.f14677d = i;
            doodleCanvasView.f14678e = imageModel;
        }
    }
}
