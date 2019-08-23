package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.Observer;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15375a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftPanelListWidget f15376b;

    s(GiftPanelListWidget giftPanelListWidget) {
        this.f15376b = giftPanelListWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f15375a, false, 10053, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f15375a, false, 10053, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftPanelListWidget giftPanelListWidget = this.f15376b;
        ab abVar = (ab) obj;
        if (PatchProxy.isSupport(new Object[]{abVar}, giftPanelListWidget, GiftPanelListWidget.f15312a, false, 10028, new Class[]{ab.class}, Void.TYPE)) {
            GiftPanelListWidget giftPanelListWidget2 = giftPanelListWidget;
            PatchProxy.accessDispatch(new Object[]{abVar}, giftPanelListWidget2, GiftPanelListWidget.f15312a, false, 10028, new Class[]{ab.class}, Void.TYPE);
            return;
        }
        if (giftPanelListWidget.g != abVar) {
            giftPanelListWidget.g = abVar;
            giftPanelListWidget.h = 0;
            giftPanelListWidget.i = 0;
            giftPanelListWidget.k = null;
            if (giftPanelListWidget.f15314c != null) {
                AbsGiftAdapter absGiftAdapter = giftPanelListWidget.f15314c;
                if (PatchProxy.isSupport(new Object[0], absGiftAdapter, AbsGiftAdapter.f15032a, false, 9756, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], absGiftAdapter, AbsGiftAdapter.f15032a, false, 9756, new Class[0], Void.TYPE);
                } else {
                    absGiftAdapter.f15034c.clear();
                }
            }
            giftPanelListWidget.a(abVar);
        }
    }
}
