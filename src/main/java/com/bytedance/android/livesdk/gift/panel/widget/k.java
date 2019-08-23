package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class k implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15359a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelDoodleWidget f15360b;

    k(GiftPanelDoodleWidget giftPanelDoodleWidget) {
        this.f15360b = giftPanelDoodleWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15359a, false, 10011, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15359a, false, 10011, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelDoodleWidget giftPanelDoodleWidget = this.f15360b;
        giftPanelDoodleWidget.f15303f.setTextColor(giftPanelDoodleWidget.context.getResources().getColor(C0906R.color.a8w));
    }
}
