package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15367a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15368b;

    o(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15368b = giftPanelDoodleWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15367a, false, 10015, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15367a, false, 10015, new Class[]{View.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15368b;
        giftPanelDoodleWidget.h.t.postValue(null);
        giftPanelDoodleWidget.h.r.postValue(Boolean.TRUE);
    }
}
