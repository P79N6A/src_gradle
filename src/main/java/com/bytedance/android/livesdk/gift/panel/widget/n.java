package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15365a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15366b;

    n(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15366b = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15365a, false, 10014, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15365a, false, 10014, new Class[]{View.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15366b;
        giftPanelDoodleWidget.g.a();
        giftPanelDoodleWidget.h.t.postValue(null);
    }
}
