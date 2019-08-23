package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15344a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelBottomWidget f15345b;

    c(GiftPanelBottomWidget giftPanelBottomWidget) {
        this.f15345b = giftPanelBottomWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15344a, false, 9980, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15344a, false, 9980, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15345b.a((a) obj);
    }
}
