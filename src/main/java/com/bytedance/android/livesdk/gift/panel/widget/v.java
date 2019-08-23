package com.bytedance.android.livesdk.gift.panel.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15381a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15382b;

    v(GiftPanelListWidget giftPanelListWidget) {
        this.f15382b = giftPanelListWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15381a, false, 10056, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15381a, false, 10056, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f15382b.f15313b.b();
    }
}
